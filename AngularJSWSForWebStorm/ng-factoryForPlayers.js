angular.module('app-players2', [])
	.factory('ngFactoryForPlayers', function($http) {

		function getPlayers() {
			return $http.get('data/data.json');
		}

		return {
			getPlayers : getPlayers
		}
	}) ;