package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class CallDeputyService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String conversationId = (String) delegateExecution.getVariable("conversationId");
        String clientId = (String) delegateExecution.getVariable("clientId");
        System.out.println("conversationId "+ conversationId);
        System.out.println("clientId "+ clientId);

        //call another service
        System.out.println("calling deputy service");

        //passing the conversationId and add deputy id
        delegateExecution.setVariable("deputyId", "99999");
        System.out.println("Calling deputy API");
    }
}
