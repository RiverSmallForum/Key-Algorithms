public class SequentialSearchST<Key, Value> {
    private int n;           // number of key-value pairs
    private Node first;      // the linked list of key-value pairs
    private class Node {
        private Key key;
        private Value val;
        private Node next;
        public Node(Key key, Value val, Node next)  {
    public SequentialSearchST() {
    public int size() {
    public boolean isEmpty() {
    public boolean contains(Key key) {
    public Value get(Key key) {
    public void put(Key key, Value val) {
    public void delete(Key key) {
    private Node delete(Node x, Key key) {
    public Iterable<Key> keys()  {
    public static void main(String[] args) {
