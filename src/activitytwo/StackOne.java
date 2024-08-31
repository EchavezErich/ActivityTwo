
package activitytwo;

import java.util.Stack;


public class StackOne {
  Stack<Double> newStack = new Stack<>();
     int maxSize;
     double[] StackBasin;
    int top;
    
    public StackOne(int size){
        maxSize = size;
        StackBasin = new double[maxSize];
        top = -1;

    }
    public boolean isfull(){
        return (top == maxSize - 1);
    }
    public boolean isempty(){
        return (top == -1);
    }
     public void push(double Value){
         if(!isfull()){
            StackBasin [++top] = Value;
             //System.out.println(StackBasin[top]);
         }
         else{
             System.out.println("I'm full napo"); 
         }    
     }
     public double pop(){
         if (!isempty()){
          return StackBasin [top--];        
        }
         else{
             System.out.println("wala na");
             return -1;
         }
     }
    //    public double peek(){
//         if (!isempty()){
//          return StackBasin[top];     
//        }
//         else{
//             System.out.println("DI KASABOT!");
//             return -1;
//         }        
//    }
       public double  bottomElement(){
        if (!isempty()) {
            return StackBasin[0];           
        }
        else {
            System.out.println("\nEMPTY");
            return -1;     
        }
    }

    public void loop(){
         if (!isempty()){
            for (int i = top; i >= 0; i --){
            System.out.println(StackBasin[i]);
        }
         }
         else{
            System.out.println("EMPTY");        
    }
         
     }
        public void newloop(){
         if (!isempty()){
            for (int i = top; i >= 0; i --){
            System.out.println(newStack.get(i));
        }
         }
         else{
            System.out.println("EMPTY");        
    }
         
     }

}
