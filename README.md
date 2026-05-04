# Ampliación de Contenidos Audiovisuales

## Descripción del proyecto

Este proyecto corresponde a una actividad de Programación Orientada a Objetos desarrollada en Java. Su propósito es ampliar un sistema básico de contenidos audiovisuales, incorporando nuevas clases, relaciones entre objetos y subclases.

El sistema parte de la clase abstracta `ContenidoAudiovisual`, junto con las clases originales `Pelicula`, `SerieDeTV` y `Documental`. A partir de esta base, se añadieron nuevas clases para representar actores, temporadas, investigadores y contenidos digitales actuales.

## Objetivo

Ampliar el proyecto original aplicando conceptos de Programación Orientada a Objetos, como herencia, asociación, agregación, composición y polimorfismo.

## Clases añadidas

### Nuevas clases relacionadas

- `Actor`
- `Temporada`
- `Investigador`

### Nuevas subclases

- `PeliculaStreaming`
- `TransmisionEnVivo`

## Relaciones implementadas

| Clase principal | Clase relacionada | Relación | Método implementado |
|---|---|---|---|
| `Pelicula` | `Actor` | Asociación | `agregarActor()` |
| `SerieDeTV` | `Temporada` | Composición | `agregarTemporada()` |
| `Documental` | `Investigador` | Agregación | `agregarInvestigador()` |
| `PeliculaStreaming` | `ContenidoAudiovisual` | Herencia | `mostrarDetalles()` |
| `TransmisionEnVivo` | `ContenidoAudiovisual` | Herencia | `mostrarDetalles()` |

## Funcionalidades nuevas

- Registro de actores asociados a una película.
- Registro de temporadas dentro de una serie de televisión.
- Registro de investigadores asociados a un documental.
- Creación de contenidos de tipo película en streaming.
- Creación de contenidos de tipo transmisión en vivo.
- Visualización de información específica mediante el método `mostrarDetalles()`.
- Prueba funcional del sistema mediante la clase `PruebaAudioVisual`.

## Estructura de carpetas

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


Instrucciones de instalación y uso
1. Clonar el repositorio
git clone https://github.com/JuanXavierPeralta/poo_unidad1_contenidos_audiovisuales.git
2. Importar el proyecto en Eclipse
Abrir Eclipse.
Seleccionar File > Import.
Elegir Existing Projects into Workspace.
Seleccionar la carpeta del proyecto clonado.
Finalizar la importación.
3. Ejecutar el proyecto

Ejecutar la clase principal:

src/poo/PruebaAudioVisual.java

Al ejecutar esta clase, se crean objetos de las clases principales, se agregan actores, temporadas e investigadores, y se muestran los detalles del sistema en consola.

Mejoras implementadas:
Incorporación de nuevas clases relacionadas con las clases originales.
Aplicación de asociación, composición y agregación.
Creación de nuevas subclases orientadas a contenidos digitales actuales.
Implementación de métodos para agregar objetos relacionados.
Actualización de la clase principal para validar el funcionamiento del sistema.
Elaboración de un diagrama de clases UML mediante draw.io.

Herramientas utilizadas:
Java
Eclipse IDE
GitHub
draw.io

Autor: Juan Xavier Peralta León
