public class BellmanFordSP {
    private double[] distTo;               // distTo[v] = distance  of shortest s->v path
    private DirectedEdge[] edgeTo;         // edgeTo[v] = last edge on shortest s->v path
    private boolean[] onQueue;             // onQueue[v] = is v currently on the queue?
    private Queue<Integer> queue;          // queue of vertices to relax
    private int cost;                      // number of calls to relax()
    private Iterable<DirectedEdge> cycle;  // negative cycle (or null if no such cycle)
    public BellmanFordSP(EdgeWeightedDigraph G, int s) {
    private void relax(EdgeWeightedDigraph G, int v) {
    public boolean hasNegativeCycle() {
    public Iterable<DirectedEdge> negativeCycle() {
    private void findNegativeCycle() {
    public double distTo(int v) {
    public boolean hasPathTo(int v) {
    public Iterable<DirectedEdge> pathTo(int v) {
    private boolean check(EdgeWeightedDigraph G, int s) {
    private void validateVertex(int v) {
    public static void main(String[] args) {
