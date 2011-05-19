package es.upm.dit.gsi.commune.ontology;

import edu.stanford.smi.protegex.owl.model.*;

import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/Diagnosis.owl#Subsystem
 *
 * @version generated on Tue Apr 05 14:50:26 CEST 2011
 */
public interface Subsystem extends System {

    // Property http://www.owl-ontologies.com/Diagnosis.owl#isPartOf

    Collection getIsPartOf();

    RDFProperty getIsPartOfProperty();

    boolean hasIsPartOf();

    Iterator listIsPartOf();

    void addIsPartOf(System newIsPartOf);

    void removeIsPartOf(System oldIsPartOf);

    void setIsPartOf(Collection newIsPartOf);
}
