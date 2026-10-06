# Parcial1

Katherine Michelle Estrada Guzmán

## Análisis de la documentación y cambios realizados

Al pasar mi UML a código Java, traté de mantener la estructura lo más parecida posible a como la había diseñado originalmente. Mi intención fue primero escribir el código tal como aparecía en el UML y después compilarlo para poder identificar los errores y hacer los cambios necesarios.

Al momento de compilar, me di cuenta de que algunos nombres que había utilizado en el UML no coincidían con los enums que había creado. Por ejemplo, en JackPizzaChef había colocado Horario y Ubicacion, pero los enums realmente se llamaban HoraJack y UBI. Para solucionarlo, cambié estos tipos de datos por los nombres correctos para que Java pudiera reconocerlos.

Otro error que encontré fue en la clase Pizza. Había utilizado Masa como tipo de dato para representar la base de la pizza, pero todavía no tenía creado ese tipo dentro del proyecto. Al compilar me apareció el error cannot find symbol, indicando que Java no encontraba la clase Masa. Para solucionarlo, creé un enum llamado Masa con las opciones correspondientes y así pude utilizarlo dentro de Pizza.

También revisé la clase Cocina y noté que originalmente había colocado un arreglo con capacidad para cuatro órdenes pendientes. Al comparar mi código con los requisitos del ejercicio, vi que se pedía un máximo de cinco órdenes, así que cambié el arreglo de Orden[4] a Orden[5].

En Pizza también tuve que modificar la forma en la que estaba manejando los toppings. Al principio había colocado solamente una variable de tipo Toppings, lo cual me permitía guardar un solo ingrediente. Como necesitaba poder manejar varios toppings para una misma pizza, cambié esta parte para poder almacenar una colección de ellos.

Por último, hice un Main para probar mi código. En este creé una orden y objetos como Cliente y Chef para comprobar que las clases pudieran relacionarse entre sí. Hacer estas pruebas me ayudó a encontrar errores que no había notado cuando solamente estaba trabajando con el UML.

En general, al pasar mi UML a Java pude darme cuenta de que el diagrama me servía como una guía para organizar las clases y sus relaciones, pero que al momento de llevarlo al código aparecieron algunos detalles que necesitaban ser corregidos. Fui realizando los cambios conforme encontraba los errores al compilar, hasta lograr que la estructura del programa funcionara correctamente y cumpliera mejor con lo solicitado.
