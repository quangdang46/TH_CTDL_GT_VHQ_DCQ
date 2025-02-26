interface StackInterface<E> {
  public void push(E e);

  public E pop();

  public int size();

  public boolean contains(E item);

  public void print();

  public boolean isEmpty();

  public E getPeek();
}
