package program

import java.util.Scanner

import scala.io.StdIn.readInt

object utils {
  def userInputNumber() = {
    val scanner = new Scanner(System.in)
    val num = readInt()
    // val n = scanner.nextLine()
    num
  }

  def userInputString() = {
    val scanner = new Scanner(System.in)
    val inp = scanner.nextLine()
    // val n = scanner.nextLine()
    inp
  }
}