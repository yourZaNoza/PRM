package rpm_11.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("account.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Bill loribill = new Bill(12L, 1000, true);
        Account account = new Account(1L, "Lori", 3, "88005553535", "lori@cat.xyz", loribill);
        objectOutputStream.writeObject(account);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("account.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Account accountFromFile = (Account) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(accountFromFile);
    }
}
