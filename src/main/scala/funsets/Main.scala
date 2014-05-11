package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s123 = union(s1, union(s2, s3))
  printSet(s123)
  printSet(map(s123, _ + 10))
}
