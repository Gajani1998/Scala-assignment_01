object Addition{
def sum(n:Int):Int={
if(n==1) 1
else n+sum(n-1)
}
def main(args:Array[String]):Unit={
print("Enter the value of n:");
var n= scala.io.StdIn.readInt();
println("Addition of Numbers:-"+sum(5));
}
}