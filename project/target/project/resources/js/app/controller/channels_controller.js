(function() {
	'use strict';
	
	angular.module('projectApp').controller('ChannelsController', ChannelsController);
	
	ChannelsController.$inject = ['$scope', 'MainService'];
	
	function ChannelsController($scope,  MainService){
		var vm = this;
		
		//VM Functions
		vm.doSomething = doSomething;
		
		activate();
			
		function activate() {
			console.log("in controller");
			doSomething();
		}
		
		function doSomething() {
			
			MainService.getUsers(1).then(
				function(response) {
					console.log("Response : " + JSON.stringify(response));
					if (response.status === 'Correcto') {
						console.log('true');
					} else {
						console.log('false');
					}
				}, error);
		}
	
		function error() {
			console.log('Ocurrio un eror');
		}
	}
})();