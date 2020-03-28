//var scope;
angular.module('app-players', ['app-players2', 'ngRoute'])
	.controller('ng-players', function($scope, ngFactoryForPlayers){
//		$scope.players = ngFactoryForPlayers.getPlayers();
		//scope = $scope;
		$scope.playerInfo = {
			'min' : 1000
		};

		$scope.newPlayer = {};

		ngFactoryForPlayers.getPlayers().success(function (data) {
			$scope.players = data;
		}).error(function (error) {
			console.log(error);
		});

		$scope.addNewPlayer = function (newPlayer) {
			$scope.players.push(newPlayer);
			//$scope.newPlayer = {};
		}
	}) ;