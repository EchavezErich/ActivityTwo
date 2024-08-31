/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author HP
 */
public class StackTwo extends StackOne {
    public StackTwo(int size) {
        super(size);
    }
    public void countElements(){
        if (!isempty()){
            int Value = top+1;
            System.out.println("Value: " + Value);
        }
        else{
            System.out.println("Walay Value");
        }
       
    }

}
