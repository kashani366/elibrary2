package model;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static Admin admin = new Admin();
    private static boolean isAlive = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<librarian> librarians = new ArrayList<librarian>();
        System.out.println("--welcom to elibrary --");
        System.out.println("are you admin?y/n");
        String input = sc.nextLine();
        boolean y = true;
        boolean n = true;
        //aplication loop
        if (input.equals("y")) {
            while (isAlive) {
                //get input
                //String input=sc.nextLine();
                //process
                //show result(feeadback)
                admin.checkAdmin(input);
                isAlive= false;

            }
            //application quit
            //  System.out.println("the end");
        }
      //  public static void routInput (String input){
      //      while (input == "n") {

            }
        }

