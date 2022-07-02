package homework.oop_homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Example {
    public static void main(String[] args) throws ParseException {
        System.out.println("Beauty salon testing:\n");

        Customer firstCustomer = new Customer("Jānis Bērziņš", true, "Golden");
        Visit firstVisit = new Visit(firstCustomer,new SimpleDateFormat("dd.MM.yyyy").parse("19.06.2022"));
        firstVisit.setProductExpense(35.50);
        firstVisit.setServiceExpense(10.35);
        System.out.println(firstVisit.toString());
        System.out.println("Total expense for " + firstCustomer.getName()+ ": " + firstVisit.getTotalExpense());

        Customer secondCustomer = new Customer("Līga Liepiņa", false, "");
        Visit secondVisit = new Visit(secondCustomer,new SimpleDateFormat("dd.MM.yyyy").parse("20.06.2022"));
        secondVisit.setProductExpense(13.50);
        secondVisit.setServiceExpense(36.50);
        System.out.println(secondVisit.toString());
        System.out.println("Total expense for " + secondCustomer.getName()+ ": " + secondVisit.getTotalExpense());
    }
}