object BlackJack {

  def main(args: Array[String]): Unit = {

    blackjackgame(18,19)

  }

  def blackjackgame(a :Int, b:Int): Unit ={
    if (a>21 && b>21) println(0)
    else if (a > b) println(a)
    else(println(b))
  }
}
