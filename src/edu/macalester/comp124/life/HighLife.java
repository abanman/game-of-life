package edu.macalester.comp124.life;

/**
 * Created with IntelliJ IDEA.
 * User: abanman
 * Date: 9/10/13
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class HighLife implements RuleSet{

    public String getName() {
        return "HighLife";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     * @param isAlive The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     *
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {
        if (isAlive && neighborCount < 2) isAlive = false;
        if (isAlive && neighborCount == 3 || isAlive && neighborCount == 2) isAlive = true;
        if (isAlive && neighborCount > 3) isAlive = false;
        if (!isAlive && (neighborCount == 3 || neighborCount == 6)) isAlive = true;
        //if (!isAlive && neighborCount == 6) isAlive = true;


        return isAlive;
    }
}
