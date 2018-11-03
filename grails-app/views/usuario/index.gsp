
<table>
    <thead>
    <tr>
        <th>Cedula</th>
        <th>Nombres</th>
        <th>Apellidos</th>
        <th>Edad</th>
        <th>Email</th>
    </tr>
    </thead>
    <tbody>

    <g:each in="${usuarios}">
        <tr>
            <td>${it.Cedula}</td>
            <td>${it.Nombre}</td>
            <td>${it.Apellidos}</td>
            <td>${it.Edad}</td>
            <td>${it.Email}</td>
        </tr>
    </g:each>

    </tbody>
</table>