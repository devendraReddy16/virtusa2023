import java.util.function.*; 
class Demo 
{ 
 /*boolean isEven(int a) 
 { 
if(a%2==0) 
 return true; 
else 
 return false; 
 }*/ 
 public static void main(String args[]) 
 { 
/*Demo d=new Demo(); 
System.out.println(d.isEven(5));*/ 
Predicate<Integer> p=a->a%2==0; 
System.out.println(p.test(4));
 } 
} 
