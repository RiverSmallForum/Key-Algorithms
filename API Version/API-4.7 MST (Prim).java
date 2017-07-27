public class PrimMST {
    private static final double FLOATING_POINT_EPSILON = 1E-12;
    private Edge[] edgeTo;        // edgeTo[v] = shortest edge from tree vertex to non-tree vertex
    private double[] distTo;      // distTo[v] = weight of shortest such edge
    private boolean[] marked;     // marked[v] = true if v on tree, false otherwise
    private IndexMinPQ<Double> pq;
    public PrimMST(EdgeWeightedGraph G) {
    private void prim(EdgeWeightedGraph G, int s) {
    private void scan(EdgeWeightedGraph G, int v) {
    public Iterable<Edge> edges() {
    public double weight() {
    private boolean check(EdgeWeightedGraph G) {
    public static void main(String[] args) {
