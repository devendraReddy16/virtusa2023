import java.io.*; 
import javax.sql.rowset.*; 
import oracle.jdbc.rowset.*; 
class CRSDemo 
{ 
 public static void main(String args[])  { 
 try{ 
 CachedRowSet crs=new OracleCachedRowSet();  crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  crs.setUsername("system"); 
 crs.setPassword("manager"); 
 crs.setCommand("select * from student");  crs.execute(); 
 while(crs.next()) 
 { 
 System.out.print(crs.getInt("rollno")+"\t");  System.out.print(crs.getString("name")+"\t");  System.out.println(crs.getInt("marks"));  } 
 }catch(Exception e) 
 { 
 System.err.println(e);  
 } 
 } 
} 
