import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {

            ArrayList<YelpData> businesses = ReadJson.readFromJson(174566, "../business.json");
            Graph g = new Graph();
            for (YelpData y : businesses) {
                g.add(new Node(y));
            }

            g.AssignEdges();

            Node n = new Node(null);


            for (int i = 0; i < businesses.size(); i++) {
                g.write(g.nodes[i]);
            }


            long a = 2;
            n = g.read((a));


            System.out.println("\nDone adding to graph and edges have been assigned!");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
