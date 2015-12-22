public class TwitchBotMain {
	public static void main(String[] args) throws Exception {
		for (String arg : args)
			System.out.println(arg);
		String channel = "#" + args[0];
		String password = args[1];
		TwitchBot bot = new TwitchBot("twitchbotbulbazoid");
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, password);
		bot.joinChannel("#tyuyhnbnm");
	}
}