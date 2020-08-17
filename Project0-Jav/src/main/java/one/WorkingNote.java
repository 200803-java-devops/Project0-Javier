package one;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkingNote extends Note {

    String filepath = "Notes.txt";

    BufferedWriter out;
    Scanner in;

    public WorkingNote() {
        try {
            out = new BufferedWriter(new FileWriter(filepath, true));
            in = new Scanner(new File(filepath));
        } catch (IOException e) {
            System.out.println("Problem opening file for read/write");
        }

    }

    public void storeNote() {
        try{
        out.write(this.getHeader() + "\n");
        out.write(this.getBody() + "\n");
        for (int i = 0; i < this.tags.size(); i++) {
            out.write(this.tags.get(i) + ",");
        }
        out.write("\n");
        } catch(IOException e){
            System.out.println("Problem writing to file");
            e.printStackTrace();
        }
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadNote() {
        in.reset();
        this.setHeader(in.nextLine());
        this.setBody(in.nextLine());

        in.useDelimiter(",");
        while(in.hasNext()){
            this.setTags(in.next());
        }
        in.reset();

        this.allOut();
    }
}