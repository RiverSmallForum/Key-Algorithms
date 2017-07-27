public class LinkedStack<Item> implements Iterable<Item> {
    private int n;          // size of the stack
    private Node first;     // top of stack
    private class Node {
        private Item item;
        private Node next;
    public LinkedStack() {
    public boolean isEmpty() {
    public int size() {
    public void push(Item item) {
    public Item pop() {
    public Item peek() {
    public String toString() {
    public Iterator<Item> iterator() {
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }
        public Item next() {
    private boolean check() {
    public static void main(String[] args) {
