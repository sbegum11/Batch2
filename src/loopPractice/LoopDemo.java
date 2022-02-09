package loopPractice;

import javax.swing.*;

public class LoopDemo {

    public void whileLoop() {
        int x = 1;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
    }

    public void forLoop() {

        for (int y = 2; y < 10; y++) {
            System.out.println(y);

        }
    }

    public void dowhile() {
        int z = 3;
        do {
            System.out.println(z);
            z++;
        }
        while(z<8);

    }

    public static void main(String[] args) {
        LoopDemo obj= new LoopDemo();
        obj.whileLoop();
        obj.forLoop();
        obj.dowhile();
    }
}







