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
public class BaseballTeam extends Sports implements Stats{
    private int points,pointsWon,pointsLost,pointsTied;
    
    /**
     * constructor
     * pre: none
     * post: input the number of won, lost and tied
     */
    public BaseballTeam(){
    super();
}
    /**
     * Get the points of won and add to total
     * pre: none
     * post: the total points after adding the points of won
     */
    public void PointsOfWon(){
        pointsWon = won*2;
        points += pointsWon;
    }
    
    /**
     * Get the points of tied and add to total
     * pre: none
     * post: the total points after adding the points of tied
     */
    public void PointsOfTied(){
        pointsTied = tied;
        points += pointsTied;
    }
    
    /**
     * Return the total points the team earned
     * pre: none
     * post: the value of "points" has been return
     * @return 
     */
     public int overallPoints(){
         return(points);
     }
}
