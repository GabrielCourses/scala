5 + 7
"hola mundo"
7.01

//hola mundo
println("Hola mundo")
print("Hola mundo")
printf("Hola mundo")
System.out.printl("Hola mundo")

import java.util.ArrayList

new java.util.ArrayList()

//Variables y funciones
val a = 2
println(a)

val b: Double=5

//Variables mutables
var b = 10
b
b = 2
b

//Definir funciones
def suma(a: Int, b: Int) = a + b

def resta(a: Int, b:Int): Int = a - b

def division(a: Int, b: Int) = {
  val dividendo = a
  val divisor = b
  dividendo / divisor
}

suma(7, 1)
resta(7,1)
division(7,1)

//Unit
def main(args: Array[String]){
  print("Hola mundo")
}
main(Array())

//Para usar el operador asignación '='
def main(arg: Array[String]): Unit = {
  println("Hola mundo")
}
main(Array())

//Declaración de objetos
object MiObjeto{
  def sumar(a: Int, b:Int): Int = a + b
  def restar(a: Int, b:Int): Int = a - b
}
MiObjeto.sumar(12, 3)

object Aplicacion{
  def main(arg: Array[String]): Unit = { println("Hola mundo") }
  }
Aplicacion.main(Array())

