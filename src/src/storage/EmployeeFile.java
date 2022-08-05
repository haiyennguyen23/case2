package storage;

import model.Employee;
import model.FulltimeEmployee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile implements Serializable {
    private static final long serialVersionUID = 6433858223774886977L;


    public static void writeFile(List<Employee> employees){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.dat");
            ObjectOutputStream ost = new ObjectOutputStream(fileOutputStream);
            ost.writeObject(employees);
            ost.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFile(){
        List<Employee> employees = null;
        try {
            FileInputStream fis = new FileInputStream("employee.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            employees = (List<Employee>) ob;
            ois.close();
            fis.close();
            return employees;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void main(String[] args) throws IOException {
                FulltimeEmployee b1 = new FulltimeEmployee(100, 0, 10000);
                FulltimeEmployee b2 = new FulltimeEmployee(10, 50, 20000);
//                PartimeEmployee b3 = new PartimeEmployee(3.4f);
//                PartimeEmployee b4 = new PartimeEmployee(10.0f);
        List<Employee> employees = new ArrayList<>();
        employees.add(b1);
        employees.add(b2);
//        employees.add(b3);
//        employees.add(b4);
        writeFile(employees);
        File file= new File("employee.dat");
        if(!file.exists()){
            file.createNewFile();
        }
        List<Employee> employees1 = EmployeeFile.readFile();
        System.out.println(employees1);
    }

}
