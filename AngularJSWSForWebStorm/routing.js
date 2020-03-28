//var scope;
angular.module('app-players')
		.config(['$routeProvider', function ($routeProvider) {

			$routeProvider.when('/add', {
				templateUrl : 'templates/add.html',
				controller : 'addPlayer'
			})
			.when('/list', {
				templateUrl : 'templates/list.html',
				controller : 'ng-players'
			})
			.when('/', {
				templateUrl : 'list.html',
				controller : 'ng-players'
			}).otherwise({
				redirectTo: '/list.html'
			});
		}]);