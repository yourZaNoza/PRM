package rpm_11.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

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

        FileOutputStream fileOutputStream1= new FileOutputStream("account_pretty.json");
        OutputStreamWriter outputStreamWriter1 = new OutputStreamWriter(fileOutputStream1);
        ObjectMapper objectMapper = new ObjectMapper();
        outputStreamWriter1.write(objectMapper.writeValueAsString(account));
        outputStreamWriter1.close();

        FileInputStream fileInputStream1 = new FileInputStream( "account_pretty.json");
        InputStreamReader inputStreamReader1 = new InputStreamReader (fileInputStream1);
        Account accountFromJson = objectMapper.readValue(inputStreamReader1, Account.class);
        inputStreamReader1.close();
        System.out.println(accountFromJson);
    }
}
