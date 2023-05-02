package databases;
import java.util.ArrayList;

import models.User;

import java.sql.*;


public class UserDAO {
	
	User oneUser = null;
	Connection conn = null;
    Statement stmt = null;
	String user = "jonesdil";
    String password = "Grogglex7";
    // Note none default port used, 6306 not 3306
    String url = "jdbc:mysql://mudfoot.doc.stu.mmu.ac.uk:6306/"+user;

	public UserDAO() {}

	
	private void openConnection(){
		// loading jdbc driver for mysql
		try{
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch(Exception e) { System.out.println(e); }

		// connecting to database
		try{
			// connection string for demos database, username demos, password demos
 			conn = DriverManager.getConnection(url, user, password);
		    stmt = conn.createStatement();
		} catch(SQLException se) { System.out.println(se); }	   
    } 
	private void closeConnection(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private User getNextUser(ResultSet rs){
    	User thisUser=null;
		try {
			thisUser = new User(
					rs.getInt("id"),
					rs.getString("title"),
					rs.getString("lastName"),
					rs.getString("firstName"),
					rs.getInt("age"),
					rs.getString("gender"),
					rs.getString("educationLevel"),
					rs.getString("computerExperience"),
					rs.getInt("answer1"),
					rs.getInt("answer2"),
					rs.getInt("answer3"),
					rs.getInt("answer4"),
					rs.getInt("answer5"),
					rs.getInt("answer6"),
					rs.getInt("answer7"),
					rs.getInt("answer8"),
					rs.getInt("answer9"),
					rs.getInt("answer10"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return thisUser;		
	}
	
	
	
   public ArrayList<User> getAllUsers(){
	   
		ArrayList<User> allUsers = new ArrayList<User>();
		openConnection();
		
	    // Create select statement and execute it
		try{
		    String selectSQL = "select * from userDetails";
		    ResultSet rs1 = stmt.executeQuery(selectSQL);
	    // Retrieve the results
		    while(rs1.next()){
		    	oneUser = getNextUser(rs1);
		    	allUsers.add(oneUser);
		   }

		    stmt.close();
		    closeConnection();
		} catch(SQLException se) { System.out.println(se); }

	   return allUsers;
   }

   public User getUserByID(int id){
	   
		openConnection();
		oneUser=null;
	    // Create select statement and execute it
		try{
		    String selectSQL = "select * from userDetails where id="+id;
		    ResultSet rs1 = stmt.executeQuery(selectSQL);
	    // Retrieve the results
		    while(rs1.next()){
		    	oneUser = getNextUser(rs1);
		    }

		    stmt.close();
		    closeConnection();
		} catch(SQLException se) { System.out.println(se); }

	   return oneUser;
   }

   public boolean insertUser(User f) throws SQLException {
	    openConnection();
	    boolean b = false;
		try {
	        String insertSQL = "INSERT INTO userDetails (title, firstName, lastName, age, gender, educationLevel, computerExperience, answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	        PreparedStatement pstmt = conn.prepareStatement(insertSQL);
	        pstmt.setString(1, f.getTitle());
	        pstmt.setString(2, f.getFirstName());
	        pstmt.setString(3, f.getLastName());
	        pstmt.setInt(4, f.getAge());
	        pstmt.setString(5, f.getGender());
	        pstmt.setString(6, f.getEducation());
	        pstmt.setString(7, f.getExperience());
	        pstmt.setInt(8, f.getAnswer1());
	        pstmt.setInt(9, f.getAnswer2());
	        pstmt.setInt(10, f.getAnswer3());
	        pstmt.setInt(11, f.getAnswer4());
	        pstmt.setInt(12, f.getAnswer5());
	        pstmt.setInt(13, f.getAnswer6());
	        pstmt.setInt(14, f.getAnswer7());
	        pstmt.setInt(15, f.getAnswer8());
	        pstmt.setInt(16, f.getAnswer9());
	        pstmt.setInt(17, f.getAnswer10());
	        b = pstmt.execute();
	        pstmt.close();
	        closeConnection();
	        b = true;
	    } catch (SQLException s) {
	        s.printStackTrace();
	        throw new SQLException("User Not Inserted");
	    }
	    return b;
}
}