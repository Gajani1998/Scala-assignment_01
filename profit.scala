object profit{
def attendee(price:Int)=120+(15-price)*4;
def cost(x:Int)=500+3*attendee(x);
def profit(p:Int)=p*attendee(p)-cost(p);
def main(args:Array[String]):Unit={
var x:Int=profit(15);
var y:Int=profit(10);
var z:Int=profit(20);
println("profit for price of Rs 15.00 per ticket:-Rs "+x);
println("profit for price of Rs 10.00 per ticket:-Rs "+y);
println("profit for price of Rs 20.00 per ticket:-Rs "+z);
println("\n");
if(x>=y)
{
    if(x>z)
    {
    println("\"Best ticket price is Rs 15.00 for highest profit\"");
    }
    else{
	println("\"Best ticket price is Rs 20.00 for highest profit\"");
	}
}
else if(y>=z){
println("\"Best ticket price is Rs 10.00 for highest profit\"");
}
else{
println("\"Best ticket price is Rs 20.00 for highest profit\"");
}
}
}