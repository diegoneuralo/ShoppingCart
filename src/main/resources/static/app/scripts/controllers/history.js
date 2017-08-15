'use strict';

angular.module('infraApp')
    .controller('HistoryCtrl', ['$scope', 'history', '$http', function ($scope, history, $http) {
        $scope.history1 = history;
    }]);