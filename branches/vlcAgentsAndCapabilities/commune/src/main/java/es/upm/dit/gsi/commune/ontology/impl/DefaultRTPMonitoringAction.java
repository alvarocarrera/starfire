package es.upm.dit.gsi.commune.ontology.impl;

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.*;
import edu.stanford.smi.protegex.owl.model.impl.*;
import edu.stanford.smi.protegex.owl.javacode.AbstractCodeGeneratorIndividual;
import java.util.*;

import es.upm.dit.gsi.commune.ontology.RTPMonitoringAction;
import es.upm.dit.gsi.commune.ontology.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/P2PDiagnosis.owl#RTPMonitoringAction
 *
 * @version generated on Tue Apr 05 14:50:26 CEST 2011
 */
public class DefaultRTPMonitoringAction extends DefaultMonitoringAction
         implements RTPMonitoringAction {

    public DefaultRTPMonitoringAction(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultRTPMonitoringAction() {
    }



    // Property http://www.owl-ontologies.com/Diagnosis.owl#hasPrecondition

    public Collection getHasPrecondition() {
        return getPropertyValues(getHasPreconditionProperty());
    }


    public RDFProperty getHasPreconditionProperty() {
        final String uri = "http://www.owl-ontologies.com/Diagnosis.owl#hasPrecondition";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasHasPrecondition() {
        return getPropertyValueCount(getHasPreconditionProperty()) > 0;
    }


    public Iterator listHasPrecondition() {
        return listPropertyValues(getHasPreconditionProperty());
    }


    public void addHasPrecondition(Object newHasPrecondition) {
        addPropertyValue(getHasPreconditionProperty(), newHasPrecondition);
    }


    public void removeHasPrecondition(Object oldHasPrecondition) {
        removePropertyValue(getHasPreconditionProperty(), oldHasPrecondition);
    }


    public void setHasPrecondition(Collection newHasPrecondition) {
        setPropertyValues(getHasPreconditionProperty(), newHasPrecondition);
    }
}
