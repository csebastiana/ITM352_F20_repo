<<<<<<< Updated upstream
// -- Price depends on quantity
quantity = 100;

if (quantity >= 25) {
    price = 35;
}
else if (quantity >= 10) {
    price = 50;
}
else if (quantity > 0) {
    price = 100;
}
else
    price = "no purchase";

=======
// -- Price depends on quantity
quantity = 100;

if (quantity >= 25) {
    price = 35;
}
else if (quantity >= 10) {
    price = 50;
}
else if (quantity > 0) {
    price = 100;
}
else
    price = "no purchase";

>>>>>>> Stashed changes
console.log(quantity + ' products will cost ' + price + ' each.');