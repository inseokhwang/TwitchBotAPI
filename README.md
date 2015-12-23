Twitch Bot API
=========================

We have a Makefile running, and we'll publish it when we get fully working/acceptable level of work done, as we have our OAuth key included in our makefile for ease of development.

How to build
------------------------------
Linux

    make

Windows - We have a working batch file, but we'll post it after finishing up some OAuth stuff.

    build.bat

    or 

    java -cp lib/*;* TwitchBotMain


How to run
-------------------------------
Linux

    make run

Or on any platform

    java -cp lib/*;* TwitchBotMain

Settings.txt
-------------------------------
You'll noticce a settings.txt file in the directory. The TwitchBot.java is responsible for reading in the settings.txt file and populating the possible commands for the Twitch Chat. Currently, the order which you put in doesn't matter, and there's not many features to set up for. 

e.g. Format

hello hello world		// !hello  =  types "hello world" on the host computer 
mouse \mouse:1920:1080		// !mouse  =  sets the host computer's mouse on (1920,1080) - note I haven't implemented click yet

Todo
-------------------------------

1. Write a more complete and featureful parser for settings.txt (Inseok)
2. Implement Democracy/Poll System(Inseok)
3. Other possible features