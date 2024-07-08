<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./estilos_cac_movies/style.css">
    <link rel="stylesheet" href="./estilos_cac_movies/style_media_queries.css">
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="shortcut icon" href="./imagenes/favicon.ico">
    <link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;1,300&display=swap" rel="stylesheet">
    <title>Iniciar Sesion | CAC-MOVIES</title>
</head>
<header>
    <nav class="container_nav_registro">
        <a href="index.html">
            <i class="fas fa-film" aria-hidden="true"></i>
            <span id="logo_registro">CAC-Movies</span>
        </a>
    </nav>
</header>
<body class="body_inicio">
    <section class="formulario_inicio" data-aos="zoom-in" data-aos-duration="1000" id="formRegis">
        <form action="index.html" method="post">
        <h1>Iniciar Sesion</h1>
        <input type="email" class="campos_inicio" id="campoEmail" name="mail" placeholder="Email">
        <input type="password" class="campos_inicio" id="campoContra" name="contra" placeholder="Contraseña">
        <input type="submit" class="boton_registro" value="Iniciar Sesion">
        <p>Registrarse</p>
        </form>
    </section>
    <!--div class="modal" tabindex="-1" id="miModal">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Inicio de sesion</h5>
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
              <p>Por favor complete los campos vacios</p>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
            </div>
          </div>
        </div>
      </div-->

    <script src="https://kit.fontawesome.com/fae5ac15d7.js" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
    <script>
        AOS.init();
    </script>
    <script src="script.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
    
    
    </html>