public class DepthFirstPaths {
    private boolean[] marked;    // marked[v] = is there an s-v path?
    private int[] edgeTo;        // edgeTo[v] = last edge on s-v path
    private final int s;         // source vertex
    public DepthFirstPaths(Graph G, int s) {
    private void dfs(Graph G, int v) {
    public boolean hasPathTo(int v) {
    public Iterable<Integer> pathTo(int v) {
    private void validateVertex(int v) {
    public static void main(String[] args) {
