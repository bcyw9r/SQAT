package org.example.values;

import java.util.HashSet;
import java.util.Set;

public class Walrus {
    private Set<WalrusFood> stomach = new HashSet<>();

    public Boolean hasEaten(WalrusFood food) {
        return stomach.contains(food);
    }
// Updated for submission

    public void addToStomach(WalrusFood food) {
        stomach.add(food);
    }

    public int stomachSize() {
        return stomach.size();
    }
}
