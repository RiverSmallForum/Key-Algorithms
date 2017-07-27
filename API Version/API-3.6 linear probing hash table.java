public class LinearProbingHashST<Key, Value> {
    private static final int INIT_CAPACITY = 4;
    private int n;           // number of key-value pairs in the symbol table
    private int m;           // size of linear probing table
    private Key[] keys;      // the keys
    private Value[] vals;    // the values
    public LinearProbingHashST() {
    public LinearProbingHashST(int capacity) {
    public int size() {
    public boolean isEmpty() {
    public boolean contains(Key key) {
    private int hash(Key key) {
    private void resize(int capacity) {
    public void put(Key key, Value val) {
    public Value get(Key key) {
    public void delete(Key key) {
    public Iterable<Key> keys() {
    private boolean check() {
    public static void main(String[] args) { 
