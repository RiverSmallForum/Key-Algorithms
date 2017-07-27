public class BreadthFirstPaths {
    private static final int INFINITY = Integer.MAX_VALUE;
    private boolean[] marked;  // marked[v] = is there an s-v path
    private int[] edgeTo;      // edgeTo[v] = previous edge on shortest s-v path
    private int[] distTo;      // distTo[v] = number of edges shortest s-v path
    public BreadthFirstPaths(Graph G, int s) {
    public BreadthFirstPaths(Graph G, Iterable<Integer> sources) {
    private void bfs(Graph G, int s) {
    private void bfs(Graph G, Iterable<Integer> sources) {
    public boolean hasPathTo(int v) {
    public int distTo(int v) {
    public Iterable<Integer> pathTo(int v) {
    private boolean check(Graph G, int s) {
    private void validateVertex(int v) {
    private void validateVertices(Iterable<Integer> vertices) {
    public static void main(String[] args) {
