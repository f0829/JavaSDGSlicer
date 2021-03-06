package es.upv.mist.slicing.arcs.sdg;

import es.upv.mist.slicing.arcs.Arc;
import org.jgrapht.io.Attribute;
import org.jgrapht.io.DefaultAttribute;

import java.util.Map;

/** An arc that connects nodes from different procedures. Depending on the source and target, it can be considered
 * an input (connects a call to a declaration) or output (connects the end of the declaration back to the call). */
public abstract class InterproceduralArc extends Arc {
    protected InterproceduralArc() {
        super();
    }

    @Override
    public Map<String, Attribute> getDotAttributes() {
        var map = super.getDotAttributes();
        map.put("penwidth", DefaultAttribute.createAttribute("3"));
        if (isInterproceduralInputArc())
            map.put("color", DefaultAttribute.createAttribute("orange"));
        else if (isInterproceduralOutputArc())
            map.put("color", DefaultAttribute.createAttribute("blue"));
        else
            map.put("color", DefaultAttribute.createAttribute("green"));
        return map;
    }

    @Override
    public abstract boolean isInterproceduralInputArc();

    @Override
    public abstract boolean isInterproceduralOutputArc();
}
