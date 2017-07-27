public class BTree<Key extends Comparable<Key>, Value>  {
    private static final int M = 4;
    private Node root;       // root of the B-tree
    private int height;      // height of the B-tree
    private int n;           // number of key-value pairs in the B-tree
    private static final class Node {
        private int m;                             // number of children
        private Entry[] children = new Entry[M];   // the array of children
        private Node(int k) {
    private static class Entry {
        private Comparable key;
        private final Object val;
        private Node next;     // helper field to iterate over array entries
        public Entry(Comparable key, Object val, Node next) {
    public BTree() {
    public boolean isEmpty() {
    public int size() {
    public int height() {
    public Value get(Key key) {
    private Value search(Node x, Key key, int ht) {
    public void put(Key key, Value val) {
    private Node insert(Node h, Key key, Value val, int ht) {
    private Node split(Node h) {
    public String toString() {
    private String toString(Node h, int ht, String indent) {
    private boolean less(Comparable k1, Comparable k2) {
    private boolean eq(Comparable k1, Comparable k2) {
    public static void main(String[] args) {
