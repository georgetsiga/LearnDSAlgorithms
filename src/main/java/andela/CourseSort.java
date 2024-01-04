package andela;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSort {
    Queue<String> courseQue = new LinkedList<>();
    public static void main(String[] args) {
        String[][] prereqs_courses = new String[][]{
                {"Foundations of Computer Science", "Operating Systems"},
                {"Data Structures", "Algorithms"},
                {"Computer Networks", "Computer Architecture"},
                {"Algorithms", "Foundations of Computer Science"},
                {"Computer Architecture", "Data Structures"},
                {"Software Design", "Computer Networks"}
        };
        String course = "Software Design";
        CourseSort hello = new CourseSort();
        hello.sortCauses(prereqs_courses, course);
        hello.display();
    }

    public void sortCauses(String[][] courses, String firstCause) {
        for (int i = 0; i < courses.length; i ++) {
                if (courses[i][0].equals(firstCause) && courseQue.size() <= courses.length) {
                    courseQue.add(firstCause);
                    sortCauses(courses, courses[i][1]);
                }
        }
    }

    public void display() {
        while (courseQue.size() > 0) {
            System.out.println("# " + courseQue.poll());
        }
    }
}

//1st element is prerequist
// 	Software Design
// 	Computer Networks
// 	Computer Architecture
// 	Data Structures
// 	Algorithms
// 	Foundations of Computer Science
// 	Operating Systems