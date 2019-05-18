package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapGrouping
{

    private static class Student
    {

        private final String name;

        private final int age;

        public Student(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }
    }

    public static void main(String[] args)
    {
        final List<Student> students = new ArrayList<>();
        students.add(new Student("Kim", 20));
        students.add(new Student("Mike", 20));
        students.add(new Student("Joe", 21));
        students.add(new Student("Beth", 22));

        final Map<Integer, List<Student>> studentsByAge
                = students.stream().collect(Collectors.groupingBy(Student::getAge));

        for (int age : studentsByAge.keySet())
        {
            System.out.println("Students of Age: " + age);

            final List<Student> studentsForAge = studentsByAge.get(age);

            for (Student currentStudent : studentsForAge)
            {
                System.out.println(currentStudent.getName());
            }

            System.out.println();
        }
    }
}
