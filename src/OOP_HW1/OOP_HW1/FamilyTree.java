package OOP_HW1;

import java.util.ArrayList;

public class FamilyTree<T extends Person> implements ResearchPeople{

    ArrayList<Node> tree;



    public FamilyTree() {
        this.tree = new ArrayList<Node>();
    }


    public void addNode(T parent, T child) {
        this.tree.add(new Node(parent, child, Relations.Parent));
        this.tree.add(new Node(child, parent, Relations.Child));
    }

    public ArrayList<String>  searchByAge(int age){
        ArrayList<String> res = new ArrayList<>();
        for (Node node: this.tree) {
            if (node.getPerson().getAge() < age){
                res.add(node.getPerson().getName());
            }
        }
        return res;
    }
    ///TODO переделать функцию на свич кейс, каждый кейс - тип отношений в семье. На каждый тип свой метод.

    public ArrayList<String> getRelatedPersons(T person, Relations relation){
        ArrayList<String> res = new ArrayList<>();
        for (Node node: this.tree) {
            if (node.getPerson().getName().equals(person.getName())
                 && node.getRelation() == relation){
                res.add( node.getParent().getName());
            }
        }
        return res;
    }

    public void add (T item){
        this.add(item);
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