public class KosarajuSharirSCC {
    private boolean[] marked;     // marked[v] = has vertex v been visited?
    private int[] id;             // id[v] = id of strong component containing v
    private int count;            // number of strongly-connected components
    public KosarajuSharirSCC(Digraph G) {
    private void dfs(Digraph G, int v) { 
    public int count() {
    public boolean stronglyConnected(int v, int w) {
    public int id(int v) {
    private boolean check(Digraph G) {
    private void validateVertex(int v) {
    public static void main(String[] args) {
