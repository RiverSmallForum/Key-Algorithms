public class MaxPQ<Key> implements Iterable<Key> {
    private Key[] pq;                    // store items at indices 1 to n
    private int n;                       // number of items on priority queue
    private Comparator<Key> comparator;  // optional comparator
    public MaxPQ(int initCapacity) {
    public MaxPQ() {
    public MaxPQ(int initCapacity, Comparator<Key> comparator) {
    public MaxPQ(Comparator<Key> comparator) {
    public MaxPQ(Key[] keys) {
    public boolean isEmpty() {
    public int size() {
    public Key max() {
    private void resize(int capacity) {
    public void insert(Key x) {
    public Key delMax() {
    private void swim(int k) {
    private void sink(int k) {
    private boolean less(int i, int j) {
    private void exch(int i, int j) {
    private boolean isMaxHeap() {
    private boolean isMaxHeap(int k) {
    public Iterator<Key> iterator() {
    private class HeapIterator implements Iterator<Key> {
        private MaxPQ<Key> copy;
        public HeapIterator() {
        public boolean hasNext()  { return !copy.isEmpty();                     }
        public void remove()      { throw new UnsupportedOperationException();  }
        public Key next() {
    public static void main(String[] args) {
