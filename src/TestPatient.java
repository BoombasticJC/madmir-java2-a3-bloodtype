
public class TestPatient {

	public static void main(String[] args) {
		
		//testing default
		Patient carney = new Patient();
		
		//testing over-load
		BloodType bloodData = new BloodType("B", '+');
		Patient carol = new Patient(4581, 32, bloodData);
		
		//testing mutators
		Patient josh = new Patient(32009, 24, bloodData);
		josh.setPatientAge(100);
		josh.setPatientIdNumber(9857098);
		josh.setBloodType(new BloodType("AB", '-'));
		
		//System OutPut
		System.out.println("Carney's ID is " + carney.getPatientIdNumber()
				+ " Patients Age is " + carney.getPatientAge()
				+ " Blood type is " + carney.getBloodType());
		System.out.println("Carol's ID is " + carol.getPatientIdNumber()
				+ " Patients Age is " + carol.getPatientAge()
				+ " Blood type is " + carol.getBloodType());
		System.out.println("Josh's ID is " + josh.getPatientIdNumber()
				+ " Patients Age is " + josh.getPatientAge()
				+ " Blood type is " + josh.getBloodType());

	}

}
