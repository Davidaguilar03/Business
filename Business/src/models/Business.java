package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Business {
    private ArrayList<Employee> employees;

    public Business() {
        employees = new ArrayList<Employee>();
    }

    public void addNewEmployee(Employee employee) {
        employees.add(employee);
    }

    public void readData() throws NumberFormatException, IOException {
        File f = new File("C:\\Users\\PC\\Desktop\\BusinessEm.txt");
        FileReader file = new FileReader(f);
        BufferedReader br= new BufferedReader(file);
        String cad;
        while ((cad = br.readLine()) != null) {
            String[] info = cad.split(",");
            int id = Integer.parseInt(info[0]);
            String firstName = info[1];
            String lastName = info[2];
            char gender = info[3].charAt(0);
            Employee auxEmp = new Employee(id, firstName, lastName, gender);
            this.addNewEmployee(auxEmp);
        }
        br.close();
    }
    public void readDataByte() throws NumberFormatException, IOException {
        File f = new File("C:\\Users\\PC\\Desktop\\BusinessEm2.txt");
        FileReader file = new FileReader(f);
        BufferedReader br= new BufferedReader(file);
        int i;
        String cad = "";
        ArrayList<String> cads= new ArrayList<String>();
        while ((i = br.read()) != -1) {
            char c = (char)i;
            if(c == '\''){
                cads.add(cad);
                cad+= " ";
            }else{
                cad += c;
            }
        }
        System.out.println(cad);
        br.close();
    }

    public String showEmployees() {
        String empInfo = "";
        Iterator<Employee> e = employees.iterator();
        while (e.hasNext()) {
            Employee currentEmployee = e.next();

            empInfo += "Id: " + currentEmployee.getId() + "\nNombre: " + currentEmployee.getFirstName() + " "
                    + currentEmployee.getLastName() + "\nGenero: " + currentEmployee.getGender()
                    + "\n----------//----------\n";
        }

        return empInfo;
    }
}
