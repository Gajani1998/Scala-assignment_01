object caesar{
def main(args:Array[String]):Unit={
val alphabet="ABCDEFGHIJKLMNOPQRSTVUWXYZ"
val key=1
val c=scala.io.StdIn.readLine("Message:")
val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size);
val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a));
val ct=cipher(E,c,key,alphabet);
val pt=cipher(D,ct,key,alphabet);
println("Encryption:"+ct);
println("Decryption:"+pt);
}
}