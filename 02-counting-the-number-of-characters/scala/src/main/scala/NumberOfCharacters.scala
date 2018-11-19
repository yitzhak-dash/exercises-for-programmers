object NumberOfCharacters extends App {
  var input = ""
  while (input.isEmpty())
    input = scala.io.StdIn.readLine("What is the input string? ")
  println(s"$input has ${input.length()} characters.")
}
