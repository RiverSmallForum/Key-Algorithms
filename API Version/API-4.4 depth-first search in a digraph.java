public class DirectedDFS {
    private boolean[] marked;  // marked[v] = true if v is reachable
    private int count;         // number of vertices reachable from s
    public DirectedDFS(Digraph G, int s) {
    public DirectedDFS(Digraph G, Iterable<Integer> sources) {
    private void dfs(Digraph G, int v) { 
    public boolean marked(int v) {
    public int count() {
    private void validateVertex(int v) {
    private void validateVertices(Iterable<Integer> vertices) {
    public static void main(String[] args) {
