<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="./estilos_cac_movies/style.css"/>
  <link rel="stylesheet" href="./estilos_cac_movies/style_media_queries.css">
  <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
  <link rel="shortcut icon" href="./imagenes/favicon.ico">
  <link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;1,300&display=swap" rel="stylesheet">
  <title>Detalle | CAC-MOVIES</title>
</head>

<body>
  <header>
    <nav class="container_nav">
      <a href="index.html">
          <i class="fas fa-film" aria-hidden="true"></i>
          <span id="logo">CAC-Movies</span>
      </a>
      <ul class="menu">
          <li class="opciones_menu">
              <a class="opcion" href="#ver_peliculas">Tendencias</a>
          </li>
          <li class="opciones_menu">
              <a class="opcion" href="registro.html">Registrarse</a>
          </li>
          <li class="opciones_menu">
              <a id="boton_negro" href="inicio_sesion.html">Iniciar Sesion</a>
          </li>
      </ul>
  </nav>
  </header>
  <main class="banner_mario">
    <div class="contenedor_detalle">
      <div class="row">
      <div class="foto_banner_detalle" >
        <img src="imagenes/mario.jpg" alt="" id="super_mario"/>
      </div>
      </div>
      <div class="col-md-8 mb-4">
      <h1 class="titulo_detalle" >The Super Mario Bros. Movie (2023)</h1>
      <p class="subtitulo_detalle">
        04/05/2023 • Animation, Family, Adventure, Fantasy, Comedy • 1h 33m
      </p>
      <h2 class="overview_detalle" >Overview</h2>
      <p class="descripcion_detalle">
        While working underground to fix a water main, Brooklyn plumbers—and
        brothers—Mario and Luigi are transported down a mysterious pipe and
        wander into a magical new world. But when the brothers are separated,
        Mario embarks on an epic quest to find Luigi.
      </p>
      <div class="creditos">
        <ul class="list-unstyled d-flex">
          <li class="me-5">
            <h3 class="subtitulo_detalle"><strong>Aaron Horvath</strong></h3>
            <p class="descripcion_detalle">Director</p>
          </li>
          <li class="me-5">
            <h3 class="subtitulo_detalle"><strong>Michael Jelenic</strong></h3>
            <p class="descripcion_detalle">Director</p>
          </li>
          <li class="me-5">
            <h3 class="subtitulo_detalle"><strong>Matthew Fogel</strong></h3>
            <p class="descripcion_detalle">Director</p>
          </li>
        </ul>
      </div>
    </div>
    </div>
  </main>
  <section class="info_mario" >
    <div class="contenedor_video">
      <h2 class="subtitulo_detalle">Ver trailer</h2>
      <iframe width="560" height="315" src="https://www.youtube.com/embed/RjNcTBXTk4I?si=7fnK8NtlxetW0d1R"
        title="YouTube video player" frameborder="0"
        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
        allowfullscreen=""></iframe>
    </div>
    <div class="contenedor_info">
      <div class="redes">
        <ul>
          <li>
            <a href="https://www.facebook.com/supermariomovie" target="_blank"><i class="fab fa-facebook"
                aria-hidden="true"></i></a>
          </li>
          <li>
            <a href="https://twitter.com/supermariomovie" target="_blank"><i class="fab fa-twitter"
                aria-hidden="true"></i></a>
          </li>
          <li>
            <a href="https://instagram.com/supermariomovie/"><i class="fab fa-instagram" target="_blank"
                aria-hidden="true"></i></a>
          </li>
          <li>
            <a href="https://www.thesupermariobros.movie/"><i class="fas fa-link" target="_blank"
                aria-hidden="true"></i></a>
          </li>
        </ul>
      </div>
      <div class="info">
        <table>
          <thead>
            <tr>
              <th colspan="2">Info</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td><strong>Status</strong></td>
              <td>Released</td>
            </tr>
            <tr>
              <td><strong>Original Language</strong></td>
              <td>English</td>
            </tr>
            <tr>
              <td><strong>Budget</strong></td>
              <td>$100.000.000,00</td>
            </tr>
            <tr>
              <td><strong>Revenue</strong></td>
              <td>$1.347.013.866,00</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </section>
  <footer >
    <nav>
      <ul class="menu_footer">
        <li class="opciones_footer">Terminos y condiciones</li>
        <li class="opciones_footer">Preguntas frecuentes</li>
        <li class="opciones_footer">Ayuda</li>
        <li class="opciones_footer">
          <a id="boton_negro_footer" href="index.html">Administrador Peliculas</a>
        </li>
      </ul>
    </nav>
    <div class="contenedor_flecha">
      <a href="#banner_publicitario">
        <img id="flecha_arriba" src="imagenes/flecha-hacia-arriba.png" alt="ir hacia arriba" />
      </a>
    </div>
  </footer>
  <script src="https://kit.fontawesome.com/fae5ac15d7.js" crossorigin="anonymous"></script>
  <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
    <script>
        AOS.init();
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</body>

</html>