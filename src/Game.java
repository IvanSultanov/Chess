public class Game {
    private boolean[][] GameField = new boolean[8][8];
    public Figures[][] FigSet = new Figures[9][9];

    public void Setup() {
        FigSet[1][1] = new Rook('B', 1, 11, '♖');
        FigSet[1][2] = new Knight('B', 1, 21, '♘');
        FigSet[1][3] = new Bishop('B', 1, 31, '♗');
        FigSet[1][4] = new King('B', 1, 41, '♔');
        FigSet[1][5] = new Queen('B', 1, 51, '♕');
        FigSet[1][6] = new Bishop('B', 2, 61, '♗');
        FigSet[1][7] = new Knight('B', 2, 71, '♘');
        FigSet[1][8] = new Rook('B', 2, 81, '♖');

        for (int i = 0; i < 8; i++) FigSet[2][i + 1] = new Pawn('B', i, 12 + 10 * i, '♙');

        FigSet[8][8] = new Rook('W', 1, 88, '♜');
        FigSet[8][7] = new Knight('W', 1, 78, '♞');
        FigSet[8][6] = new Bishop('W', 1, 68, '♝');
        FigSet[8][5] = new King('w', 1, 58, '♚');
        FigSet[8][4] = new Queen('W', 1, 48, '♛');
        FigSet[8][3] = new Bishop('W', 2, 38, '♝');
        FigSet[8][2] = new Knight('W', 2, 28, '♞');
        FigSet[8][1] = new Rook('W', 2, 18, '♜');

        for (int i = 0; i < 8; i++) {
                FigSet[7][i + 1] = new Pawn('W', i, 17 + 10 * i, '♟');
            }
            for (int i = 3; i <= 6; i++) {
                for (int j = 1; j <= 8; j++) {
                    FigSet[i][j] = new Blank('O', 0, 0, '⛚');
                }
            }
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
                for (int j = 1; j <= 8; j++) {
                    System.out.print(FigSet[i][j].getName() + " ");
                }
                System.out.print("|" + (9 - i));
                System.out.println();
//            for (int s = 0; s < 8; s++) System.out.print("_");
//            System.out.println();
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
                if (Conv.Convert(Move))
                    if ((Plob.getColor() == FigSet[Conv.getY1()][Conv.getX1()].getColor())) {
                    Figures TempFig = FigSet[Conv.getY1()][Conv.getX1()]; // Временный объект для переносимой фигуры
                    FigSet[Conv.getY1()][Conv.getX1()] = new Blank('O', 0, 0, '⛚');
                    FigSet[Conv.getY2()][Conv.getX2()] = TempFig;
                    }
                    else {
                        b = true;
                        System.out.println("Играйте своими фигурами!");
                    }
                else b = true;
            return b;
        }
    }