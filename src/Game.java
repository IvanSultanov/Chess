import javax.crypto.spec.PSource;

public class Game {
    public boolean[][] GameField = new boolean[8][8];
    public Figures[][] FigSet = new Figures[9][9];

    public void Setup() {
        FigSet[1][1] = new Rook('B', 1, 1, 1, '♖');
        FigSet[1][2] = new Knight('B', 1, 1,2, '♘');
        FigSet[1][3] = new Bishop('B', 1, 1, 3, '♗');
        FigSet[1][4] = new King('B', 1, 1, 4,'♔');
        FigSet[1][5] = new Queen('B', 1, 1, 5,'♕');
        FigSet[1][6] = new Bishop('B', 2, 1, 6, '♗');
        FigSet[1][7] = new Knight('B', 2, 1, 7,'♘');
        FigSet[1][8] = new Rook('B', 2, 1, 8,'♖');

        for (int i = 0; i < 8; i++) FigSet[2][i + 1] = new Pawn('B', i+1, 2,1 + i, '♙');

        FigSet[8][8] = new Rook('W', 1, 8, 8, '♜');
        FigSet[8][7] = new Knight('W', 1, 8, 7,'♞');
        FigSet[8][6] = new Bishop('W', 1, 8, 6,'♝');
        FigSet[8][5] = new King('w', 1, 8, 5,'♚');
        FigSet[8][4] = new Queen('W', 1, 8, 4,'♛');
        FigSet[8][3] = new Bishop('W', 2, 8, 3,'♝');
        FigSet[8][2] = new Knight('W', 2, 8, 2,'♞');
        FigSet[8][1] = new Rook('W', 2, 8, 1,'♜');

        for (int i = 0; i < 8; i++) FigSet[7][i + 1] = new Pawn('W', i+1, 7,1 + i, '♟');
        for (int i = 3; i <= 6; i++) for (int j = 1; j <= 8; j++) FigSet[i][j] = new Blank('O', 0, i, j,'⛚');
        }

        // Отрисовать доску
        public void DrawBoard () {
            System.out.println();
            System.out.print("   ");
            char ch = 'a';
            for (int s = 0; s < 8; s++) System.out.print((char) (ch + s) + "\u0381\u0381");
            System.out.println();
            for (int s = 0; s < 14; s++) System.out.print('―');
            System.out.println();
            for (int i = 1; i <= 8; i++) {
                System.out.print(9 - i + "|\u0381");
                for (int j = 1; j <= 8; j++) System.out.print(FigSet[i][j].getName() + " ");
                System.out.print("|" + (9 - i));
                System.out.println();
            }
            for (int s = 0; s < 14; s++) System.out.print('―');
            System.out.print("\n" + "   ");
            ch = 'a';
            for (int s = 0; s < 8; s++) System.out.print((char) (ch + s) + "\u0381\u0381");
            System.out.println("\n");
        }

        // Ходы
        public boolean Action (String Move, Players Plob){
            boolean b = false;
            StringToInt Conv = new StringToInt();
                if (Conv.Convert(Move)) {
                    Figures TempFig1 = FigSet[Conv.getY1()][Conv.getX1()]; // Временный объект для переносимой фигуры
                    Figures TempFig2 = FigSet[Conv.getY2()][Conv.getX2()];
                    if (MovAllow(TempFig1, TempFig2, Plob)) {
                        FigSet[Conv.getY1()][Conv.getX1()] = new Blank('O', 0, Conv.getY1(), Conv.getX1(), '⛚');
                        FigSet[Conv.getY2()][Conv.getX2()] = TempFig1;
                        FigSet[Conv.getY2()][Conv.getX2()].setFigPosY(Conv.getY2());
                        FigSet[Conv.getY2()][Conv.getX2()].setFigPosX(Conv.getX2());
                    } else {
                        b = true;
                        System.out.println("Недопустимый ход!");
                    }
                }
                else b = true;
            return b;
        }

    public boolean MovAllow (Figures takeFig, Figures putFig, Players PlayerObj) {
        boolean Result = false, Color, Xpos, StepW, StepB, Obst, FwdB;
        int X1 = takeFig.getFigPosX();
        int X2 = putFig.getFigPosX();
        int Y1 = takeFig.getFigPosY();
        int Y2 = putFig.getFigPosY();
        int Num = putFig.getFigNum();
        int Sum = 0;
        char C1 = takeFig.getColor();
        char C2 = PlayerObj.getColor();
        Color = C1 == C2;
        int Y = Math.abs(Y2 - Y1);
        int X = Math.abs(X2 - X1);
        boolean king = (takeFig.getName() == '♚') | (takeFig.getName() == '♔');
        boolean queen = (takeFig.getName() == '♛') | (takeFig.getName() == '♕');
        boolean knight = (takeFig.getName() == '♞') | (takeFig.getName() == '♘');
        boolean bishop = (takeFig.getName() == '♝') | (takeFig.getName() == '♗');
        boolean rook = (takeFig.getName() == '♜') | (takeFig.getName() == '♖');
        boolean pawn = (takeFig.getName() == '♟') | (takeFig.getName() == '♙');

        if (!Color) return false;
        if ( Y == 0 & X == 0) return false;
        if (Y > 0 & X > 0 & Y != X & !knight) return false;
        if (takeFig.getColor() == putFig.getColor()) return false;
        if ((putFig.getName() == '♚') ^ (putFig.getName() == '♔')) return false;
        if (takeFig.getName() == '⛚') return false;

        if (king) {
            if (Y < 2 & X < 2);
            else return false;
        }

        if (queen) {
            if (Y == 0 ^ X == 0 ^ X == Y);
            else return false;
        }

        // Проверка ходов коня
        if (knight) {
            if ((Y == 1 & X == 2) ^ (Y == 2 & X == 1))
            return true;
            else return false;
        }

        if (bishop) {
            if (Y == X);
            else return false;
        }

        if (rook) {
            if (Y == 0 ^ X == 0);
            else return false;
        }

        if (pawn) {
            boolean A = false, B = false, C = false;
            if (takeFig.getColor() == 'W') A = ((Y == 1) & (X == 0) & ( (Y2 - Y1) < 0) & (Num == 0));
            if (takeFig.getColor() == 'W') B = ((Y == 2) & (X == 0) & ( (Y2 - Y1) < 0) & (Y1 == 7) & (Num == 0));
            if (takeFig.getColor() == 'W') C = ((Y == 1) & (X == 1) & (Num > 0));

            if (takeFig.getColor() == 'B') A = ((Y == 1) & (X == 0) & ( (Y2 - Y1) > 0) & (Num == 0));
            if (takeFig.getColor() == 'B') B = ((Y == 2) & (X == 0) & ( (Y2 - Y1) > 0) & (Y1 == 2) & (Num == 0));
            if (takeFig.getColor() == 'B') C = ((Y == 1) & (X == 1) & (Num > 0));

            if (A ^ B ^ C);
            else return false;
        }

        int Dist = Math.max(Y, X);
        int a = 1, b = 1;
        if ((Y2 - Y1) == 0) a = 0;
        if ((X2 - X1) == 0) b = 0;
        if ((Y2 - Y1) < 0) a *= -1;
        if ((X2 - X1) < 0) b *= -1;
        for (int i = 1; i < Dist; i++)
            Sum += FigSet[Y1 + i * a][X1 + i * b].getFigNum();
        Result = (Sum == 0);
        return Result;
    }
}