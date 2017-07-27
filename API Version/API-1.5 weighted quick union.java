public class WeightedQuickUnionUF {
    private int[] parent;   // parent[i] = parent of i
    private int[] size;     // size[i] = number of sites in subtree rooted at i
    private int count;      // number of components
    public WeightedQuickUnionUF(int n) {
    public int count() {
    public int find(int p) {
    private void validate(int p) {
    public boolean connected(int p, int q) {
    public void union(int p, int q) {
    public static void main(String[] args) {
