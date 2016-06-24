package exercise1

object Hamlet {
  trait PrettyPrintable {
    def prettyPrint: String
  }

  val shakespeare = Author("William", "Shakespeare")
  val hamlet = Book("Hamlet", shakespeare, 1603)

  PrettyPrintable.toScreen(hamlet)
}
