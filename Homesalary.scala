object Homesalary{
def normal(s1:Int)=s1*150;
def OT(s2:Int)=s2*75;
def tax(t:Int)=t*0.1;
def income(s1:Int,s2:Int)=normal(s1)+OT(s2);
def takehome(s1:Int,s2:Int)=income(s1,s2)-tax(income(s1,s2));
def main(args:Array[String]):Unit={
println("Home salary Rs." +takehome(40,20));
}
}
