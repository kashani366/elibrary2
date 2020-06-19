package model;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Admin {
    Scanner sc=new Scanner(System.in);
    private  static ArrayList<librarian> librarians=new ArrayList<librarian>();
//boolean y=true;
    private String emailAdmin="kashani_sara@yahoo.com";
    private String passwordAdmin="123";
    public Admin() {

    }
public  void checkAdmin(String input) {
    System.out.println("enter Adminemail");
    String input1 = sc.next();
    System.out.println("enter Adminpassword");
    String input2 = sc.next();

    if (input1.equals("sara") && input2.equals("123")) {
        System.out.println("your email is correct");
        System.out.println("your password is coorect");

        showmenue();
return;

    }//else
//break;
}

    private void showmenue() {
        System.out.println("pleas enter youe choose:");
      //  sleep(1000);
        System.out.println("1.Add librarian");
        System.out.println("2.view librarian");
        System.out.println("3.edit");
        System.out.println("4.delet");
        System.out.println("5.logout");
       int  input3= sc.nextInt();
        routInput(input3);
String result=routInput(input3);
    }

    private String routInput(int input3) {
        switch (input3) {
            case 1:
                return addLibrarian();

            case 2:
                showlist();
                return null;
            case 3:
                editlist();
                return null;
            case 4:
                delet();
                return null;
            case 5:
                logout();
                return null;
            default:
                //wrongInput

        }

        return "back";
    }

    private String addLibrarian() {
        System.out.println("enter username");
        String name=sc.next();
        System.out.println("enter email");
        String email=sc.next();
        System.out.println("enter password");
        int password=sc.nextInt();
        System.out.println("enter mobile");
        int mobile=sc.nextInt();
        librarian l=new librarian(name,email,password,mobile);
        boolean add = librarians.add(l);
        return "new librarian added";
        }




    private String showlist() {
        String result="";
        for(int i=0; i<librarians.size();i++) {
            librarian l = librarians.get(i);
            result+=l.name+":"+l.email+""+l.mobile+l.password;



        }
        if (librarians.size()==0){
            result="no librarian foundPl. ";
        }
    return result;
    }
    private String editlist() {
        return "";
    }
    private String delet() {
        return "";
    }
    private String logout() {
        return "";
        //
    }

}

