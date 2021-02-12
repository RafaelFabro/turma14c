function filtrar(){

fetch("http://localhost:8080/intervalo/" + 
document.getElementById("txtinicio").value + "/" + document.getElementById("txtfinal").value)
.then(res => res.json())
.then(res => montartabela(res))
.catch(err => {
    window.alert("Não encontrado");
document.getElementById("tabela").innerHTML = 
"<table class='table'>"+
"<thead>"+
  "<tr>"+
    "<th scope='col'>Código</th>"+
    "<th scope='col'>Nome</th>"+
    "<th scope='col'>Artista</th>"
    "</tr>" +
"</thead>"+
"<tbody><tbody></table>";


});

}

function montartabela(lista){

var resultado = 
"<table class='table'>"+
"<thead>"+
  "<tr>"+
    "<th scope='col'>Código</th>"+
    "<th scope='col'>Nome</th>"+
    "<th scope='col'>Artista</th>"
    "</tr>" +
"</thead>"+
"<tbody>";

for(contador=0;contador<lista.length;contador++){
resultado +=
"<tr>"+
    "<th scope='row'>" + lista[contador].id + "</th>" +
    "<td>" + lista[contador].titulo + "</td>" +
    "<td>" + lista[contador].artista.nomeartistico + "</td>" +    
  "</tr>";

}

resultado += "</tbody></table>";
document.getElementById("tabela").innerHTML=resultado;

}
