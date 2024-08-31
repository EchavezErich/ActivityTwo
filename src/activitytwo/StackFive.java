/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author HP
 */
public class StackFive extends StackFour {
     public StackFive(int size) {
        super(size);
    }
      public void stackStack(){
        
        for (int i = 0; i <= top; i++) {
            if (!isfull()) {
                System.out.println("\nAdded stack to newstack: "
                + StackBasin[i]);
                newStack.push(StackBasin[i]);
            } else {
                System.out.println("\nYour stack is full");
            }
            }

        }

}
