package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class AgentInfo extends ValueObject implements Serializable {
    /**
     * Agent Id 
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String agentId = null;

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setCommissonableAgentId(String commissonableAgentId) {
        this.commissonableAgentId = commissonableAgentId;
    }

    public String getCommissonableAgentId() {
        return commissonableAgentId;
    }

    /**
     * Commissionable Agent Id
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * TODO: EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias:  <br>
     * EnterpriseOne field length:  40 <br>
     */
    private String commissonableAgentId = null;

    /**
     * TODO: Default public constructor for instantiating: AgentInfo
     */
    public AgentInfo() {
    }
}
