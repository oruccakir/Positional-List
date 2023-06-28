import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        PositionalList<Integer> list = new PositionalList<>();

        for(int i=0; i<10; i++){
            list.addLast(i);
        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("//////////////////////////////");

        for(Integer t : list){
            System.out.println(t);
        }

        

        

        list.printList();

        
        

    }
    
}
