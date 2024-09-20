package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.util.Arrays;

public class EcdsaP256Signature extends ASN1Object {
  private final EccP256CurvePoint rSig;
  
  private final ASN1OctetString sSig;
  
  public EcdsaP256Signature(EccP256CurvePoint paramEccP256CurvePoint, ASN1OctetString paramASN1OctetString) {
    this.rSig = paramEccP256CurvePoint;
    this.sSig = paramASN1OctetString;
  }
  
  private EcdsaP256Signature(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.rSig = EccP256CurvePoint.getInstance(paramASN1Sequence.getObjectAt(0));
    this.sSig = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static EcdsaP256Signature getInstance(Object paramObject) {
    return (paramObject instanceof EcdsaP256Signature) ? (EcdsaP256Signature)paramObject : ((paramObject != null) ? new EcdsaP256Signature(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public EccP256CurvePoint getRSig() {
    return this.rSig;
  }
  
  public ASN1OctetString getSSig() {
    return this.sSig;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.rSig, (ASN1Encodable)this.sSig });
  }
  
  public static class Builder {
    private EccP256CurvePoint rSig;
    
    private ASN1OctetString sSig;
    
    public Builder setRSig(EccP256CurvePoint param1EccP256CurvePoint) {
      this.rSig = param1EccP256CurvePoint;
      return this;
    }
    
    public Builder setSSig(byte[] param1ArrayOfbyte) {
      this.sSig = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public Builder setSSig(ASN1OctetString param1ASN1OctetString) {
      this.sSig = param1ASN1OctetString;
      return this;
    }
    
    public EcdsaP256Signature createEcdsaP256Signature() {
      return new EcdsaP256Signature(this.rSig, this.sSig);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\EcdsaP256Signature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */