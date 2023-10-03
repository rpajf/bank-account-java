package ClassesFundamentals;

import ClassesFundamentals.Intro.LPAStudent;
import ClassesFundamentals.Intro.Student;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 4 ; i++) {
            LPAStudent s = new LPAStudent("123" + i,  switch (i){
                case 1 -> "amber";
                case 2 -> "mike";
                case 3 -> "borb neto";
                case 4 -> "borba";
                default -> "Arno";
            }, "2/2/1993", "Java" );
            System.out.println(s.toString());
        }
        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.getClass();
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());

    }


}
