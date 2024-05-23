public class PongPaddle 
extends java.lang.Object{
    
    private int x;
    private int y;
    private int width;
    private int height; 

    public PongPaddle(int top, int left, int w, int h){
        x = left;
        y = top;
        width = w;
        height = h; 
    }

    public int getBottomY(){
        return y+=height;
    }

    public int getLeftX(){
        return x;
    }

    public int getRightX(){
        return x+=width;
    }

    public int getTopY(){
        return y; 
    }

    public void moveDown(int d){
        x+=d;
    }

    public void moveUp(int d){
        y+=d;
    }
}
