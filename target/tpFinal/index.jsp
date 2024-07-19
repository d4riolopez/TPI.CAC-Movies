<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./estilos_cac_movies/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;1,300&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="./estilos_cac_movies/style_media_queries.css">
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <link rel="shortcut icon" href="./imagenes/favicon.ico">
    <title>CAC-MOVIES</title>
</head>

<body>
    <header>
        <nav class="container_nav">
            <a href="#">
                <i class="fas fa-film" aria-hidden="true"></i>
                <span id="logo">CAC-Movies</span>
            </a>
            <ul class="menu">
                <li class="opciones_menu">
                    <a class="opcion" href="#ver_peliculas">Tendencias</a>
                </li>
                <li class="opciones_menu">
                    <a class="opcion" href="registro.jsp">Registrarse</a>
                </li>
                <li class="opciones_menu">
                    <a id="boton_negro" href="inicio_sesion.jsp">Iniciar Sesion</a>
                </li>
            </ul>
        </nav>
    </header>
    <main class="banner_publicitario" data-aos="zoom-in" data-aos-duration="1000">
        <div class="elementos_banner">
            <img src="imagenes/banner-bg.jpg" alt="tele de fondo">
        </div>
        <h1 class="titulo_banner">Peliculas y series ilimitadas
            en un solo lugar</h1>
        <h2 class="subtitulo_banner">Disfruta donde quieras.
            Cancela en cualquier momento.</h2>
        <a class="boton_registrarse" href="registro.jsp">Registrate</a>
    </main>
    <section class="buscar_peliculas" data-aos="zoom-in" data-aos-duration="1000">
        <h1 class="subtitulo_peliculas">¿Que estas buscando para ver?</h2>
            <div class="buscador">
                <input type="text" placeholder="Buscar..." id="barra">
                <button type="submit" id="boton_busqueda">Buscar</button>
            </div>
            <hr>
            <h2 class="subtitulo_peliculas_tendencias">Las tendencias de hoy</h2>
    </section>
    <section id="ver_peliculas" data-aos="zoom-in" data-aos-duration="1000">
        <!--button id="btnAnterior" class="boton_ver_peliculas">Anterior</button>
        <button id="btnSiguiente" class="boton_ver_peliculas">Siguiente</button-->
        <hr>
    </section>
    <section class="aclamadas" data-aos="zoom-in" data-aos-duration="1000">
        <h1 class="titulo_aclamadas">Las mas aclamadas</h1>
        <div class="peliculas_aclamadas">
            <!--div class="peliculas_item">
                <img src="imagenes/shawshank.jpg" alt="shawshank">
            </div>
            <div class="peliculas_item">
               <img src="imagenes/elpadrino.jpg" alt="el padrino">
            </div>
            <div class="peliculas_item">
                <img src="imagenes/elpadrino2.jpg" alt="el padrino 2">
            </div>
            <div class="peliculas_item">
                <img src="imagenes/schindler.jpg" alt="schindler's list">
            </div>
            <div class="peliculas_item">
                <img src="imagenes/12angryman.jpg" alt="12 angry man">
            </div>
            <div class="peliculas_item">
                <img src="imagenes/spiritedaway.jpg" alt="spirited away">
            </div-->
        </div>
    </section>
    <footer >
        <nav>
            <ul class="menu_footer">
                <li class="opciones_footer">Terminos y condiciones</li>
                <li class="opciones_footer">Preguntas frecuentes</li>
                <li class="opciones_footer">Ayuda</li>
                <li class="opciones_footer">
                    <a id="boton_negro_footer" href="index.jsp">Administrador Peliculas</a>
                </li>
            </ul>
        </nav>
        <div class="contenedor_flecha">
            <a href="#banner_publicitario">
                <img id="flecha_arriba" src="imagenes/flecha-hacia-arriba.png" alt="ir hacia arriba">
            </a>
        </div>
    </footer>
    <script src="https://kit.fontawesome.com/fae5ac15d7.js" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
    <script>
        AOS.init();
    </script>
    <script src="script.js"></script>
</body>

</html>