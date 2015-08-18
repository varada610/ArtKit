/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositePatternPackage;

/**
 *
 * @author Aditee Nagle
 */
public class BeginnerLevelState extends ExpertiseLevelState{
    
    public BeginnerLevelState() {
        this.levelMultiplier = 1;
    }
    
    public String getLevelDescription() {
        return "Beginner";
    }
    
    public String toString() {
        return "BeginnerLevelState Object";
    }
}
