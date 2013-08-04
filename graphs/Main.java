import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: abarax
 * Date: 4/08/13
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {



    public static void main(String [] args) {

        var graph = new Graph();

        var a = graph.CreateRoot("A");
        var b = graph.CreateNode("B");
        var c = graph.CreateNode("C");
        var d = graph.CreateNode("D");
        var e = graph.CreateNode("E");
        var f = graph.CreateNode("F");
        var g = graph.CreateNode("G");
        var h = graph.CreateNode("H");
        var i = graph.CreateNode("I");
        var j = graph.CreateNode("J");
        var k = graph.CreateNode("K");
        var l = graph.CreateNode("L");
        var m = graph.CreateNode("M");
        var n = graph.CreateNode("N");
        var o = graph.CreateNode("O");
        var p = graph.CreateNode("P");

        a.AddArc(b, 1)
                .AddArc(c, 1);

        b.AddArc(e, 1)
                .AddArc(d, 3);

        c.AddArc(f, 1)
                .AddArc(d, 3);

        c.AddArc(f, 1)
                .AddArc(d, 3);

        d.AddArc(h, 8);

        e.AddArc(g, 1)
                .AddArc(h, 3);

        f.AddArc(h, 3)
                .AddArc(i, 1);

        g.AddArc(j, 3)
                .AddArc(l, 1);

        h.AddArc(j, 8)
                .AddArc(k, 8)
                .AddArc(m, 3);

        i.AddArc(k, 3)
                .AddArc(n, 1);

        j.AddArc(o, 3);

        k.AddArc(p, 3);

        l.AddArc(o, 1);

        m.AddArc(o, 1)
                .AddArc(p, 1);

        n.AddArc(p, 1);

        // o - Already added

        // p - Already added

        int?[,] adj = graph.CreateAdjMatrix(); // We're going to implement that down below

        PrintMatrix(ref adj, graph.AllNodes.Count);


    }

}
