# SimSimulator

Basado en el final de paradigmas de programacion de [Utnianos](https://www.utnianos.com.ar/foro/tema-aporte-final-paradigmas-de-programacion-19-12-2015)

## Enunciado

La idea es generar un pequeño simulador de los Sims,
una representación simplificada de una funcionalidad en particular:
Jugar.

Un sim en esta version posee dos estadisticas base: Inteligencia y Agilidad
Un sim puede incrementar esta estadistica jugando

- Cuando un Sim juega a un juego de mesa su inteligencia sube tantas unidades como la dificultad del juego de mesa
- Cuando juega a la pelota su agilidad sube en 15 unidades
- Cuando un Sim juega a un videojuego sube
  - 20 de inteligencia si el videojuego es de Puzzle
  - 2 de agilidad si el videojuego es de accion

La estadistica de inteligencia y de agilidad tienen como tope minimo 0 y como maximo 100,
esto es. Un sim no puede tener mas de 100 de inteligencia y menos de 0, en caso de que se quiera sobrepasar alguno de los limites
simplemente su valor toma el valor maximo o minimo dependiendo del valor limite mas cercano, esto es
- Si un Sim tiene 90 de de inteligencia y juega un videojuego de puzzle solamente tendra 100 de inteligencia

El objetivo del ejercicio es modelar este juego en etapa temprana teniendo en cuenta que:
- Mas estadisticas se agregaran a futuro, como Hambre, Higiene, etc.
- Un sim se crea por defecto con sus estadisticas en 50, pero se puede crear un Sim con valores de inteligencia y de agilidad personalizados


Agregar test unitarios es deseado, pero no necesario.


