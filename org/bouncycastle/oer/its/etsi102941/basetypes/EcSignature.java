package org.bouncycastle.oer.its.etsi102941.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataEncrypted;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSignedExternalPayload;

public class EcSignature extends ASN1Object implements ASN1Choice {
  public static final int encryptedEcSignature = 0;
  
  public static final int ecSignature = 1;
  
  private final int choice;
  
  private final ASN1Encodable _ecSignature;
  
  public EcSignature(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this._ecSignature = paramASN1Encodable;
  }
  
  private EcSignature(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this._ecSignature = (ASN1Encodable)EtsiTs103097DataEncrypted.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this._ecSignature = (ASN1Encodable)EtsiTs103097DataSignedExternalPayload.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static EcSignature getInstance(Object paramObject) {
    return (paramObject instanceof EcSignature) ? (EcSignature)paramObject : ((paramObject != null) ? new EcSignature(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getEcSignature() {
    return this._ecSignature;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this._ecSignature);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\basetypes\EcSignature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */