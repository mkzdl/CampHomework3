package campHomework3.campaign;

public class CampingManager implements CampaingPanel{

	@Override
	public void add(Campaing camp) {
		System.out.println(camp.getCampaingId() + " numaral� kampanya sisteme tan�mland�...");
		
	}

	@Override
	public void delete(Campaing camp) {
		System.out.println(camp.getCampaingId() + " numaral� kampanya sistemden silindi...");
		
	}

	@Override
	public void update(Campaing camp) {
		System.out.println(camp.getCampaingId() + " numaral� kampanya g�ncellendi...");
		
	}

}
