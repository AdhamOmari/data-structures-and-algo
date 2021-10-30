package trees.implemant.node;

import java.util.ArrayList;
import java.util.List;

public class NodeK {
    String value;
     public  List<NodeK > children;


    public NodeK(String value) {
        this.value = value;
        children=new ArrayList<NodeK>();
    }
}
