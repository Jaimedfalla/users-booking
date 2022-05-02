# SERVICIO GESTIÓN DE USUARIOS

Este servicio hace parte del proyecto integrador para el curso de Spring boot de Ada School. El proyecto consiste en 2 microservicios que son los siguientes:

1. Gestión de Usuarios
2. [Gestión de reservas o Booking.](https://github.com/PipeRojas/Bookings)

Fue desarrollado por:

- [Andrés Felipe Rojas Ortiz](https://github.com/PipeRojas)
- [Nelson Andrés Patiño Vallejo](https://github.com/vallejop)
- [Jaime Eduardo Falla Cardozo]()

## __*Uso del servicio:*__
---

### Registro:

Para poder acceder a los endpoint, primero se debe [registrar](https://users-booking-unit-testing.herokuapp.com/api/v1/auth/create). el objeto JSON para poderse registrar, es el siguiente

```javascript
{
    "name":"xxxxxxx",
    "lastName":"xxxxx",
    "email":"xxxxxxx@xxxxxxx.com",
    "password":"xxxxxxxxx"
}
```

<h4 style="color:#61c2b8;">Ingreso:</h4>

Una vez registrado, debe obtener el token de autenticación para poder acceder a los demás endpoint, desde esta [url](https://users-booking-unit-testing.herokuapp.com/api/v1/auth/authenticate). El json a utilizar es:

```javascript
{
    "email":"xxxxxxx.xxxxxxx@xxxxxxxx.com",
    "password":"xxxxxxxxx"
}
```
 
 <h4 style="color:#61c2b8;">Endpoints disponibles:</h4>

Antes de ejecutar cualquiera de los endpoint, recuerda que debes copiar el token generado en la autenticación y agregar la siguiente cabecera:

> Authorization: Bearer \<token>

 - Para consultar todos los usuarios registrados
 
> [GET] https://users-booking-unit-testing.herokuapp.com/api/v1/user/All

*Códigos de respuesta*: 200,204,500

---
 - Obtener un usuario por Id:
 
 > [GET] https://users-booking-unit-testing.herokuapp.com/api/v1/user/6269bf4fbd411f0337bca7e3

*Códigos de respuesta*: 200,404,500

---
 - Registrar un usuario nuevo:

 > [POST] https://users-booking-unit-testing.herokuapp.com/api/v1/user

 *JSON*
 ```javascript
 {
     "name":"xxxxxxx",
     "active":true|false,
     "until":"",//ISO date
     "age"://positive number,
     "email":"xxxxxx@xxxxx.com",
     "phone":"999999999",
     "profession":"xxxxxxxxxx"
 }
 ```
*Códigos de respuesta*: 201,400,404,500,503

---
 - Actualizar un usuario:

 > [UPDATE] https://users-booking-unit-testing.herokuapp.com/api/v1/user/6269bf4fbd411f0337bca7e3

 *JSON*
 ```javascript
 {
     "name":"xxxxxxx",
     "active":true|false,
     "until":"",//ISO date
     "age"://positive number,
     "email":"xxxxxx@xxxxx.com",
     "phone":"999999999",
     "profession":"xxxxxxxxxx"
 }
 ```
*Códigos de respuesta*: 200,204

---
- Eliminar un usuario:

> [DELETE] https://users-booking-unit-testing.herokuapp.com/api/v1/user/6269bf4fbd411f0337bca7e3

*Códigos de respuesta*: 201,400,404,500,503
