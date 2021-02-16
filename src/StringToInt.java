public class StringToInt {

    private  int x1 = 1, y1 = 1, x2 = 1, y2 = 1;
    public boolean Convert (String Str) {
        boolean val = false;
        if (Str.length() < 4) {
            System.out.println("Вы ввели неверные координаты! Откройте глаза!");
            return val;
        }
        else {
            String Sel1 = Str.substring(0, 1);
            String Sel2 = Str.substring(1, 2);
            String Sel3 = Str.substring(2, 3);
            String Sel4 = Str.substring(3, 4);

        switch (Sel1) {
            case "a" : x1 = 1; break;
            case "b" : x1 = 2; break;
            case "c" : x1 = 3; break;
            case "d" : x1 = 4; break;
            case "e" : x1 = 5; break;
            case "f" : x1 = 6; break;
            case "g" : x1 = 7; break;
            case "j" : x1 = 8; break;
            default: {
                System.out.println("Вы ввели неверные координаты! Вы что, тупой?");
                return val;
            }
        }
        switch (Sel2) {
            case "1" : y1 = 8; break;
            case "2" : y1 = 7; break;
            case "3" : y1 = 6; break;
            case "4" : y1 = 5; break;
            case "5" : y1 = 4; break;
            case "6" : y1 = 3; break;
            case "7" : y1 = 2; break;
            case "8" : y1 = 1; break;
            default: {
                System.out.println("Вы ввели неверные координаты! Ну Вы и дебил...");
                return val;
            }
        }
        switch (Sel3) {
            case "a" : x2 = 1; break;
            case "b" : x2 = 2; break;
            case "c" : x2 = 3; break;
            case "d" : x2 = 4; break;
            case "e" : x2 = 5; break;
            case "f" : x2 = 6; break;
            case "g" : x2 = 7; break;
            case "j" : x2 = 8; break;
            default: {
                System.out.println("Вы ввели неверные координаты! Да, игрок Вы некудышный...");
                return val;
            }
        }
        switch (Sel4) {
            case "1" : y2 = 8; break;
            case "2" : y2 = 7; break;
            case "3" : y2 = 6; break;
            case "4" : y2 = 5; break;
            case "5" : y2 = 4; break;
            case "6" : y2 = 3; break;
            case "7" : y2 = 2; break;
            case "8" : y2 = 1; break;
            default: {
                System.out.println("Вы ввели неверные координаты! Вы вообще знаете, эту игру?");
                return val;
            }

        } return true;
        }

//        System.out.println(x1);
//        System.out.println(y1);
//        System.out.println(x2);
//        System.out.println(y2);
    }

    public int getX1() { return x1;}
    public int getY1() { return y1;}
    public int getX2() { return x2;}
    public int getY2() { return y2;}
}
