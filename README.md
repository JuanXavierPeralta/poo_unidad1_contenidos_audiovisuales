# Ampliación de Contenidos Audiovisuales

## Descripción del proyecto

Este proyecto corresponde a la actividad de Programación Orientada a Objetos sobre la ampliación de contenidos audiovisuales. El proyecto base contenía las clases `ContenidoAudiovisual`, `Pelicula`, `SerieDeTV` y `Documental`.

El trabajo realizado consistió en agregar nuevas clases, nuevas relaciones y dos nuevas subclases para ampliar el funcionamiento del sistema.

## Objetivo

Aplicar conceptos de Programación Orientada a Objetos en Java, como herencia, asociación, agregación, composición y polimorfismo, dentro de un proyecto ya existente.

## Clases añadidas

Se agregaron las siguientes clases:

- `Actor`
- `Temporada`
- `Investigador`
- `PeliculaStreaming`
- `TransmisionEnVivo`

## Relaciones implementadas

- `Pelicula` se relaciona con `Actor` mediante asociación.
- `SerieDeTV` se relaciona con `Temporada` mediante composición.
- `Documental` se relaciona con `Investigador` mediante agregación.
- `PeliculaStreaming` y `TransmisionEnVivo` heredan de `ContenidoAudiovisual`.

## Funcionalidades agregadas

- Se pueden agregar actores a una película.
- Se pueden agregar temporadas a una serie.
- Se pueden agregar investigadores a un documental.
- Se añadieron contenidos actuales como películas en streaming y transmisiones en vivo.
- Se actualizó la clase `PruebaAudioVisual` para probar el funcionamiento del sistema.

## Estructura del proyecto

```text
poo_unidad1_contenidos_audiovisuales/
├── src/
│   ├── poo/
│   │   └── PruebaAudioVisual.java
│   └── uni1a/
│       ├── Actor.java
│       ├── ContenidoAudiovisual.java
│       ├── Documental.java
│       ├── Investigador.java
│       ├── Pelicula.java
│       ├── PeliculaStreaming.java
│       ├── SerieDeTV.java
│       ├── Temporada.java
│       └── TransmisionEnVivo.java
├── .classpath
├── .project
└── .gitignore
```

## Instrucciones para clonar y ejecutar
Clonar el repositorio:
git clone https://github.com/JuanXavierPeralta/poo_unidad1_contenidos_audiovisuales.git
Abrir Eclipse.
Importar el proyecto con la opción:
File > Import > Existing Projects into Workspace
Seleccionar la carpeta del proyecto clonado.
Ejecutar la clase principal:
src/poo/PruebaAudioVisual.java

##Mejoras realizadas
Se agregaron nuevas clases al sistema.
Se implementaron relaciones entre clases.
Se crearon dos nuevas subclases de ContenidoAudiovisual.
Se elaboró un diagrama de clases UML en draw.io.
Se probó el funcionamiento del sistema desde PruebaAudioVisual.

##Herramientas utilizadas:
Java
Eclipse
GitHub
draw.io

##Autor: Juan Xavier Peralta León
