object NumOfCharactersFunc extends App {
  def whileLoop(cond: => Boolean)(block: => Unit): Unit =
    if (cond) {
      block
      whileLoop(cond)(block)
    }

  var input = ""
  whileLoop(input.isEmpty()) {
    input = scala.io.StdIn.readLine("What is the input string, Bro? ")
  }
  println(s"$input has ${input.length()} characters.")
}
