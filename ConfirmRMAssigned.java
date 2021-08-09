package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class ConfirmRMAssigned implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String agentName = (String) delegateExecution.getVariable("agentName");

        System.out.println("agentName "+ agentName);

        //call another service
        System.out.println("RM is assigned to conversation");

    }
}