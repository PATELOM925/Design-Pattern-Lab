package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonDP o1 = SingletonDP.getInstance();
        SingletonDP o2 = SingletonDP.getInstance();
        o1.setI(1);
        System.out.println("object 1 :"+o1.getI());
        o2.setI(2);
        System.out.println("object 1 (after o2 assigned):"+
                o1.getI());
        System.out.println("object 2 :"+o2.getI());
        o2.i = o1.i + o2.i;
        System.out.println("object 2 (after addn) :"+o2.getI());
        print("1",o1);
        print("2",o2);
    }


    static void print(String name , SingletonDP object){
        System.out.println(String.format("Object:%s," +
                "Hashcode:%d",name,object.hashCode()));
    }
}
