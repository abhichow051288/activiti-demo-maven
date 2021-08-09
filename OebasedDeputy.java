package com.example.workflow.deputy;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named
public class OebasedDeputy implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String deputyId  = (String) delegateExecution.getVariable("deputyId");

        System.out.println("deputyId "+ deputyId);
        // Calling OE based deputy Service

        List<String> oeDeputyList = Arrays.asList("Paul", "Helen", "ZTYC");

        delegateExecution.setVariable("oeDeputyList", oeDeputyList);

        // calling unblu to assign the conversation to deputies
    }
}