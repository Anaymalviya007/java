public class Main {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        obj.setName("Anay");
        obj.setAge(21);
        obj.setRoll(11);

        System.out.println(" name: " + obj.getName());
        System.out.println(" age: " + obj.getAge());
        System.out.println(" roll: " + obj.getRoll());

//        System.out.println(" roll: " + obj.Name);
    }
}
