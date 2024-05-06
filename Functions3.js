let array = [1,2,3,4,5,6];

function user(numbers) {
	
	for(let num of numbers) {
		if(num % 2 == 0) {
		console.log(num);
	}
   }
}

user(array);
