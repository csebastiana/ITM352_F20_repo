age = 22;
name = "Chavez";
var piece;
attributes  =  name+";"+ age +";" + (age + 0.5) + ";" + (0.5 - age) ;
pieces = attributes.split(';');
for(i in pieces) {
    pieces[i] = `${typeof pieces[i]} ${pieces[i]}`;
}
console.log(pieces.join(','));
function isNonNegInt(){
    errors = []; // assume no errors at first
if(Number(q) != q) errors.push('Not a number!'); // Check if string is a number value
if(q < 0) errors.push('Negative value!'); // Check if it is non-negative
if(parseInt(q) != q) errors.push('Not an integer!'); // Check that it is an integer

}