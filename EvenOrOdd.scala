object EvenOrOdd{
def check(n:Int):String= n match{
case n if(n%2==0) =>"Even"
case n => "Odd";
}
def main(args:Array[String]):Unit={
print("Enter the value of n:");
var n= scala.io.StdIn.readInt();
println(check(n));
}
}