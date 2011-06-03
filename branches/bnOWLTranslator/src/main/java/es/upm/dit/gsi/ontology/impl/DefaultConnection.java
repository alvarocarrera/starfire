package es.upm.dit.gsi.ontology.impl;

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.*;
import edu.stanford.smi.protegex.owl.model.impl.*;
import edu.stanford.smi.protegex.owl.javacode.AbstractCodeGeneratorIndividual;
import java.util.*;

import es.upm.dit.gsi.ontology.Connection;
import es.upm.dit.gsi.ontology.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/Diagnosis.owl#Connection
 *
 * @version generated on Fri Apr 01 15:09:41 CEST 2011
 */
public class DefaultConnection extends AbstractCodeGeneratorIndividual
         implements Connection {

    public DefaultConnection(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultConnection() {
    }



    // Property http://www.owl-ontologies.com/Diagnosis.owl#connectsSystem

    public Set getConnectsSystem() {
        return new HashSet(getPropertyValuesAs(getConnectsSystemProperty(), Device.class));
    }


    public RDFProperty getConnectsSystemProperty() {
        final String uri = "http://www.owl-ontologies.com/Diagnosis.owl#connectsSystem";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasConnectsSystem() {
        return getPropertyValueCount(getConnectsSystemProperty()) > 0;
    }


    public Iterator listConnectsSystem() {
        return listPropertyValuesAs(getConnectsSystemProperty(), Device.class);
    }


    public void addConnectsSystem(Device newConnectsSystem) {
        addPropertyValue(getConnectsSystemProperty(), newConnectsSystem);
    }


    public void removeConnectsSystem(Device oldConnectsSystem) {
        removePropertyValue(getConnectsSystemProperty(), oldConnectsSystem);
    }


    public void setConnectsSystem(Set newConnectsSystem) {
        setPropertyValues(getConnectsSystemProperty(), newConnectsSystem);
    }



    // Property http://www.owl-ontologies.com/Diagnosis.owl#id

    public String getId() {
        return (String) getPropertyValue(getIdProperty());
    }


    public RDFProperty getIdProperty() {
        final String uri = "http://www.owl-ontologies.com/Diagnosis.owl#id";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasId() {
        return getPropertyValueCount(getIdProperty()) > 0;
    }


    public void setId(String newId) {
        setPropertyValue(getIdProperty(), newId);
    }



    // Property http://www.owl-ontologies.com/Diagnosis.owl#isPartOfNetwork

    public Set getIsPartOfNetwork() {
        return new HashSet(getPropertyValuesAs(getIsPartOfNetworkProperty(), Network.class));
    }


    public RDFProperty getIsPartOfNetworkProperty() {
        final String uri = "http://www.owl-ontologies.com/Diagnosis.owl#isPartOfNetwork";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasIsPartOfNetwork() {
        return getPropertyValueCount(getIsPartOfNetworkProperty()) > 0;
    }


    public Iterator listIsPartOfNetwork() {
        return listPropertyValuesAs(getIsPartOfNetworkProperty(), Network.class);
    }


    public void addIsPartOfNetwork(Network newIsPartOfNetwork) {
        addPropertyValue(getIsPartOfNetworkProperty(), newIsPartOfNetwork);
    }


    public void removeIsPartOfNetwork(Network oldIsPartOfNetwork) {
        removePropertyValue(getIsPartOfNetworkProperty(), oldIsPartOfNetwork);
    }


    public void setIsPartOfNetwork(Set newIsPartOfNetwork) {
        setPropertyValues(getIsPartOfNetworkProperty(), newIsPartOfNetwork);
    }
}