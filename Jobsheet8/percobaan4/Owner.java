package Jobsheet8.percobaan4;

import Jobsheet8.percobaan1.ElectricityBill;
import Jobsheet8.percobaan1.Employee;
import Jobsheet8.percobaan1.Payable;
import Jobsheet8.percobaan1.PermanentEmployee;

public class Owner {

    public void pay(Payable p) {
        System.out.println("Total payment = " + p.getPaymentAmount());

        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println(eb.getBillInfo());
        } else if (p instanceof PermanentEmployee) {
            PermanentEmployee pe = (PermanentEmployee) p;
            System.out.println(pe.getEmployeeInfo());
        }
    }

    public void showMyEmployee(Employee e) {
        System.out.println(e.getEmployeeInfo());

        if (e instanceof PermanentEmployee) {
            System.out.println("You have to pay her/him monthly!!!");
        } else {
            System.out.println("No need to pay him/her :)");
        }
    }
}
