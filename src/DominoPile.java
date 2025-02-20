import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        this.pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(pile);
    }

    public void shuffleAlternative() {
        for (int i = 0; i < pile.size() * 10; i++) {
            int index1 = (int) (Math.random() * pile.size());
            int index2 = (int) (Math.random() * pile.size());
            Collections.swap(pile, index1, index2);
        }
    }
}