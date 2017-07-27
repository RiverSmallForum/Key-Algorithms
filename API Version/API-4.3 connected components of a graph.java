public class CC {
    private boolean[] marked;   // marked[v] = has vertex v been marked?
    private int[] id;           // id[v] = id of connected component containing v
    private int[] size;         // size[id] = number of vertices in given component
    private int count;          // number of connected components
    public CC(Graph G) {
    public CC(EdgeWeightedGraph G) {
    private void dfs(Graph G, int v) {
    private void dfs(EdgeWeightedGraph G, int v) {
    public int id(int v) {
    public int size(int v) {
    public int count() {
    public boolean connected(int v, int w) {
    public boolean areConnected(int v, int w) {
    private void validateVertex(int v) {
    public static void main(String[] args) {
