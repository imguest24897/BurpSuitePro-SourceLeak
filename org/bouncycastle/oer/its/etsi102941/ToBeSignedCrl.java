package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.Version;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;

public class ToBeSignedCrl extends ASN1Object {
  private final Version version;
  
  private final Time32 thisUpdate;
  
  private final Time32 nextUpdate;
  
  private final SequenceOfCrlEntry entries;
  
  public ToBeSignedCrl(Version paramVersion, Time32 paramTime321, Time32 paramTime322, SequenceOfCrlEntry paramSequenceOfCrlEntry) {
    this.version = paramVersion;
    this.thisUpdate = paramTime321;
    this.nextUpdate = paramTime322;
    this.entries = paramSequenceOfCrlEntry;
  }
  
  private ToBeSignedCrl(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 4)
      throw new IllegalArgumentException("expected sequence size of 4"); 
    this.version = Version.getInstance(paramASN1Sequence.getObjectAt(0));
    this.thisUpdate = Time32.getInstance(paramASN1Sequence.getObjectAt(1));
    this.nextUpdate = Time32.getInstance(paramASN1Sequence.getObjectAt(2));
    this.entries = SequenceOfCrlEntry.getInstance(paramASN1Sequence.getObjectAt(3));
  }
  
  public static ToBeSignedCrl getInstance(Object paramObject) {
    return (paramObject instanceof ToBeSignedCrl) ? (ToBeSignedCrl)paramObject : ((paramObject != null) ? new ToBeSignedCrl(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public Version getVersion() {
    return this.version;
  }
  
  public Time32 getThisUpdate() {
    return this.thisUpdate;
  }
  
  public Time32 getNextUpdate() {
    return this.nextUpdate;
  }
  
  public SequenceOfCrlEntry getEntries() {
    return this.entries;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.version, (ASN1Encodable)this.thisUpdate, (ASN1Encodable)this.nextUpdate, (ASN1Encodable)this.entries });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private Version version;
    
    private Time32 thisUpdate;
    
    private Time32 nextUpdate;
    
    private SequenceOfCrlEntry entries;
    
    public Builder setVersion(Version param1Version) {
      this.version = param1Version;
      return this;
    }
    
    public Builder setThisUpdate(Time32 param1Time32) {
      this.thisUpdate = param1Time32;
      return this;
    }
    
    public Builder setNextUpdate(Time32 param1Time32) {
      this.nextUpdate = param1Time32;
      return this;
    }
    
    public Builder setEntries(SequenceOfCrlEntry param1SequenceOfCrlEntry) {
      this.entries = param1SequenceOfCrlEntry;
      return this;
    }
    
    public ToBeSignedCrl createToBeSignedCrl() {
      return new ToBeSignedCrl(this.version, this.thisUpdate, this.nextUpdate, this.entries);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\ToBeSignedCrl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */