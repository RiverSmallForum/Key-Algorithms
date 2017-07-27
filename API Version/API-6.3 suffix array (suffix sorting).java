public class SuffixArray {
    private Suffix[] suffixes;
    public SuffixArray(String text) {
    private static class Suffix implements Comparable<Suffix> {
        private final String text;
        private final int index;
        private Suffix(String text, int index) {
        private int length() {
        private char charAt(int i) {
        public int compareTo(Suffix that) {
        public String toString() {
    public int length() {
    public int index(int i) {
    public int lcp(int i) {
    private static int lcp(Suffix s, Suffix t) {
    public String select(int i) {
    public int rank(String query) {
    private static int compare(String query, Suffix suffix) {
    public static void main(String[] args) {
