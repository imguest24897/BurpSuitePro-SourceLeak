package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.CrlSeries;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId3;

public class MissingCrlIdentifier extends ASN1Object {
  private final HashedId3 cracaId;
  
  private final CrlSeries crlSeries;
  
  public MissingCrlIdentifier(HashedId3 paramHashedId3, CrlSeries paramCrlSeries) {
    this.cracaId = paramHashedId3;
    this.crlSeries = paramCrlSeries;
  }
  
  private MissingCrlIdentifier(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.cracaId = HashedId3.getInstance(paramASN1Sequence.getObjectAt(0));
    this.crlSeries = CrlSeries.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static MissingCrlIdentifier getInstance(Object paramObject) {
    return (paramObject instanceof MissingCrlIdentifier) ? (MissingCrlIdentifier)paramObject : ((paramObject != null) ? new MissingCrlIdentifier(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.cracaId, (ASN1Encodable)this.crlSeries });
  }
  
  public HashedId3 getCracaId() {
    return this.cracaId;
  }
  
  public CrlSeries getCrlSeries() {
    return this.crlSeries;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private HashedId3 cracaId;
    
    private CrlSeries crlSeries;
    
    public Builder setCracaId(HashedId3 param1HashedId3) {
      this.cracaId = param1HashedId3;
      return this;
    }
    
    public Builder setCrlSeries(CrlSeries param1CrlSeries) {
      this.crlSeries = param1CrlSeries;
      return this;
    }
    
    public MissingCrlIdentifier createMissingCrlIdentifier() {
      return new MissingCrlIdentifier(this.cracaId, this.crlSeries);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\MissingCrlIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */