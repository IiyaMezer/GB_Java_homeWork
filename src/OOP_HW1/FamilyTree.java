package OOP_HW1;

import java.util.ArrayList;

public class FamilyTree {
    ArrayList<String> res = new ArrayList<String>();
    ArrayList<Node> tree;


    public FamilyTree() {
        ArrayList<Node> tree = new ArrayList<Node>();
        this.tree = tree;
    }


    public void addNode(Person parent, Person child) {
        this.tree.add(new Node(parent, child, Relations.Parent));
        this.tree.add(new Node(child, parent, Relations.Child));
    }

    public ArrayList<String> searchByAge(int age){
        for (Node node: this.tree) {
            if (node.getPerson().getAge() < age){
                res.add(node.getPerson().getName());
            }
        }
        return res;
    }
    ///TODO переделать функцию на свич кейс, каждый кейс - тип отношений в семье. На каждый тип свой метод.

    public ArrayList<String> getRelatedPersons(Person person, Relations relation){
        for (Node node: this.tree) {
            if ( node.getPerson().getName() == person.getName()
                 && node.getRelation() == relation){
                res.add(node.getParent().getName());
            }
        }
        return res;
    }
///TODO на каждый тип отношений доделать метод, для выявления этих отношений.
    private ArrayList<String> getSibling(){
        return null;
    }
    private ArrayList<String> getCousin(){
        return null;
    }

    private ArrayList<String> getGrandParent(){
        return null;
    }
    private ArrayList<String> getСhild(){
        return null;
    }
    private ArrayList<String> getParent(){
        return null;
    }
}