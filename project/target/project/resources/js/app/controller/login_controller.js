(function() {
	'use strict';
	
	angular.module('projectApp').controller('LoginController', LoginController);
	
	LoginController.$inject = ['$scope', 'MainService'];
	
	function LoginController($scope,  MainService){
		var vm = this;
		
		//VM Functions
		vm.authenticate = authenticate;
		
		activate();
			
		function activate() {
		}
		
		function authenticate() {
			
			MainService.authenticate(vm.user).then(
				function(response) {
					console.log("Response : " + JSON.stringify(response));
					if (response.status === 'success') {
						$window.location.href = ctxPath + '/admin/main';
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