package program

object starPattern {

  def main(args: Array[String]): Unit = {
    printPattern()
  }

  def printPattern() = {
    var v_continue = "Y"
    do {
      var options = chooseOptions()
      matchCase(options._1, options._2)

      println("Do you want to continue(Y/N): ")
      v_continue = utils.userInputString()
    } while(v_continue == "Y" || v_continue == "y")

    println("bye bye... :)")
  }

  def chooseOptions()={
    println("Please chose from below options: \n" +
      "1. Right Triangle Star Pattern \n" +
      "2. Mirrored Right Triangle Star Pattern \n" +
      "3. Inverted Right Triangle Star Pattern \n" +
      "4. Inverted Mirror Right Triangle Star Pattern \n"+
      "5. Pyramid Star Pattern")
    val option = utils.userInputNumber()

    print("Enter the number of rows ")
    val num = utils.userInputNumber()

    var opt = (option,num)
    opt
  }

  def matchCase(option: Any, num: Int): Any = option match {
    case 1 => rightTriangleStarPattern(num)
    case 2 => mirroredRightTriangleStarPattern(num)
    case 3 => invertedRightTriangleStarPattern(num)
    case 4 => invertedMirrorRightTriangleStarPattern(num)
    case 5 => pyramidStarPattern(num)
    case _ => "NO OPTION FOUND..."
  }

  def pyramidStarPattern(n:Int): Unit ={
    var m = n
    for (i <- 1 to n by 1){
        for (j <- 1 to m by 1){
          print(" ")
        }
      for (k <- 1 to 2*i -1){
        print("*")
      }
      m = m-1
      println("")
    }
  }
  def invertedMirrorRightTriangleStarPattern(n:Int): Unit ={
    var m = 1
    for(i <- 1 to n by 1){
      for (j <- 1 to m by 1){
        print(" ")
      }
      for(k <- m to n by 1) {
        print("*")
      }
      println("")
      m = m+1
    }
  }
  def invertedRightTriangleStarPattern(n: Int): Unit ={
    for(i <- n to 1 by -1){
      for(j <- 1 to i by 1){
        print("*")
      }
      println("")
    }
  }
  def rightTriangleStarPattern(n: Int): Unit ={
    println("Pattern: ")
    for (i <- 1 to n by 1){
      for (j <- 1 to i by 1){
        print("*")
      }
      println("")
    }
  }
  def mirroredRightTriangleStarPattern(n: Int): Unit ={
    var m: Int = 1
    for (i <- n to 1 by -1){
     for (j <- 1 to (i-1) by 1){
       print(" ")
     }
     for (k <- 1 to m by 1){
       print("*")
     }
      m = m+1
        println("")
   }
  }
}
