package model;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Admin {
    Scanner sc=new Scanner(System.in);
//boolean y=true;
    private String emailAdmin="kashani_sara@yahoo.com";
    private String passwordAdmin="123";
    public Admin() {

    }
public  void checkAdmin(String input) {
    System.out.println("enter email");
    String input1 = sc.next();
    System.out.println("enter password");
    String input2 = sc.next();

    if (input1.equals("sara") && input2.equals("123")) {
        System.out.println("your email is correct");
        System.out.println("your password is coorect");

        showmenue();


    }//else
//break;
}

    private void showmenue() {
        System.out.println("pleas enter youe choose:");
      //  sleep(1000);
        System.out.println("1.Add librarian");
        System.out.println("2.view librarian");
        System.out.println("3.edit");
        System.out.println("4delet");
        System.out.println("5logout");
       int  input3= sc.nextInt();
        routInput(input3);

    }

    private void routInput(int input3) {
        switch (input3){
            case 1:
                addLibrarian();
                break;
            case 2:
                showlist();
                break;
            case 3:
                editlist();
                break;
            case 4:
                delet();
                break;
            case 5:
                logout();
                break;
            default:
                //wrongInput

        }
    }

    private void addLibrarian() {
    }
    private void showlist() {
    }
    private void editlist() {
    }
    private void delet() {
    }
    private void logout() {
        //
    }

}

