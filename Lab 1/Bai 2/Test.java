public class Test {
  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    list.print();
    System.out.println("Remove node value: "+ list.getByIndex(3));
    list.removeCurr(list.getByIndex(3));
    list.print();
  }
}
