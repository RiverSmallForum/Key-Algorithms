public class BinarySearchST<Key extends Comparable<Key>, Value> {
    private static final int INIT_CAPACITY = 2;
    private Key[] keys;
    private Value[] vals;
    private int n = 0;
    public BinarySearchST() {
    public BinarySearchST(int capacity) { 
    private void resize(int capacity) {
    public int size() {
    public boolean isEmpty() {
    public boolean contains(Key key) {
    public Value get(Key key) {
    public int rank(Key key) {
    public void put(Key key, Value val)  {
    public void delete(Key key) {
    public void deleteMin() {
    public void deleteMax() {
    public Key min() {
    public Key max() {
    public Key select(int k) {
    public Key floor(Key key) {
    public Key ceiling(Key key) {
    public int size(Key lo, Key hi) {
    public Iterable<Key> keys() {
    public Iterable<Key> keys(Key lo, Key hi) {
    private boolean check() {
    private boolean isSorted() {
    private boolean rankCheck() {
    public static void main(String[] args) { 
