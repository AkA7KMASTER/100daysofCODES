/*
In computer science, a priority queue is an abstract data type which is like a regular queue, 
but where additionally each element has a "priority" associated with it. In a priority queue, 
an element with high priority is served before an element with low priority.

Problem Statement:
There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:

The Student class should implement:
The constructor Student(int id, String name, double cgpa).
The method int getID() to return the id of the student.
The method String getName() to return the name of the student.
The method double getCGPA() to return the CGPA of the student.
The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events 
and return all the students yet to be served in the priority order.

Input Format:

The first line contains an integer, n, describing the total number of events. Each of the n subsequent lines will be of the 
following two forms:

->ENTER name CGPA id: The student to be inserted into the priority queue.
->SERVED: The highest priority student in the queue was served.

Output Format

The locked stub code prints the names of the students yet to be served in the priority order. 
If there are no such student, then the code prints EMPTY.

Sample Input:
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Sample Output:
Dan
Ashley
Shafaet
Maria
*/

import java.util.*;

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getID));

    public List<Student> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");

                queue.add(new Student(Integer.parseInt(details[3]), details[1], Double.parseDouble(details[2])));
            }
        });

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Priorities pr = new Priorities();
        int totalEvents = Integer.parseInt(sc.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = sc.nextLine();
            events.add(event);
        }

        List<Student> students = pr.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
        sc.close();
    }
}