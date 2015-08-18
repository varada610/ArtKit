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
public class AdvancedLevelState extends ExpertiseLevelState {
    
    public AdvancedLevelState() {
        this.levelMultiplier = 3;
    }
            
    public String getLevelDescription() {
        return "Advanced";
    }
    
    public String toString() {
        return "AdvancedLevelState Object";
    }
}
