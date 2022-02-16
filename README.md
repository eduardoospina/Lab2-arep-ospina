# AREP- ARQUITECTURAS EMPRESARIAL - Laboratorio 2.

## AUTOR.

> Eduardo Ospina Mejia

## Taller Clientes y Servicios.

### Introduccion.

Para este laboratorio se requieren conocimientos de tres herramientas para su desarrollo, siendo estas :
1) MVN
2) GIT
3) Librerias de java.

Este taller presenta diferentes retos que los ayudaran a explorar los conceptos de esquemas de nombres y 
de clientes y servicios. Adicionalmente, el taller le ayudará a explorar la arquitectura de las aplicaciones 
distribuidas sobre internet.

Se separa en 3 ejercicios y 2 retos diseñados para fortalezer y entender la manera como funciona correctamente
los clientes y servicios. Sin aplicar ningun framework como spring o spark para desarrollar cada uno de los 
diferentes ejercios planteados. Se busca tambien aplicar desarrollo continue para mostrar el funcionamiento
correcto de los servidores web desarrollados. 

#### Ejercicio 1:

Escriba un programa en el cual usted cree un objeto URL e imprima en pantalla cada uno de los componentes de 
una URL. Es decir , debe usar los siguientes métodos: getProtocol, getAuthority, getHost, getPort, getPath, 
getQuery, getFile, getRef. Asegúrese que ninguno imprima una cadena vacía, esto implica que la URL que use 
para su objeto debe contener datos suficientes.

#### Eercicio 2:

Escriba una aplicación browser que dada una URL lea datos de esa dirección y que los almacene en un archivo 
con el nombre resultado.html. Intente ver este archivo en el navegador. Su implementación debe ser un programa 
que reciba el parámetro de URL por medio de la línea de comandos.

#### Ejercicio 3:

Usando sockets escriba un servidor que reciba un número y responda el cuadrado de este número. Escriba un 
cliente para probarlo y envíele una secuencia de 20 números.

#### Reto 1

Escriba un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor debe 
retornar todos los archivos solicitados, incluyendo páginas html e imágenes. Construya un sitio web con 
javascript para probar su servidor. Despliegue su solución en Heroku. NO use frameworks web como Spark o 
Spring use solo Java y las librerías para manejo de la red.

#### Reto 2

Usando su  servidor y java (NO use frameworks web como Spark o Spring). Escriba un framework similar a Spark 
que le permita publicar servicios web "get" con funciones lambda y le permita acceder a recursoso estáticos 
como páginas, javascripts, imágenes, y CSSs. Cree una aplicación que conecte con una base de datos desde el 
servidor para probar su solución. Despliegue su solución en Heroku.

#### Entregables

- El proyecto con los retos implementados y funcionado desplegado en Heroku.

- Repositorio en GITHUB con los más altos estándares de calidad.

- Artículo describiendo la arquitectura de su prototipo y la evaluación.


### Desplegando localmente.

1) Se clona el repositorio que contiene todos los ejercicios y retos. 

![](https://i.postimg.cc/y8bvJz4v/Capture1.png)

2) Se realiza un clean y package: 

![](https://i.postimg.cc/G34Y2shw/Capture3.png)
![](https://i.postimg.cc/pdV5tm1S/Capture4.png)

3) Dependiendo de la parte que se quiere ejecutar, siendo los main de ejercicios 1 y 2, el cliente y servidor del 
   ejercicio 3 o los main dentro de reto 1 y 2: 
   
![](https://i.postimg.cc/QxBB8LmX/Capture2.png)

4) se ejecutan ya sea pro comandos de consola o directamente desde al IDE que corra cad auno de los programas:

![](https://i.postimg.cc/hvY1X9Nh/Capture5.png)

![](https://i.postimg.cc/8cfrnxnP/Capture6.png)


##### Requisitos:
1)   [Java 8](https://www.java.com/download/ie_manual.jsp)
2)   [Maven](https://maven.apache.org/download.cgi)
3)   [Git](https://git-scm.com/downloads)
4)   IDE de java.

### Desplegando de forma remota.


### Arquitectura implementada


### Limitaciones


### Extender


## Construido con
-   HTML
-   javascript
-   java

## Despliegue Heroku:

[![ProjectDesign](https://www.herokucdn.com/deploy/button.png)]()

### Licencia.

Licencia.
