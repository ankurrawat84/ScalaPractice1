class Balance extends Account() {

  var bal = 100;
 // super.getDetails("ankur1","12345")


  //override def getDetails(nam: String, acctnum: String): Unit = super.getDetails(nam, acctnum+" partial ")

  override def getDetails(nam: String, acctnum: String): Unit = {
    //super.getDetails(nam,acctnum);
    print("\n" + "inside child class" + "\n")

  }

  print("\n" + bal + "\n")

}



object balMain extends App{
  var obj1= new Balance
  obj1.getDetails("ankur1","12345")

}