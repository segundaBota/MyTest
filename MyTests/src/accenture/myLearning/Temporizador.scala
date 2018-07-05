package accenture.myLearning

object Temporizador {

  def unaVezPorSegundo(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }

  def tiempoVuela() {
    println("El tiempo vuela como una flecha...")
  }

  def main(args: Array[String]) {
    unaVezPorSegundo(tiempoVuela)
  }

}