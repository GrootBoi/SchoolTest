//Raymond Tang, March 7, 2022, Class linked to Array List Practice
class ChessOpening {
    String name;
    String firstMove;
    int whiteWinRate;
    int drawRate;
    int blackWinRate;
    double eval;

    ChessOpening(String name, String firstMove, int whiteWinRate, int drawRate, int blackWinRate, double eval)
    {
        this.name = name;
        this.firstMove = firstMove;
        this.whiteWinRate = whiteWinRate;
        this.drawRate = drawRate;
        this.blackWinRate = blackWinRate;
        this.eval = eval;
    }
}
