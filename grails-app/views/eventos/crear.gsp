<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>Crear Evento</title>

    <!-- Google font -->
    <link href="https://fonts.googleapis.com/css?family=Nunito+Sans:700%7CNunito:300,600" rel="stylesheet">

    <!-- Bootstrap -->
    <asset:stylesheet src="bootstrap.css"/>

    <!-- Font Awesome Icon -->
    <asset:stylesheet src="font-awesome.min.css"/>

    <!-- Custom stlylesheet -->
    <asset:stylesheet src="style.css"/>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
</head>

<body>

<!-- Header -->
<header id="header">
    <!-- Nav -->
    <div id="nav">
        <!-- Main Nav -->
        <div id="nav-fixed">
            <div class="container">
                <!-- logo -->
                <div class="nav-logo">
                    <a href="index.html" class="logo"><h2>EVENTOS ENMA</h2></a>
                </div>
                <!-- /logo -->

                <!-- nav -->
                <ul class="nav-menu nav navbar-nav">
                    <li class="cat-1"><a href="${createLink(controller:'eventos', action:'index')}">Eventos</a></li>
                    <li class="cat-2"><a href="${createLink(controller:'usuario', action:'index')}">Usuarios</a></li>
                    <li class="cat-3"><a href="${createLink(controller:'eventos', action:'crear')}">Crear Evento</a></li>
                    <li class="cat-4"><a href="${createLink(controller:'usuario', action:'crear')}">Crear Usuario</a></li>
                </ul>
                <!-- /nav -->

                <!-- search & aside toggle -->

                <!-- /search & aside toggle -->
            </div>
        </div>
        <!-- /Main Nav -->

        <!-- Aside Nav -->
        <div id="nav-aside">
            <!-- nav -->
            <div class="section-row">
                <ul class="nav-aside-menu">
                    <li><a href="index.html">Home</a></li>
                    <li><a href="about.html">Eventos</a></li>
                    <li><a href="#">Usuarios</a></li>
                </ul>
            </div>
            <!-- /nav -->


            <!-- social links -->
            <div class="section-row">
                <h3>Siguenos!</h3>
                <ul class="nav-aside-social">
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                </ul>
            </div>
            <!-- /social links -->

            <!-- aside nav close -->
            <button class="nav-aside-close"><i class="fa fa-times"></i></button>
            <!-- /aside nav close -->
        </div>
        <!-- Aside Nav -->
    </div>
    <!-- /Nav -->
</header>
<!-- /Header -->
<div class="container">
    <div class="row">
        <div class="well well-sm">

            <g:form controller="eventos" action="save" class="form-horizontal">
                <fieldset>

                    <legend class="text-center header">Crear Evento</legend>
                        <div class="form-group">
                            <div class="form-group">
                                <label for="nombre">Nombre: </label>
                                <g:textField name="nombre" type="text" class="form-control col-xs-4"/><br/>
                            </div>

                            <div class="form-group">
                                <label for="descripcion">Descripcion: </label>
                                <g:textArea name="descripcion" class="form-control col-xs-4"/><br/>
                            </div>

                            <div class="form-group">
                                <label for="edad">Edad Minima: </label>
                                <g:textField name="edad" class="form-control col-xs-4" type="number"/><br/>
                            </div>
                            <div class="form-group">
                                <label for="fecha_ini">Fecha de Inicio: </label>
                                <g:textField name="fecha_ini" type="text" class="form-control col-xs-4"/><br/>
                            </div>
                            <div class="form-group">
                                <label for="fecha_fin">Fecha de Final: </label>
                                <g:textField name="fecha_fin" type="text" class="form-control col-xs-4"/><br/>
                            </div>
                        </div>


                    <g:actionSubmit value="Save"/>

                </fieldset>
            </g:form>

        </div>
    </div>

</div>

</body>
</html>