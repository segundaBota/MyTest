package accenture.myLearning

object HighOrder {

  def reverse (cad:String):String = {
    if (cad.isEmpty()) ""
    else reverse(cad.tail)+cad.head
      
  }

  def sumarDos(valor: Int): Int = valor +2
  
  def sumarCinco(valor: Int): Int = valor + 5

  def procesar (inicio:Int, fin:Int, funcion: Int => Int): Unit ={
    for (i <- inicio to fin)
      println(funcion(i))
  }
  
  def main(args: Array[String]) {
    val y = "Empezamos..."
    println(y)
    println(reverse(y))
    
    procesar(1, 5, sumarDos)
    procesar(1, 5, sumarCinco)
    
    var nombre = (n:String) => "Te llamas... "+n
    println(nombre("Jose"))

    var iniciales = (n:String, a:String)=>n.head+"."+a.head+"."
    println(iniciales("Jose", "España"))
    println("Fin del programa.")
  }

}