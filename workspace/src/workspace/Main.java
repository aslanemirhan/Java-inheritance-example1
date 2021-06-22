package workspace;

public class Main {

	public static void main(String[] args) {
		
		Instructor teacher = new Instructor();
		teacher.setId(1);
		teacher.setFirstName("Engin");
		teacher.setLastName("Demiroğ");
		teacher.setTeacherNumber("1111");
		teacher.setLessonTaught("Java-React");
		
		Student student = new Student();
		student.setId(9);
		student.setFirstName("Emirhan");
		student.setLastName("Aslan");
		student.setStudentNumber("9999");
		student.setLessonLearned("Java-React");
		

		
//		InstructorManager instructors = new InstructorManager();
//		instructors.addTeacher(teacher);
//		
//		StudentManager students = new StudentManager();
//		students.addStudent(student);
		
		UserManager userManager = new UserManager();
		
		User[] multi = {teacher,student};
		
		userManager.addMulti(multi);
		
		
		

	}

}
