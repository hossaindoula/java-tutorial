package info.doula.collection;

import info.doula.task.impl.Calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tasnim on 1/11/2018.
 */
public class CollectionFirst {

    public static void main(String[] args) {
        List<Map<String, Object>> students = new ArrayList<>();
        Map<String, Object> student = new HashMap<>();
        student.put("id", 1);
        student.put("Firstname", "Akib");
        student.put("Lastname", "Uddin");
        student.put("Department", "CSE");
        students.add(student);


        student = new HashMap<>();
        student.put("id", 2);
        student.put("Firstname", "Rubaiya");
        student.put("Lastname", "Doula");
        student.put("Department", "CSE");
        students.add(student);

        System.out.println(students);

        List<String> names = new ArrayList<>();
        names.add("Akib");
        names.add("Ruba");
        names.add("Ronnie");
        names.add("Ony");
        names.add("Sony");
        names.add("Johnny");
        names.add("Maisha");
        names.add("Sadat");
        names.add("Safin");
        System.out.println("names = " + names);

    }
}
