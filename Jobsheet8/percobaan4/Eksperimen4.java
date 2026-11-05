package Jobsheet8.percobaan4;

import Jobsheet8.percobaan1.Employee;
import Jobsheet8.percobaan1.InternshipEmployee;
import Jobsheet8.percobaan1.PermanentEmployee;

public class Eksperimen4 {

    public static void main(String[] args) {
        Employee e = new InternshipEmployee("Sunarto", 5);
        System.out.println("Sebelum casting");
        PermanentEmployee pe = (PermanentEmployee) e;
        System.out.println("Sesudah casting: " + pe.getSalary());
    }
}
