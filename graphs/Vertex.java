import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: abarax
 * Date: 4/08/13
 * Time: 8:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vertex
{
    public String name;
    public HashSet<Edge> edges = new HashSet<Edge>();

    public Vertex(String name)
    {
        this.name = name;
    }

    /// <summary>
    /// Create a new Edge, connecting this Vertex to the Nod passed in the parameter
    /// Also, it creates the inversed Vertex in the passed Vertex
    /// </summary>
    public Vertex addEdge(Vertex child, int w)
    {
        edges.add(new Edge(this, child, w));

        child.addEdge(this, w);

        return this;
    }
}