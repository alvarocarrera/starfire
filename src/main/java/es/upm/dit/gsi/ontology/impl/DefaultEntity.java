package es.upm.dit.gsi.ontology.impl;

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.*;
import edu.stanford.smi.protegex.owl.model.impl.*;
import edu.stanford.smi.protegex.owl.javacode.AbstractCodeGeneratorIndividual;
import java.util.*;

import es.upm.dit.gsi.ontology.Entity;
import es.upm.dit.gsi.ontology.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.pr-owl.org/pr-owl.owl#Entity
 *
 * @version generated on Fri Apr 01 15:09:41 CEST 2011
 */
public class DefaultEntity extends AbstractCodeGeneratorIndividual
         implements Entity {

    public DefaultEntity(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultEntity() {
    }



    // Property http://www.pr-owl.org/pr-owl.owl#hasType

    public MetaEntity getHasType() {
        return (MetaEntity) getPropertyValueAs(getHasTypeProperty(), MetaEntity.class);
    }


    public RDFProperty getHasTypeProperty() {
        final String uri = "http://www.pr-owl.org/pr-owl.owl#hasType";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasHasType() {
        return getPropertyValueCount(getHasTypeProperty()) > 0;
    }


    public void setHasType(MetaEntity newHasType) {
        setPropertyValue(getHasTypeProperty(), newHasType);
    }



    // Property http://www.pr-owl.org/pr-owl.owl#hasUID

    public String getHasUID() {
        return (String) getPropertyValue(getHasUIDProperty());
    }


    public RDFProperty getHasUIDProperty() {
        final String uri = "http://www.pr-owl.org/pr-owl.owl#hasUID";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasHasUID() {
        return getPropertyValueCount(getHasUIDProperty()) > 0;
    }


    public void setHasUID(String newHasUID) {
        setPropertyValue(getHasUIDProperty(), newHasUID);
    }



    // Property http://www.pr-owl.org/pr-owl.owl#isArgTermIn

    public Set getIsArgTermIn() {
        return new HashSet(getPropertyValuesAs(getIsArgTermInProperty(), ArgRelationship.class));
    }


    public RDFProperty getIsArgTermInProperty() {
        final String uri = "http://www.pr-owl.org/pr-owl.owl#isArgTermIn";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasIsArgTermIn() {
        return getPropertyValueCount(getIsArgTermInProperty()) > 0;
    }


    public Iterator listIsArgTermIn() {
        return listPropertyValuesAs(getIsArgTermInProperty(), ArgRelationship.class);
    }


    public void addIsArgTermIn(ArgRelationship newIsArgTermIn) {
        addPropertyValue(getIsArgTermInProperty(), newIsArgTermIn);
    }


    public void removeIsArgTermIn(ArgRelationship oldIsArgTermIn) {
        removePropertyValue(getIsArgTermInProperty(), oldIsArgTermIn);
    }


    public void setIsArgTermIn(Set newIsArgTermIn) {
        setPropertyValues(getIsArgTermInProperty(), newIsArgTermIn);
    }



    // Property http://www.pr-owl.org/pr-owl.owl#isConditionantOf

    public Set getIsConditionantOf() {
        return new HashSet(getPropertyValuesAs(getIsConditionantOfProperty(), ProbAssign.class));
    }


    public RDFProperty getIsConditionantOfProperty() {
        final String uri = "http://www.pr-owl.org/pr-owl.owl#isConditionantOf";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasIsConditionantOf() {
        return getPropertyValueCount(getIsConditionantOfProperty()) > 0;
    }


    public Iterator listIsConditionantOf() {
        return listPropertyValuesAs(getIsConditionantOfProperty(), ProbAssign.class);
    }


    public void addIsConditionantOf(ProbAssign newIsConditionantOf) {
        addPropertyValue(getIsConditionantOfProperty(), newIsConditionantOf);
    }


    public void removeIsConditionantOf(ProbAssign oldIsConditionantOf) {
        removePropertyValue(getIsConditionantOfProperty(), oldIsConditionantOf);
    }


    public void setIsConditionantOf(Set newIsConditionantOf) {
        setPropertyValues(getIsConditionantOfProperty(), newIsConditionantOf);
    }



    // Property http://www.pr-owl.org/pr-owl.owl#isPossibleValueOf

    public Set getIsPossibleValueOf() {
        return new HashSet(getPropertyValues(getIsPossibleValueOfProperty()));
    }


    public RDFProperty getIsPossibleValueOfProperty() {
        final String uri = "http://www.pr-owl.org/pr-owl.owl#isPossibleValueOf";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasIsPossibleValueOf() {
        return getPropertyValueCount(getIsPossibleValueOfProperty()) > 0;
    }


    public Iterator listIsPossibleValueOf() {
        return listPropertyValues(getIsPossibleValueOfProperty());
    }


    public void addIsPossibleValueOf(Object newIsPossibleValueOf) {
        addPropertyValue(getIsPossibleValueOfProperty(), newIsPossibleValueOf);
    }


    public void removeIsPossibleValueOf(Object oldIsPossibleValueOf) {
        removePropertyValue(getIsPossibleValueOfProperty(), oldIsPossibleValueOf);
    }


    public void setIsPossibleValueOf(Set newIsPossibleValueOf) {
        setPropertyValues(getIsPossibleValueOfProperty(), newIsPossibleValueOf);
    }
}
