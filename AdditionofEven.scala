object AdditionofEven{
def sum(n:Int):Int= n match{
case n if(n<=1) => 0
case n if(n%2==0) => n+sum(n-2)
case _  => n-1+sum(n-3)
}
def main(args:Array[String]):Unit={
print("Enter the value of n:");
var n= scala.io.StdIn.readInt();
if(n%2==0) println("Addition of all even number:-"+(sum(n)-n));
else println("Addition of all even number:-"+sum(n));
}
}