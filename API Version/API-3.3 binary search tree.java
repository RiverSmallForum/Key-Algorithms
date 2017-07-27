public class BST<Key extends Comparable<Key>, Value> {
    private Node root;             // root of BST
    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree
        public Node(Key key, Value val, int size) {
    public BST() {
    public boolean isEmpty() {
    public int size() {
    private int size(Node x) {
    public boolean contains(Key key) {
    public Value get(Key key) {
    private Value get(Node x, Key key) {
    public void put(Key key, Value val) {
    private Node put(Node x, Key key, Value val) {
    public void deleteMin() {
    private Node deleteMin(Node x) {
    public void deleteMax() {
    private Node deleteMax(Node x) {
    public void delete(Key key) {
    private Node delete(Node x, Key key) {
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
    public int height() {
    private int height(Node x) {
    public Iterable<Key> levelOrder() {
    private boolean check() {
    private boolean isBST() {
    private boolean isBST(Node x, Key min, Key max) {
    private boolean isSizeConsistent() { return isSizeConsistent(root); }
    private boolean isSizeConsistent(Node x) {
    private boolean isRankConsistent() {
    public static void main(String[] args) { 
