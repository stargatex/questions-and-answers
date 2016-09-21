/**
  * You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B.
  * Write a method to merge A and B in sorted order
  */

object TwoArray {
  def main(args: Array[String]) {
    val x = new Array[Int](12)
    val y = Array(2, 6, 4, 8)
    val lenX = x.length - y.length
    val lenY = y.length
    for (i <- 0 until lenX) {
      x(i) = i * 2
    }
    println("Merged Array Values : " + sortArray(x, y, lenX, lenY).mkString(" "))
  }

  def sortArray(a: Array[Int], b: Array[Int], lenA: Int, lenB: Int): Array[Int] = {
    var indexA: Int = lenA - 1
    var indexB: Int = lenB - 1
    var indexMerged: Int = lenA + lenB - 1

    while (indexA >= 0 && indexB >= 0) {
      if (a(indexA) > b(indexB)) {
        a(indexMerged) = a(indexA)
        indexA -= 1
        indexMerged -= 1
      } else {
        a(indexMerged) = b(indexB)
        indexB -= 1
        indexMerged -= 1
      }
    }
    while (indexB >= 0) {
      a(indexMerged) = b(indexB)
      indexB -= 1
      indexMerged -= 1
    }
    a
  }
}
