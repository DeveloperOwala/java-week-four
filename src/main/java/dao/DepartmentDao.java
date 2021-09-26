package dao;

import model.Department;
import model.user;

import java.util.List;

public interface DepartmentDao {


    //create method
    void add(Department department);
    void addDepartmentToUser(Department department, user user);

    //read method
    List<Department> getAll();
    List<user> getAllUsersByDepartment(int departmentid);


    Department findById(int id);
    // List<user> getAllusersForADepartment(int departmentid);

    //update method
    void update(int id, String name, String about, String website, String email);

    //delete method
    void deleteById(int id);
    void clearAll();
}
