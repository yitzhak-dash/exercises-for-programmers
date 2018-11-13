package example

object SayingHello extends App {
  val name = scala.io.StdIn.readLine("What's your name? ")
  println("Hello " + name + ", nice to meet you!")
}
