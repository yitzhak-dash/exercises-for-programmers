package example

object SayingHello extends App {
  println(s"Hello ${scala.io.StdIn.readLine("What's your name? ")}, nice to meet you!")
}
