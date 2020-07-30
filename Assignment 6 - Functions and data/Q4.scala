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
  var acc3 = new Account("345434676v", 3, -100.0)
  var acc4 = new Account("785434676v", 4, 7500.0)
  var acc5 = new Account("892455676v", 5, -3000.0)

  var bank: List[Account] = List(acc1, acc2, acc3, acc4, acc5)

  val overdraft = (b: List[Account]) => { b.filter(acc => acc.balance < 0) }
  val balance = (b: List[Account]) => {
    var total = b.reduce((x, y) => new Account("", 0, x.balance + y.balance))
    total.balance
  }
  val interest = (b: List[Account]) =>
    b.map((acc) => {
      if (acc.balance >= 0) acc.balance = acc.balance * 1.1
      else acc.balance = acc.balance * 1.05
      acc
    })
  // interest(bank).foreach(acc => {
  //   println(acc)
  // })
}
