package services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.guide;
import utils.DBConnect;

public class guideService {
	//guide register
	public void regGuide(guide gd) {
		try {
			
			String query = "insert into guide values('" +gd.getGuideId()+ "','" +gd.getGuideName()+ "','" +gd.getGuideContact()+ "','" +gd.getGuideEmail()+ "','" +gd.getGuidePass()+ "')";
			Statement statement = DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//guide table view
	public ArrayList<guide> getAllGuide(){
		try {
			ArrayList<guide> listGud = new ArrayList<guide>();
			
			String query = "select * from guide";
			Statement statement = DBConnect.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				guide gd = new guide();
				
				gd.setGuideId(rs.getInt("guideId"));
				gd.setGuideName(rs.getString("guideName"));
				gd.setGuideContact(rs.getInt("guideContact"));
				gd.setGuideEmail(rs.getString("guideEmail"));
				gd.setGuidePass(rs.getString("guidePass"));
				
				listGud.add(gd);
			}
			return listGud;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public guide editGuide(guide gd) {
		try {
			
			String query = "select * from guide where guideEmail = '" +gd.getGuideEmail()+ "'";
			Statement statement = DBConnect.getConnection().createStatement();
			
			ResultSet rs = statement.executeQuery(query);
			if(rs.next()) {
				gd.setGuideId(rs.getInt("guideId"));
				gd.setGuideName(rs.getString("guideName"));
				gd.setGuideContact(rs.getInt("guideContact"));
				gd.setGuideEmail(rs.getString("guideEmail"));
				gd.setGuidePass(rs.getString("guidePass"));
				return gd;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void updateGuide(guide gd) {
		try {
			String query = "update guide SET guideName='"+gd.getGuideName()+"',guideContact='"+gd.getGuideContact()+"',guideEmail='"+gd.getGuideEmail()+"',guidePass='"+gd.getGuidePass()+"'where guideEmail='"+gd.getGuideEmail()+"' ";
			Statement statement = DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteGuide(guide gd) {
		try {
			String query = "Delete from guide where guideEmail = '"+gd.getGuideEmail()+"'";
			Statement statement = DBConnect.getConnection().createStatement();
			statement.executeUpdate(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}