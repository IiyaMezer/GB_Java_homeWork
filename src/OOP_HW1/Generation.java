package OOP_HW1;

import java.util.ArrayList;

public class Generation {
    private ArrayList<Node> nodes;
    public Generation() {
        this.nodes = new ArrayList<Node>();
    }
    public void addNode(int age, String name, String parent){
        this.nodes.add(new Node(name, age, parent));
    }
}

