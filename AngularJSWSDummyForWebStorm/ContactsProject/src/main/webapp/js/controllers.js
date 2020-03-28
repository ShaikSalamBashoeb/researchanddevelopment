'use strict';

/* Controllers */


var app = angular.module('contact.controllers', ['ngResource']);


// Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
})
.controller('ContactListController', ['$scope', 'UsersFactory', function ($scope, UsersFactory) {
	console.info('ContactListController: inside');
    $scope.bla = 'bla from controller';
    UsersFactory.query({}, function (usersFactory) {
    	console.info('usersFactory: '+usersFactory);
    	var usersFactoryJson =	angular.fromJson(usersFactory);
    	console.info('usersFactoryJson: '+usersFactoryJson);
    	window.usersFactoryJsonW = usersFactoryJson;
    	$scope.contacts = usersFactoryJson;
    	/*$scope.contacts = [
    	                   {
    	                       'name': 'Salam',
    	                       'contactNumber': '9908724036'
    	                   },
    	                   {
    	                       'name': 'Shaik',
    	                       'contactNumber': '839999999'
    	                   }];*/
//        $scope.name = usersFactory.name;
    });
    
    console.info('ContactListController: end');
}])

.controller('EditContactController', ['$scope', 'UserFactory', '$routeParams', '$location', function ($scope, UserFactory, $routeParams, $location) {

	console.log('EditContactController');
    
	window.UserFactoryT = UserFactory;
    	$scope.contact = UserFactory.get({personId: $routeParams.personId});
    	
    	console.info('$routeParams.personId'+$routeParams.personId);
    	
    	$scope.deleteUser = function(personId) {
    		var response = UserFactory.delete({personId: personId}, function(){
    			
    			console.info('response:'+response);
        		window.responseW = response;
        		if(response.result === "success") {
        			console.info('Success Inside:'+response.result);
        			$location.path("/").replace();
        		} else {
        			console.info('Error Inside:'+response.result);
        		}
        		//else show error msg
    		}, function(){
    			console.info('Error:'+response.result);
    		
    		//else show error msg
    		});
    		
    	}
//        console.info('$scope.contacts'+$scope.contact);

        /*angular.forEach($scope.contacts, function (contactTemp, key) {

            console.info('contNumber'+$routeParams.contNumber);
            console.info('name'+$routeParams.name);
            console.info('contactTemp'+contactTemp.name);
            if(contactTemp.name === $routeParams.name) {
                $scope.contact = contactTemp;
            }

        });*/
        //$scope.contact = $scope.contacts[$scope.params.name];
    }])
	.controller('AddContactController', ['$scope', 'UserFactory', '$routeParams', '$location', function ($scope, UserFactory, $routeParams, $location) {

		console.log('AddContactController');

		window.UserFactoryT = UserFactory;
		var Contact = $resource('/ContactsProject/rest/user');
		$scope.contact = new Contact({});
		/*{
			'personId' : '',
			'name' : '',
			'contactNumber' : ''
		};*/

		$scope.addUser = function(contactName, contactNumber) {
			$scope.contact.$save(function () {
				console.info('savedddddddddddddd');
			});
			/*var response = UserFactory.add({name: contactName, contactNumber: contactNumber}, function(){

				console.info('response:'+response);
				window.responseW = response;
				if(response.result === "success") {
					console.info('Success Inside:'+response.result);
					$location.path("/").replace();
				} else {
					console.info('Error Inside:'+response.result);
				}
				//else show error msg
			}, function(){
				console.info('Error:'+response.result);

				//else show error msg
			});
*/
		}

	}])

	.controller('HelloController', ['$scope', function($scope){
    	//$scope.greetings = {'text': 'Hello'};
    	
    }])
    ;
var homeModule = angular.module('HomeModule', []);
homeModule.filter('titleCase', function() {
	var titleCaseFilter = function(input) {

		var words = input.split(' ');
		for (var i = 0; i < words.length; i++) {
			words[i] = words[i].charAt(0).toUpperCase() + words[i].slice(1);
		}
		return words.join(' ');
	};
	return titleCaseFilter;
})
