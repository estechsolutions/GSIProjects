package tcc.e1.bssv.J5542001.valueobject;

import java.io.Serializable;

import java.util.Date;

import oracle.e1.bssvfoundation.base.ValueObject;
import oracle.e1.bssvfoundation.util.MathNumeric;

/**
 * TODO: Java Doc comments for Value Object here
 */
public class InternalSelectResults extends ValueObject implements Serializable {
    /**
     * Order Company (Order Number)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: KCOO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String F4211_KCOO = null;

    /**
     * Document (Order No, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DOCO <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_DOCO = null;

    /**
     * Order Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: DCTO <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String F4211_DCTO = null;

    /**
     * Line Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: true <br>
     * EnterpriseOne Alias: LNID <br>
     * EnterpriseOne field length:  6 <br>
     * EnterpriseOne decimal places: 3 <br>
     */
    private MathNumeric F4211_LNID = null;

    /**
     * Order Suffix
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SFXO <br>
     * EnterpriseOne field length:  3 <br>
     */
    private String F4211_SFXO = null;

    /**
     * Business Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MCU <br>
     * EnterpriseOne field length:  12 <br>
     */
    private String F4211_MCU = null;

    /**
     * Company
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String F4211_CO = null;

    /**
     * Address Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AN8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 01/1 <br>
     */
    private MathNumeric F4211_AN8 = null;

    /**
     * Address Number - Ship To
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SHAN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_SHAN = null;

    /**
     * Address Number - Parent
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PA8 <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_PA8 = null;

    /**
     * Date - Requested
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DRQJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_DRQJ = null;

    /**
     * Date - Order/Transaction
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TRDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_TRDJ = null;

    /**
     * Date - Scheduled Pick
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PDDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_PDDJ = null;

    /**
     * Date - Original Promised Delivery
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: OPDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_OPDJ = null;

    /**
     * Date - Actual Ship Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ADDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_ADDJ = null;

    /**
     * Date - Invoice
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: IVD <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_IVD = null;

    /**
     * Date - Cancel
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CNDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_CNDJ = null;

    /**
     * Date - For G/L (and Voucher)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DGL <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_DGL = null;

    /**
     * Date - Promised Delivery
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: RSDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_RSDJ = null;

    /**
     * Date - Price Effective Date
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PEFJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_PEFJ = null;

    /**
     * Date - Promised Shipment
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PPDJ <br>
     * EnterpriseOne field length:  6 <br>
     */
    private Date F4211_PPDJ = null;

    /**
     * Reference
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: VR01 <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F4211_VR01 = null;

    /**
     * Item Number - Short
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ITM <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_ITM = null;

    /**
     * 2nd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F4211_LITM = null;

    /**
     * 3rd Item Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AITM <br>
     * EnterpriseOne field length:  25 <br>
     */
    private String F4211_AITM = null;

    /**
     * Location
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOCN <br>
     * EnterpriseOne field length:  20 <br>
     */
    private String F4211_LOCN = null;

    /**
     * Lot/Serial Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOTN <br>
     * EnterpriseOne field length:  30 <br>
     * EnterpriseOne Next Number: 40/1 <br>
     */
    private String F4211_LOTN = null;

    /**
     * Description
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC1 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F4211_DSC1 = null;

    /**
     * Description - Line 2
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DSC2 <br>
     * EnterpriseOne field length:  30 <br>
     */
    private String F4211_DSC2 = null;

    /**
     * Line Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LNTY <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne Default value: S <br>
     */
    private String F4211_LNTY = null;

    /**
     * Status Code - Next
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: NXTR <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 40/AT <br>
     */
    private String F4211_NXTR = null;

    /**
     * Status Code - Last
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LTTR <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 40/AT <br>
     */
    private String F4211_LTTR = null;

    /**
     * Business Unit - Header
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EMCU <br>
     * EnterpriseOne field length:  12 <br>
     * EnterpriseOne Edit Rule:SERVER <br>
     */
    private String F4211_EMCU = null;

    /**
     * Sales Catalog Section
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP1 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/S1 <br>
     */
    private String F4211_SRP1 = null;

    /**
     * Sub Section
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP2 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/S2 <br>
     */
    private String F4211_SRP2 = null;

    /**
     * Sales Category Code 3
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP3 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/S3 <br>
     */
    private String F4211_SRP3 = null;

    /**
     * Sales Category Code 4
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP4 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/S4 <br>
     */
    private String F4211_SRP4 = null;

    /**
     * Sales Category Code 5
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SRP5 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/S5 <br>
     */
    private String F4211_SRP5 = null;

