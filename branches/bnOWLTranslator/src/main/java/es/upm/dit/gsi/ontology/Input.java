package es.upm.dit.gsi.ontology;

import edu.stanford.smi.protegex.owl.model.*;

import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.pr-owl.org/pr-owl.owl#Input
 *
 * @version generated on Fri Apr 01 15:09:42 CEST 2011
 */
public interface Input extends Node {

    // Property http://www.pr-owl.org/pr-owl.owl#hasArgument

    Set getHasArgument();

    RDFProperty getHasArgumentProperty();

    boolean hasHasArgument();

    Iterator listHasArgument();

    void addHasArgument(SimpleArgRelationship newHasArgument);

    void removeHasArgument(SimpleArgRelationship oldHasArgument);

    void setHasArgument(Set newHasArgument);


    // Property http://www.pr-owl.org/pr-owl.owl#hasInnerTerm

    Set getHasInnerTerm();

    RDFProperty getHasInnerTermProperty();

    boolean hasHasInnerTerm();

    Iterator listHasInnerTerm();

    void addHasInnerTerm(Input newHasInnerTerm);

    void removeHasInnerTerm(Input oldHasInnerTerm);

    void setHasInnerTerm(Set newHasInnerTerm);


    // Property http://www.pr-owl.org/pr-owl.owl#isInputInstanceOf

    Object getIsInputInstanceOf();

    RDFProperty getIsInputInstanceOfProperty();

    boolean hasIsInputInstanceOf();

    void setIsInputInstanceOf(Object newIsInputInstanceOf);


    // Property http://www.pr-owl.org/pr-owl.owl#isInputNodeIn

    Set getIsInputNodeIn();

    RDFProperty getIsInputNodeInProperty();

    boolean hasIsInputNodeIn();

    Iterator listIsInputNodeIn();

    void addIsInputNodeIn(MFrag newIsInputNodeIn);

    void removeIsInputNodeIn(MFrag oldIsInputNodeIn);

    void setIsInputNodeIn(Set newIsInputNodeIn);


    // Property http://www.pr-owl.org/pr-owl.owl#isParentOf

    Set getIsParentOf();

    RDFProperty getIsParentOfProperty();

    boolean hasIsParentOf();

    Iterator listIsParentOf();

    void addIsParentOf(Resident newIsParentOf);

    void removeIsParentOf(Resident oldIsParentOf);

    void setIsParentOf(Set newIsParentOf);
}