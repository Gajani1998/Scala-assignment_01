object primeseq{
def gcd(x:Int,y:Int):Int= y match{
      case 0=>x
	  case y if(y>x) =>gcd(y,x)
	  case _ =>gcd(y,x%y)
	  }
def prime(p:Int,x:Int=2):Any=x match{
    case x  if(x==p) => p
    case x if(gcd(p,x)>1) =>" "
    case x => prime(p,x+1)
    }
def pseq(n:Int):Any={
    print(prime(n)+" ")
    if (n>0) pseq(n-1) 
} 

def main(args:Array[String]):Unit={
print("Enter the value of n:");
var n= scala.io.StdIn.readInt();
pseq(n);
 }
} 