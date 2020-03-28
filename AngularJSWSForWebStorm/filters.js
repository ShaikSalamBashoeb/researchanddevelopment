angular.module('app-players')
	.filter('playersFilter', function () {
		return function (players, playerInfo) {

        var filtered = [];

		angular.forEach(players, function (player) {
            console.info(player);
			if(parseInt(player.price)>=parseInt(playerInfo.min)) {
				filtered.push(player);
			}
		});
		return filtered;
        }
    });