    /**
     * Commodity Class
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRP1 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/P1 <br>
     */
    private String F4211_PRP1 = null;

    /**
     * Commodity Sub Class
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRP2 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/P2 <br>
     */
    private String F4211_PRP2 = null;

    /**
     * Supplier Rebate Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRP3 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/P3 <br>
     */
    private String F4211_PRP3 = null;

    /**
     * Master Planning Family
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRP4 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/P4 <br>
     */
    private String F4211_PRP4 = null;

    /**
     * Purchasing Category Code 5
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PRP5 <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 41/P5 <br>
     */
    private String F4211_PRP5 = null;

    /**
     * Unit of Measure as Input
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UOM <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/UM <br>
     */
    private String F4211_UOM = null;

    /**
     * Units - Order/Transaction Quantity
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UORG <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_UORG = null;

    /**
     * Quantity Shipped
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SOQS <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_SOQS = null;

    /**
     * Units - Qty Backordered/Held
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SOBK <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_SOBK = null;

    /**
     * Units - Quantity Canceled/Scrapped
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SOCN <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_SOCN = null;

    /**
     * Committed (H/S)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: COMM <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Default value: S <br>
     * EnterpriseOne User Defined Code: H42/CP <br>
     */
    private String F4211_COMM = null;

    /**
     * Amount - Price per Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UPRC <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric F4211_UPRC = null;

    /**
     * Amount - Extended Price
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: AEXP <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F4211_AEXP = null;

    /**
     * Price Override Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PROV <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String F4211_PROV = null;

    /**
     * Amount - Unit Cost
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: UNCS <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric F4211_UNCS = null;

    /**
     * Amount - Extended Cost
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: ECST <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F4211_ECST = null;

    /**
     * Cost Override Code
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: CSTO <br>
     * EnterpriseOne field length:  1 <br>
     * EnterpriseOne Edit Rule:VALUE <br>
     */
    private String F4211_CSTO = null;

    /**
     * Extended Cost - Transfer
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: TCST <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric F4211_TCST = null;

    /**
     * Document Company
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: KCO <br>
     * EnterpriseOne field length:  5 <br>
     */
    private String F4211_KCO = null;

    /**
     * Document (Voucher, Invoice, etc.)
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DOC <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_DOC = null;

    /**
     * Document Type
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DCT <br>
     * EnterpriseOne field length:  2 <br>
     * EnterpriseOne User Defined Code: 00/DT <br>
     */
    private String F4211_DCT = null;

    /**
     * Pick Slip Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: PSN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     */
    private MathNumeric F4211_PSN = null;

    /**
     * Delivery Number
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: DELN <br>
     * EnterpriseOne field length:  8 <br>
     * EnterpriseOne decimal places: 0 <br>
     * EnterpriseOne Next Number: 40/2 <br>
     */
    private MathNumeric F4211_DELN = null;

    /**
     * Mode of Transport
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: MOT <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 00/TM <br>
     */
    private String F4211_MOT = null;

    /**
     * Line of Business
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: LOB <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 40/LB <br>
     */
    private String F4211_LOB = null;

    /**
     * End Use
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: EUSE <br>
     * EnterpriseOne field length:  3 <br>
     * EnterpriseOne User Defined Code: 40/EU <br>
     */
    private String F4211_EUSE = null;

    /**
     * Inter Branch Sales
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: SO01 <br>
     * EnterpriseOne field length:  1 <br>
     */
    private String F4211_SO01 = null;

    /**
     * Amount - Foreign Price per Unit
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FUP <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric F4211_FUP = null;

    /**
     * Amount - Foreign Extended Price
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FEA <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F4211_FEA = null;

    /**
     * Amount - Foreign Unit Cost
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FUC <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 4 <br>
     */
    private MathNumeric F4211_FUC = null;

    /**
     * Amount - Foreign Extended Cost
     * <p>
     * TODO: Description using Glossary Text from EnterpriseOne if appropriate.
     * </p>
     * EnterpriseOne Key Field: false <br>
     * EnterpriseOne Alias: FEC <br>
     * EnterpriseOne field length:  15 <br>
     * EnterpriseOne decimal places: 2 <br>
     */
    private MathNumeric F4211_FEC = null;

    public void setF4211_KCOO(String F4211_KCOO) {
        this.F4211_KCOO = F4211_KCOO;
    }

    public String getF4211_KCOO() {
        return F4211_KCOO;
    }

    public void setF4211_DOCO(MathNumeric F4211_DOCO) {
        this.F4211_DOCO = F4211_DOCO;
    }

    public MathNumeric getF4211_DOCO() {
        return F4211_DOCO;
    }

