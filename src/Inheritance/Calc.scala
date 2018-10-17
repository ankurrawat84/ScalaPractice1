package Inheritance


abstract class Calc extends Calculator {

  override def add(x: Integer, y: Integer): Integer = {
    x + y
  }

 override def subs(x: Integer, y: Integer): Integer = {
   x-y
 }

  override def multi(x: Integer, y: Integer): Integer = {
    x*y
  }

  override def div(x: Integer, y: Integer): Integer
}


