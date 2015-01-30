# Cordova AmeyaNaik Plugin

Simple plugin as to explore cordova.

This plugin provides a simple example demonstrating how Cordova plugins work.

## Using
Clone the plugin

    $ git clone https://github.com/ameyanaik/cordova-plugin-ameyanaik.git

Create a new Cordova Project

    $ cordova create hello com.example.helloapp Hello
    
Install the plugin

    $ cd hello
    $ cordova plugin install ../cordova-plugin-ameyanaik
    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling AmeyaNaik Plugin");
    }

    ameyanaik.getAmeya("someThing", success, failure);
```

Install iOS or Android platform

    cordova platform add ios
    cordova platform add android
    
Run the code

    cordova run 

## More Info

For more information on setting up Cordova see [the documentation](http://cordova.apache.org/docs/en/4.0.0/guide_cli_index.md.html#The%20Command-Line%20Interface)

For more info on plugins see the [Plugin Development Guide](http://cordova.apache.org/docs/en/4.0.0/guide_hybrid_plugins_index.md.html#Plugin%20Development%20Guide)
