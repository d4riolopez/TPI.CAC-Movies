
function Pelicula(pelicula) {
        return `
            <tr>
                <td><img src="img/${pelicula.foto}" alt="${pelicula.nombre}" style="width: 100px; height: auto;"></td>
                <td>${pelicula.nombre}</td>
                <td>${pelicula.sinopsis}</td>
                <td>${pelicula.genero}</td>
                <td>${pelicula.clasificacion}</td>
                <td>${pelicula.director}</td>
            </tr>
        `;
    }

    function llamarAPI() {
        fetch('/finalCac/peliculas')
            .then(response => response.json())
            .then(data => {
                const tablebody = document.querySelector('#peliculasTable tbody'); // Cambié a #peliculasTable
                tablebody.innerHTML = data.map(Pelicula).join('');
            })
            .catch(error => console.error('Error:', error));
        console.log("llamada realizada");
    }

    llamarAPI();

//validacion inicio de sesion
var f=document.getElementById('formRegis');
f.addEventListener('submit', function(event){
    var inputEmail = document.getElementById("campoEmail").value;
    var inputContra = document.getElementById("campoContra").value;

    if(inputEmail=="" || inputContra==""){
        alert("Complete los campos vacios")
    }else{
       alert("Bienvenido");
}});