'use strict';

/* Services */

var services = angular.module('contact.services', ['ngResource']);

services.service('UserService', function () {
    
	this.get = function(name){
		
		for(n in contacts){
			if(name == n.name) {
				return n;
			}
			
		};
	};
});

//way to create factory

services.factory('UsersFactory', function ($resource) {
    return $resource('/ContactsProject/rest/users/:userName/:contNumber', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: true
        },
        get: {
            method: 'GET',
            params: {},
            isArray: false
        }
    })
});

services.factory('UserFactory', function ($resource) {
    return $resource('/ContactsProject/rest/user/:personId', {}, {
        get: {
            method: 'GET',
            params: {},
            isArray: false
        },
        delete: {
            method: 'DELETE',
            params: {personId: '@personId'},
            isArray: false
        }
    })
});