package loopPractice;

public class LoopDemo2 {
    /*
    there are 3 types of Loop
    1. While Loop
    2. For Loop
    3. Do-while Loop
     */
   public void whileLoop(){
       int x= 5; //initialization
       while(x<=10){ //condition
           System.out.println("I'm running repeatedly " +x); //statement
        //   x++; //increment
           x=x+2; // increment by different number
       }
      int y= 20;
       while(y>=1){
           System.out.println("I am running repeatedly " +y);
           y-- ; //decrement
       }

   }
    public void forLoop(){
    for (int i= 0; i<5;i++){
    System.out.println(i);
}

   }
   public void doWhileLoop(){
    int x= 5;
    do{
        System.out.println(x);
        x++;
    }
   while (x<=5);

   }

//mentoring access, if else stmt and loop.
    public static void main(String[] args) {
        LoopDemo2 obj= new LoopDemo2 ();
        //obj.whileLoop();
       obj.forLoop();
        //obj.doWhileLoop();
    }

}
