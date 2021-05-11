package campHomework3.campaign;

public class Campaing {
	private int campaingId;
	private String message;
	private int customerId;
	private int gamerId;
	
	public Campaing(int campaingId, String message, int customerId, int gamerId) {
		super();
		this.campaingId = campaingId;
		this.message = message;
		this.customerId = customerId;
		this.gamerId = gamerId;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	
}
