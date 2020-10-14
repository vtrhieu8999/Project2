package model.Customer;

import BasicIO.LoginData;

import java.awt.*;
import java.io.Serializable;

public class BasicCustomer extends LoginData {
    protected String email;
    protected String name;
    protected boolean active;

    //blank costructor
    protected BasicCustomer(){
        super();
        this.active= false;
    }
    // complete costructor
    public BasicCustomer(Long id, String userName, String email,
                         String name, String password) {
        super(userName, password, id);
        this.email = email;
        this.name = name;
        this.active = false;
    }
    //complete casting up
    protected BasicCustomer(LoginData instance, String email, String name){
        super(instance);
        this.email= email;
        this.name= name;
        this.active= false;
    }
    //partial casting up
    protected BasicCustomer(LoginData instance){
        super(instance);
    }
    // casting down
    protected <V extends BasicCustomer> BasicCustomer(V instance){
        super(instance);
        this.email= instance.getEmail();
        this.name = instance.getName();
        this.password = instance.getPassword();
        this.active= false;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    @Override
    public String toString(){
        return "/BasicCustomer/"+ this.id;
    }
}
