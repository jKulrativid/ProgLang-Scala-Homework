package main

import homework.Question01
import homework.Question02
import homework.Question03
import homework.Question04
import homework.Question05
import homework.Question06
import homework.Question07

object Main {
  def main(args: Array[String]) : Unit = {
    testMyMap()
  }

  def testInsertAtPosition() : Unit = {
    val ls = List(1, 3, 4, 1, 0 , 8)
    val qs = Question01
    println(s"Before Insert = $ls")
    println(qs.insertATPosition(666, 0, ls))
    println(qs.insertATPosition(666, 4, ls))
    println(qs.insertATPosition(666, 1000, ls))
    println(qs.insertATPosition(666, -1, ls))
  }

  def testInsertInOrder() : Unit = {
    val ls = List(1, 3, 5, 7, 9, 11)
    val qs = Question02
    println(qs.insertInOrder(0, ls))
    println(qs.insertInOrder(8, ls))
    println(qs.insertInOrder(15, ls))
  }

  def testSubList() : Unit = {
    val qs = Question03
    println(qs.subList(List(1, 3, 5), List(1, 2, 3, 4, 5)))
    println(qs.subList(List(), List()))
    println(qs.subList(List(), List(1, 2, 3)))
    println(qs.subList(List(1, 2, 3, 4), List(1, 2)))
  }

  def testPalindrome() : Unit = {
    val qs = Question04
    println(qs.palindrome(List('A', 'A', 'A', 'A')))
    println(qs.palindrome(List('A', 'B', 'C')))
    println(qs.palindrome(List('A', 'B', 'A', 'C', 'A', 'C', 'A', 'B', 'A')))
  }

  def testMergeSort() : Unit = {
    val qs = Question05
  }

  def testMyFilter() : Unit = {
    val qs = Question06
    val isLessThan3 = (x:Int) => x<3
    println(qs.myFilter(x => x%2==0)(List(1,2,3,4,5)))
		println(qs.myFilter(isLessThan3)(List(1,2,3,4,5)))
  }

  def testMyMap() : Unit = {
    val qs = Question07
    val square = (x:Int) => x*x
    println(qs.myMap(x => x*2)(List(1,2,3,4,5)))
    println(qs.myMap(square)(List(1,2,3,4,5)))
  }

  def testMaxAll() : Unit = {

  }
}