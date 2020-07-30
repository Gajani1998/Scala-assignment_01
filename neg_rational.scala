object neg_rational{
def main(args:Array[String]):Unit={
print("Enter the value of a:")
val a=scala.io.StdIn.readInt()
print("Enter the value of b:")
val b=scala.io.StdIn.readInt()
val x=new Rational(a,b)
println(x)
println(x.neg)
}

class Rational(n:Int,d:Int){
def numer=n
def denom=d
def neg=new Rational(-this.numer,this.denom)
override def toString=numer+"/"+denom
}
}