public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a;         // array of items
    private int n;            // number of elements on stack
    public ResizingArrayStack() {
    public boolean isEmpty() {
    public int size() {
    private void resize(int capacity) {
    public void push(Item item) {
    public Item pop() {
    public Item peek() {
    public Iterator<Item> iterator() {
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i;
        public ReverseArrayIterator() {
        public boolean hasNext() {
        public void remove() {
        public Item next() {
    public static void main(String[] args) {
