function getRandD6(){
	return Math.floor(Math.random() * 6) + 1;
}
function getRandD20(){
	return Math.floor(Math.random() * 20) + 1;
}
function getRandRoll(){
	let sidesInput = document.getElementById("sides");
	let sides = sidesInput.value;
	sides = parseInt(sides);
	return Math.floor(Math.random() * sides) + 1;
}

// let die1 = document.querySelector(".die"); <-- TO GRAB BY CLASS

// die1.innerHTML = "Hello <i>World</i>"; CHANGES HTML OF CLASS; innerText
// CHANGES TEXT DIRECTLY
let die1 = document.getElementById("die1");
let die2 = document.getElementById("die2");

function rollDice(){
	die1.innerText = getRandRoll();
	die2.innerText = getRandRoll();
}

rollDice(); // TO CALL ONCE ON PAGE LOAD

let rollButton = document.getElementById("rollButton");
rollButton.addEventListener("click",(event) =>{
	rollDice();
});




let pick1 = document.querySelector(".red");
let pick2 = document.querySelector(".yellow");
let pick3 = document.querySelector(".blue");
let div = document.querySelector(".colorPicker");
 
function getColor(color){
	console.log(color);
	div.style.backgroundColor = color;
}

getColor("silver");



// ON CLICK IN HTML, OR EVENT HANDLERS IN JS, NOT BOTH
//pick1.addEventListener("click",(event) =>{
//	let color = pick1.value;
//	console.log(color);
//getColor(color);
//});
//pick2.addEventListener("click",(event) =>{
//	let color = pick2.value;
//getColor(color);
//});
//pick3.addEventListener("click",(event) =>{
//	let color = pick3.value;
//getColor(color);
//});





// CREATING A CLASS
let movie = {
		title: "Wizard of Oz",
		genre: "Musical"
};
movie.genre = "Adventure";
movie.director = "Victor Flemming";



let movies = [
	{title: "Grinch",genre: "Holiday"},
	{title: "Wizard of Oz",genre: "Musical"},
	{title: "Mononoke",genre: "Animation"},
	{title: "Thirteen Ghosts",genre: "Horror"},
	{title: "Jurassic Park",genre: "Thriller"}
];

movies.push({title: "Friday Night Lights",genre: "Sports"});
