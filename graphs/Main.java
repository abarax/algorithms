import java.util.ArrayList;

public class Main {


    public static void main(String [] args) {

        graph = new Graph();

        a = graph.createRoot("A");
        b = graph.createVertex("B");
        c = graph.createVertex("C");
        d = graph.createVertex("D");
        e = graph.createVertex("E");
        f = graph.createVertex("F");
        g = graph.createVertex("G");
        h = graph.createVertex("H");
        i = graph.createVertex("I");
        j = graph.createVertex("J");
        k = graph.createVertex("K");
        l = graph.createVertex("L");
        m = graph.createVertex("M");
        n = graph.createVertex("N");
        o = graph.createVertex("O");
        p = graph.createVertex("P");

        a.addEdge(b, 1)
                .addEdge(c, 1);

        b.addEdge(e, 1)
                .addEdge(d, 3);

        c.addEdge(f, 1)
                .addEdge(d, 3);

        c.addEdge(f, 1)
                .addEdge(d, 3);

        d.addEdge(h, 8);

        e.addEdge(g, 1)
                .addEdge(h, 3);

        f.addEdge(h, 3)
                .addEdge(i, 1);

        g.addEdge(j, 3)
                .addEdge(l, 1);

        h.addEdge(j, 8)
                .addEdge(k, 8)
                .addEdge(m, 3);

        i.addEdge(k, 3)
                .addEdge(n, 1);

        j.addEdge(o, 3);

        k.addEdge(p, 3);

        l.addEdge(o, 1);

        m.addEdge(o, 1)
                .addEdge(p, 1);

        n.addEdge(p, 1);


        int[][] matrix = graph.createAdjMatrix(); 


    }

}
