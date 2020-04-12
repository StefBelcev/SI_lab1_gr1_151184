class Student {
	String index;
	String firstName;
	String lastName;
    List<Integer> labPoints;
	//TODO constructor
	public Student(string i, string fn, string ln,List<Integer> labPoints){
		this.index = i;
		this.firstName = fn;
		this.lastName = ln;
		this.labPoints = labPoints;
	}
	//TODO seters & getters
	public void setIndex(String i){
		this.index = i;
	}

	public String getIndex(){
		return this.index;
	}

	public void setFirstName(String fn){
		this.firstName = fn;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public void setLastName(String ln){
		this.lastName = ln;
	}

	public String getLastName(){
		return this.lastName;
	}

	public void setLabPoints(List<Integer> lp){
		this.labPoints = lp;
	}

	public String getLabPoints(){
		return this.labPoints;
	}
	public double getAverage() {
		double average = 0;
		for(List<Integer> l: labPoints){
			average += l;
		}
		average = average/len(labPoints);
		return average;
	}

	public boolean hasSignature() {
		if(len(labPoints) >= 8)
			return true;
		else
			return false;
	}
}
class Course{
	List<Student> students = new List(Student);
	public Course(List<Students> s){
		this.students = s;
	}
}
