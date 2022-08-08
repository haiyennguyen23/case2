package storage;

import model.Employee;

import java.io.*;
import java.util.List;

public class GhiFile {
    public void outPut(List<Employee> arr, String name){
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("NguyenHaiYen.txt"));
            for (int i = 0; i <arr.size(); i++) {
                if(arr.get(i).getName().equals(name)){
                    obj.writeObject(arr.get(i));
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //    Lấy dữ liệu trong file
    public void inPut(){
        try {
            ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("NguyenHaiYen.txt"));
            Employee arr = (Employee) obj2.readObject();
            System.out.println(arr);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
