package one;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int menuChoice = 0;
        boolean exit = false;
        WorkingNote note = new WorkingNote();
        Scanner scanner = new Scanner(System.in);


        DB db = new DB();

        // main menu loop
        do {
            System.out.println("Please enter option: ");
                menuChoice = scanner.nextInt();

            switch(menuChoice){
                case 1://1: make a new note
                    note.newNote();
                    note.storeNote();
                    db.insert(note);
                    break;
                case 2://2: read an existing note
                    System.out.println("enter 1 to load from file\n enter 2 to load from database: ");
                    menuChoice = scanner.nextInt();
                    switch(menuChoice){
                        case 1:
                            note.loadNote();
                            break;
                        case 2:
                            db.select();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3://exit program
                    exit = true;
                    break;
                default: exit = true; break;

            }

        //3: list all tags
        //4: exit

        } while (!exit);

        scanner.close();
    }
}
