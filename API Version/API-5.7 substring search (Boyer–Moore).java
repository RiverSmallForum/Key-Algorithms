public class BoyerMoore {
    private final int R;     // the radix
    private int[] right;     // the bad-character skip array
    private char[] pattern;  // store the pattern as a character array
    private String pat;      // or as a string
    public BoyerMoore(String pat) {
    public BoyerMoore(char[] pattern, int R) {
    public int search(String txt) {
    public int search(char[] text) {
    public static void main(String[] args) {
