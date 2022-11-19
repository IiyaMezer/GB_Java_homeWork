package OOP_HW1;

public class main {
    public static void main(String[] args) {
        Person ilya = new Person("Илья", 60);
        Person ira = new Person("Ирина", 55);
        Person vanya = new Person("Ваня", 35);
        Person masha = new Person("Маша", 25);
        Person tanya = new Person("Таня", 1);
        Person victor = new Person("Витя", 10);
        FamilyTree tree = new FamilyTree();
        tree.addNode(ilya,masha);
        tree.addNode(vanya,tanya);
        tree.addNode(vanya, victor);
        tree.addNode(ira, masha);

        System.out.println(tree.getRelatedPersons(masha,
                Relations.Parent));

        System.out.println("Поиск людей по возрасту: " + tree.searchByAge(30));





    }
}
