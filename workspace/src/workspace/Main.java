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
		
//		UserManager userManager = new UserManager();
//		userManager.add(teacher);
//		userManager.add(student);
		
		InstructorManager instructors = new InstructorManager();
		instructors.addTeacher(teacher);
		
		StudentManager students = new StudentManager();
		students.addStudent(student);
		

	}

}
