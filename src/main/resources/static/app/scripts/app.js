'use strict';

angular
    .module('infraApp', [
        'ngAnimate',
        'ngCookies',
        'ngResource',
        'ngRoute',
        'ngSanitize',
        'ngTouch'
    ])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'app/views/main.html',
                controller: 'MainCtrl',
                controllerAs: 'main',
                resolve: {
                    products: function ($http) {
                        return $http.get("http://localhost:8080/shoppingcart/products").then(function (response) {
                            return response.data;
                        })
                    }
                }
            })

            .when('/cart', {
                templateUrl: 'app/views/cart.html',
                controller: 'CartCtrl',
                controllerAs: 'cart',
                resolve: {
                    shoppingCart: function ($http) { 
                        return $http.get("http://localhost:8080/shoppingcart/shoppingCart").then(function (response) {
                            return response.data;
                        })
                    }
                }
            })

            .when('/history', {
                templateUrl: 'app/views/history.html',
                controller: 'HistoryCtrl',
                controllerAs: 'history',
                resolve: {
                    history: function ($http) {
                        return $http.get("http://localhost:8080/shoppingcart/history").then(function (response) {
                            return response.data;
                        })
                    }
                }
            })

            .otherwise({
                redirectTo: '/'
            });
    });
