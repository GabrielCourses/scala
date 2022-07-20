![](https://raw.githubusercontent.com/GabrielCourses/scala/main/image/header_scala.png)

# Scala
## Introducción a Scala

**¿Qué es Scala?**

- Lenguaje de programación multiparadigma.
- Basado en Java.
- Es a la vez:
	+ **Orientado a objetos**. Utiliza nociones de objeto, clase, paquete, campos, métodos, visibilidad, polimorfismo, etc.
	+ **Funcional**. Trata a las funciones como ciudadanos de primera clase. Soporta funciones anónimas lambda, currificación, patrones, etc.
	
**¿Y por qué Scala?**

- Es conciso. No tendrás que escribir demasiado en este lenguaje.
- Es elegante como él sólo.
- Es de tipado estático (en contra de lo que puedes pensar...)
- Compila contra la JVM y es compatible con Java.
- **Es de los más valorados.** Segundo lenguaje de programación mejor pagado según StackOverflow Developer Survey 2016.

**¿De dṕnde sale Scala?**

- Suiza, 2003.
- Desarrollando inicialmente por Marin Odersky.
- Hasta la aparición de Java 8, era de las mejores alternativas para juntar porgramación funcional con Java.

**¿Dónde funciona?**

- Está basado en Java, así que funciona **en cualquier plataforma.**
- Instalador para Microsoft Windows
- Distribución binaria para Linux, MacOs, y Windows.
- En los gestores de paquete de Ubuntu, Fedora, Arch, MacOs...

## Instalar Scala

En Linux:

```
$ apt install scala
```

Ahora desde el bash puede abrir scala:

```
$ scala
scala>
```

## Primeros pasos con el interprete

Vamos ocupar el interprete REPL (Read-Eval-Print-Loop) de Scala:

![](https://raw.githubusercontent.com/GabrielCourses/scala/main/image/interprete.png)

**Scala** es un lenguaje de programación multi-paradigma diseñado para expresar patrones comunes de programación en forma concisa, elegante y con tipos seguros. Integra sutilmente caracteristicas de lenguaje funcionales y orientado a objetos. La implementación actual se ejecuta en la máquina virtual de java y es compatible con las aplicaciones Java existentes.

### Declaración de variables

Dejo un fichero test.sc para hacer las primeras pruebas con el interprete, en el encontraras:

- Ejecutar <code>«hola mundo»</code>
- Variables con <coode>val</code> y <code>var</code> (solo si es altamente necesario).

### Declaración de funciones

Para definir funciones en Scala, tenemos que utilizar la palabra clave <code>def</code>. Y a continuación tenemos que escribir el nombre de la función.

```
scala> def <name_function>(argumentos) = <funcion>
```

### Inciso sobre Units e iguales

En Scala tenemos distintos tipos de datos: <code>int</code>, <code>double</code>, <code>float</code>, <code>long</code>, <code>String</code>, <code>boolean</code>.

Pero en Scala tenemos un tipo de dato que es equivalente al <code>void</code> de otros lenguajes de programación. En Scala se le llama <code>Unit</code>

