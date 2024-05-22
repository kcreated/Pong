public class PongScore 
extends java.lang.Object{

    private int score;
    public int points;

    public PongScore(){
        points = 0;
    }
    
    public int getScore(){
        return score;
    }

    public void scorePoints(int points){
        score += points; 
    }
    
}
