
public class BloodType {
	
	private String bloodType;
	private char rhFactor;
	
	//Constructors
	public BloodType(String newBloodType, char newRhFactor) {
		bloodType = newBloodType;
		rhFactor = newRhFactor;
	}
	public BloodType(String newBloodType) {
		this(newBloodType, '+');
	}
	public BloodType(char newRhFactor) {
		this("O", newRhFactor);
	}
	
	//Default
	public BloodType() {
		this("O", '+');
	}
	
	//Accessor methods
	public String getBloodType() {
		return bloodType;
	}
	
	public char getRhFactor() {
		return rhFactor;
	}
	
	//Mutator Methods
	public void  setBloodType(String blood) {
		bloodType = blood;
	}
	
	public void setRhFactor(char rh) {
		rhFactor = rh;
	}
}

