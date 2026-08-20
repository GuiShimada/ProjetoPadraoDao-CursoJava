package aplication;

import db.DB;
import model.entities.Department;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Guilherme");
        System.out.println(department);
    }
}
