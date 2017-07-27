public class TST<Value> {
    private int n;              // size
    private Node<Value> root;   // root of TST
    private static class Node<Value> {
        private char c;                        // character
        private Node<Value> left, mid, right;  // left, middle, and right subtries
        private Value val;                     // value associated with string
    public TST() {
    public int size() {
    public boolean contains(String key) {
    public Value get(String key) {
    private Node<Value> get(Node<Value> x, String key, int d) {
    public void put(String key, Value val) {
    private Node<Value> put(Node<Value> x, String key, Value val, int d) {
    public String longestPrefixOf(String query) {
    public Iterable<String> keys() {
    public Iterable<String> keysWithPrefix(String prefix) {
    private void collect(Node<Value> x, StringBuilder prefix, Queue<String> queue) {
    public Iterable<String> keysThatMatch(String pattern) {
    private void collect(Node<Value> x, StringBuilder prefix, int i, String pattern, Queue<String> queue) {
    public static void main(String[] args) {
