public class LinkedQueue<Item> implements Iterable<Item> {
    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue
    private class Node {
        private Item item;
        private Node next;
    public LinkedQueue() {
    public boolean isEmpty() {
    public int size() {
    public Item peek() {
    public void enqueue(Item item) {
    public Item dequeue() {
    public String toString() {
    private boolean check() {
    public Iterator<Item> iterator()  {
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }
        public Item next() {
    public static void main(String[] args) {
