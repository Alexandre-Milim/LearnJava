package org.alexandre.javacore.association.test;

import org.alexandre.javacore.association.domain.School;
import org.alexandre.javacore.association.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("DevDojo");

        Teacher[] teachers = {teacher1};
        School school = new School("Fateb", teachers);

        school.print();
    }
}
