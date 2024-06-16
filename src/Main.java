import Student.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * � Создать класс Студент
 * � Создать класс УчебнаяГруппа
 * � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
 * интерфейс Iterator
 * � Реализовать его контракты (включая удаление)
 * Создать класс СтудентКомпаратор реализующий интерфейс Comparator
 * � Реализовать контракт compare () со сравнением по какому-либо параметру
 * (пример: сочетание Имя+Фамилия)
 * � Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
 * сортировки списка студентов по ФИО
 * � Модифицировать класс Контроллер, добавив в него метод сортировки
 * списка студентов по ФИО и вызывать в нем созданный метод из
 * УчебнаяГруппаСервис
 */
public class Main {
    static public void main (String[] args) {
        Student student1 = new Student("иван");

        Student student3 = new Student("антоныч");
        Student student2 = new Student("денис");



        StudentGroup studentGroup1 = new StudentGroup();


        studentGroup1.addStudent(student1);
        studentGroup1.addStudent(student2);
        studentGroup1.addStudent(student3);

//        Iterator<Student> iterator = new StudentGroupIterator(studentGroup1);
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        for (Student student: studentGroup1) {
//            System.out.println(student);
//        }

        ArrayList<Student> ts = new ArrayList<>(List.of(student1, student2, student3));

//        System.out.println(ts);
//
//        Collections.sort(ts);
//
//        System.out.println(ts);
//
//
//        Collections.sort(ts, new StudentComparator());
//
//        System.out.println(ts);
//
//        Collections.sort(ts, (s1, s2) -> s1.id - s2.id);
//
//        System.out.println(ts);


        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();
        StudentGroup studentGroup4 = new StudentGroup();

        Student student4 = new Student("лера");

        Student student5 = new Student("саша");
        Student student6 = new Student("ваня");

        studentGroup2.addStudent(student4);
        studentGroup3.addStudent(student5);
        studentGroup4.addStudent(student6);



        StudentsGroupStream studentsGroupStream1 = new StudentsGroupStream();
        StudentsGroupStream studentsGroupStream2 = new StudentsGroupStream();
        StudentsGroupStream studentsGroupStream3 = new StudentsGroupStream();

        studentsGroupStream1.addStudentGroup(studentGroup1);
        studentsGroupStream1.addStudentGroup(studentGroup2);
        studentsGroupStream2.addStudentGroup(studentGroup3);
        studentsGroupStream3.addStudentGroup(studentGroup4);

        StudentGroupStreamService ss = new StudentGroupStreamService();

        List<StudentsGroupStream> listStream = new ArrayList<>(List.of(studentsGroupStream2, studentsGroupStream1, studentsGroupStream3));

        System.out.println("До сортировки потоков");
        System.out.println(listStream);

        StreamComparator sc = new StreamComparator();

        System.out.println("После сортировки потоков");
        System.out.println(ss.sort(listStream, sc));

    }
}