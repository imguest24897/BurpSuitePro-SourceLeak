package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.util.Arrays;

public class EcdsaP384Signature extends ASN1Object {
  private final EccP384CurvePoint rSig;
  
  private final ASN1OctetString sSig;
  
  public EcdsaP384Signature(EccP384CurvePoint paramEccP384CurvePoint, ASN1OctetString paramASN1OctetString) {
    this.rSig = paramEccP384CurvePoint;
    this.sSig = paramASN1OctetString;
  }
  
  private EcdsaP384Signature(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.rSig = EccP384CurvePoint.getInstance(paramASN1Sequence.getObjectAt(0));
    this.sSig = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static EcdsaP384Signature getInstance(Object paramObject) {
    return (paramObject instanceof EcdsaP384Signature) ? (EcdsaP384Signature)paramObject : ((paramObject != null) ? new EcdsaP384Signature(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public EccP384CurvePoint getRSig() {
    return this.rSig;
  }
  
  public ASN1OctetString getSSig() {
    return this.sSig;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.rSig, (ASN1Encodable)this.sSig });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private EccP384CurvePoint rSig;
    
    private ASN1OctetString sSig;
    
    public Builder setRSig(EccP384CurvePoint param1EccP384CurvePoint) {
      this.rSig = param1EccP384CurvePoint;
      return this;
    }
    
    public Builder setSSig(ASN1OctetString param1ASN1OctetString) {
      this.sSig = param1ASN1OctetString;
      return this;
    }
    
    public Builder setSSig(byte[] param1ArrayOfbyte) {
      return setSSig((ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte)));
    }
    
    public EcdsaP384Signature createEcdsaP384Signature() {
      return new EcdsaP384Signature(this.rSig, this.sSig);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\EcdsaP384Signature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */