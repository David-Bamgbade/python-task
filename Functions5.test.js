const {add, multiply} = require("./Function5.js");

test("add two numbers", () => {
	let numOne = 2;
	let numTwo = 5;
	let ans = add(2, 5);
	expect(ans).toBe(7);
});  

test("multiply, two numbers", () => {
	let numOne = 2;
	let numTwo = 5;
	let ant = multiply(2, 5);
	expect(ant).toBe(10);
});    