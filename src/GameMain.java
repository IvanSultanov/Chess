import java.util.Scanner;
public class GameMain {
    public static void main(String[] args) {
        char MoveFlag = 'X';
        String Str;
        String Exit = "q";
        Scanner in = new Scanner(System.in);
        Players Player1 = new Players("Ivan", 'W');
        Players Player2 = new Players("Roman", 'B');
        Game Game = new Game();
        Game.Setup();
        Game.DrawBoard();
        while (true) {
            // Ход игрока 1
            do {
                System.out.print(Player1.getName() + " (" + Player1.getColor() + ") " + "Ходите (напр. a2a3, выход:\"q\"): ");
                Str = in.next();
                if (Str.equals(Exit)) return;
            } while (Game.Action(Str, Player1));
            Game.Action(Str, Player1);
            Game.DrawBoard();
            System.out.println();
            // Ход игрока 2
            do {
                System.out.print(Player2.getName() + " (" + Player2.getColor() + ") " + "Ходите (напр. a2a3, выход:\"q\"): ");
                Str = in.next();
                if (Str.equals(Exit)) return;
            } while (Game.Action(Str, Player2));
            Game.Action(Str, Player2);
            Game.DrawBoard();
            System.out.println();
        }
//        for (char i = 0; i<12000; i++){
//            System.out.print((char)i);
//            if (i%100 == 0) System.out.println(" " + (int)i);
//       }
    }
}
