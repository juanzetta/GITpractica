<!doctype html>
<html>
<head>
    <style>
        tr.activo{color:green}
        tr.inactivo{color:red}
    </style>
    <meta name="layout" content="main"/>
    <asset:javascript src="application.js"/>
    <asset:stylesheet src="application.css"/>
    <title>Welcome to Grails</title>

</head>
<body>



<table>
    <tr>
        <th>Sitio</th>
        <th>Categorias</th>

    </tr>
    <g:each in = "${sitiosList}" var="s">
        <tr  class="${s.active ? 'activo' : 'inactivo'}" name="${s.idSite}">
            <td>${s.name}</td>
            <td class="">
                <select id="cat" onchange=irCategoria() >
                    <g:each in="${s.categories}" var="c">
                        <option value="${c.id}">${c.name}</option>

                    </g:each>
                </select>
            </td>
        </tr>
    </g:each>



</table>




<script>
    function irCategoria(){
        var categoria = document.getElementById("cat").value;
        var URL="${createLink(controller:'GrailGit',action:'categoria')}";
        location.href= URL;
    }
</script>







</body>
</html>
