package ibm;


public class MarsRoverFinalPosition {

public static int finalPosition(int n, String[] moves){
        
        int col = 0 , row = 0;
        
        for(int i =0; i<moves.length; i++){
            String dir = moves[i];
            
           if(dir=="r" && col < n) 
            col = col+1;
           
           else if(dir == "l" && col > 0)
           col = col-1;
           
           else if(dir == "d" && row < n )
           row = row+1;
           
           else if(dir == "u" && row > 0)
             row = row-1;
            
        }
        return (row*n)+col;
        
    }

public static void main(String[] args) {
    int n =4;
    String[] moves = {"r","u","d","l","d","d"};
    // finalPos = (row*n)+col
    int finalPos = finalPosition(n,moves);
    System.out.println("final position of the rover = " + finalPos);
    }


}
