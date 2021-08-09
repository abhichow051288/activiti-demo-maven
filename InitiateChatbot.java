package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class InitiateChatbot implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
 // call another service here
        System.out.println("Initiate chat bot api");
    }
}
