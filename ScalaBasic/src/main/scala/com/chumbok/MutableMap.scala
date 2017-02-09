package com.chumbok


object MutableMap {

  def main(args: Array[String]): Unit = {

    mapTest
    valMapTest
    concatMap
  }

  def mapTest(): Unit = {

    var map: Map[String, Int] = Map()
    map += ("One" -> 1)
    map += ("Two" -> 2)

    println(map)
    println("Keys : " + map.keys)
    println("Values : " + map.values)
    println("Size : " + map.size)

  }

  def valMapTest(): Unit = {

    val map: Map[String, Int] = Map("Three" -> 3, "Four" -> 4)

    println(map)
    println("Keys : " + map.keys)
    println("Values : " + map.values)
    println("Size : " + map.size)

  }

  def concatMap(): Unit = {

    val map1: Map[String, Int] = Map("Three" -> 3, "Four" -> 4)

    var map2: Map[String, Int] = Map()
    map2 += ("One" -> 1)
    map2 += ("Two" -> 2)

    val concatedMap = map1 ++ map2
    println("Concated Map : " + concatedMap)

    // Iterate map
    concatedMap.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + concatedMap(i))
    }

    // Find key in map
    if (concatedMap.contains("One")) {
      println("'One' key exists with value :" + concatedMap("One"))
    } else {
      println("'One' key does not exist")
    }

  }

}