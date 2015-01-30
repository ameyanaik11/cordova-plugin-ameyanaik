using WP7CordovaClassLib.Cordova;
using WP7CordovaClassLib.Cordova.Commands;
using WP7CordovaClassLib.Cordova.JSON;

namespace Cordova.Extension.Commands
{
    public class AmeyaNaik : BaseCommand
    {
        public void getAmeya(string args)
        {
            string name = JsonHelper.Deserialize<string>(args);
            string message = "Hello, " + name + " -- by Ameya Naik";
            PluginResult result = new PluginResult(PluginResult.Status.OK, message);
            DispatchCommandResult(result);
        }
    }
}
