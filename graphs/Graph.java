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
        this.vertices.add(n);
        return n;
    }

    public int[][] createAdjMatrix()
    {
        int[][] adj = new int[this.vertices.size()][this.vertices.size()];

        for (int i = 0; i < this.vertices.size(); i++)
        {
            Vertex v1 = this.vertices.get(i);

            for (int j = 0; j < this.vertices.size(); j++)
            {
                Vertex v2 = this.vertices.get(j);

                for (Edge e : v1.edges) {
                    if (e.child == v2)
                        adj[i][j] = e.weight;
                    
                }
            }
        }
        return adj;
    }
}
