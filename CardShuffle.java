public class CardShuffle {
    static final int HEARTS = 1;
    static final int CLUBS = 2;
    static final int DIAMONDS = 3;
    static final int SPADES = 4;
    static int[][] deck = new int[2][52];
    public static void main(String[] args)
    {
        int k = 0;
        String [] deck1 = new String [52];
        String temp;

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                deck[0][k] = i + 1;
                deck[1][k] = j + 1;
                k++;
            }
        }

        for (int i = 0; i < 52; i++)
        {
            if (deck[0][i] == 1) deck1[i] = "Hearts ";
            if (deck[0][i] == 2) deck1[i] = "Clubs ";
            if (deck[0][i] == 3) deck1[i] = "Diamonds ";
            if (deck[0][i] == 4) deck1[i] = "Spades ";

            if (deck[1][i] == 1) deck1[i] += "A, ";
            else if (deck[1][i] == 11) deck1[i] += "J, ";
            else if (deck[1][i] == 12) deck1[i] += "Q, ";
            else if (deck[1][i] == 13) deck1[i] += "K, ";
            else deck1[i] += (deck[1][i] + ", ");
        }

        System.out.println("Initial Deck");
        for (int i = 0; i < 52; i++)
        {
            System.out.print(deck1[i]);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 52; i++)
        {
            int a = (int)(Math.random()*52);
            int b = (int)(Math.random()*52);

            temp = deck1[a];
            deck1[b] = deck1[a];
            deck1[b] = temp;
        }

        System.out.println("New Deck");
        for (int i = 0; i < 52; i++)
        {
            System.out.print(deck1[i]);
        }
    }
}