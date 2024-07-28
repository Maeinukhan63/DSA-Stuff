public class oops {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        king k=new king();
        k.moves();

    }
}

interface Chess{
    void moves();
}

class Queen implements Chess{
public void moves(){
    System.out.println("up,down,right,left,diagonally");
}
}

class pawn implements Chess{
    public void moves(){
    System.out.println("up,down,straight");

    }
}
class king implements Chess{
    public void moves(){
    System.out.println("up,down,right,left");

    }
}
