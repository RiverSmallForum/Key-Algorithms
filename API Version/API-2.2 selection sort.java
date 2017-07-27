public class Selection {
    private Selection() { }
    public static void sort(Comparable[] a) {
    public static void sort(Object[] a, Comparator comparator) {
    private static boolean less(Comparable v, Comparable w) {
    private static boolean less(Comparator comparator, Object v, Object w) {
    private static void exch(Object[] a, int i, int j) {
    private static boolean isSorted(Comparable[] a) {
    private static boolean isSorted(Comparable[] a, int lo, int hi) {
    private static boolean isSorted(Object[] a, Comparator comparator) {
    private static boolean isSorted(Object[] a, Comparator comparator, int lo, int hi) {
    private static void show(Comparable[] a) {
    public static void main(String[] args) {
