object pointcase{
def main(args:Array[String]):Unit={
println("Enter the x1 and y1  value of p1:")
val  x1 = scala.io.StdIn.readInt()
val  y1 = scala.io.StdIn.readInt()
println("Enter the x2 and y2  value of p2:")
val  x2= scala.io.StdIn.readInt()
val y2 = scala.io.StdIn.readInt()
println("Enter the x3 and y3  value of move point:")
val x3= scala.io.StdIn.readInt()
val y3= scala.io.StdIn.readInt()
val p1=point(x1,y1)
val p2=point(x2,y2)
val p3=p1+p2
val p4=p1.move(x3,y3)
val n=p1.distance(p2)
val p5=p1.invert()
println("Addition of p1 and p2 points:"+p3)
println("move point:"+p4)
println("distance between  p1 and p2:"+n)
println("inverse of p1 point:"+p5)
}
}

case class point(a:Int,b:Int)
{
def x:Int=a
def y:Int=b

def +(that:point)=point(this.x+that.x,this.y+that.y)
def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)
def distance(that:point):Double=math.sqrt(math.pow(x-that.x,2)+math.pow(y-that.y,2))
def invert()=point(y,x)
}