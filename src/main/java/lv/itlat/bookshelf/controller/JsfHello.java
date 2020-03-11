package lv.itlat.bookshelf.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class JsfHello {

    private String message;
    private String secondMessage;
    private String result;

    public JsfHello() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSecondMessage() {
        return secondMessage;
    }

    public void setSecondMessage(String secondMessage) {
        this.secondMessage = secondMessage;
    }

    public void getResultMessage() {
        result = "Hello, " + message + ", " + secondMessage;
    }
}
