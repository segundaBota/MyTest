package accenture.myLearning


object ProgramaListas {


  def main(args: Array[String]) {
    println("Empieza el programa.")

    val lista = List(1,2,3,4,5)

    val lista2 = List(1,2,1,3,4,2,5)
    
    println(lista.map(_*2))

    println("La lista [1,2,3,4,5] contiene el 3? : " + pertenece(lista, 3))
    println("La lista [1,2,3,4,5] contiene el 7? : " + pertenece(lista, 7))

    println(quitaDuplicados(lista2))

    println("Termina el programa.")
  }

  def pertenece (l:List[Int], e:Int) : Boolean ={
    if (l.size == 0)
      return false
    else if (l.head.equals(e)){
      return true
    }else{
      return pertenece(l.tail, e)
    }
      
  }
  
  def quitaDuplicados(l:List[Int]): List[Int] ={
    if (l.isEmpty)
      return l
    else if (pertenece(l.tail, l.head))
        return quitaDuplicados(l.tail)
    else
      return l.take(1) ++ quitaDuplicados(l.tail)
          
  }

}