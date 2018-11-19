object NumberOfCharacters extends App {
  var input = ""
  while (input.length() == 0){
    input = scala.io.StdIn.readLine("What is the input string? ")
  }
  println(s"$input has ${input.length()} characters.")
}
