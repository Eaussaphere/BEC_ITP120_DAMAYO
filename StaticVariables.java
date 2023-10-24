public class StaticVariables {
    private static int instanceCount = 0;
    private String data;

    public MyClass(String data) {
        this.data = data;
        instanceCount++;
    }

    public void displayInfo() {
        System.out.println("Data: " + data);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Instance 1");
        MyClass obj2 = new MyClass("Instance 2");
        MyClass obj3 = new MyClass("Instance 3");

        System.out.println("Instance count: " + MyClass.getInstanceCount());

        MyClass obj4 = new MyClass("Instance 4");
        MyClass obj5 = new MyClass("Instance 5");

        System.out.println("Instance count: " + MyClass.getInstanceCount());

        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();
        obj4.displayInfo();
        obj5.displayInfo();
    }
}
