package lab4.compulsory;


import lombok.var;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainLab4 {
    /**
     * Instantiation of the objects given in example, adding schools to a set,
     * sorting and mapping of both students and schools
     **/
    public static void main(String[] args) {

        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i))
                .toArray(Student[]::new);

        List<Student> studentList = new ArrayList<>(Arrays.asList(students));

        var schools = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new School("H" + i))
                .toArray(School[]::new);

        List<School> schoolList = new ArrayList<>(Arrays.asList(schools));
        schools[0].setCapacity(1);
        schools[1].setCapacity(2);
        schools[2].setCapacity(2);

        Set<School> schoolSet = new TreeSet<School>(new SchoolComparator());
        schoolSet.add(schools[0]);
        schoolSet.add(schools[1]);
        schoolSet.add(schools[2]);

        for(School school : schoolSet)
            System.out.println(school);

        //lists of sorted schools and students
        List<Student> sortedStudents = studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        List<School> sortedSchools = schoolList.stream()
                .sorted(Comparator.comparing(School::getName))
                .collect(Collectors.toList());


        //Student Map
        Map<Student, List<School>> studPrefMap = new HashMap<>();
        studPrefMap.put(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        studPrefMap.put(students[1], Arrays.asList(schools[0], schools[1], schools[2]));
        studPrefMap.put(students[2], Arrays.asList(schools[0], schools[1], schools[2]));
        studPrefMap.put(students[3], Arrays.asList(schools[0], schools[1], schools[2]));

        System.out.println("Students map: ");
        for (Map.Entry<Student, List<School>> entry : studPrefMap.entrySet())
            System.out.println(entry);

        //School Map
        Map<School, LinkedList<Student>> schoolPrefMap = new TreeMap<>();
        schoolPrefMap.put(schools[0], new LinkedList<>(Arrays.asList(students[3], students[0], students[1], students[2])));
        schoolPrefMap.put(schools[1], new LinkedList<>(Arrays.asList(students[0], students[1], students[2])));
        schoolPrefMap.put(schools[2], new LinkedList<>(Arrays.asList(students[0], students[1], students[3])));

        System.out.println("Schools map: ");
        for (Map.Entry<School, LinkedList<Student>> entry : schoolPrefMap.entrySet())
            System.out.println(entry);
    }


}
