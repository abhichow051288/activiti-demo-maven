package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class AssignConversationToRM implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        Boolean online  = (boolean) delegateExecution.getVariable("online");
        Boolean businessHours  = (boolean) delegateExecution.getVariable("businessHours");
        System.out.println("online "+ online);
        System.out.println("businessHours "+ businessHours);

        delegateExecution.setVariable("conversationId", "ABCDEFGHIJK");
        delegateExecution.setVariable("clientId", "123456");
    }
}
