import javax.crypto.spec.PSource;

public class Figures {
    Figures () { }

    Figures (char FigColor, int FigNum, int FigPos, char FigChar) {
        this.FigColor = FigColor;
        this.FigNum = FigNum;
        this.FigPos = FigPos;
        Name = FigChar;
    }

    private char FigColor = 'W'; // Цвет фигуры
    private int FigNum = 1;
    private int FigPos; // Положение фигуры
                    //    18 28 38 48 58 68 78 88
                    //    17 27 37 47 57 67 77 87
                    //    16 26 36 46 56 66 75 86
                    //    15 25 35 45 55 65 75 85
                    //    14 24 34 44 54 64 74 84
                    //    13 23 33 43 53 63 73 83
                    //    12 22 32 42 52 62 72 82
                    //    11 21 31 41 51 61 71 81
    private boolean FigStat = true; // Состояние фигуры. В игре - true, съедена - false

    public void setColor(char Color) { this.FigColor = FigColor; } // Задать цвет фигуры
    public char getColor() { return FigColor; } // Получить цвет фигуры

    public void setFigNum(int FigNum) { this.FigNum = FigNum; } // Задать номер фигуры
    public int getFigNum() { return FigNum; } // Получить номер фигуры

    public void setFigPos(int Pos) { this.FigPos = FigPos; } // Задать положение фигуры
    public int getFigPos() { return FigPos; } // Получить положение фигуры

    public void setFigStat(boolean FigStat) { this.FigStat = FigStat; } // Задать статус фигуры
    public boolean getFigStat() { return FigStat; } // Получить статус фигуры

    char Name = 'X';
    public char getName() { return this.Name; }


}

// Король
class King extends Figures {

    King (char FigColor, int FigNum, int FigPos, char FigChar) {
        super(FigColor, FigNum, FigPos, FigChar);
    }
    char Color = getColor();
    public char getName() { return this.Name; }
}

// Ферзь
class Queen extends Figures {

    Queen (char FigColor, int FigNum, int FigPos, char FigChar) {
        super(FigColor, FigNum, FigPos, FigChar);
    }
    char Color = getColor();
    public char getName() { return this.Name; }
}

// Ладья
class Rook extends Figures {

    Rook (char FigColor, int FigNum, int FigPos, char FigChar) {
        super(FigColor, FigNum, FigPos, FigChar);
    }
    char Color = getColor();
    public char getName() { return this.Name; }
}

// Конь
class Knight extends Figures {

    Knight (char FigColor, int FigNum, int FigPos, char FigChar) {
        super(FigColor, FigNum, FigPos, FigChar);
    }
    char Color = getColor();
    public char getName() { return this.Name; }
}

// Слон
class Bishop extends Figures {

    Bishop (char FigColor, int FigNum, int FigPos, char FigChar) {
        super(FigColor, FigNum, FigPos, FigChar);
    }
    char Color = getColor();
    public char getName() { return this.Name; }
}

// Пешка
class Pawn extends Figures {

    Pawn (char FigColor, int FigNum, int FigPos, char FigChar) {
        super(FigColor, FigNum, FigPos, FigChar);
    }
    char Color = getColor();
    public char getName() { return this.Name; }
}

// Пустое поле
class Blank extends Figures {

    Blank(char FigColor, int FigNum, int FigPos, char FigChar) {
        super(FigColor, FigNum, FigPos, FigChar);
    }
    // ⛚ = 9946
    public char getName() { return Name; }
}