age = 22;
name = "Chavez";
var piece;
attributes  =  "Chavez;22;22.5;"+ (0.5 - 22) ;
pieces = attributes.split(';');
for(i in pieces) {
    pieces[i] = `${typeof pieces[i]} ${pieces[i]}`;
}
console.log(pieces.join(','));
function isNonNegInt(string_to_check, returnErrors=false){
   /* This function returns true if string_to_check is a non-negative integer.
   // if returnErrors=true it will return the array of reasons it is not a non-neg int. */
    errors = []; // assume no errors at first
if(Number(string_to_check) != string_to_check) errors.push('Not a number!'); // Check if string is a number value
if(string_to_check < 0) errors.push('Negative value!'); // Check if it is non-negative
if(parseInt(string_to_check) != string_to_check) errors.push('Not an integer!'); // Check that it is an integer
return returnErrors ? errors : (errors.length ==0);
}

function callback(i,part) {
    console.log(`${part} is non neg int ${isNonNegInt(part, true).join("***")}`);
}
pieces.forEach(function (item,i){console.log( (typeof item == 'string' && item.length > 0)?true:false )});
/*for(i in pieces){
    console.log(`${pieces[i]} is non neg int ${isNonNegInt(pieces[i], true).join("***")}`);
} */