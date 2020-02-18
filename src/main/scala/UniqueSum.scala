object UniqueSum {

  def main(args: Array[String]): Unit = {

    println(uniqueSum(1,2,3))

  }

  def uniqueSum(num1:Int,num2:Int,num3:Int): Int ={
    println("Unique Sum")
    var amount = 0
    if(num1 == num2 && num2 == num3) amount = 0
    else if(num1 == num2) amount = num3
    else if(num2 == num3) amount = num1
    else if(num1 == num3) amount = num2
    else amount = num1 + num2 + num3
    amount
  }

}
