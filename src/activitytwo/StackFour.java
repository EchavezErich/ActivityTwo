
package activitytwo;


public class StackFour extends StackThree{
    public StackFour(int size) {
        super(size);
    }
    public double peek(){
         if (!isempty()){
          return StackBasin[top];     
        }
         else{
             System.out.println("EMPTY JUD, FINAL NA!");
             return -1;
         }
}

}
