package tcc.e1.bssv.JP554200.valueobject;

import java.io.Serializable;

import oracle.e1.bssvfoundation.base.ValueObject;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class OrderOptions extends ValueObject implements Serializable
{
    private String jdeSOVersion = null;

    /**
     * TODO: Default public constructor for instantiating: OrderOptions
     */
    public OrderOptions()
    {
    }

    public void setJdeSOVersion(String jdeSOVersion)
    {
        this.jdeSOVersion = jdeSOVersion;
    }

    public String getJdeSOVersion()
    {
        return jdeSOVersion;
    }
}
