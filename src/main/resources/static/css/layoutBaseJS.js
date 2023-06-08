//function activateTag(index) {
//   //Remove a classe "active" de todas as tags
//  var tags = document.querySelectorAll('#menu li a');
//  tags.forEach(function(tag) {
//    tag.classList.remove('active');
//  });
// //Adiciona a classe "active" à tag selecionada
// tags[index].classList.add('active');
//    this.classList.add('active');
//}

let activateTag = document.querySelectorAll("#menu li a");
activateTag.forEach((menuNav) => {
  menuNav.addEventListener("click", function () {

    // Remove a classe "active" de todas as tags
    activateTag.forEach((menuNav) => {
        menuNav.classList.remove('active');
     console.log("NAVIGATION", menuNav)
    });

    // Adiciona a classe "active" à tag selecionada
    this.classList.add('active');
  });
});