public class Main {

    public static void main(String[] args) {
        
        PositionalList<Integer> list = new PositionalList<>();

        Position<Integer> p1 = list.addLast(8);
        Position<Integer> p2 = list.addAfter(p1, 5);
        Position<Integer> p3 = list.addBefore(p2, 3);
        Position<Integer> p0 = list.addFirst(9);
        Integer data = list.remove(list.last());
        System.out.println(data);
        list.set(p1,7);
        System.out.println(list.remove(p2));

        

        list.printList();

        
        

    }
    
}
