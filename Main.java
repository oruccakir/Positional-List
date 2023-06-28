import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        PositionalList<Integer> list = new PositionalList<>();
        PositionalList<Integer> list1 = new PositionalList<>();

        for(int i=0; i<10; i++){
            list.addLast(i);
            list1.addLast(1);
        }

    
        System.out.println(list.equals(list1));

        

        list.printList();
        list1.printList();

        
        

    }
    
}
