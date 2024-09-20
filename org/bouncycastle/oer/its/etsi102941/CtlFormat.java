package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.Version;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class CtlFormat extends ASN1Object {
  private final Version version;
  
  private final Time32 nextUpdate;
  
  private final ASN1Boolean isFullCtl;
  
  private final UINT8 ctlSequence;
  
  private final SequenceOfCtlCommand ctlCommands;
  
  public CtlFormat(Version paramVersion, Time32 paramTime32, ASN1Boolean paramASN1Boolean, UINT8 paramUINT8, SequenceOfCtlCommand paramSequenceOfCtlCommand) {
    this.version = paramVersion;
    this.nextUpdate = paramTime32;
    this.isFullCtl = paramASN1Boolean;
    this.ctlSequence = paramUINT8;
    this.ctlCommands = paramSequenceOfCtlCommand;
  }
  
  protected CtlFormat(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 5)
      throw new IllegalArgumentException("expected sequence size of 5"); 
    this.version = Version.getInstance(paramASN1Sequence.getObjectAt(0));
    this.nextUpdate = Time32.getInstance(paramASN1Sequence.getObjectAt(1));
    this.isFullCtl = ASN1Boolean.getInstance(paramASN1Sequence.getObjectAt(2));
    this.ctlSequence = UINT8.getInstance(paramASN1Sequence.getObjectAt(3));
    this.ctlCommands = SequenceOfCtlCommand.getInstance(paramASN1Sequence.getObjectAt(4));
  }
  
  public static CtlFormat getInstance(Object paramObject) {
    return (paramObject instanceof CtlFormat) ? (CtlFormat)paramObject : ((paramObject != null) ? new CtlFormat(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public Version getVersion() {
    return this.version;
  }
  
  public Time32 getNextUpdate() {
    return this.nextUpdate;
  }
  
  public ASN1Boolean getIsFullCtl() {
    return this.isFullCtl;
  }
  
  public UINT8 getCtlSequence() {
    return this.ctlSequence;
  }
  
  public SequenceOfCtlCommand getCtlCommands() {
    return this.ctlCommands;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.version, (ASN1Encodable)this.nextUpdate, (ASN1Encodable)this.isFullCtl, (ASN1Encodable)this.ctlSequence, (ASN1Encodable)this.ctlCommands });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private Version version;
    
    private Time32 nextUpdate;
    
    private ASN1Boolean isFullCtl;
    
    private UINT8 ctlSequence;
    
    private SequenceOfCtlCommand ctlCommands;
    
    public Builder setVersion(Version param1Version) {
      this.version = param1Version;
      return this;
    }
    
    public Builder setNextUpdate(Time32 param1Time32) {
      this.nextUpdate = param1Time32;
      return this;
    }
    
    public Builder setIsFullCtl(ASN1Boolean param1ASN1Boolean) {
      this.isFullCtl = param1ASN1Boolean;
      return this;
    }
    
    public Builder setCtlSequence(UINT8 param1UINT8) {
      this.ctlSequence = param1UINT8;
      return this;
    }
    
    public Builder setCtlSequence(ASN1Integer param1ASN1Integer) {
      this.ctlSequence = new UINT8(param1ASN1Integer.getValue());
      return this;
    }
    
    public Builder setCtlCommands(SequenceOfCtlCommand param1SequenceOfCtlCommand) {
      this.ctlCommands = param1SequenceOfCtlCommand;
      return this;
    }
    
    public CtlFormat createCtlFormat() {
      return new CtlFormat(this.version, this.nextUpdate, this.isFullCtl, this.ctlSequence, this.ctlCommands);
    }
    
    public DeltaCtl createDeltaCtl() {
      if (this.isFullCtl != null && ASN1Boolean.TRUE.equals((ASN1Primitive)this.isFullCtl))
        throw new IllegalArgumentException("isFullCtl must be false for DeltaCtl"); 
      return new DeltaCtl(this.version, this.nextUpdate, this.ctlSequence, this.ctlCommands);
    }
    
    public FullCtl createFullCtl() {
      return new FullCtl(this.version, this.nextUpdate, this.isFullCtl, this.ctlSequence, this.ctlCommands);
    }
    
    public ToBeSignedRcaCtl createToBeSignedRcaCtl() {
      return new ToBeSignedRcaCtl(this.version, this.nextUpdate, this.isFullCtl, this.ctlSequence, this.ctlCommands);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\CtlFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */