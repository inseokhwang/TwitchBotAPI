import java.util.HashMap;
import java.awt.Robot;
import java.awt.AWTException;

import org.jibble.pircbot.*;

public class TwitchBot extends PircBot {
	HashMap<String, String> commands;
	Robot robot;

	public TwitchBot() {
		this.setName("TwitchBot");
		commands = new HashMap<String, String>();
		commands.put("put", "onMessage");
		commands.put("lut", "onPrivateMessage");
		try {
			robot = new Robot();
		} catch (AWTException a) {
			robot = null;
		}
	}

	public TwitchBot(String name) {
		this.setName(name);
		commands = new HashMap<String, String>();
		commands.put("put", "onMessage");
		commands.put("lut", "onPrivateMessage");
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
			sendMessage(channel, temp);
			sendMessage(channel, commands.get(temp)); // Do your actions here
			robot.mouseMove(0, 0);
		}
	}
}