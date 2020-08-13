package task2;

public class Student {
	private String nume;
	private int year;
	
	@Override
	public String toString() {
		return "Student [nume=" + nume + ", year=" + year + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
