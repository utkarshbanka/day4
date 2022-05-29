package masai;

public class Student {

	int roll;
	String name;
	String address;
	String collegeName;
	
	public Student(){
		
	}
	
	
	Student(int roll, String name, String address, String collegeName){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collegeName=collegeName;
	}
	
	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCollegeName() {
		return collegeName;
	}
	
	Student(int roll, String name, String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collegeName="NIT";
	}
	
	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			Student students = new Student(1234,"Rahul","Delhi");
			return students;
		} else {
			Student students = new Student(1221,"Saurabh","Bangalore","VIT");
			return students;
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       Student obj = Student.getStudent(true);
		
		Student obj1 = Student.getStudent(false);
		
		System.out.println("roll: "+obj.getRoll());
		System.out.println("name: "+obj.getName());
		System.out.println("address: "+obj.getAddress());
		System.out.println("collegeName: "+obj.getCollegeName());
		
		System.out.println("roll: "+obj1.getRoll());
		System.out.println("name: "+obj1.getName());
		System.out.println("address: "+obj1.getAddress());
		System.out.println("collegeName: "+obj1.getCollegeName());
		
		
		
	}

}
