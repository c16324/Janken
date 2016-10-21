package janken;
import java.util.Random;
/**
 *
 * @author c16324
 */
public class Cpu extends Janken{
    private int pon;
    Cpu(){
        this.pon = 0;
    }

    @Override
     int poi() {
        Random rnd = new Random();
        pon = rnd.nextInt(3);
        
        return pon;
    }

    @Override
    public String toString() {
        String select;
        if(pon==1)
            select="グー";
        else if(pon==2)
            select="チョキ";
        else
            select="パー";
        
        return "相手:"+ select;
    }
    
    
}