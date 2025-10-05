const Human = {
	name: "kalianah",
	target_affinity: "unknown",
	gender: "unknown",
	financial_capacity: 4,
	elegance_charm: 4,
	
	toString: function() {
		console.log("name: " + this.name + "\ntarget affinity: " + this.target_affinity + "\ngender: " + this.gender + "\nfinancial capacity: " + this.financial_capacity + "\nelegance & charm: " + this.elegance_charm);
	},
	
	getName: function() {
		console.log(this.name);
	},
	getTargetAffinity: function() {
		console.log(this.target_affinity);
	},
	getGender: function() {
		console.log(this.gender);
	},
	getFinancialCapacity: function() {
		console.log(this.financial_capacity);
	},
	getEleganceCharm: function() {
		console.log(this.elegance_charm);
	},
	
	setName: function(new_name) {
		this.name = new_name;
	},
	setTargetAffinity: function(new_TargetAffinity) {
		this.target_affinity = new_TargetAffinity;
	},
	setFinancialCapacity: function(new_FCapacity) {
		this.financial_capacity = new_FCapacity;
	},
	setEleganceCharm: function(new_ECharm) {
		this.elegance_charm = new_ECharm;
	}
};
