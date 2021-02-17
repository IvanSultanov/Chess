public class Figures {
    Figures () { }

    Figures (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        this.FigColor = FigColor;
        this.FigNum = FigNum;
        this.FigPosY = FigPosY;
        this.FigPosX = FigPosX;
        this.Name = FigChar;
    }

    private char FigColor = 'W'; // Цвет фигуры
    private int FigNum = 1;
    private int FigPosY;
    private int FigPosX;
    private char Name;

                    // Положение фигуры
                    //    18 28 38 48 58 68 78 88
                    //    17 27 37 47 57 67 77 87
                    //    16 26 36 46 56 66 75 86
                    //    15 25 35 45 55 65 75 85
                    //    14 24 34 44 54 64 74 84
                    //    13 23 33 43 53 63 73 83
                    //    12 22 32 42 52 62 72 82
                    //    11 21 31 41 51 61 71 81
    private boolean FigStat = true; // Состояние фигуры. В игре - true, съедена - false

    public void setColor(char Color) { this.FigColor = Color; } // Задать цвет фигуры
    public char getColor() { return FigColor; } // Получить цвет фигуры

    public void setFigNum(int FigNum) { this.FigNum = FigNum; } // Задать номер фигуры
    public int getFigNum() { return FigNum; } // Получить номер фигуры

    public void setFigPosY(int PosY) { this.FigPosY = PosY; } // Задать положение Y фигуры
    public int getFigPosY() { return FigPosY; } // Получить положение Y фигуры

    public void setFigPosX(int PosX) { this.FigPosX = PosX; } // Задать положение Y фигуры
    public int getFigPosX() { return FigPosX; } // Получить положение Y фигуры

    public void setFigStat(boolean FigStat) { this.FigStat = FigStat; } // Задать статус фигуры
    public boolean getFigStat() { return FigStat; } // Получить статус фигуры

    public char getName() { return Name; }
    boolean Result = false;
    public boolean Movement (Figures takeFig, Figures putFig, Players PlayerObj) {
        return Result;
    }


}

// Король
class King extends Figures {

    King (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
}

// Ферзь
class Queen extends Figures {

    Queen (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
}

// Ладья
class Rook extends Figures {

    Rook (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
}

// Конь
class Knight extends Figures {

    Knight (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
}

// Слон
class Bishop extends Figures {

    Bishop (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }

}

// Пешка
class Pawn extends Figures {

    Pawn (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
}

// Пустое поле
class Blank extends Figures {

    Blank(char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
}