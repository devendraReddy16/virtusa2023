class Test 
{ 
static void show() 
{ 
 try{ 
 for(int i=1;i<=10;i++) 
 { 
System.out.println("Child Thread: "+i); 
Thread.sleep(1000); 
 } 
 }catch(Exception e) 
 { 
System.err.println(e); 
 } 
} 
} 
class Demo 
{ 
public static void main(String args[]) 
{ 
 Runnable r1=Test::show; 
 Thread t1=new Thread(r1); 
 t1.start();
 try{ 
 for(int i=1;i<=10;i++) 
 { 
System.out.println("Main Thread: "+i); 
Thread.sleep(1000); 
 } 
 }catch(Exception e) 
 { 
System.err.println(e); 
 } 
} 
} 