    public void setF4211_DCTO(String F4211_DCTO) {
        this.F4211_DCTO = F4211_DCTO;
    }

    public String getF4211_DCTO() {
        return F4211_DCTO;
    }

    public void setF4211_LNID(MathNumeric F4211_LNID) {
        this.F4211_LNID = F4211_LNID;
    }

    public MathNumeric getF4211_LNID() {
        return F4211_LNID;
    }

    public void setF4211_SFXO(String F4211_SFXO) {
        this.F4211_SFXO = F4211_SFXO;
    }

    public String getF4211_SFXO() {
        return F4211_SFXO;
    }

    public void setF4211_MCU(String F4211_MCU) {
        this.F4211_MCU = F4211_MCU;
    }

    public String getF4211_MCU() {
        return F4211_MCU;
    }

    public void setF4211_CO(String F4211_CO) {
        this.F4211_CO = F4211_CO;
    }

    public String getF4211_CO() {
        return F4211_CO;
    }

    public void setF4211_AN8(MathNumeric F4211_AN8) {
        this.F4211_AN8 = F4211_AN8;
    }

    public MathNumeric getF4211_AN8() {
        return F4211_AN8;
    }

    public void setF4211_SHAN(MathNumeric F4211_SHAN) {
        this.F4211_SHAN = F4211_SHAN;
    }

    public MathNumeric getF4211_SHAN() {
        return F4211_SHAN;
    }

    public void setF4211_PA8(MathNumeric F4211_PA8) {
        this.F4211_PA8 = F4211_PA8;
    }

    public MathNumeric getF4211_PA8() {
        return F4211_PA8;
    }

    public void setF4211_DRQJ(Date F4211_DRQJ) {
        this.F4211_DRQJ = F4211_DRQJ;
    }

    public Date getF4211_DRQJ() {
        return F4211_DRQJ;
    }

    public void setF4211_TRDJ(Date F4211_TRDJ) {
        this.F4211_TRDJ = F4211_TRDJ;
    }

    public Date getF4211_TRDJ() {
        return F4211_TRDJ;
    }

    public void setF4211_PDDJ(Date F4211_PDDJ) {
        this.F4211_PDDJ = F4211_PDDJ;
    }

    public Date getF4211_PDDJ() {
        return F4211_PDDJ;
    }

    public void setF4211_OPDJ(Date F4211_OPDJ) {
        this.F4211_OPDJ = F4211_OPDJ;
    }

    public Date getF4211_OPDJ() {
        return F4211_OPDJ;
    }

    public void setF4211_ADDJ(Date F4211_ADDJ) {
        this.F4211_ADDJ = F4211_ADDJ;
    }

    public Date getF4211_ADDJ() {
        return F4211_ADDJ;
    }

    public void setF4211_IVD(Date F4211_IVD) {
        this.F4211_IVD = F4211_IVD;
    }

    public Date getF4211_IVD() {
        return F4211_IVD;
    }

    public void setF4211_CNDJ(Date F4211_CNDJ) {
        this.F4211_CNDJ = F4211_CNDJ;
    }

    public Date getF4211_CNDJ() {
        return F4211_CNDJ;
    }

    public void setF4211_DGL(Date F4211_DGL) {
        this.F4211_DGL = F4211_DGL;
    }

    public Date getF4211_DGL() {
        return F4211_DGL;
    }

    public void setF4211_RSDJ(Date F4211_RSDJ) {
        this.F4211_RSDJ = F4211_RSDJ;
    }

    public Date getF4211_RSDJ() {
        return F4211_RSDJ;
    }

    public void setF4211_PEFJ(Date F4211_PEFJ) {
        this.F4211_PEFJ = F4211_PEFJ;
    }

    public Date getF4211_PEFJ() {
        return F4211_PEFJ;
    }

    public void setF4211_PPDJ(Date F4211_PPDJ) {
        this.F4211_PPDJ = F4211_PPDJ;
    }

    public Date getF4211_PPDJ() {
        return F4211_PPDJ;
    }

    public void setF4211_VR01(String F4211_VR01) {
        this.F4211_VR01 = F4211_VR01;
    }

    public String getF4211_VR01() {
        return F4211_VR01;
    }

    public void setF4211_ITM(MathNumeric F4211_ITM) {
        this.F4211_ITM = F4211_ITM;
    }

    public MathNumeric getF4211_ITM() {
        return F4211_ITM;
    }

    public void setF4211_LITM(String F4211_LITM) {
        this.F4211_LITM = F4211_LITM;
    }

    public String getF4211_LITM() {
        return F4211_LITM;
    }

