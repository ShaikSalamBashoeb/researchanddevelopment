/**
 * Created by YOGA500 on 17-08-2016.
 */

angular.module("myContactAppModule", ['ngRoute'])

    .config(function ($routeProvider, $locationProvider) {



        $routeProvider.when('/editContact/:name/:contNumber', {
            controller: 'EditContactController',
            templateUrl: 'templates/editContact.html'
        })
            .when('/', {
                controller: 'ContactListController',
                templateUrl: 'templates/list.html'
            })
            .otherwise({
                redirectTo: '/'
            });

        $locationProvider.html5Mode(false);
        $locationProvider.hash
    })

    .controller('ContactListController', function ($scope) {
        $scope.contacts = [
            {
                'name': 'Salam',
                'contactNumber': '9908724036'
            },
            {
                'name': 'Shaik',
                'contactNumber': '839999999'
            }];
    })
    .controller('EditContactController', function ($scope, $routeParams) {

        $scope.contacts = [
            {
                'name': 'Salam',
                'contactNumber': '9908724036'
            },
            {
                'name': 'Shaik',
                'contactNumber': '839999999'
            }];
        console.info('$routeParams.name'+$routeParams.name);
        console.info('$scope.contacts'+$scope.contacts);

        angular.forEach($scope.contacts, function (contactTemp, key) {

            console.info('contNumber'+$routeParams.contNumber);
            console.info('name'+$routeParams.name);
            console.info('contactTemp'+contactTemp.name);
            if(contactTemp.name === $routeParams.name) {
                $scope.contact = contactTemp;
            }

        });
        //$scope.contact = $scope.contacts[$scope.params.name];
    })
;