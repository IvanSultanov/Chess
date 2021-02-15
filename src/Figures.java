public class Figures {
    Figures () { }

    Figures (char FigColor, int FigNum, int FigPos) {
        this.FigColor = FigColor;
        this.FigNum = FigNum;
        this.FigPos = FigPos;
    }

    private char FigColor = 'W'; // ���� ������
    private int FigNum = 1;
    private int FigPos; // ��������� ������
                    //    18 28 38 48 58 68 78 88
                    //    17 27 37 47 57 67 77 87
                    //    16 26 36 46 56 66 75 86
                    //    15 25 35 45 55 65 75 85
                    //    14 24 34 44 54 64 74 84
                    //    13 23 33 43 53 63 73 83
                    //    12 22 32 42 52 62 72 82
                    //    11 21 31 41 51 61 71 81
    private boolean FigStat = true; // ��������� ������. � ���� - true, ������� - false

    public void setColor(char Color) { this.FigColor = FigColor; } // ������ ���� ������
    public char getColor() { return FigColor; } // �������� ���� ������

    public void setFigNum(int FigNum) { this.FigNum = FigNum; } // ������ ����� ������
    public int getFigNum() { return FigNum; } // �������� ����� ������

    public void setFigPos(int Pos) { this.FigPos = FigPos; } // ������ ��������� ������
    public int getFigPos() { return FigPos; } // �������� ��������� ������

    public void setFigStat(boolean FigStat) { this.FigStat = FigStat; } // ������ ������ ������
    public boolean getFigStat() { return FigStat; } // �������� ������ ������

    char Name = 'X';
    public char getName() { return this.Name; }


}

// ������
class King extends Figures {

    King (char FigColor, int FigNum, int FigPos) {
        super(FigColor, FigNum, FigPos);
    }
    char Name = 'K';
    public char getName() { return 'K'; }
}

// �����
class Queen extends Figures {

    Queen (char FigColor, int FigNum, int FigPos) {
        super(FigColor, FigNum, FigPos);
    }
    char Name = 'Q';
    public char getName() { return this.Name; }
}

// �����
class Rook extends Figures {

    Rook (char FigColor, int FigNum, int FigPos) {
        super(FigColor, FigNum, FigPos);
    }
    char Name = 'R';
    public char getName() { return Name; }
}

// ����
class Knight extends Figures {

    Knight (char FigColor, int FigNum, int FigPos) {
        super(FigColor, FigNum, FigPos);
    }
    char Name = 'N';
    public char getName() { return Name; }
}

// ����
class Bishop extends Figures {

    Bishop (char FigColor, int FigNum, int FigPos) {
        super(FigColor, FigNum, FigPos);
    }
    char Name = 'B';
    public char getName() { return Name; }
}

// �����
class Pawn extends Figures {

    Pawn (char FigColor, int FigNum, int FigPos) {
        super(FigColor, FigNum, FigPos);
    }
    char Name = 'P';
    public char getName() { return Name; }
}

// ������ ����
class Blank extends Figures {

    Blank(char FigColor, int FigNum, int FigPos) {
        super(FigColor, FigNum, FigPos);
    }
    char Name = 'O';
    public char getName() { return Name; }
}