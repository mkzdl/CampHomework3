package campHomework3;

import campHomework3.campaign.Campaing;
import campHomework3.gamer.Gamer;
import campHomework3.members.Members;

public class SalesManager {
	private Members[] members;
	private Gamer[] gamers;
	private Campaing camp;
	

	public SalesManager(Members[] members, Gamer[] gamers,Campaing camp) {
		super();
		this.members = members;
		this.gamers= gamers;
		this.camp=camp;
	}

	public void sales(Customer customer, Gamer gamer, Campaing camp) {
		System.out.println(customer.getAd() + " isimli müþteriye " + gamer.getAd() + " oyuncunun "
	    + gamer.getGame() + " oyun satýþý için " + camp.getCampaingId() + " numaralý kampanya uygulanmýþtýr. " );
	}
}
