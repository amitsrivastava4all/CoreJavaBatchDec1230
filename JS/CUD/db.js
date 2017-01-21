var db = firebase.database();
var ref = firebase.database().ref('products');
function fetchProducts(){
  var db = firebase.database();
  var ref = firebase.database().ref('products'); 
    ref.on("value", function(snapshot) {
    var products = snapshot.val();    
    console.log(products);
    printProducts(products);    
}, function (error) {
   console.log("Error: " + error.code);
});
}

function printProducts(products){
    var ul =  document.getElementById("productList");
        //var products = fetchProducts();
        products.forEach(function(product){
           
           var li= document.createElement("li"); 
            li.innerHTML="Id "+product.id+" Name "+product.name+" Price "+product.price+" <img src='"+product.url+"'>";
            ul.appendChild(li);
        });
}
