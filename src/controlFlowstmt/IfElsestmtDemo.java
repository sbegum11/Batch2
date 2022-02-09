package controlFlowstmt;

public class IfElsestmtDemo {
    public void ifElseDemo (){
        int a= 7;
        int b= 5;
        if (a==b){
            System.out.println("a is equal to b");
        }

     int c= 9;
     int d=9;
      if (c==d) {
          System.out.println("c is equal to "+c +"the value of d is "+d);
      }
      else{
          System.out.println("the value of c "+ c+ "the value is d "+d);

      }
    }

    public static void main(String[] args) {
        IfElsestmtDemo obj= new IfElsestmtDemo();
        obj.ifElseDemo();
    }


}
