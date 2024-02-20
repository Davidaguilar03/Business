package models;

import java.io.FileInputStream;
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

    public void readDataByte() throws IOException {
        try {
            Business business = new Business();
            ArrayList<String> cadenas = new ArrayList<String>();
            FileInputStream fis = new FileInputStream("Business\\BusinessEm2.txt");
            int byteLeido;
            int contador = 0;
            String cad = "";
            while ((byteLeido = fis.read()) != -1) {
               // while (contador <= 5) {
                    if (byteLeido != 92 && byteLeido != 10 && byteLeido != 13) {
                        switch (contador) {
                            case 0:
                                cad += (char) byteLeido;
                                break;
                            case 1:
                                cad += (char) byteLeido;
                                break;
                            case 2:
                                cad += (char) byteLeido;
                                break;
                            case 3:
                                cad += (char) byteLeido;
                                break;
                             case 4:
                        
                                 String hexDecimal = Integer.toHexString(byteLeido);
                                 cad += hexDecimal;
                                 break;
                            case 5:                             
                                String hexDecimal1 = Integer.toHexString(byteLeido);
                                cad += hexDecimal1;
                                System.out.println("-------->   "+byteLeido+"   "+hexDecimal1+"    "+cad);
                               break;       
                            }
                        

                    } else {
                        System.out.println("1111 "+cad);
                        cadenas.add(cad);
                        contador++;
                        cad = "";
                        if (byteLeido == 10) {
                            contador =0;
                        }
                    }
              //  }
                // System.out.print(cadenas.get(contador));
                // int id = 0;
                // String lastName = "";
                // String Name = "";
                // char Gender = ' ';
                // int weight = 0;
                // int salary = 0;
                // Employee employee = new Employee(id, Name, lastName, Gender, weight, salary);
                // business.addNewEmployee(employee);
                // contador = 0;
                // cadenas.clear();
            }
            fis.close();
        } catch (

        IOException e) {
            e.printStackTrace();
        }

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
