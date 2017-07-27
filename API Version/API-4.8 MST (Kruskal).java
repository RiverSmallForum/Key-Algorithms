public class KruskalMST {
    private static final double FLOATING_POINT_EPSILON = 1E-12;
    private double weight;                        // weight of MST
    private Queue<Edge> mst = new Queue<Edge>();  // edges in MST
    public KruskalMST(EdgeWeightedGraph G) {
    public Iterable<Edge> edges() {
    public double weight() {
    private boolean check(EdgeWeightedGraph G) {
    public static void main(String[] args) {
