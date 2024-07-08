<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./estilos_cac_movies/style.css">
    <link rel="stylesheet" href="./estilos_cac_movies/style_media_queries.css">
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <link rel="shortcut icon" href="./imagenes/favicon.ico">
    <link href="https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200;0,300;0,400;0,500;0,600;0,700;0,800;1,300&display=swap" rel="stylesheet">
    <title>Registro | CAC-MOVIES</title>
</head>
<header>
    <nav class="container_nav_registro">
        <a href="index.html">
            <i class="fas fa-film" aria-hidden="true"></i>
            <span id="logo_registro">CAC-Movies</span>
        </a>
    </nav>
</header>
<body class="body_registro">
    <section class="formulario_registro" data-aos="zoom-in" data-aos-duration="1000">
        <form action="" method="post">
        <h1>Registro</h1>
        <input type="text" class="campos_registro" name="nombre" placeholder="Nombre">
        <input type="text" class="campos_registro" name="apellido" placeholder="Apellido">
        <input type="email" class="campos_registro" name="mail" placeholder="Email">
        <input type="password" class="campos_registro" name="contra" placeholder="Contraseña">
        <input type="date" class="campos_registro" name="fecha_nac">
        <select name="pais" class="campos_registro">
            <option value="">País</option>
            <option value="AR">Argentina</option>
            <option value="BO">Bolivia</option>
            <option value="BR">Brasil</option>
            <option value="CH">Chile</option>
            <option value="CO">Colombia</option>
            <option value="EC">Ecuador</option>
            <option value="PY">Paraguay</option>
            <option value="PE">Perú</option>
            <option value="UY">Uruguay</option>
            <option value="VE">Venezuela</option>
        </select>
        <input type="checkbox" id="checkbox_tercon" name="tercon"> Acepto términos y condiciones
        <input type="submit" class="boton_registro" value="Registrarse">
        <p>Necesitas ayuda?</p>
        </form>
    </section>
    <script src="https://kit.fontawesome.com/fae5ac15d7.js" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
    <script>
        AOS.init();
    </script>
    </body>
    
    
    </html>