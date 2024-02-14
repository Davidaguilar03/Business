package controllers;

import java.io.IOException;

import models.Business;

public class Control {

    private Business businessObj;

    public Control() {

        businessObj = new Business();
    }

    public void init() throws NumberFormatException, IOException {
        businessObj.readData();
        System.out.println(businessObj.showEmployees());
    }
}
