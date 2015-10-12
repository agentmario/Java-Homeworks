package student;

/**
 * Created by agentmario on 2015/10/12.
 */
public abstract class sPrototype {
    protected String name;
    protected String prof;
    protected String teacher;
    protected String proName;
    protected int point;
    protected int funds;

    public sPrototype(String n, String p, String t, String pr, int pt, int f) {
        name = n;
        prof = p;
        teacher = t;
        proName = pr;
        point = pt;
        funds = f;
    }

    public sPrototype() {
    }


}
