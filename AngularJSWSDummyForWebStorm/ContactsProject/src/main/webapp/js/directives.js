'use strict';

/* Directives */

angular.module('contact.directives', []).directive('hello', [ function() {
	return {
		restrict : 'E',
		template : '<div>Hi Guys!</div>',
		replace : true
	};
} ]).directive('saybye', [ function() {
	return {
		restrict : 'E',
		templateUrl : 'templates/sayBye.html'
	};
} ]).directive('hellotransclude', [ function() {
	return {
		restrict : 'E',
		template : '<div>Hi Guys!<span ng-transclude></span></div>',
		replace : true,
		transclude : true
	};
} ]);