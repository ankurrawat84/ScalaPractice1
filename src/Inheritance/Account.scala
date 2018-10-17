package Inheritance

class Account (){
//
//  def this(name: String, acctnumber: String){
//    name = this.name;
//    acctnumber = this.acctnumber
//  }

  var name= ""
  var acctnumber= ""

  def getDetails(nam: String, acctnum: String) {

    name = nam
    acctnumber = acctnum
    print("practice.Account Name: " + name + " practice.Account Number is: " + acctnumber)

  }
}


