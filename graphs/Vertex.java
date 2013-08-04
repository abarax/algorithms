import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Vertex
{
    public String name;
    public HashSet<Edge> edges = new HashSet<Edge>();

    public Vertex(String name)
    {
        this.name = name;
    }

    public Vertex addEdge(Vertex child, int w)
    {
        edges.add(new Edge(this, child, w));

        return this;
    }
}
