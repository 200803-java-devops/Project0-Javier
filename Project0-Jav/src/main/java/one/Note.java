package one;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Note {

    private String header = " ";
    private String body = " ";
    List<String> tags = new ArrayList<>();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public String getHeader() {
        return this.header;
    }

    public String getBody() {
        return this.body;
    }

    public void getTags() {
        if (this.tags.size() > 0)
            for (int i = 0; i < this.tags.size(); i++) {
                System.out.println(this.tags.get(i));
            }
        else {
            System.out.println("No tags for this note");
        }
    }

    public void setHeader() {
        System.out.println("Please enter Title: ");
        try {
            this.header = input.readLine();
        } catch (IOException e) {
            System.out.println("Something Happened while reading from console");
        }
    }

    public void setHeader(String s) {
            this.header = s;
    }

    public void setBody() {
        System.out.println("Please enter Note: ");
        try {
            this.body = input.readLine();
        } catch (IOException e) {
            System.out.println("Something Happened while reading from console");
        }
    }

    public void setBody(String s) {
        this.body = s;
    }

    public void setTags() {
        System.out.println("Please enter a tag: ");
        try {
            this.tags.add(input.readLine());
        } catch (IOException e) {
            System.out.println("Something Happened while reading from console");
        }
    }

    public void setTags(String s){
        this.tags.add(s);
    }

    public void newNote(){
        this.setHeader();
        this.setBody();
        this.setTags();
        this.allOut();
    }

    public void allOut() {
        
        System.out.println(this.getHeader());
        System.out.println(this.getBody());
        this.getTags();
    }
}