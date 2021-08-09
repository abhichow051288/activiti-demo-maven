package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class DeputyAPI implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String conversationId = (String) delegateExecution.getVariable("conversationId");
        String clientId = (String) delegateExecution.getVariable("clientId");
        String deputyId = (String) delegateExecution.getVariable("deputyId");

        System.out.println("conversationId "+ conversationId);
        System.out.println("clientId "+ clientId);
        System.out.println("deputyId "+ deputyId);

        // call another service here
        System.out.println("Calling Deputy API");
    }
}