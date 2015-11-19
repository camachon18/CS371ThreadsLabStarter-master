package edu.up.cs301threadslab;

/**
 * Created by camachon18 on 11/18/2015.
 */
public class SubThread extends Thread {
    private AnimationView myAV;
    public SubThread(AnimationView initAV){
       myAV = initAV;

    }
    @Override
    public void run(){
        while(!false){
            try {
                myAV.postInvalidate();
                this.sleep(50);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
