public class KMP {
    private final int R;       // the radix
    private int[][] dfa;       // the KMP automoton
    private char[] pattern;    // either the character array for the pattern
    private String pat;        // or the pattern string
    public KMP(String pat) {
    public KMP(char[] pattern, int R) {
    public int search(String txt) {
    public int search(char[] text) {
    public static void main(String[] args) {
