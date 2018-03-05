<div class="container" xmlns="http://www.w3.org/1999/html">
    <div class="card card-container">
        <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
        %{--<img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />--}%
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <g:if test="${session.user}">
        </br>
            Login as :${session.user} | <g:link action="logout">Cerrar Sesion</g:link>
    </g:if>
        <g:form action="login" class="form-signin" controller="grailGit">
            <span id="reauth-email" class="reauth-email"></span>
            <input name="username" type="text" id="username" class="form-control" placeholder="Nombre de usuario" required autofocus>
            <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Contraseña" required>
            <div id="remember" class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> Recordarme
                </label>
            </div>
            <input type="submit" value="Iniciar Sesion">
        </g:form><!-- /form -->
        %{--<a href="#" class="forgot-password">
            Forgot the password?
        </a>--}%
    </div><!-- /card-container -->
</div><!-- /container -->