public class Test
{
  public static void main(String[] args)
  {
    Resource[] res = {new Resource("book", "pdf"), new Resource("sample", "txt")};
    ZoomLesson zoomLesson = new ZoomLesson("Data Structures", Date.today(), new Time(8, 20, 0), new Time(11, 45, 0), res, true, "link.com", true);
    ZoomLesson zoomLesson1 = new ZoomLesson("Data Structures 2", Date.today(), new Time(8, 20, 0), new Time(11, 45, 0), res, true, "zelda.com", false);
    Resource[] res2 = {new Resource("analysis", "jpeg")};
    Lesson lesson = new Lesson("Data Structures 3", Date.today(), new Time(8, 20, 0), new Time(11, 45, 0), res2);
    DiscordLesson discordLesson = new DiscordLesson("Data Structures 4", Date.today(), new Time(8, 20, 0), new Time(11, 45, 0), res2, false, "Voice1");


    Course course = new Course("SDJ");
    course.addLesson(zoomLesson);
    course.addLesson(zoomLesson1);
    course.addLesson(lesson);
    course.addLesson(discordLesson);

    Grade grade = new Grade(12, course);

    Student student = new Student(1234, "Bob");

    System.out.println(student.getName());
    System.out.println(student.getStudentNumber());
    System.out.println(student.getCoronaPassport());
    System.out.println(student.getAllCourses());
    System.out.println(student.getAllGrades());

    student.addCourse(course);
    student.addGrade(grade);
    student.addGrade(new Grade(2, new Course("RWD")));

    System.out.println(student.getAllCourses().length);
    System.out.println(student.getAllGrades().length);

    CoronaPassport coronaPassport = new CoronaPassport("Vaccinated", new Date(5, 5, 2021));
    student.addCoronaPassport(coronaPassport);
    System.out.println(student.getCoronaPassport());
    System.out.println(student.hasValidCoronaPassport());
    student.removeCoronaPassport();
    System.out.println(student.hasValidCoronaPassport());
  }
}
