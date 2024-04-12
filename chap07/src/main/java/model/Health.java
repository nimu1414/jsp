package model;

public class Health implements java.io.Serializable {
	private double height,weight,bmi;
	private String bodytype;

	public double getHeight() {return height;}
	public double getWeight() {return weight;}
	public double getBmi() {return bmi;}
	public String getBodetype() {return bodytype;}
	public void setHeight(double height) {this.height = height;}
	public void setWeight(double weight) {this.weight = weight;}
	public void setBmi(double bmi) {this.bmi = bmi;}
	public void setBodytype(String bodytype) {this.bodytype = bodytype;}

}
