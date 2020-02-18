
object MainApp {

  def main(args: Array[String]): Unit = {

    //Simple Hello World
    println("Hello World")

    //Store Hello World in  variable
    val greeting = "Hello World"
    println(greeting)

    //Create a method that takes a string as an input
    funcGreeting("Hello World")

    //Create a method that returns a string type
    println(returnGreeting("Hello Nice to meet you"))

    //Returns amount of characters specified at the end
    println(characterReturn("Hello", 3))

    //Function that returns the sum of two numbers
    println(sumOfNumbers(21, 21))

    //Boolean Checker if numbers are
    println(checkNums(0, 6, false))

    iterator("William", 6)

    iterationsNew("H", 4)

    printIterations("Fizz", "Buzz", 15)

    //Recursive Function
    recursiveFunc("H", 2)

  }

  def funcGreeting(helloGreeting: String): Unit = println(helloGreeting)

  def returnGreeting(word1: String): String = word1

  def returnAnything(anythingReturned: Any): Any = anythingReturned

  def characterReturn(word: String, number: Int): String = word.substring(number - 1)

  def sumOfNumbers(num1: Int, num2: Int): Int = num1 + num2

  def checkNums(num1: Int, num2: Int, checker: Boolean): Int = {
    if (num1 == 0) num2
    else if (num2 == 0) num1
    else if (checker == true) num1 * num2
    else num1 + num2
  }

  def iterator(name: String, num1: Int) {
    var a = 0
    while (a < num1) {
      println(name)
      a = a + 1
    }
  }

  def iterationsNew(letter: String, iterations: Int) {
    var a = 0
    while (a < iterations) {
      for (i <- 1 to iterations) {
        print(letter)
      }
      a = a + 1
      println("")
    }
  }

  def printIterations(firstWord: String, SecWord1: String, IterationsNew: Int) {
    for (a <- 1 to IterationsNew) {
      if (a % 3 == 0 && a % 5 == 0)
        print(firstWord + " " + SecWord1)
      else if (a % 3 == 0) {
        print(firstWord)
      } else if (a % 5 == 0) {
        print(SecWord1)
      } else {
        print(a)
      }
      if (a != IterationsNew) {
        print(",")
      }
    }
  }

  def recursiveFunc(word: String, n: Int): Unit = {
    if (n > 0) {
      print(word)
      recursiveFunc(word, n - 1)
    }
  }
}