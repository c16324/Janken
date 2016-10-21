/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

/**
 *
 * @author c16324
 */
public class JankenTester {
    public static void main(String[] args){
        
        Janken[] a = new Janken[2];
        a[0] = new Player();
        a[1] = new Cpu();
         
        int p = a[0].poi();
        System.out.println(a[0]);
        int c = a[1].poi();
        System.out.println(a[1]);
        
        int judge = (p - c + 3) % 3;
        switch(judge){
            case 0:System.out.println("引き分け");break;
            case 1:System.out.println("あなたの負けです");break;
            case 2:System.out.println("あなたの勝ちです");break;
        }
        
        
    }
}
