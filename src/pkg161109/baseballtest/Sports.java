/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161109.baseballtest;

import java.util.*;

/**
 * Sports Class
 */
public abstract class Sports {
    Scanner input = new Scanner (System.in);
    public int won,lost,tied;
    
    /**
     * constructor
     * pre: none
     * post: input the number of won, lost and tied
     */
    public Sports(){
        System.out.println("Please enter the number of games that won:");
        won = input.nextInt();
        System.out.println("Please enter the number of games that lost");
        lost = input.nextInt();
        System.out.println("Please enter the number of games that tied");
        tied = input.nextInt();
}
   
}
