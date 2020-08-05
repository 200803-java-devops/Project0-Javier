package one;

import java.util.ArrayList;
import java.util.List;

public class Note {
    private String header;
    private String body;
    List<String> tags = new ArrayList<>();


    public String getHeader()
    {
        return this.header;
    }

    public String getBody()
    {
        return this.body;
    }

    public void getTags()
    {
        if (this.tags.size() > 0)
        for (int i=0; i<this.tags.size(); i++)
        {
            //output list of tags
        }
        else
        {
            System.out.println("No tags for this note");
        }
    }

    public void setHader()
    {
        System.out.println("Please enter Title: ");
        //need to get input here
    }

    public void setBody()
    {
        System.out.println("Please enter Note: ");
        //need to get input here
    }

    public void setTags()
    {
        System.out.println("Please enter Tags: ");
        //need to get input here
    }
}