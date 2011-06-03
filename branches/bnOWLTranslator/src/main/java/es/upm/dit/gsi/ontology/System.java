package es.upm.dit.gsi.ontology;

import edu.stanford.smi.protegex.owl.model.*;

import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/Diagnosis.owl#System
 *
 * @version generated on Fri Apr 01 15:09:41 CEST 2011
 */
public interface System extends OWLIndividual {

    // Property http://www.owl-ontologies.com/Diagnosis.owl#hasAgentResiding

    Set getHasAgentResiding();

    RDFProperty getHasAgentResidingProperty();

    boolean hasHasAgentResiding();

    Iterator listHasAgentResiding();

    void addHasAgentResiding(Agent newHasAgentResiding);

    void removeHasAgentResiding(Agent oldHasAgentResiding);

    void setHasAgentResiding(Set newHasAgentResiding);


    // Property http://www.owl-ontologies.com/Diagnosis.owl#hasData

    Set getHasData();

    RDFProperty getHasDataProperty();

    boolean hasHasData();

    Iterator listHasData();

    void addHasData(Variable newHasData);

    void removeHasData(Variable oldHasData);

    void setHasData(Set newHasData);


    // Property http://www.owl-ontologies.com/Diagnosis.owl#hasFailure

    Set getHasFailure();

    RDFProperty getHasFailureProperty();

    boolean hasHasFailure();

    Iterator listHasFailure();

    void addHasFailure(Failure newHasFailure);

    void removeHasFailure(Failure oldHasFailure);

    void setHasFailure(Set newHasFailure);


    // Property http://www.owl-ontologies.com/Diagnosis.owl#id

    String getId();

    RDFProperty getIdProperty();

    boolean hasId();

    void setId(String newId);


    // Property http://www.owl-ontologies.com/Diagnosis.owl#isComposedBy

    Set getIsComposedBy();

    RDFProperty getIsComposedByProperty();

    boolean hasIsComposedBy();

    Iterator listIsComposedBy();

    void addIsComposedBy(Subsystem newIsComposedBy);

    void removeIsComposedBy(Subsystem oldIsComposedBy);

    void setIsComposedBy(Set newIsComposedBy);
}