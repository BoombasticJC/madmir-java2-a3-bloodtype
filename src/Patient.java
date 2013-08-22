
public class Patient {
	
		//Declaring Variables
		private int pIdNumber;
		private int pAge;
		private BloodType pBloodData;
		
		//Over-loaded Constructors
		public Patient(int id, int age, BloodType bloodData) {
			this.pIdNumber = id;
			this.pAge = age;
			this.pBloodData = bloodData;
		}
		
		//Constructor
		public Patient() {
			this(0,0,new BloodType());
		}
		
		//Accessor Methods
		public int getPatientIdNumber() {
			return pIdNumber;
		}
		public int getPatientAge() {
			return pAge;
		}
		public String getBloodType() {
			return pBloodData.getBloodType() + pBloodData.getRhFactor();
		}
		
		//Mutators Methods
		public void setPatientIdNumber(int newId) {
			pIdNumber = newId;
		}
		public void setPatientAge(int newAge) {
			pAge = newAge;
		}
		public void setBloodType(BloodType newBloodType) {
			pBloodData = newBloodType;
		}
	}

