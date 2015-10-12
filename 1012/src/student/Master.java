package student;

/**
 * Created by agentmario on 2015/10/12.
 */
public class Master extends sPrototype{
    private String dir;
    private String tutor;
    public Master(String n, String p, String t, String pr, int pt, int f,String d,String tu)
    {
        super();
        dir=d;
        tutor=tu;
    }
    public String getTutor()
    {
        return tutor;
    }

}
