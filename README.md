# PocketChange plugin for Phonegap #
By wenzhi xue

## Adding the Plugin to your project ##
1. Install pocketchange library by following the instruction here https://pocketchange.com/documentation
2. Move pocketchange.js to your project's www folder and include a reference to it in your html files. 
3. Create a folder called "com.pocketchange.phonegap" within your project's src/com/ folder and move the java file into it.
4. Add <plugin name="PocketChangePlugin" value="com.pocketchange.phonegap.PocketChangePlugin" /> to your res/xml/config.xml file
5. Init pocketchange by adding "PocketChange.initialize(this, "you key");" to onStart() in "yourprojectname.java: under /src
6. Done!

## Using the plugin ##
The plugin creates the object `window.plugins.pocketchange` with five methods:

### getPendingNotificationIntent ###
Displays the next pending notification. For example:


    window.plugins.pocketchange.getNotification();


### openStore ###
Open pocketchange store. For example:

    window.plugins.pocketchange.openShop();
 

