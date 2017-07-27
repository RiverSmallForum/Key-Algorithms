public class NFA { 
    private Digraph graph;     // digraph of epsilon transitions
    private String regexp;     // regular expression
    private final int m;       // number of characters in regular expression
    public NFA(String regexp) {
    public boolean recognizes(String txt) {
    public static void main(String[] args) {
