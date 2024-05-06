const prompt = require("prompt-sync")();

let day = prompt("What day is today");

switch(day){
	case "Monday":
		console.log("Today is monday");
		break;
	case "Tuesday":
		console.log("Today is tuesday");
		break;
	case "Wednesday":
		console.log("Today is Wednesday");
		break;
	case "Thursday":
		console.log("Today is Thursday");
		break;
	case "Friday":
		console.log("Today is Friday");
		break;
	default:
		console.log("Anyother Name");
}