public class CollisionSystem {
    private final static double HZ = 0.5;    // number of redraw events per clock tick
    private MinPQ<Event> pq;          // the priority queue
    private double t  = 0.0;          // simulation clock time
    private Particle[] particles;     // the array of particles
    public CollisionSystem(Particle[] particles) {
    private void predict(Particle a, double limit) {
    private void redraw(double limit) {
    public void simulate(double limit) {
    private static class Event implements Comparable<Event> {
        private final double time;         // time that event is scheduled to occur
        private final Particle a, b;       // particles involved in event, possibly null
        private final int countA, countB;  // collision counts at event creation
        public Event(double t, Particle a, Particle b) {
        public int compareTo(Event that) {
        public boolean isValid() {
    public static void main(String[] args) {
