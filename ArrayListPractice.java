//Raymond Tang, March 7, 2022, Program using ArrayLists
import java.util.*;

public class ArrayListPractice {
    static ArrayList<ChessOpening> co = new ArrayList<ChessOpening>();

    public static void main(String[] args) {
        co.add(new ChessOpening("Italian Game", "e4", 42, 25, 33, 0.22));
        co.add(new ChessOpening("Queen's Gambit", "d4", 40, 36, 24, 0.19));
        co.add(new ChessOpening("English Opening", "c4", 38, 34, 28, 0.1));
        co.add(new ChessOpening("Polish Opening", "b4", 33, 26, 41, -0.24));
        co.add(new ChessOpening("Ruy Lopez", "e4", 38, 36, 26, 0.4));
        co.add(new ChessOpening("French Defense", "e4", 38, 32, 30, 0.25));

        System.out.println(getArray());

        for (int i = co.size() - 1; i >= 0; i--) {
            ChessOpening c = co.get(i);
            if (c.firstMove == "e4") {
                co.remove(i);
            }
        }

        System.out.println(getArray());
    }

    static String getArray() {
        String s = String.format("%-20s%-15s%-15s%-10s%-15s%s%n", "Opening Name", "First Move", "White Win", "Draw",
                "Black Win", "Eval");
        for (ChessOpening c : co) {
            s = s + String.format("%-24s%-15s%-12s%-12s%-12s%+.2f%n", c.name, c.firstMove, c.whiteWinRate + "%",
                    c.drawRate + "%", c.blackWinRate + "%", c.eval);
        }
        return s;
    }
}
