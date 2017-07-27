public class FordFulkerson {
    private static final double FLOATING_POINT_EPSILON = 1E-11;
    private final int V;          // number of vertices
    private boolean[] marked;     // marked[v] = true iff s->v path in residual graph
    private FlowEdge[] edgeTo;    // edgeTo[v] = last edge on shortest residual s->v path
    private double value;         // current value of max flow
    public FordFulkerson(FlowNetwork G, int s, int t) {
    public double value()  {
    public boolean inCut(int v)  {
    private void validate(int v)  {
    private boolean hasAugmentingPath(FlowNetwork G, int s, int t) {
    private double excess(FlowNetwork G, int v) {
    private boolean isFeasible(FlowNetwork G, int s, int t) {
    private boolean check(FlowNetwork G, int s, int t) {
    public static void main(String[] args) {
