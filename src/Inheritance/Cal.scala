package Inheritance


class Cal extends Calc with Calculator {

  override def div(x: Integer, y: Integer): Integer = {
    if (y == 0){
      0
    }
    else{
      x/y
    }
  }

  def oldadd(x: Integer, y: Integer) = super[Calculator].add(x: Integer, y: Integer)


  }


object calMain extends App{
  val obj1 = new Cal
  print("sum: " +obj1.add(1,2) + "\n")
  print("old sum: " +obj1.oldadd(1,2) + "\n")
  print("div: "+obj1.div(4,2))
}

