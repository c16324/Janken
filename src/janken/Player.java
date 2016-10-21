/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;
import java.util.Scanner;
/**
 *
 * @author c16324
 */
public class Player extends Janken{
    private int pon;
    Player(){
        this.pon = 0;
    }

    @Override
     int poi() {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("ジャンケンするよ！ 1.グー2.チョキ3.パー");
        pon = stdIn.nextInt();
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
        
        return "自分:"+select;
    }
    
    
}
