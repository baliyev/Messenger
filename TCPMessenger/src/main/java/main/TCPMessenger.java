package main;

import java.util.Scanner;
import util.HelpUtil;

public class TCPMessenger {

    public static void main(String[] args) {
        System.out.println("Designed by: | @baliyev |");
        System.out.println("***************************************");
        System.out.println("***************Messenger***************");
        System.out.println("***************************************");
        System.out.println("--> for help write !help to console <--");
        while (true) {
            System.out.print("--> ");
            mainProcess();
        }
    }

    public static void mainProcess() {
        try {
            Scanner sc = new Scanner(System.in);

            String command = sc.nextLine().trim().toLowerCase();
            switch (command) {
                case "!help":
                    HelpUtil.helpCommands();
                    break;
                default:
                    System.out.println("Choose correct command...");
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

}
