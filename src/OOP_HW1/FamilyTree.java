package OOP_HW1;

import java.util.ArrayList;

public class FamilyTree  {
    private ArrayList<Generation> generations;

    public FamilyTree() {
        this.generations = new ArrayList<Generation>();
    }
    public void addGeneraition(Generation generation){
        generations.add(generation);
    }
}
