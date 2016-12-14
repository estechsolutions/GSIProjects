package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class Entity extends ValueObject implements Serializable
{
    private String entityIdTCC = null;
    private Address entityAddress = null;

    /**
     * TODO: Default public constructor for instantiating: Entity
     */
    public Entity()
    {
    }

    public void setEntityIdTCC(String entityIdTCC)
    {
        this.entityIdTCC = entityIdTCC;
    }

    public String getEntityIdTCC()
    {
        return entityIdTCC;
    }

    public void setEntityAddress(Address entityAddress)
    {
        this.entityAddress = entityAddress;
    }

    public Address getEntityAddress()
    {
        return entityAddress;
    }
}
