# demo
API REST con Spring Boot

# Deploying

## Listar usuarios
GET https://demo-application-spring.herokuapp.com/usuario

## Crear y Actualizar usuario
POST  https://demo-application-spring.herokuapp.com/usuario
### Body Crear
{
 "nombre":"cadena",
  "email:"cadena",
  "prioridad":numero
}
### Body Actualizar
{
  "id":numero
  "nombre":"cadena",
  "email:"cadena",
  "prioridad":numero
}
## Buscar usuario por id
GET https://demo-application-spring.herokuapp.com/usuario/{numero}

## Buscar usuario por prioridad
GET https://demo-application-spring.herokuapp.com/usuario/query?prioridad={numero}

## Eliminar usuario por id
DELETE https://demo-application-spring.herokuapp.com/usuario/{numero}
