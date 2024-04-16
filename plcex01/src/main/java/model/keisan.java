package model;

public class keisan {
	private int price,kosuu,kaikei;
	private String msg;
	public int getKaikei() {
		return kaikei;
	}
	public String getMsg() {
		return msg;
	}
	public int getPrice(){
		return price;
	}
	public int getKosuu(){
		return kosuu;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setKosuu(int kosuu) {
		this.kosuu = kosuu;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setKaikei(int kaikei) {
		this.kaikei = kaikei;
	}
}
