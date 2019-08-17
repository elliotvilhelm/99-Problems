object P1 {
  // last element of a list
  def run(): Unit = {
    var res = P1.last(Array(1,2,3))
    print(s"P1 (Last): ")
    res.foreach(println)
  }
  def last(l: Array[Int]): Array[Int] = {
    l match {
      case Array(_) => l
      case Array(_, _, _*)=> last(l.drop(1))
    }
  }
}

object P2 {
  // second to last element of a list
  def run(): Unit = {
    var res = P2.secondLast(Array(1,2,3,4))
    print(s"P2 (Second Last): ")
    res.foreach(println)
  }
  def secondLast(l: Array[Int]): Array[Int] = {
    l match {
      case Array(x, _) => Array(x)
      case Array(_, _, _, _*) => secondLast(l.drop(1))
    }
  }
}

object P3 {
  // kth element of an array
  def run(): Unit = {
    var res = P3.kthElement(Array(0,1,2,3,4,5), 2)
    println(s"P3 (Kth Element): $res")
  }
  def kthHelper(l: Array[Int], n: Int): Array[Int] = {
    n match {
      case 0 => l
      case x => kthHelper(l.drop(1), n-1)
    }

  }
  def kthElement(l: Array[Int], k: Int): Int = {
    kthHelper(l, k)(0)
  }
}

object P4 {
  // length of array
  def run(): Unit = {
    var res = P4.getSize(Array(0,1,2,3,4,5))
    println(s"P4 (Size): $res")
  }
  def getSize(l: Array[Int]): Int = {
    l match {
      case Array(_) => 1
      case Array(_, _, _*) => getSize(l.drop(1)) + 1
    }
  }
}

object P5 {
  // reverse an array
  def run(): Unit = {
    var res = P5.reverse(Array(0,1,2,3,4,5))
    print(s"P5 (Reverse): ")
    res.foreach(print)
    println()
  }
  def reverse(l: Array[Int]): Array[Int] = {
    l match {
      case Array(_) => l
      case Array(a, _, _*) => reverse(l.drop(1)) ++ Array(a)
    }
  }
}

object P6 {
  def run(): Unit = {
    println(s"P6 (Palindrome): 2112112 ${isPalindrome(List(2,1,1,2,1,1,2))}")
    println(s"P6 (Palindrome): 2112113 ${isPalindrome(List(2,1,1,2,1,1,3))}")
  }
  def isPalindrome(l: List[Int]): Boolean = {
    l match {
      case Nil => true
      case List(a,b) => a == b
      case List(a,_,b) => a == b
      case head :: tail => head == tail(tail.length-1) && isPalindrome(tail.drop(tail.length))
    }
  }
}

object Problems {
  def main(args: Array[String]): Unit = {
    P1.run()
    P2.run()
    P3.run()
    P4.run()
    P5.run()
    P6.run()
  }
}
