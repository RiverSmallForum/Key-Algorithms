public class MSD {
    private static final int BITS_PER_BYTE =   8;
    private static final int BITS_PER_INT  =  32;   // each Java int is 32 bits 
    private static final int R             = 256;   // extended ASCII alphabet size
    private static final int CUTOFF        =  15;   // cutoff to insertion sort
    private MSD() { } 
    public static void sort(String[] a) {
    private static int charAt(String s, int d) {
    private static void sort(String[] a, int lo, int hi, int d, String[] aux) {
    private static void insertion(String[] a, int lo, int hi, int d) {
    private static void exch(String[] a, int i, int j) {
    private static boolean less(String v, String w, int d) {
    public static void sort(int[] a) {
    private static void sort(int[] a, int lo, int hi, int d, int[] aux) {
    private static void insertion(int[] a, int lo, int hi, int d) {
    private static void exch(int[] a, int i, int j) {
    public static void main(String[] args) {
