package model;


import BasicIO.BasicIO;
import BasicIO.LoginData;
import model.Customer.BasicCustomer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Signup {
    public static void signUp(BasicIO<LoginData> basicIO, List<LoginData> list,
                              String name, String username, String password, String email){
        long id= list.size();
        basicIO.newUser(list, new LoginData(username, password, id));
        addData(name, username, password, email, id, basicIO, list);
    }
    private static void addData(String name, String username, String password, String email, long ID,
                                BasicIO<LoginData> basicIO, List<LoginData> list) {
        BasicCustomer member= new BasicCustomer(ID, username, email, name, password);
        member.writeFile(member, "src/data/Customer/BasicCustomer/"+ ID);
        basicIO.synList(list);
    }
}
