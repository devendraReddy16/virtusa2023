import java.io.*; 
import javax.sql.rowset.*; 
import oracle.jdbc.rowset.*; 
class WRSDemo 
{ 
 public static void main(String args[]) 
 { 
 try{ 
 WebRowSet wrs=new OracleWebRowSet(); 
 wrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  wrs.setUsername("system"); 
 wrs.setPassword("manager"); 
 wrs.setCommand("select * from student"); 
 wrs.execute(); 
 FileOutputStream fos=new FileOutputStream("student.xml");  wrs.writeXml(fos); 
 }catch(Exception e) 
 { System.err.println(e);  
 } 
 } 
}
