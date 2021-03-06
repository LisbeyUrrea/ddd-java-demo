package co.com.sofka.core.issue.events;

import co.com.sofka.core.issue.values.IssueId;
import co.com.sofka.domain.DomainEvent;
import co.com.sofka.generic.values.BasicInformationProperty;

public class IssueWithBasicInformationCreated extends DomainEvent {

    private final BasicInformationProperty basicInformation;
    private final IssueId issueId;

    public IssueWithBasicInformationCreated(IssueId issueId, BasicInformationProperty basicInformation) {
        super("issue_with_basic_information_created");
        this.issueId = issueId;
        this.basicInformation = basicInformation;
    }

    public BasicInformationProperty getBasicInformation() {
        return basicInformation;
    }

    public IssueId getIssueId() {
        return issueId;
    }

}
