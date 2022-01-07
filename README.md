

## INTRODUCCIÓN
En este repositorio se encuentra el proyecto relizado para la prueba tecnica de Necomplus realizado por Tatiana Peña.

## Buenas practicas
Las buenas praticas para mi son el buen uso de los recursos con los que cuenta un lenguaje en especifico, 
saberlo implementar y organizar de forma adecuada el codigo que se realice, para mi las buenaa practicas en
un codigo es que este sea diciente con lo que realiza y asi mismo que tenga una funcion especifica... 
tambien es evitar el uso de clases que se tornen monoliticas y estas no permitan dar un buen soporte en un
futuro o hagan que los futuros desarrolladores se pierdan en el codigo.

Yo las practico haciendo uso de los principios SOLID y de patrones que para mi son como la normas de programacion que todos 
como desarrolladores deberiamos tener presentes, generalmente mis mtodos siempre tienen el nombre de lo que 
realizan y no sobrecargo el metodo con varias responsabilidades, de igual manera me gusta mucho estar refactorizando 
el codigo que se ve complejo de comprender y hacer reuso de lineas de codigo repetitivas dentro del mismo, tambien 
generalmente me gusta que mis clase java queden limpias sin warnings a menos de que sea estrictamente necesario.


# ARQUITECTURA

La arquitectura implementada para este proyecto el la arquitectura limpia que se especifica para android:

- [ARQUITECTURA](http://codictados.com/mvp/arquitectura-limpia/)

Esta arquitectura la seleccione por que me parce que es una arquitectura adapatativa y escalable para los 
negocios y las aplicaciones, aparte de ello que me permite implementar correctamente los principios SOLID. Me gusta que la 
arquitectura se pueda dar en capas ya que me permite de esa fotma separar la logica del negocio, aparte de 
hacer independiente a cada comoponete de la aplicacion y aparte de eso.

Esta arquitectura al ser por capas le brinda a la aplicacion una capa de seguridad debido a la dependencia 
que tiene una capa sobre otra, aparte de esto   se acopla muy bien con algunos patrones de programacion 
como lo son el de repositorio, fabrica, fachada, dto..etc
