/**
 * cordova PocketChange plugin
 * Copyright (c) wenzhi xue 2012
 *
 */
var PocketChange = function() { 

};


PocketChange.prototype.getNotification = function(params, success, fail) {
	return cordova.exec(function(args) {
        success(args);
    }, function(args) {
        fail(args);
    }, 'PocketChangePlugin', 'getNotification', [params]);
};

PocketChange.prototype.openShop = function(params, success, fail) {
	return cordova.exec(function(args) {
        success(args);
    }, function(args) {
        fail(args);
    }, 'PocketChangePlugin', 'openShop', [params]);
};


cordova.addConstructor(function() {
	window.pocketchange = new PocketChange();	
	window.plugins = window.plugins || {};
	window.plugins.pocketchange = window.pocketchange;
});
