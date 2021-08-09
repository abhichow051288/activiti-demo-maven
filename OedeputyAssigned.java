package com.example.workflow.deputy;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named
public class OedeputyAssigned implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        List oeDeputyList  = (List) delegateExecution.getVariable("oeDeputyList");

        System.out.println("oeDeputyList "+ oeDeputyList);
    //call
       System.out.println("Assigned to "+ "Paul");
    }
}