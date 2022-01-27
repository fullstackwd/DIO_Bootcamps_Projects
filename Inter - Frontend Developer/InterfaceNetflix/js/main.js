$(window).scroll(function () {
  var scroll = $(window).scrollTop();
  if (scroll >= 1) {
    // se rolar 40px ativa o evento
    $("#header").addClass("ativo"); //coloca a classe "ativo" no id=menu
  } else {
    $("#header").removeClass("ativo"); //se for menor que 40px retira a classe "ativo" do id=menu
  }
});
function Pesquisar() {
  document.getElementById("IconPesquisa").style.display = "none";
  document.getElementById("Pesquisa").style.display = "inline-block";
}
function NPesquisar() {
  document.getElementById("IconPesquisa").style.display = "inline-block";
  document.getElementById("Pesquisa").style.display = "none";
  document.getElementById("InputPesquisa").value = "";
}

var modal = document.getElementById("modal");

window.onclick = function (event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
};

document.getElementsByClassName("tablink")[0].click();

function openCity(evt, cityName) {
  var i, x, tablinks;
  x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) {
    tablinks[i].classList.remove("w3-light-grey");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.classList.add("w3-light-grey");
}
document.getElementById("video").play();
