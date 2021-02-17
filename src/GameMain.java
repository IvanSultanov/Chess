import javax.swing.*;
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
        Out: while (true) {
            // Ход игрока 1
            do {
                System.out.print(Player1.getName() + " (" + Player1.getColor() + ") " + "Ходите (напр. a2a3, выход:\"q\"): ");
                Str = in.next();
                if (Str.equals(Exit)) break Out;
            } while (Game.Action(Str, Player1)); // Пока не введете правильные координаты
            Game.DrawBoard();
//            System.out.println(Game.FigSet[7][1].getFigPosY());
//            System.out.println(Game.FigSet[7][1].getFigPosX());
//            System.out.println(Game.FigSet[7][1].getName());
            // Ход игрока 2
            do {
                System.out.print(Player2.getName() + " (" + Player2.getColor() + ") " + "Ходите (напр. a7a6, выход:\"q\"): ");
                Str = in.next();
                if (Str.equals(Exit)) break Out;
            } while (Game.Action(Str, Player2)); // Пока не введете правильные координаты
            Game.DrawBoard();
//            System.out.println(Game.FigSet[6][1].getFigPosY());
//            System.out.println(Game.FigSet[6][1].getFigPosX());
//            System.out.println(Game.FigSet[6][1].getName());
        }
        System.out.println("Спасибо за игру!");
    }
}
