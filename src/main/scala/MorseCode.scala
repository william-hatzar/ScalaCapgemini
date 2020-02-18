object MorseCode{


  def morseCodeLookUp(letter: String): String = {

    val lettertoMorse = Map("a" -> ".-", "b" -> "-...", "c" -> "-.-.", "d" -> "-..", "e" -> ".", "f" -> "..-.", "g" -> "--.",
      "h" -> "....", "i" -> "..", "j" -> ".---", "k" -> "-.-", "l" -> ".-..", "m" -> "--", "n" -> "--", "o" -> "---",
      "p" -> ".--.", "q" -> "--.-", "r" -> ".-.", "s" -> "...", "t" -> "-", "u" -> "..-", "v" -> "...-", "w" -> ".--", "x" -> "-..-", "y" -> "-.--", "z" -> "--.."," " -> "/")

    lettertoMorse(letter)
  }

  def inputter(word:String): Unit ={

    var newWord = ""

    for (i<- 0 until word.length){
      newWord+= morseCodeLookUp(word.substring(i,i+1))
    }
    print(newWord)

  }

  def main(args: Array[String]): Unit = {
    println("Plese enter a word to translate")
    inputter(scala.io.StdIn.readLine())
  }


}