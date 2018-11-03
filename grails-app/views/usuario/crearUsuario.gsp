<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Crear Usuario</title>
</head>
<body>
<g:form controller="usuario" action="save">
<div class="form-group">
    <div class="form-group">
        <label for="nombre">Nombre: </label>
        <g:textField name="nombre" type="text" class="form-control"/><br/>
    </div>

    <div class="form-group">
        <label for="apellidos">Apeillos: </label>
        <g:textField name="apellidos"/><br/>
    </div>

    <div class="form-group">
        <label for="cedula">Cedula: </label>
        <g:textField name="cedula"/><br/>
    </div>
    <div class="form-group">
        <label>Fecha de Naciminento: </label>
        <g:textField name="fecha_Nacimiento" type="date" class="form-control"/><br/>
    </div>

    <div class="form-group">
        <label for="mail">E-Mail: </label>
        <g:textField name="mail" type="email" class="form-control"/><br/>
    </div>

    <g:actionSubmit value="Save"/>
</div>

</g:form>
</body>
</html>