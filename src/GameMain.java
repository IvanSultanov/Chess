import java.util.Scanner;
public class GameMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Players Player1 = new Players("Ivan", 'W');
        Players Player2 = new Players("Roman", 'B');
        Game Game = new Game();
        Game.Setup();
        Game.DrawBoard();
        System.out.print (Player1.getName() + " ("+Player1.getColor()+") " + "¬ведите код хода: ");
        System.out.println();
        //System.out.println(Game.getFigure(1,1));
        //int a = in.nextInt();
        //System.out.println(a);
        System.out.println();
    }
}
