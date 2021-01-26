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
Authentication:Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjYXJsaXRvcyIsImV4cCI6MTYxMTY1NzU1OSwiaWF0IjoxNjExNjM5NTU5fQ.wKt5sKgDInLLygo3KqbTkXIpXtE3xm8-T2dUQMh7opQR75CD7SlwY2Oy7HLdWAuu9vIh3_TaixNhB9VIQ5zwDQ

# body
{
"nombre":"Carlos",
"apellido":"Chavez",
"dni":"73060601",
"telefono":"977163503",
"email":"carlosxavez1992@gmail.com"
}
