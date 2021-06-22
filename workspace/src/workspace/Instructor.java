package workspace;

public class Instructor extends User{

	private String teacherNumber;
	private String lessonTaught;
	
	public Instructor() {}

	public Instructor(String teacherNumber, String lessonTaught) {
		super();
		this.teacherNumber = teacherNumber;
		this.lessonTaught = lessonTaught;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getLessonTaught() {
		return lessonTaught;
	}

	public void setLessonTaught(String lessonTaught) {
		this.lessonTaught = lessonTaught;
	}
	
	
	

	
	
	
}
