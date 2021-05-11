package campHomework3.gamer;

public class GamerManager implements Panel {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getAd() + gamer.getSoyad() + "isimli oyuncu sisteme kay�t oldu...");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getAd() + gamer.getSoyad() + " isimli oyuncu bilgileri g�ncellendi...");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getAd() + gamer.getSoyad() +  " isimli oyuncu sistemden silindi...");
		
	}

}
