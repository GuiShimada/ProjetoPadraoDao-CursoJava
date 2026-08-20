package aplication;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Department department = new Department(1, "Tec");

        Seller seller = new Seller(1, "Guilherme", "guishimada06@gmail.com", LocalDate.parse("08/03/2006", formatter), 3000.0, department);
        System.out.println(seller);

    }
}
