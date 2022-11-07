package OOP_HW1;

public class main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 56);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 25);
        Person jane = new Person("Женя", 2);
        Person ivan = new Person("Ваня", 5);
        FamilyTree tree = new FamilyTree();
        tree.addNode(irina, masha);
        tree.addNode(irina, vasya);
        tree.addNode(vasya, jane);
        tree.addNode(vasya, ivan);

        System.out.println(tree.getRelatedPersons(irina,
                Relations.Parent));

        System.out.println("Поиск людей по возрасту: " + tree.searchByAge(30));





    }
}
