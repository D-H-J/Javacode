public class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.setname("������");
        c1.setname("��ķè");

        d1.showName();
        d1.cry();
        d1.swimming();

        c1.showName();
        c1.cry();
        c1.climbUpTree();
    }
}

class Animal{
    protected String name;

    void setname(String name){
        this.name = name;
    }
    public void cry()
    {
        System.out.println(name + "����crying~~~");
    }


    public void showName()
    {
        System.out.println("�ҵ������ǣ�" + name);
    }
}

class Dog extends Animal{

    public void swimming()
    {
        System.out.println(name + "����Ӿ");
    }


    public void cry()
    {
        System.out.println("Wang ~~~ Wang ~~~~");

    }

}

class Cat extends Animal{
    public void climbUpTree()
    {
        System.out.println(name + "������");
    }

    public void cry()
    {
        System.out.println("Miao ~~~ Miao ~~~~");

    }

}





