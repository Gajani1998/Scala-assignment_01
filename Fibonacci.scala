object Fibonacci{
def fib(n:Int):Int =n match{
case n if(n==0) => 0
case n if(n==1) => 1
case _ => fib(n-1)+fib(n-2)
}
def fibseq(n:Int):Any={
if(n>0) fibseq(n-1)
print(fib(n)+" ");
}
def main(args:Array[String]):Unit={
print("Enter the value of n:");
var n= scala.io.StdIn.readInt();
fibseq(n);
}
}