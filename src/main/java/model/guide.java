package model;

public class guide {
	
	private int guideId;
	private String guideName;
	private int guideContact;
	private String guideEmail;
	private String guidePass;
	
	public guide() {
		
	}
	
	public guide(int guideId, String guideName, int guideContact, String guideEmail, String guidePass) {
		super();
		this.guideId = guideId;
		this.guideName = guideName;
		this.guideContact = guideContact;
		this.guideEmail = guideEmail;
		this.guidePass = guidePass;
	}
	
	public int getGuideId() {
		return guideId;
	}
	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}
	public String getGuideName() {
		return guideName;
	}
	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	public int getGuideContact() {
		return guideContact;
	}
	public void setGuideContact(int guideContact) {
		this.guideContact = guideContact;
	}
	public String getGuideEmail() {
		return guideEmail;
	}
	public void setGuideEmail(String guideEmail) {
		this.guideEmail = guideEmail;
	}
	public String getGuidePass() {
		return guidePass;
	}
	public void setGuidePass(String guidePass) {
		this.guidePass = guidePass;
	}
}
