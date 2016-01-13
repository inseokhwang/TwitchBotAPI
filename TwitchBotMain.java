import java.util.Scanner;
import java.io.File;

public class TwitchBotMain {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("config.txt"));
		String channel = "#" + scanner.nextLine().split("-")[1];
		String id = scanner.nextLine().split("-")[1];
		String password = scanner.nextLine().split("-")[1];
		TwitchBot bot = new TwitchBot(id);
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, password);
		bot.joinChannel(channel);
	}
}