package es.upv.mist.slicing.arcs.sdg;

import es.upv.mist.slicing.arcs.Arc;
import es.upv.mist.slicing.nodes.io.ActualIONode;
import org.jgrapht.io.Attribute;
import org.jgrapht.io.DefaultAttribute;

import java.util.Map;

/** An intraprocedural arc that connects {@link ActualIONode actual} nodes of
 *  the same call to summarize the dependencies within the declaration. */
public class SummaryArc extends Arc {
    @Override
    public Map<String, Attribute> getDotAttributes() {
        Map<String, Attribute> map = super.getDotAttributes();
        map.put("style", DefaultAttribute.createAttribute("bold"));
        return map;
    }
}
