public class CourseTest
{
  public static void main(String[] args)
  {
    Course course = new Course("SDJ", new Instructor("Allen", 515));
    System.out.println(course);

    course.addStudent(new Student("Andras", 1));
    course.addStudent(new Student("Iana", 3));
    course.setSecondaryInstructor(new Instructor("Richard", 515));
    System.out.println(course.getNumberOfStudents(1));
    System.out.println(course);
  }
}
