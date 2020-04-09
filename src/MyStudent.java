public class MyStudent implements Student {

    private String name;
    private int age;


    public MyStudent() {
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public MyStudent(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public void myNameAge() {
        System.out.println(name + age + "哈哈哈哈哈哈");
    }


    //被增强对象的方法

}
