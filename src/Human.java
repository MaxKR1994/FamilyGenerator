import java.util.ArrayList;

public class Human {
    public String name;
    public int age;
    public ArrayList<Human> children;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        children = null;
    }
    public Human(String name,int age,ArrayList<Human> children) {
        this.name = name;
        this.age = age;
        this.children = new ArrayList<Human>(children);
    }

    public String toString() {
        String text = "";
        text += "Name: " + this.name;
        text += ", Age: " + this.age;
        int childCount = 0;
        if (children != null){
            childCount = children.size();
        }
        if (childCount > 0) {
            text += ", children -> " + " Name: " + children.get(0).name + ", age: " + children.get(0).age;
            for (int i = 1; i < childCount; i++) {
                Human child = children.get(i);
                text += ", " + "Name: " + child.name + "; " + " age: " + child.age ;
            }
        }

        return text;
    }
}

