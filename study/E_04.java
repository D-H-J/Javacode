class Student {
    private String id;
    private String name;

    // Constructor for Student class
    void student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("ѧ����������" + name + " id��" + id);
    }

    String get_id() {
        return id;
    }

    String get_name() {
        return name;
    }
}

class PostGraduate extends Student {
    private String major;

    // Constructor for PostGraduate class
    void student(String id, String name, String major) {
        super.student(id, name); // Correctly call the superclass method
        this.major = major;
    }

    void show() {
        System.out.println("�о���ѧ����������" + get_name() + " id��" + get_id() + " רҵ��" + major);
    }
}

public class E_04 {
    public static void main(String[] args) {
        PostGraduate p1 = new PostGraduate();
        p1.student("01", "Mars", "�����");
        p1.show();
    }
}
