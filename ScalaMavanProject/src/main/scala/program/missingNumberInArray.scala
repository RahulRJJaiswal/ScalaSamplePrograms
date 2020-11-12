package program

import java.util.Scanner

import scala.io.StdIn.readInt

object missingNumberInArray {
  def main(args: Array[String]): Unit = {
    val inputArray = userInput()
    val sum = sumUserInput(inputArray)
    val inputcal = formulaCalculation(inputArray.length)
    println("sum: " + sum)
    println("Input Cal:" + inputcal)
    println("Missing Number: " + missingNumner(inputcal, sum))

  }

  def missingNumner(inputcal: Int, sum: Int): Int = {
    inputcal - sum
  }

  def formulaCalculation(n: Int): Int = {
    (n * (n + 1)) / 2
  }

  def sumUserInput(inputArray: Array[Int]) = {
    var sum = 0
    for (i <- inputArray) {
      sum += i
    }
    sum
  }

  def userInput() = {
    val scanner = new Scanner(System.in)
    println("Enter the number of element")
    val n = readInt()
    // val n = scanner.nextLine()
    println("Number of elements : " + n)
    var userInput = new Array[Int](n)
    for (i <- 0 to n - 2) {
      userInput(i) = readInt()
    }
    userInput
  }
}
