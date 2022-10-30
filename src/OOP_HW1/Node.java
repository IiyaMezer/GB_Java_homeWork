package OOP_HW1;
//Человек как элемент семеного древа, наследуется от Person имеет поле с родителем.
public class Node extends Person{
    private String parent;

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
    public Node(String name, int age, String parent) {
        super(name, age);
        this.parent = parent;
    }


}
