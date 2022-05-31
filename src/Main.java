import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human child1 = new Human("Max",27);
        Human child2 = new Human("Daria",26);

        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);

        Human child3 = new Human("Vitaliy",18);
        Human child4 = new Human("Andrey",15);

        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(child3);
        children2.add(child4);

        Human father = new Human("Sergei",50,children);
        Human mother = new Human("Natalia",50,children);
        children.add(father);
        children.add(mother);

        Human father2 = new Human("Fedor",40,children2);
        Human mother2 = new Human("Anastasia",37,children2);
        children2.add(father2);
        children2.add(mother2);

        System.out.println(father);
        System.out.println(mother);
        System.out.println(father2);
        System.out.println(mother2);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(child4);
    }
}
