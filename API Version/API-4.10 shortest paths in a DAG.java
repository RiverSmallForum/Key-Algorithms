public class AcyclicSP {
    private double[] distTo;         // distTo[v] = distance  of shortest s->v path
    private DirectedEdge[] edgeTo;   // edgeTo[v] = last edge on shortest s->v path
    public AcyclicSP(EdgeWeightedDigraph G, int s) {
    private void relax(DirectedEdge e) {
    public double distTo(int v) {
    public boolean hasPathTo(int v) {
    public Iterable<DirectedEdge> pathTo(int v) {
    private void validateVertex(int v) {
    public static void main(String[] args) {
