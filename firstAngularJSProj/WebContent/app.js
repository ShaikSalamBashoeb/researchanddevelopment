angular.module('app-players', []).controller('ng-players', function($scope) {
	$scope.players = [ {
		'name' : 'Salam',
		'address' : 'Salala  Barkas',
		'price' : '20000'
	}, {
		'name' : 'Shaik',
		'address' : 'Raichur',
		'price' : '140000'
	} ];
});