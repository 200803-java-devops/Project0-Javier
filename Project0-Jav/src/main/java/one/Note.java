package one;

public class Note {
    private String header;
    private String body;
    private String[] tags;
    //should be changed to an expandable collection

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
        for (int i=0; i<this.tags.length; i++)
        {
            System.out.println(tags[i]);
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