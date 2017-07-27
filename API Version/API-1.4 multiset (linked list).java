public class LinkedBag<Item> implements Iterable<Item> {
    private Node first;    // beginning of bag
    private int n;         // number of elements in bag
    private class Node {
        private Item item;
        private Node next;
    public LinkedBag() {
    public boolean isEmpty() {
    public int size() {
    public void add(Item item) {
    public Iterator<Item> iterator()  {
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }
        public Item next() {
    public static void main(String[] args) {
