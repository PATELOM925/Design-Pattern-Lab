public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator i = namesRepository.getIterator(); i.hasNext();){
            String name = (String)i.next();
            System.out.println("Name : " + name);
        }
    }
}