    public void setF4211_AITM(String F4211_AITM) {
        this.F4211_AITM = F4211_AITM;
    }

    public String getF4211_AITM() {
        return F4211_AITM;
    }

    public void setF4211_LOCN(String F4211_LOCN) {
        this.F4211_LOCN = F4211_LOCN;
    }

    public String getF4211_LOCN() {
        return F4211_LOCN;
    }

    public void setF4211_LOTN(String F4211_LOTN) {
        this.F4211_LOTN = F4211_LOTN;
    }

    public String getF4211_LOTN() {
        return F4211_LOTN;
    }

    public void setF4211_DSC1(String F4211_DSC1) {
        this.F4211_DSC1 = F4211_DSC1;
    }

    public String getF4211_DSC1() {
        return F4211_DSC1;
    }

    public void setF4211_DSC2(String F4211_DSC2) {
        this.F4211_DSC2 = F4211_DSC2;
    }

    public String getF4211_DSC2() {
        return F4211_DSC2;
    }

    public void setF4211_LNTY(String F4211_LNTY) {
        this.F4211_LNTY = F4211_LNTY;
    }

    public String getF4211_LNTY() {
        return F4211_LNTY;
    }

    public void setF4211_NXTR(String F4211_NXTR) {
        this.F4211_NXTR = F4211_NXTR;
    }

    public String getF4211_NXTR() {
        return F4211_NXTR;
    }

    public void setF4211_LTTR(String F4211_LTTR) {
        this.F4211_LTTR = F4211_LTTR;
    }

    public String getF4211_LTTR() {
        return F4211_LTTR;
    }

    public void setF4211_EMCU(String F4211_EMCU) {
        this.F4211_EMCU = F4211_EMCU;
    }

    public String getF4211_EMCU() {
        return F4211_EMCU;
    }

    public void setF4211_SRP1(String F4211_SRP1) {
        this.F4211_SRP1 = F4211_SRP1;
    }

    public String getF4211_SRP1() {
        return F4211_SRP1;
    }

    public void setF4211_SRP2(String F4211_SRP2) {
        this.F4211_SRP2 = F4211_SRP2;
    }

    public String getF4211_SRP2() {
        return F4211_SRP2;
    }

    public void setF4211_SRP3(String F4211_SRP3) {
        this.F4211_SRP3 = F4211_SRP3;
    }

    public String getF4211_SRP3() {
        return F4211_SRP3;
    }

    public void setF4211_SRP4(String F4211_SRP4) {
        this.F4211_SRP4 = F4211_SRP4;
    }

    public String getF4211_SRP4() {
        return F4211_SRP4;
    }

    public void setF4211_SRP5(String F4211_SRP5) {
        this.F4211_SRP5 = F4211_SRP5;
    }

    public String getF4211_SRP5() {
        return F4211_SRP5;
    }

    public void setF4211_PRP1(String F4211_PRP1) {
        this.F4211_PRP1 = F4211_PRP1;
    }

    public String getF4211_PRP1() {
        return F4211_PRP1;
    }

    public void setF4211_PRP2(String F4211_PRP2) {
        this.F4211_PRP2 = F4211_PRP2;
    }

    public String getF4211_PRP2() {
        return F4211_PRP2;
    }

    public void setF4211_PRP3(String F4211_PRP3) {
        this.F4211_PRP3 = F4211_PRP3;
    }

    public String getF4211_PRP3() {
        return F4211_PRP3;
    }

    public void setF4211_PRP4(String F4211_PRP4) {
        this.F4211_PRP4 = F4211_PRP4;
    }

    public String getF4211_PRP4() {
        return F4211_PRP4;
    }

    public void setF4211_PRP5(String F4211_PRP5) {
        this.F4211_PRP5 = F4211_PRP5;
    }

    public String getF4211_PRP5() {
        return F4211_PRP5;
    }

    public void setF4211_UOM(String F4211_UOM) {
        this.F4211_UOM = F4211_UOM;
    }

    public String getF4211_UOM() {
        return F4211_UOM;
    }

    public void setF4211_UORG(MathNumeric F4211_UORG) {
        this.F4211_UORG = F4211_UORG;
    }

    public MathNumeric getF4211_UORG() {
        return F4211_UORG;
    }

    public void setF4211_SOQS(MathNumeric F4211_SOQS) {
        this.F4211_SOQS = F4211_SOQS;
    }

    public MathNumeric getF4211_SOQS() {
        return F4211_SOQS;
    }

    public void setF4211_SOBK(MathNumeric F4211_SOBK) {
        this.F4211_SOBK = F4211_SOBK;
    }

