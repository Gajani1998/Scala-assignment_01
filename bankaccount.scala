object bankaccount{
def main(args:Array[String]):Unit={
var acc_no1=new Account("12345",100101,10567.89)
var acc_no2=new Account("56789",100102,-3451.65)
var acc_no3=new Account("23456",100103,78543.00)
var acc_no4=new Account("78910",100104,-345.00)
var acc_no5=new Account("34567",100105,-12.50)
var bank:List[Account]=List(acc_no1,acc_no2,acc_no3,acc_no4,acc_no5);
val overdraft=(b:List[Account])=>b.filter(_.balance<0))
val balance=(b:List[Account])=>b.reduce((x,y)=>x._3+y._3)
//val f1=(x:Double)=>(x>0) ?x*1.05  : x*1.1)
val f1=(b:List[Account])=>  b.map((_.balance>0) ?_.balance*1.05  : _balance*1.1)
val interest=(b.List[Double])=>b(f1).reduce((x,y)=>x+y)
println("List of accounts with  negative balance:"+overdraft(bank))
println("sum of all accounts balance:"+balance)
println("final balance of all accounts :"+interest)
}
}
class Account(id:String,n:Int,b:Double){
val nic:String=id
val acnumber:Int=n
var balance:Double =b
def withdraw(a:Double)=this.balance=this.balance-a
def deposit(a:Double)=this.balance=this.balance+a
def transfer(a: Account, b: Double): Unit ={
a.withdrew(b)
a.deposit(b)
}

override def toString="["+nic+"+"acnumber+":"+balance+"]"
}


