public class TrieST<Value> {
    private static final int R = 256;        // extended ASCII
    private Node root;      // root of trie
    private int n;          // number of keys in trie
    private static class Node {
        private Object val;
        private Node[] next = new Node[R];
    public TrieST() {
    public Value get(String key) {
    public boolean contains(String key) {
    private Node get(Node x, String key, int d) {
    public void put(String key, Value val) {
    private Node put(Node x, String key, Value val, int d) {
    public int size() {
    public boolean isEmpty() {
    public Iterable<String> keys() {
    public Iterable<String> keysWithPrefix(String prefix) {
    private void collect(Node x, StringBuilder prefix, Queue<String> results) {
    public Iterable<String> keysThatMatch(String pattern) {
    private void collect(Node x, StringBuilder prefix, String pattern, Queue<String> results) {
    public String longestPrefixOf(String query) {
    private int longestPrefixOf(Node x, String query, int d, int length) {
    public void delete(String key) {
    private Node delete(Node x, String key, int d) {
    public static void main(String[] args) {
