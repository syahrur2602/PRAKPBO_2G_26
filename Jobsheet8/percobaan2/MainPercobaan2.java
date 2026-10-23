package Jobsheet8.percobaan2;

import Jobsheet8.percobaan1.Employee;
import Jobsheet8.percobaan1.PermanentEmployee;
import Jobsheet8.percobaan1.InternshipEmployee;

public class MainPercobaan2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp =
                new PermanentEmployee("Dedik", 500);

        Employee e = pEmp;

        System.out.println(e.getEmployeeInfo());
        System.out.println("------------------");
        System.out.println(pEmp.getEmployeeInfo());

        InternshipEmployee iEmp =
                new InternshipEmployee("Sunarto", 5);

        e = iEmp;

        System.out.println("------------------");
        System.out.println(e.getEmployeeInfo());
    }
}