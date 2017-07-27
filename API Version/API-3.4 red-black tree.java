public class RedBlackBST<Key extends Comparable<Key>, Value> {
    private static final boolean RED   = true;
    private static final boolean BLACK = false;
    private Node root;     // root of the BST
    private class Node {
        private Key key;           // key
        private Value val;         // associated data
        private Node left, right;  // links to left and right subtrees
        private boolean color;     // color of parent link
        private int size;          // subtree count
        public Node(Key key, Value val, boolean color, int size) {
    public RedBlackBST() {
    private boolean isRed(Node x) {
    private int size(Node x) {
    public int size() {
    public boolean isEmpty() {
    public Value get(Key key) {
    private Value get(Node x, Key key) {
    public boolean contains(Key key) {
    public void put(Key key, Value val) {
    private Node put(Node h, Key key, Value val) { 
    public void deleteMin() {
    private Node deleteMin(Node h) { 
    public void deleteMax() {
    private Node deleteMax(Node h) { 
    public void delete(Key key) { 
    private Node delete(Node h, Key key) { 
    private Node rotateRight(Node h) {
    private Node rotateLeft(Node h) {
    private void flipColors(Node h) {
    private Node moveRedLeft(Node h) {
    private Node moveRedRight(Node h) {
    private Node balance(Node h) {
    public int height() {
    private int height(Node x) {
    public Key min() {
    private Node min(Node x) { 
    public Key max() {
    private Node max(Node x) { 
    public Key floor(Key key) {
    private Node floor(Node x, Key key) {
    public Key ceiling(Key key) {
    private Node ceiling(Node x, Key key) {  
    public Key select(int k) {
    private Node select(Node x, int k) {
    public int rank(Key key) {
    private int rank(Key key, Node x) {
    public Iterable<Key> keys() {
    public Iterable<Key> keys(Key lo, Key hi) {
    private void keys(Node x, Queue<Key> queue, Key lo, Key hi) { 
    public int size(Key lo, Key hi) {
    private boolean check() {
    private boolean isBST() {
    private boolean isBST(Node x, Key min, Key max) {
    private boolean isSizeConsistent() { return isSizeConsistent(root); }
    private boolean isSizeConsistent(Node x) {
    private boolean isRankConsistent() {
    private boolean is23() { return is23(root); }
    private boolean is23(Node x) {
    private boolean isBalanced() { 
    private boolean isBalanced(Node x, int black) {
    public static void main(String[] args) { 
