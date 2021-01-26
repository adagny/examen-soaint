# examen-soaint

# Iniciar sesion
# post request
localhost:8090/authenticate

# header
content-type:application/json

# body
{
"username":"carlitos",
"password":"password"
}

# Registrar cliente
# post request
localhost:8090/cliente/registrar

# header
content-type:application/json
Authentication:Bearer "jwt"

# body
{
"nombre":"Carlos",
"apellido":"Chavez",
"dni":"73060601",
"telefono":"977163503",
"email":"carlosxavez1992@gmail.com"
}

# Registrar producto
# post request
localhost:8090/producto/registrar

# header
content-type:application/json
Authentication:Bearer "jwt"

# body
{
"nombre":"Camisa",
"precio":"30"
}

# Consultar cliente
# get request
localhost:8090/producto/{idProducto}

# header
content-type:application/json
Authentication:Bearer "jwt"
