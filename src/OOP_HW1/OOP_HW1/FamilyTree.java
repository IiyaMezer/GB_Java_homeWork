package OOP_HW1;

import java.util.ArrayList;

public class FamilyTree<T> implements ResearchPeople{

    ArrayList<Node> tree;


    public FamilyTree() {
        this.tree = new ArrayList<Node>();
    }


    public void addNode(Person parent, Person child) {
        this.tree.add(new Node(parent, child, Relations.Parent));
        this.tree.add(new Node(child, parent, Relations.Child));
    }

    public FamilyTree<T>  searchByAge(int age){
        for (Node node: this.tree) {
            if (node.getPerson().getAge() < age){
                this.add((T) node.getPerson().getName());
            }
        }
        return this;
    }
    ///TODO переделать функцию на свич кейс, каждый кейс - тип отношений в семье. На каждый тип свой метод.

    public FamilyTree<T> getRelatedPersons(Person person, Relations relation){
        for (Node node: this.tree) {
            if (node.getPerson().getName().equals(person.getName())
                 && node.getRelation() == relation){
                this.add((T) node.getParent().getName());
            }
        }
        return this;
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