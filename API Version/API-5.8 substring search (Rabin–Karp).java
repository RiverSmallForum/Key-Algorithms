public class RabinKarp {
    private String pat;      // the pattern  // needed only for Las Vegas
    private long patHash;    // pattern hash value
    private int m;           // pattern length
    private long q;          // a large prime, small enough to avoid long overflow
    private int R;           // radix
    private long RM;         // R^(M-1) % Q
    public RabinKarp(char[] pattern, int R) {
    public RabinKarp(String pat) {
    private long hash(String key, int m) { 
    private boolean check(String txt, int i) {
    public int search(String txt) {
    private static long longRandomPrime() {
    public static void main(String[] args) {
