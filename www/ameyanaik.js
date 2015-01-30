/*global cordova, module*/

module.exports = {
    getAmeya: function (arg1, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "AmeyaNaik", "getAmeya", [arg1]);
    }
};
