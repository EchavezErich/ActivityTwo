
package activitytwo;

import java.util.HashSet;
import java.util.Set;


public class StackThree extends StackTwo {
     public StackThree(int size) {
        super(size);
    }
    public void removeduplicates(){
        Set<Double> newBasin = new HashSet<>();
        int newBasinTop = -1;
        boolean hasDuplicate = false;
        
            for (int i = 0; i <= top; i++) {
            if (newBasin.contains(StackBasin[i])){
                System.out.println("\nDuplicate po! " + StackBasin[i]);
                StackBasin[++newBasinTop] = StackBasin[i];
                top = newBasinTop;        
                hasDuplicate = true;
            }
            newBasin.add(StackBasin[i]);
        }
        
        if(hasDuplicate == false){
            System.out.println("\nEME! ");
        }
    }
    

}
