/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161109.baseballtest;

/**
 * Stats Class
 */
public interface Stats {
    /**
     * Get the points of won and add to total
     * pre: none
     * post: the total points after adding the points of won
     */
   public void PointsOfWon();
   /**
     * Get the points of tied and add to total
     * pre: none
     * post: the total points after adding the points of tied
     */
   public void PointsOfTied();
   /**
     * Return the total points the team earned
     * pre: none
     * post: the value of "points" has been return
     * @return 
     */
   public int overallPoints();
}
