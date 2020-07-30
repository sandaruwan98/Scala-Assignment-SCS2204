object Main extends App {

  class Account(id: String, no: Int, b: Double) {
    val nic: String = id
    val accnumber: Int = no
    var balance: Double = b

    def withdraw(a: Double) = this.balance = this.balance - a
    def deposit(a: Double) = this.balance = this.balance + a
    def transfer(acc: Account, a: Double) = {
      this.balance = this.balance - a
      acc.balance = acc.balance + a
    }
    override def toString(): String =
      "nic = " + this.nic + "  accnumber = " + this.accnumber + "  balance = " + this.balance
  }

  var acc1 = new Account("982221112v", 1, 2045.5)
  var acc2 = new Account("892434676v", 2, 4000.0)

  println(acc1.toString())
  println(acc2.toString())
  println("transfer 1000 from acc1 to acc2")

  acc1.transfer(acc2, 1000)

  println(acc1.toString())
  println(acc2.toString())

}
