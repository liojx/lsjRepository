package l.idea.practice;

import java.util.Date;
import java.util.Random;

public class Too {

    private  String name = "";

    private String sr ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public static void main(String[] args) {
        System.out.println("sd");
        for (Object o:new Too().getClass().getMethods()
             ) {
            System.out.println(o.toString());
        }
    }

    public void justTest(){
        System.out.println("good ...");
        Date date = new Date();
        date.getTime();
        Random r = new Random();

    }
}
