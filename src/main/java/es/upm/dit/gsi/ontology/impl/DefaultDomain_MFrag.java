package es.upm.dit.gsi.ontology.impl;

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.*;
import edu.stanford.smi.protegex.owl.model.impl.*;
import edu.stanford.smi.protegex.owl.javacode.AbstractCodeGeneratorIndividual;
import java.util.*;

import es.upm.dit.gsi.ontology.Domain_MFrag;
import es.upm.dit.gsi.ontology.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.pr-owl.org/pr-owl.owl#Domain_MFrag
 *
 * @version generated on Fri Apr 01 15:09:42 CEST 2011
 */
public class DefaultDomain_MFrag extends DefaultMFrag
         implements Domain_MFrag {

    public DefaultDomain_MFrag(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultDomain_MFrag() {
    }



    // Property http://www.pr-owl.org/pr-owl.owl#hasContextNode

    public Set getHasContextNode() {
        return new HashSet(getPropertyValuesAs(getHasContextNodeProperty(), Context.class));
    }


    public RDFProperty getHasContextNodeProperty() {
        final String uri = "http://www.pr-owl.org/pr-owl.owl#hasContextNode";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasHasContextNode() {
        return getPropertyValueCount(getHasContextNodeProperty()) > 0;
    }


    public Iterator listHasContextNode() {
        return listPropertyValuesAs(getHasContextNodeProperty(), Context.class);
    }


    public void addHasContextNode(Context newHasContextNode) {
        addPropertyValue(getHasContextNodeProperty(), newHasContextNode);
    }


    public void removeHasContextNode(Context oldHasContextNode) {
        removePropertyValue(getHasContextNodeProperty(), oldHasContextNode);
    }


    public void setHasContextNode(Set newHasContextNode) {
        setPropertyValues(getHasContextNodeProperty(), newHasContextNode);
    }
}
