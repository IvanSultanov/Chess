import java.util.Scanner;
public class GameMain {
    public static void main(String[] args) {
        String Str;
        String Exit = "q";
        Scanner in = new Scanner(System.in);
        Players Player1 = new Players("Ivan", 'W');
        Players Player2 = new Players("Roman", 'B');
        Game Game = new Game();
        Game.Setup();
        Game.DrawBoard();
        while (true) {
            System.out.println();
            System.out.print(Player1.getName() + " (" + Player1.getColor() + ") " + "Ходите (напр. a2a3, выход:\"q\"): ");
            Str = in.next();
            if (Str.equals(Exit)) return;
            Game.Action(Str);
            Game.DrawBoard();
            System.out.println();
        }
//        for (char i = 0; i<12000; i++){
//            System.out.print((char)i);
//            if (i%100 == 0) System.out.println(" " + (int)i);
//       }
    }
}
