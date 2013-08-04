public class Edge
{
    public Integer weight;
    public Vertex parent;
    public Vertex child;

    public Edge(Vertex parent, Vertex child, Integer weight) {

        this.parent = parent;
        this.child = child;
        this.weight = weight;
    }
}
