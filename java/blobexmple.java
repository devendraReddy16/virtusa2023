import java.io.*; 
import java.sql.*; 
class BlobDemo 
{ 
 public static void main(String args[]) 
 { 
try{
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection  
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager"); 
PreparedStatement pstmt=con.prepareStatement("insert into images values(?,  ?)");  
pstmt.setString(1, args[0]);  
FileInputStream fis=new FileInputStream(args[1]); 
pstmt.setBinaryStream(2, fis, fis.available());  
pstmt.executeUpdate(); 
System.out.println("One Image Inserted Successfully"); 
}catch(Exception e) 
{  
 System.err.println(e); 
} 
 } 
} 
