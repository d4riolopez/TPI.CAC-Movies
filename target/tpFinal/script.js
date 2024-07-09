//validaciones en inicio de sesion

//API 
const contenedor = document.getElementById("ver_peliculas");
const contenedorAclamadas= document.querySelector('.peliculas_aclamadas');
let pagina=1;

const cargarPeliculas = async()=>{
    try{
        //url de la api
        const respuesta= await fetch(`https://api.themoviedb.org/3/movie/popular?api_key=3aa42483c86cd15fc251a9432a279f87&language=es-MX&page=${pagina} `);
        console.log(respuesta);

        if(respuesta.status==200){
            const datos = await respuesta.json();
            console.log(datos);

            let peliculas = [];

            datos.results.forEach(pelicula =>{
                peliculas+=`
                <div class="col">
            <a href="detalle_pelicula.html">
            <img class="foto_catalogo" src="https://image.tmdb.org/t/p/w500/${pelicula.poster_path}" alt=${pelicula.title}></a>
            <div class="titulo_pelicula"><h4>${pelicula.title}</h4></div>
        </div> 
                `;
            });

            contenedor.innerHTML = peliculas + botones;
            actualizarBotones();
        }

        //contenedor.innerHTML +=botones;
    }catch(e){
        console.log(e.message);
    }
}

const actualizarBotones= () =>{
    const btnAnterior = document.getElementById("btnAnterior");
    const btnSiguiente = document.getElementById("btnSiguiente");
    btnAnterior.addEventListener("click",()=>{
        if (pagina>1){
            pagina -=1;
            cargarPeliculas();
        }
    });
    
    btnSiguiente.addEventListener("click",()=>{
        if (pagina<=1000){
            pagina +=1;
            cargarPeliculas();
        }
    });

}

const botones=`<button id="btnAnterior" class="boton_ver_peliculas">Anterior</button>
<button id="btnSiguiente" class="boton_ver_peliculas">Siguiente</button>`;

cargarPeliculas();
const cargarPeliculasAclamadas = async()=>{
    try{
        //url de la api
        const respuesta= await fetch(`https://api.themoviedb.org/3/movie/top_rated?api_key=3aa42483c86cd15fc251a9432a279f87&language=es-MX `);
        console.log(respuesta);

        if(respuesta.status==200){
            const datos = await respuesta.json();
            console.log(datos);

            let peliculas = [];

            datos.results.forEach(pelicula =>{
                peliculas+=`
                <div class="col">
            <a href="detalle_pelicula.html">
            <img class="foto_catalogo" src="https://image.tmdb.org/t/p/w500/${pelicula.poster_path}" alt=${pelicula.title}></a>
            <div class="titulo_pelicula"><h4>${pelicula.title}</h4></div>
        </div> 
                `;

                peliculas+=`<div class="peliculas_item">
                <img src="https://image.tmdb.org/t/p/w500/${pelicula.poster_path}" alt=${pelicula.title}>
            </div>`
            });

            contenedorAclamadas.innerHTML = peliculas;
        }

    }catch(e){
        console.log(e.message);
    }
}
cargarPeliculasAclamadas();
var f=document.getElementById('formRegis');
f.addEventListener('submit', function(event){
    var inputEmail = document.getElementById("campoEmail").value;
    var inputContra = document.getElementById("campoContra").value;

    if(inputEmail=="" || inputContra==""){
        alert("Complete los campos vacios")
    }else{
       alert("Bienvenido");
}});
