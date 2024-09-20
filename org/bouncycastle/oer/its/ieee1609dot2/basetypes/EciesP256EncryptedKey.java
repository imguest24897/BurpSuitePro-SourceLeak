package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class EciesP256EncryptedKey extends ASN1Object {
  private final EccP256CurvePoint v;
  
  private final ASN1OctetString c;
  
  private final ASN1OctetString t;
  
  public EciesP256EncryptedKey(EccP256CurvePoint paramEccP256CurvePoint, ASN1OctetString paramASN1OctetString1, ASN1OctetString paramASN1OctetString2) {
    this.v = paramEccP256CurvePoint;
    this.c = paramASN1OctetString1;
    this.t = paramASN1OctetString2;
  }
  
  public static EciesP256EncryptedKey getInstance(Object paramObject) {
    return (paramObject instanceof EciesP256EncryptedKey) ? (EciesP256EncryptedKey)paramObject : ((paramObject != null) ? new EciesP256EncryptedKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private EciesP256EncryptedKey(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.v = EccP256CurvePoint.getInstance(paramASN1Sequence.getObjectAt(0));
    this.c = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
    this.t = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public EccP256CurvePoint getV() {
    return this.v;
  }
  
  public ASN1OctetString getC() {
    return this.c;
  }
  
  public ASN1OctetString getT() {
    return this.t;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.v, (ASN1Encodable)this.c, (ASN1Encodable)this.t });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private EccP256CurvePoint v;
    
    private ASN1OctetString c;
    
    private ASN1OctetString t;
    
    public Builder setV(EccP256CurvePoint param1EccP256CurvePoint) {
      this.v = param1EccP256CurvePoint;
      return this;
    }
    
    public Builder setC(ASN1OctetString param1ASN1OctetString) {
      this.c = param1ASN1OctetString;
      return this;
    }
    
    public Builder setC(byte[] param1ArrayOfbyte) {
      this.c = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public Builder setT(ASN1OctetString param1ASN1OctetString) {
      this.t = param1ASN1OctetString;
      return this;
    }
    
    public Builder setT(byte[] param1ArrayOfbyte) {
      this.t = (ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte));
      return this;
    }
    
    public EciesP256EncryptedKey createEciesP256EncryptedKey() {
      return new EciesP256EncryptedKey(this.v, this.c, this.t);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\EciesP256EncryptedKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */