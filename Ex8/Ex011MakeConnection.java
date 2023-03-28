package Ex8;


import java.sql.*;

class MakeConnection {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/pradeep","root","Root1234");
			stmt = con.createStatement();
			int i = stmt.executeUpdate("create table pradeep(empno integer,ename varchar(20),deptno integer)");
			int i1=stmt.executeUpdate("insert into pradeep values (001,'sakre',23)");
			int i2=stmt.executeUpdate("insert into pradeep values (001,'pradeep',223)");
			int i3=stmt.executeUpdate("insert into pradeep values (001,'vivek',243)");
			System.out.println("Created Table and inserted");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Ex011MakeConnection {
	public static void main(String args[]) {
		new MakeConnection();
	}
}
