package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.List;

@Named
public class CallSupport implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        List oeDeputyList  = (List) delegateExecution.getVariable("oeDeputyList");

        System.out.println("oeDeputyList "+ oeDeputyList);

        //call another service
        System.out.println("unassigned to any OE code, calling Genesys Support ");

        //passing the conversationId and add deputy id
        delegateExecution.setVariable("genesysSupport", "8888");
        System.out.println("Calling Genesys API");
    }
}
