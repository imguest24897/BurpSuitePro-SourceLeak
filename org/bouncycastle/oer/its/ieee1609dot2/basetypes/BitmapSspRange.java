package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.util.Arrays;

public class BitmapSspRange extends ASN1Object {
  private final ASN1OctetString sspValue;
  
  private final ASN1OctetString sspBitMask;
  
  public BitmapSspRange(ASN1OctetString paramASN1OctetString1, ASN1OctetString paramASN1OctetString2) {
    this.sspValue = paramASN1OctetString1;
    this.sspBitMask = paramASN1OctetString2;
  }
  
  private BitmapSspRange(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    Iterator iterator = paramASN1Sequence.iterator();
    this.sspValue = ASN1OctetString.getInstance(iterator.next());
    this.sspBitMask = ASN1OctetString.getInstance(iterator.next());
  }
  
  public static BitmapSspRange getInstance(Object paramObject) {
    return (paramObject instanceof BitmapSspRange) ? (BitmapSspRange)paramObject : ((paramObject != null) ? new BitmapSspRange(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getSspValue() {
    return this.sspValue;
  }
  
  public ASN1OctetString getSspBitMask() {
    return this.sspBitMask;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.sspValue, (ASN1Encodable)this.sspBitMask });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ASN1OctetString sspValue;
    
    private ASN1OctetString sspBitMask;
    
    public Builder setSspValue(ASN1OctetString param1ASN1OctetString) {
      this.sspValue = param1ASN1OctetString;
      return this;
    }
    
    public Builder setSspBitMask(ASN1OctetString param1ASN1OctetString) {
      this.sspBitMask = param1ASN1OctetString;
      return this;
    }
    
    public Builder setSspValue(byte[] param1ArrayOfbyte) {
      this.sspValue = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public Builder setSspBitMask(byte[] param1ArrayOfbyte) {
      this.sspBitMask = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public BitmapSspRange createBitmapSspRange() {
      return new BitmapSspRange(this.sspValue, this.sspBitMask);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\BitmapSspRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */