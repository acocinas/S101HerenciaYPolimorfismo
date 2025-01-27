Ejercicios de Programación en Java

Descripción

Este repositorio contiene diversos ejercicios relacionados con conceptos de programación en Java, centrándose en la programación orientada a objetos, colecciones y buenas prácticas. Los ejercicios están organizados en diferentes niveles, cada uno diseñado para reforzar habilidades prácticas aplicando conceptos teóricos.

Lenguaje de Programación usado en todos ellos: Java

Entorno de Desarrollo utilizado ha sido el IDE: IntelliJ

No se han usado herramientas de construcción adicionales sino que son proyectos en Java independientes.

Descripción de los Ejercicios

Nivel 1

Ejercicio 1: Instrumentos Musicales

Objetivo:
Crear una jerarquía de instrumentos musicales clasificados en viento, cuerda y percusión.

Requisitos:

Definir una clase base Instrumento con atributos nombre y precio.

Implementar el método abstracto tocar(), que muestra mensajes según el tipo de instrumento:

Viento: "Está sonando un instrumento de viento"

Cuerda: "Está sonando un instrumento de cuerda"

Percusión: "Está sonando un instrumento de percusión"

Demostrar la carga de la clase mediante la creación de una instancia o el acceso a un miembro estático.

Investigar y demostrar el uso de bloques de inicialización y estáticos en Java.

Ejercicio 2: Clase Coche

Objetivo:
Comprender las diferencias entre las variables estáticas, finales y de instancia.

Requisitos:

Crear una clase Coche con los atributos:

marca (estático final)

modelo (estático)

potencia (final)

Implementar dos métodos:

acelerar(): método de instancia, imprime "El vehículo está acelerando".

frenar(): método estático, imprime "El vehículo está frenando".

Demostrar cómo llamar a ambos métodos desde la función main().

Nivel 2

Ejercicio 1: Funcionalidades de Smartphone

Objetivo:
Implementar herencia de clases y uso de interfaces.

Requisitos:

Crear una clase Teléfono con los atributos marca y modelo.

Implementar el método llamar(String número), que imprime un mensaje indicando la llamada.

Definir las interfaces:

Cámara con el método fotografiar(), que imprime "Se está haciendo una foto".

Reloj con el método alarma(), que imprime "Está sonando la alarma".

Crear una clase Smartphone que extienda Teléfono e implemente ambas interfaces.

Instanciar Smartphone en main() y llamar a todos los métodos.



Cómo Ejecutar los Ejercicios

Clonar el repositorio.

Abrir el proyecto en cualquier IDE compatible con Java, recomiendo IntelliJ al haber sido el utilizado.

Compilar y ejecutar utilizando la herramienta de construcción preferida pero se han creado directamente como proyectos independientes de Java.

Seguir los resultados de salida en la consola para verificar el correcto funcionamiento.

Siguiendo las Buenas Prácticas se ha intentado que haya:

Estructura y formato de código adecuados.

Nombres de clases y métodos significativos.

Documentación mediante comentarios.

Manejo de excepciones donde sea aplicable.

Uso eficiente de colecciones y estructuras de datos.

