package services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.admin;
import utils.DBConnect;

public class adminService {
	//admin register
	public void regAdmin(admin ad) {
		try {
			
			String query = "insert into admin values('" +ad.getAdminId()+ "','" +ad.getAdminName()+ "','" +ad.getAdminContact()+ "','" +ad.getAdminEmail()+ "','" +ad.getAdminPass()+ "')";
			Statement statement = DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//admin login
	public boolean validate(admin ad) {
		try {
			
			String query = "select * from admin where adminEmail = '"+ad.getAdminEmail()+"'and  adminPass = '"+ad.getAdminPass()+"'";
			
			Statement statement = DBConnect.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	//admin table view
	public ArrayList<admin> getAllAdmin(){
		try {
			ArrayList<admin> listAdd = new ArrayList<admin>();
			
			String query = "select * from admin";
			Statement statement = DBConnect.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				admin ad = new admin();
				
				ad.setAdminId(rs.getInt("adminId"));
				ad.setAdminName(rs.getString("adminName"));
				ad.setAdminContact(rs.getInt("adminContact"));
				ad.setAdminEmail(rs.getString("adminEmail"));
				ad.setAdminPass(rs.getString("adminPass"));
				
				listAdd.add(ad);
			}
			return listAdd;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
