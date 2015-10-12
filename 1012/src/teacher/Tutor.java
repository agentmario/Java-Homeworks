package teacher;

/**
 * Created by agentmario on 2015/10/12.
 */
public class Tutor {
    private String name;
    private String proClass;
    private String dir;
    private int stuAmount;
    public Tutor(String n,String p,String d,int s){
        name=n;
        proClass=p;
        dir=d;
        stuAmount=s;
    }
    public void show(){
        System.out.println("Name:"+name+" Class:"+proClass+" Direction:"+dir+" Amount:"+stuAmount);
    }
}
