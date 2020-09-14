package tfm.slicing;

import tfm.graphs.cfg.CFG;
import tfm.graphs.pdg.PDG;
import tfm.graphs.sdg.SDG;
import tfm.nodes.GraphNode;

import java.util.Optional;

/** A criterion that locates nodes by numerical id. */
public class NodeIdSlicingCriterion extends SlicingCriterion {
    protected final long id;

    public NodeIdSlicingCriterion(long id, String variable) {
        super(variable);
        this.id = id;
    }

    @Override
    public Optional<GraphNode<?>> findNode(CFG graph) {
        return graph.findNodeById(id);
    }

    @Override
    public Optional<GraphNode<?>> findNode(PDG graph) {
        return graph.findNodeById(id);
    }

    @Override
    public Optional<GraphNode<?>> findNode(SDG graph) {
        return graph.findNodeById(id);
    }
}
