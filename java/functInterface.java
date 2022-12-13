import java.util.function.*; 
class Demo 
{ 
 /*int cube(int a) 
 { 
return a*a*a; 
 }*/ 
 public static void main(String args[]) 
 { 
/*Demo d=new Demo(); 
System.out.println(d.cube(5));*/ 
Function<Integer, Integer> f=a->a*a*a; 
System.out.println(f.apply(3)); 
 } 
} 
