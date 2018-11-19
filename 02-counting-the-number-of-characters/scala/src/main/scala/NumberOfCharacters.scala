object NumberOfCharacters extends App {
  val input = scala.io.StdIn.readLine("What is the input string? ")
  println(s"$input has ${input.length()} characters.")
}
