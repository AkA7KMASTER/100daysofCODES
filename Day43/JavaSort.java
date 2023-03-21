/*
Input Format:
The first line of input contains an integer N, representing the total number of students. 
The next N lines contains a list of student information in the following structure:
-->ID Name CGPA<--

Output Format:
After rearranging the students according to the above rules, print the first name of each student on a separate line

Sample Input:
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76

Sample Output:
Ashis
Fahim
Samara
Samiha
Rumpa
*/


import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Complete the code
public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        in.close();
        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
                .thenComparing(Student::getId));
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
