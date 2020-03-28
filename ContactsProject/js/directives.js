'use strict';

/* Directives */


angular.module('contact.directives', []).
  directive('hello', [function() {
    return {
      restrict : 'E',
      template: '<div>Hi Guys!</div>',
      replace: true
    };
  }]);
