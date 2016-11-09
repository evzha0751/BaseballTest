/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161109.baseballtest;

/**
 *
 * @author evzha0751
 */
public class BaseballTest {


    public static void main(String[] args) {
//       Sports sport = new BaseballTeam();
       Stats sports = new BaseballTeam();
       sports.PointsOfWon();
       sports.PointsOfTied();
        System.out.println("Ther total points is: "+sports.overallPoints());
    }
    
}
