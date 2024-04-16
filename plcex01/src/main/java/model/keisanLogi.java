package model;

public class keisanLogi  {
	public void execute(keisan keisan) {
		int price = keisan.getPrice();
		int kosuu = keisan.getKosuu();
		keisan.setKaikei(price * kosuu);

		if (keisan.getKaikei() >= 2000) {
			 keisan.setMsg("送料は無料です。");
		}else {
			keisan.setKaikei(keisan.getKaikei() + 250);
			keisan.setMsg("送料が250円かかります。");
		}
	}
}
