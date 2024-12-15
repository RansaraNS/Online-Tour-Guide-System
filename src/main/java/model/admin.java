package model;

public class admin {
	
	private int adminId;
	private String adminName;
	private int adminContact;
	private String adminEmail;
	private String adminPass;
	
	
	public admin() {
		
	}
	
	public admin(int adminId, String adminName, int adminContact, String adminEmail, String adminPass) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmail = adminEmail;
		this.adminPass = adminPass;
	}
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(int adminContact) {
		this.adminContact = adminContact;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
}
