package edu.up.cs301threadslab;

/**
 * Created by camachon18 on 11/18/2015.
 */
public class DiffThread extends Thread {
    private StarAnimation myAnim;
    private StarAnimation myAnim1;

    public DiffThread(StarAnimation anim) {
        myAnim = anim;
    }
    @Override
    public void run(){
        while(!false){
            double i = Math.random();
            try {
                    this.sleep(50);
                    if (i < 0.5) {
                            myAnim.removeStar();
                    } else {
                            myAnim.addStar();
                    }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
