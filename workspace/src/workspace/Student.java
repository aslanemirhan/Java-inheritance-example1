package workspace;

public class Student extends User{

	
	private String studentNumber;
	private String lessonLearned;
	
	
	public Student() {}
	
	public Student(String studentNumber, String lessonLearned) {
		super();
		this.studentNumber = studentNumber;
		this.lessonLearned = lessonLearned;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getLessonLearned() {
		return lessonLearned;
	}

	public void setLessonLearned(String lessonLearned) {
		this.lessonLearned = lessonLearned;
	}
	

}
