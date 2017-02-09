package com.chumbok

object MutableList {

  def main(args: Array[String]): Unit = {

    listTest

  }

  def listTest(): Unit = {

    val fruitList: List[String] = List("apples", "oranges", "pears")

    println(fruitList)
    println("Second item on fruitList : " + fruitList.apply(1))

    println("Head of fruit : " + fruitList.head)
    println("Tail of fruit : " + fruitList.tail)
    println("Check if fruit is empty : " + fruitList.isEmpty)

    val emptyList: List[Nothing] = List()
    val emptyList1: List[Nothing] = Nil

    println("Check if emptyList is empty : " + emptyList.isEmpty)
    println("Check if emptyList1 is empty : " + emptyList1.isEmpty)

  }

  def concatListTest(): Unit = {

    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    // use two or more lists with ::: operator
    var fruit = fruit1 ::: fruit2
    println( "fruit1 ::: fruit2 : " + fruit )

    // use two lists with Set.:::() method
    fruit = fruit1.:::(fruit2)
    println( "fruit1.:::(fruit2) : " + fruit )

    // pass two or more lists as arguments
    fruit = List.concat(fruit1, fruit2)
    println( "List.concat(fruit1, fruit2) : " + fruit  )
  }


}