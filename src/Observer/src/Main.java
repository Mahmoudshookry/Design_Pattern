/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahmoud shokry
 */
public class Main {
    public static void main(String args[])
    {
        // Create objects for testing
        AverageScoreDisplay averageScoreDisplay =
                                       new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =
                                       new CurrentScoreDisplay();
  
        // Pass the displays to Cricket data
        CricketData cricketData = new CricketData(currentScoreDisplay,
                                                  averageScoreDisplay);
  
        // In real app you would have some logic to call this
        // function when data changes
        cricketData.dataChanged();
    } 
}
