package model;

public class HealthCheckLogi {
	public void execute(Health health) {
		//BMI算出
		double weight = health.getWeight();
		double height = health.getHeight();
		double bmi = weight / (height / 100.0 * height / 100.0);
		health.setBmi(bmi);
		String bodyType;
		if (bmi < 18.5) {
			bodyType = "瘦せ型";
		}else if(bmi < 25) {
			bodyType = "普通";
		}else {
			bodyType = "肥満";
		}
		health.setBodytype(bodyType);
	}
}
