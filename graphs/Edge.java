/**
 * Created with IntelliJ IDEA.
 * User: abarax
 * Date: 4/08/13
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
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
