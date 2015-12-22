import java.util.HashMap;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.jibble.pircbot.*;

public class TwitchBot extends PircBot {
	HashMap<String, String> commands;
	Robot robot;

	public TwitchBot(String name) {
		this.setName(name);
		commands = new HashMap<String, String>();
		commands.put("put", "on Message");
		commands.put("lut", "\\mouse:1920:1080");
		try {
			robot = new Robot();
		} catch (AWTException a) {
			robot = null;
		}
	}

	@Override
	protected void onMessage(String channel, String sender, String login, String hostname, String message) {
		if (message.matches("!\\w+")) {
			String temp = message.substring(1);
			handleCommands(commands.get(temp));
		}
	}

	private void handleCommands(String input) {
		if (input.matches("\\\\mouse.+")) { 	// Mouse Command
			String temp[] = input.split(":");
			assert temp.length == 3;
			assert temp[1].matches("\\d+");
			assert temp[2].matches("\\d+");
			robot.mouseMove(new Integer(temp[1]), new Integer(temp[2]));
		} else { 				// Keyboard Command
			for (int i = 0; i < input.length(); i++) {
				int c = KeyEvent.getExtendedKeyCodeForChar((int) input.charAt(i));
				robot.keyPress(c);
				robot.keyRelease(c);
			}
		}
	}
}