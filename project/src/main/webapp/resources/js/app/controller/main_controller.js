(function() {
	'use strict';
	
	angular.module('projectApp').controller('MainController', MainController);
	
	MainController.$inject = ['$scope', '$window', 'MainService'];
	
	function MainController($scope, $window, MainService){
		var vm = this;
		
		var users = [];
		var messages = [];
		var channels = [];
		
		var resp = [];
		
		//VM Functions
		vm.loadInformation = loadInformation;
		vm.user =  {
				userName : "",
				email : "",
				password : ""
		}
		
		activate();
			
		function activate() {
			loadInformation();
		}
		
		function loadInformation() {
			
			MainService.loadInformation(1).then(
				function(response) {
					console.log("Response : " + JSON.stringify(response));
					if (response.status === 'success') {
						
						resp = response.datos[0];
						console.log("table = " + resp.friends[0].name);
						console.log("Done!");
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