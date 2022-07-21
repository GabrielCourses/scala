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

**¿De dónde sale Scala?**

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

Pero en Scala tenemos un tipo de dato que es equivalente al <code>void</code> de otros lenguajes de programación. En Scala se le llama <code>Unit</code>. Y es posible hacer funciones en Scala que devuelvan un <code>Unit</code>, es decir, que no devuelvan algo. Serían funciones que únicamente ejecutan código pero no devuelven algún resultado.

En scala tenemos la función llamada main, devuelve un Unit, es decir, no devuelve algo.

```
def main(args: Array[String]){
	println("Hola mundo")
	}
main(Array())

// para poder usuar el operador de asignación '='
def main(args: Array[String]): Unit = {
	print("Hola mundo")
	}
main(Array())
```


### Presentación de los objetos singleton

Concepto de «clase», en Scala, parte de la OOP. En Scala podemos hablar de dos tipos de objeto, típicamente conocemos los objetos instanciados de la clase, los cuales comparten atributos y métodos como es el caso de Java.

A diferencia de Java, en Scala hay algunas cosas que las clases no tienen, como por ejemplo las variables estáticas, o los métodos estáticos, o todo cualquier operación que supuestamente pueda funcionar sin estado.

En Java, por ejemplo, podemos hacer variables estáticas, campos estáticos, métodos estáticos, cosas que de alguna manera nosotros podemos ejecutar sin tener que instancias. Y eso Scala no lo permite. En Scala, si creamos una clase, todo lo que puede tener son métodos que trabajen con instancias de las clases.

Sin embargo, a cambio, Scala tiene un concepto, que son los objetos de tipo singleton. Que son objetos como tal, de hecho utilizan la palabra clave object; se parecen a la clases, aunque sin embargo, no tienen instancias. Lo único que pueden hacer es contener operaciones que pueden ser llamadas sin tener que instanciar.

```
//Declaración de objetos
object MiObjeto{
  def sumar(a: Int, b:Int): Int = a + b
  def restar(a: Int, b:Int): Int = a - b
}
```

Ahora puedo mandar llamar los métodos del objeto <code>MiObjeto</code> 

![](https://raw.githubusercontent.com/GabrielCourses/scala/main/image/mi_objeto.png)

### Editando y compilando archivos

Crearemos una carpeta en nuestro ordenador, en mi caso la guardaere con el nombre test en Desktop y dentro del el creamos el archivo HolaMundo.scala

```
object HolaMundo {
	def main(args: Array[String]): Unit = {
		println("Hola mundo")
		}
	}
```

Y ejecutamos en consola:

```
$ scala HolaMundo.scala
```

Para compilar un archivo:

```
$ scalac HolaMundo.scala
```

Aunque en la practica es poco común crear o compilar las clases de esta manera. Para ello tenemos una herramiena <code>sbt</code>.

### Descargar e instalar Scala IDE



