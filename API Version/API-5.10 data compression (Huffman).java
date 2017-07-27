public class Huffman {
    private static final int R = 256;
    private Huffman() { }
    private static class Node implements Comparable<Node> {
        private final char ch;
        private final int freq;
        private final Node left, right;
        private boolean isLeaf() {
        public int compareTo(Node that) {
    public static void compress() {
    private static Node buildTrie(int[] freq) {
    private static void writeTrie(Node x) {
    private static void buildCode(String[] st, Node x, String s) {
    public static void expand() {
    private static Node readTrie() {
    public static void main(String[] args) {
