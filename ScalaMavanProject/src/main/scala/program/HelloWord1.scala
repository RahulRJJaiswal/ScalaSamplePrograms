package program

object HelloWord1 {
  def main(args: Array[String]) {
    printWord("Hi...")
  }

  def printWord(word: String): Unit = {
    println(word)
  }
}
