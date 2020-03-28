/**
 * Created by YOGA500 on 17-08-2016.
 */

angular.module("contact", ['ngRoute', 'contact.services', 'contact.controllers', 'contact.directives'])

    .config(function ($routeProvider, $locationProvider) {



        $routeProvider.when('/rest/user/:personId', {
            controller: 'EditContactController',
            templateUrl: 'templates/editContact.html'
        })
        .when('/rest/deleteUser/:personId', {
            controller: 'DeleteContactController',
            templateUrl: 'templates/editContact.html'
        })
            .when('/rest/addUser', {
                controller: 'AddContactController',
                templateUrl: 'templates/addContact.html'
            })
            .when('/', {
                controller: 'ContactListController',
                templateUrl: 'templates/list.html'
            })
            .otherwise({
                redirectTo: '/'
            });
/*
         $locationProvider.html5Mode(false);
               $locationProvider.hashPrefix('!');*/
    })

    /*.controller('ContactListController', function ($scope) {
        $scope.contacts = [
            {
                'name': 'Salam',
                'contactNumber': '9908724036'
            },
            {
                'name': 'Shaik',
                'contactNumber': '839999999'
            }];
    })*/

;