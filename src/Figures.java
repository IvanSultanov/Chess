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
    char Color = getColor();
    //public char getName() { return this.Name; }

    public boolean Movement (Figures takeFig, Figures putFig, Players PlayerObj) {
        Result = takeFig.getColor() == PlayerObj.getColor();
        return Result;
    }
}

// Ферзь
class Queen extends Figures {

    Queen (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
    char Color = getColor();
    //public char getName() { return this.Name; }

    public boolean Movement (Figures takeFig, Figures putFig, Players PlayerObj) {
        Result = takeFig.getColor() == PlayerObj.getColor();
        return Result;
    }
}

// Ладья
class Rook extends Figures {

    Rook (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
    char Color = getColor();
    //public char getName() { return this.Name; }

    public boolean Movement (Figures takeFig, Figures putFig, Players PlayerObj) {
        Result = takeFig.getColor() == PlayerObj.getColor();
        return Result;
    }
}

// Конь
class Knight extends Figures {

    Knight (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
    char Color = getColor();
    //public char getName() { return this.Name; }

    public boolean Movement (Figures takeFig, Figures putFig, Players PlayerObj) {
        Result = takeFig.getColor() == PlayerObj.getColor();
        return Result;
    }
}

// Слон
class Bishop extends Figures {

    Bishop (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
    char Color = getColor();
    //public char getName() { return this.Name; }

    public boolean Movement (Figures takeFig, Figures putFig, Players PlayerObj) {
        Result = takeFig.getColor() == PlayerObj.getColor();
        return Result;
    }
}

// Пешка
class Pawn extends Figures {

    Pawn (char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
    char Color = getColor();
    //public char getName() { return this.Name; }

//    public boolean Movement (Figures takeFig, Figures putFig, Players PlayerObj) {
//        boolean Col, Xpos, StepW, StepB, Obst, FwdB;
//        int X1 = takeFig.getFigPosX();
//        int X2 = putFig.getFigPosX();
//        int Y1 = takeFig.getFigPosY();
//        int Y2 = putFig.getFigPosY();
//        int Num1 = putFig.getFigNum();
//        char C1 = takeFig.getColor();
//        char C2 = PlayerObj.getColor();
//
//        Col = C1 == C2;
//        Xpos = (X1 == X2);
//        StepW = ((C1 == 'W') & (0 < (Y1 - Y2)) & ( ( Math.abs(Y1 - Y2) < 2 ) ^ (Y1 == 7 & ((Y1 - Y2) == 2))));
//        StepB = ((C1 == 'B') & (0 > (Y1 - Y2)) & ( ( Math.abs(Y1 - Y2) < 2 ) ^ (Y1 == 2 & ((Y2 - Y1) == 2))));
//        Obst = (Num1) < 1;
//        Result = Col & Xpos & (StepW | StepB) & Obst;
//        return Result;
//    }
}

// Пустое поле
class Blank extends Figures {

    Blank(char FigColor, int FigNum, int FigPosY, int FigPosX, char FigChar) {
        super(FigColor, FigNum, FigPosY, FigPosX, FigChar);
    }
    // ⛚ = 9946
    //public char getName() { return Name; }
}