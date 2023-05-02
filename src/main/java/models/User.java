package models;

public class User {
	public User(int id, String title, String firstName, String lastName, int age, String gender, String educationLevel,
			String computerExperience, int answer1, int answer2, int answer3, int answer4, int answer5, int answer6,
			int answer7, int answer8, int answer9, int answer10) {
		super();
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.educationLevel = educationLevel;
		this.computerExperience = computerExperience;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
		this.answer7 = answer7;
		this.answer8 = answer8;
		this.answer9 = answer9;
		this.answer10 = answer10;
	}

	public User(String title, String firstName, String lastName, int age, String gender, String educationLevel,
			String computerExperience, int answer1, int answer2, int answer3, int answer4, int answer5, int answer6,
			int answer7, int answer8, int answer9, int answer10) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.educationLevel = educationLevel;
		this.computerExperience = computerExperience;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
		this.answer7 = answer7;
		this.answer8 = answer8;
		this.answer9 = answer9;
		this.answer10 = answer10;
	}

	public User() {

	}

	public User(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	int id;
	String title;
	String firstName;
	String lastName;
	int age;
	String gender;
	String educationLevel;
	String computerExperience;
	int answer1;
	int answer2;
	int answer3;
	int answer4;
	int answer5;
	int answer6;
	int answer7;
	int answer8;
	int answer9;
	int answer10;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return educationLevel;
	}

	public void setEducation(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getExperience() {
		return computerExperience;
	}

	public void setExperience(String computerExperience) {
		this.computerExperience = computerExperience;
	}

	public int getAnswer1() {
		return answer1;
	}

	public void setAnswer1(int answer1) {
		this.answer1 = answer1;
	}

	public int getAnswer2() {
		return answer2;
	}

	public void setAnswer2(int answer2) {
		this.answer2 = answer2;
	}

	public int getAnswer3() {
		return answer3;
	}

	public void setAnswer3(int answer3) {
		this.answer3 = answer3;
	}

	public int getAnswer4() {
		return answer4;
	}

	public void setAnswer4(int answer4) {
		this.answer4 = answer4;
	}

	public int getAnswer5() {
		return answer5;
	}

	public void setAnswer5(int answer5) {
		this.answer5 = answer5;
	}

	public int getAnswer6() {
		return answer6;
	}

	public void setAnswer6(int answer6) {
		this.answer6 = answer6;
	}

	public int getAnswer7() {
		return answer7;
	}

	public void setAnswer7(int answer7) {
		this.answer7 = answer7;
	}

	public int getAnswer8() {
		return answer8;
	}

	public void setAnswer8(int answer8) {
		this.answer8 = answer8;
	}

	public int getAnswer9() {
		return answer9;
	}

	public void setAnswer9(int answer9) {
		this.answer9 = answer9;
	}

	public int getAnswer10() {
		return answer10;
	}

	public void setAnswer10(int answer10) {
		this.answer10 = answer10;
	}

	@Override
	public String toString() {
		return "userDetails [id=" + id + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", educationLevel=" + educationLevel + ", computerExperience="
				+ computerExperience + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3
				+ ", answer4=" + answer4 + ", answer5=" + answer5 + ", answer6=" + answer6 + ", answer7=" + answer7
				+ ", answer8=" + answer8 + ", answer9=" + answer9 + ", answer10=" + answer10 + "]";
	}
}
