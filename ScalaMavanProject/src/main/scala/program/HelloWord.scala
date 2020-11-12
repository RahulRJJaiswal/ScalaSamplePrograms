package program

object HelloWord {
  def main(args: Array[String]) {
    printWord("Hi...")
  }

  def printWord(word: String): Unit = {
    println(word)
  }
}
