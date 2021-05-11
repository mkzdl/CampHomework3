package campHomework3.gamer;

public class GamerManager implements Panel {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getAd() + gamer.getSoyad() + "isimli oyuncu sisteme kayýt oldu...");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getAd() + gamer.getSoyad() + " isimli oyuncu bilgileri güncellendi...");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getAd() + gamer.getSoyad() +  " isimli oyuncu sistemden silindi...");
		
	}

}
