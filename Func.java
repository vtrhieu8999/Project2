package model;

import java.io.*;

public class Func {
    public static void changeFile(String path, Object obj){
        path= "D:/CodeGym/Module_2/Project/SpaManagement/src/data/" + path;
        try {
            File file = new File(path);
            FileOutputStream fileOutputStream= new FileOutputStream(file, true);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static Object readFile(String path){
        path= "src/data/"+ path;
        try {
            FileInputStream fileInputStream= new FileInputStream(path);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            return null;
        }
    }
}
