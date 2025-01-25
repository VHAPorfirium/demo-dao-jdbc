package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o DAO para Department
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        // Teste 1: Department findById
        System.out.println("=== Teste 1: Department findById ===");
        Department department = departmentDao.findById(2);
        if (department != null) {
            System.out.println(department);
        } else {
            System.out.println("Department with Id = 2 not found.");
        }

        // Teste 2: Department findAll
        System.out.println("\n=== Teste 2: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }

        // Teste 4: Department insert
        System.out.println("\n=== TEST 4: department insert =====");
        Department newDepartment = new Department(null, "Finance");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        // Teste 5: Department update
        System.out.println("\n=== TEST 5: department update =====");
        department = departmentDao.findById(1);
        if (department != null) {
            department.setName("Human Resources");
            departmentDao.update(department);
            System.out.println("Update completed");
        } else {
            System.out.println("Department with Id = 1 not found.");
        }

        // Teste 6: Department delete
        System.out.println("\n=== TEST 6: department delete =====");
        System.out.print("Enter Id for delete test: ");
        int id = sc.nextInt();

        try {
            departmentDao.deleteById(id);
            System.out.println("Delete completed");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

