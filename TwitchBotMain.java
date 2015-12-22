public class TwitchBotMain {
	public static void main(String[] args) throws Exception {
		for (String arg : args)
			System.out.println(arg);
		String channel = "#" + args[0];
		String id = args[1];
		String password = args[2];
		TwitchBot bot = new TwitchBot(id);
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, password);
		bot.joinChannel("#tyuyhnbnm");
	}
}