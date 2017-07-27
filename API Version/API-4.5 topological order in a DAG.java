public class Topological {
    private Iterable<Integer> order;  // topological order
    private int[] rank;               // rank[v] = position of vertex v in topological order
    public Topological(Digraph G) {
    public Topological(EdgeWeightedDigraph G) {
    public Iterable<Integer> order() {
    public boolean hasOrder() {
    public boolean isDAG() {
    public int rank(int v) {
    private void validateVertex(int v) {
    public static void main(String[] args) {
