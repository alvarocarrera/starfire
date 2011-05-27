package es.upm.dit.gsi.ontology;

import edu.stanford.smi.protegex.owl.model.*;

import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.pr-owl.org/pr-owl.owl#MTheory
 *
 * @version generated on Fri Apr 01 15:09:42 CEST 2011
 */
public interface MTheory extends OWLIndividual {

    // Property http://www.pr-owl.org/pr-owl.owl#hasMFrag

    Set getHasMFrag();

    RDFProperty getHasMFragProperty();

    boolean hasHasMFrag();

    Iterator listHasMFrag();

    void addHasMFrag(MFrag newHasMFrag);

    void removeHasMFrag(MFrag oldHasMFrag);

    void setHasMFrag(Set newHasMFrag);
}
