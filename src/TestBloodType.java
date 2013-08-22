
public class TestBloodType {

	public static void main(String[] args) {
		
		BloodType carney = new BloodType("O", '-');
		BloodType ashley = new BloodType();
		BloodType carol = new BloodType("AB");
		BloodType clyde = new BloodType('-');
		
		System.out.println("Carney's Blood Type is " + carney.getBloodType() 
				+ carney.getRhFactor());
		System.out.println("Ashleys Blood Type is " + ashley.getBloodType() 
				+ ashley.getRhFactor());
		System.out.println("Carol's Blood Type is " + carol.getBloodType() 
				+ carol.getRhFactor());
		System.out.println("Clyde's Blood Type is " + clyde.getBloodType() 
				+ clyde.getRhFactor());

	}

}
