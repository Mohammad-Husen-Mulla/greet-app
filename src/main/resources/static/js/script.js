ansel = document.getElementById("pj-ans-block");
ansbtn = document.getElementById("btn-show-ans");
nextbtn = document.getElementById("pj-next-btn");

ansbtn.addEventListener("click", function(e) {
	ansel.classList.add("pj-ans-block-show");

});

nextbtn.addEventListener("click", function(e) {
	ansel.classList.add("pj-ans-block");
	ansel.classList.remove("pj-ans-block-show");
}); 