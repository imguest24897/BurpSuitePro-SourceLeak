package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfHashedId8;

public class DcEntry extends ASN1Object {
  private final Url url;
  
  private final SequenceOfHashedId8 cert;
  
  public DcEntry(Url paramUrl, SequenceOfHashedId8 paramSequenceOfHashedId8) {
    this.url = paramUrl;
    this.cert = paramSequenceOfHashedId8;
  }
  
  private DcEntry(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.url = Url.getInstance(paramASN1Sequence.getObjectAt(0));
    this.cert = SequenceOfHashedId8.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static DcEntry getInstance(Object paramObject) {
    return (paramObject instanceof DcEntry) ? (DcEntry)paramObject : ((paramObject != null) ? new DcEntry(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public Url getUrl() {
    return this.url;
  }
  
  public SequenceOfHashedId8 getCert() {
    return this.cert;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.url, (ASN1Encodable)this.cert });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private Url url;
    
    private SequenceOfHashedId8 cert;
    
    public Builder setUrl(Url param1Url) {
      this.url = param1Url;
      return this;
    }
    
    public Builder setCert(SequenceOfHashedId8 param1SequenceOfHashedId8) {
      this.cert = param1SequenceOfHashedId8;
      return this;
    }
    
    public DcEntry createDcEntry() {
      return new DcEntry(this.url, this.cert);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\DcEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */