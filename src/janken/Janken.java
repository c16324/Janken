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
abstract class Janken {
    abstract int poi();
    @Override
    public abstract String toString();
    
    public void print_info(){
        System.out.println("ジャンケンクラス");
    }
    
}