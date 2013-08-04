import java.util.ArrayList;
import java.util.List;


public class Graph {

    public Vertex root;
    public List<Vertex> vertices = new ArrayList<Vertex>();

    public Vertex createRoot(String name)
    {
        root = createVertex(name);
        return root;
    }

    public Vertex createVertex(String name)
    {
        Vertex n = new Vertex(name);
        vertices.add(n);
        return n;
    }

    public int[][] createAdjMatrix()
    {
        int[][] adj = new int[this.vertices.size()][this.vertices.size()];

        for (int i = 0; i < this.vertices.size(); i++)
        {
            Vertex n1 = this.vertices.get(i);

            for (int j = 0; j < this.vertices.size(); j++)
            {
                Vertex n2 = this.vertices.get(j);

                Edge edge = n1.Arcs.FirstOrDefault(a => a.Child == n2);

                if (edge != null)
                {
                    adj[i, j] = edge.weight;
                }
            }
        }
        return adj;
    }
}
