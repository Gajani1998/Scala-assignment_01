object account_transfer{
var bank: List[Account] = List();

  def main(args:Array[String]):Unit={
    val p = scala.io.StdIn.readLine("Enter the id:")
    print("Enter the account number:")
    val q = scala.io.StdIn.readInt()
    print("Enter the balance:")
    val r = scala.io.StdIn.readDouble()

    val Acc1 = new Account(p,q,r);

    println("[nic,acnum,balance]="+Acc1+"\n");
    val x= scala.io.StdIn.readLine("Enter the id:")
    print("Enter the account number:")
    val y = scala.io.StdIn.readInt()
    print("Enter the balance:")
    val z = scala.io.StdIn.readDouble()

    val Acc2 = new Account(x, y, z);
    println("[nic,acnum,balance]="+Acc2);
    print("\nEnter the total amount to transfer from this account to given account:");
    val total = scala.io.StdIn.readDouble()
    val t=Acc1.transfer(Acc2,total);
    println("\nAccount1 Details:");
    println("[nic,acnum,balance]="+Acc1);
    println("\nAccount2 Details:");
    println("[nic,acnum,balance]="+Acc2);
  }
}

class Account(id:String, n:Int, b:Double){
  val nic:String=id
  val acnumber:Int=n
  var balance:Double =b
  def withdraw(a:Double)=this.balance=this.balance-a
  def deposit(a:Double)=this.balance=this.balance+a
  def transfer(a: Account, b: Double): Unit ={
    if(this.balance>b)
    {
      this.balance-=b;
      a.balance+=b;
    }
    else
    {
      println("your balance is not enough .");
    }
  }
  override def toString = "[" + nic + ":" + acnumber + ":" + balance + "]"

}