    public MathNumeric getF4211_SOBK() {
        return F4211_SOBK;
    }

    public void setF4211_SOCN(MathNumeric F4211_SOCN) {
        this.F4211_SOCN = F4211_SOCN;
    }

    public MathNumeric getF4211_SOCN() {
        return F4211_SOCN;
    }

    public void setF4211_COMM(String F4211_COMM) {
        this.F4211_COMM = F4211_COMM;
    }

    public String getF4211_COMM() {
        return F4211_COMM;
    }

    public void setF4211_UPRC(MathNumeric F4211_UPRC) {
        this.F4211_UPRC = F4211_UPRC;
    }

    public MathNumeric getF4211_UPRC() {
        return F4211_UPRC;
    }

    public void setF4211_AEXP(MathNumeric F4211_AEXP) {
        this.F4211_AEXP = F4211_AEXP;
    }

    public MathNumeric getF4211_AEXP() {
        return F4211_AEXP;
    }

    public void setF4211_PROV(String F4211_PROV) {
        this.F4211_PROV = F4211_PROV;
    }

    public String getF4211_PROV() {
        return F4211_PROV;
    }

    public void setF4211_UNCS(MathNumeric F4211_UNCS) {
        this.F4211_UNCS = F4211_UNCS;
    }

    public MathNumeric getF4211_UNCS() {
        return F4211_UNCS;
    }

    public void setF4211_ECST(MathNumeric F4211_ECST) {
        this.F4211_ECST = F4211_ECST;
    }

    public MathNumeric getF4211_ECST() {
        return F4211_ECST;
    }

    public void setF4211_CSTO(String F4211_CSTO) {
        this.F4211_CSTO = F4211_CSTO;
    }

    public String getF4211_CSTO() {
        return F4211_CSTO;
    }

    public void setF4211_TCST(MathNumeric F4211_TCST) {
        this.F4211_TCST = F4211_TCST;
    }

    public MathNumeric getF4211_TCST() {
        return F4211_TCST;
    }

    public void setF4211_KCO(String F4211_KCO) {
        this.F4211_KCO = F4211_KCO;
    }

    public String getF4211_KCO() {
        return F4211_KCO;
    }

    public void setF4211_DOC(MathNumeric F4211_DOC) {
        this.F4211_DOC = F4211_DOC;
    }

    public MathNumeric getF4211_DOC() {
        return F4211_DOC;
    }

    public void setF4211_DCT(String F4211_DCT) {
        this.F4211_DCT = F4211_DCT;
    }

    public String getF4211_DCT() {
        return F4211_DCT;
    }

    public void setF4211_PSN(MathNumeric F4211_PSN) {
        this.F4211_PSN = F4211_PSN;
    }

    public MathNumeric getF4211_PSN() {
        return F4211_PSN;
    }

    public void setF4211_DELN(MathNumeric F4211_DELN) {
        this.F4211_DELN = F4211_DELN;
    }

    public MathNumeric getF4211_DELN() {
        return F4211_DELN;
    }

    public void setF4211_MOT(String F4211_MOT) {
        this.F4211_MOT = F4211_MOT;
    }

    public String getF4211_MOT() {
        return F4211_MOT;
    }

    public void setF4211_LOB(String F4211_LOB) {
        this.F4211_LOB = F4211_LOB;
    }

    public String getF4211_LOB() {
        return F4211_LOB;
    }

    public void setF4211_EUSE(String F4211_EUSE) {
        this.F4211_EUSE = F4211_EUSE;
    }

    public String getF4211_EUSE() {
        return F4211_EUSE;
    }

    public void setF4211_SO01(String F4211_SO01) {
        this.F4211_SO01 = F4211_SO01;
    }

    public String getF4211_SO01() {
        return F4211_SO01;
    }

    public void setF4211_FUP(MathNumeric F4211_FUP) {
        this.F4211_FUP = F4211_FUP;
    }

    public MathNumeric getF4211_FUP() {
        return F4211_FUP;
    }

    public void setF4211_FEA(MathNumeric F4211_FEA) {
        this.F4211_FEA = F4211_FEA;
    }

    public MathNumeric getF4211_FEA() {
        return F4211_FEA;
    }

    public void setF4211_FUC(MathNumeric F4211_FUC) {
        this.F4211_FUC = F4211_FUC;
    }

    public MathNumeric getF4211_FUC() {
        return F4211_FUC;
    }

    public void setF4211_FEC(MathNumeric F4211_FEC) {
        this.F4211_FEC = F4211_FEC;
    }

    public MathNumeric getF4211_FEC() {
        return F4211_FEC;
    }
}
