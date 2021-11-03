package mulesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.Statement;
public class class366 {
public static void main(String args[])
{
try
{
  Connection con = null;

  Driver d = new com.mysql.cj.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loaded");


  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muleproj","root","root");
  
  Statement stmt1 = con.createStatement();
  Statement stmt2 = con.createStatement();
  Statement stmt3 = con.createStatement();
  String sql1 = "insert into details values('seethaiah','Nandamuri HariKrishna','Soundarya','Y. V. S.Chowdary',2003)";
  String sql2 = "insert into details values('Ninnu Chudalani','Jr Ntr','Raveena Rajput','V.R. Pratap',2001)";
  String sql3 = "insert into details values('Adavi Ramudu','NTR','Jaya Prada','Kovelamudi Raghavendra Rao',1999)";
    stmt1.executeUpdate(sql1);
    stmt2.executeUpdate(sql2);
    stmt3.executeUpdate(sql3);
    System.out.println("Records inserted successfully!");
  con.close();



  con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}