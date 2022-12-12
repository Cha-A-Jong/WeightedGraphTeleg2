package sr.unasat.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void addEdge() {
        ArrayList<String> edgeList = new ArrayList<String>();
        edgeList.add("Dorp1");
        edgeList.add("Dorp2");
        assertTrue(edgeList.size() == 2 );
    }

}