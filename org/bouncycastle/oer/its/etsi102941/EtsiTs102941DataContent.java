package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class EtsiTs102941DataContent extends ASN1Object implements ASN1Choice {
  public static final int enrolmentRequest = 0;
  
  public static final int enrolmentResponse = 1;
  
  public static final int authorizationRequest = 2;
  
  public static final int authorizationResponse = 3;
  
  public static final int certificateRevocationList = 4;
  
  public static final int certificateTrustListTlm = 5;
  
  public static final int certificateTrustListRca = 6;
  
  public static final int authorizationValidationRequest = 7;
  
  public static final int authorizationValidationResponse = 8;
  
  public static final int caCertificateRequest = 9;
  
  public static final int linkCertificateTlm = 10;
  
  public static final int singleSignedLinkCertificateRca = 11;
  
  public static final int doubleSignedlinkCertificateRca = 12;
  
  private final int choice;
  
  private final ASN1Encodable etsiTs102941DataContent;
  
  public EtsiTs102941DataContent(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.etsiTs102941DataContent = paramASN1Encodable;
  }
  
  private EtsiTs102941DataContent(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.etsiTs102941DataContent = (ASN1Encodable)InnerEcRequestSignedForPop.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.etsiTs102941DataContent = (ASN1Encodable)InnerEcResponse.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.etsiTs102941DataContent = (ASN1Encodable)InnerAtRequest.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 3:
        this.etsiTs102941DataContent = (ASN1Encodable)InnerAtResponse.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 5:
        this.etsiTs102941DataContent = (ASN1Encodable)ToBeSignedTlmCtl.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 6:
        this.etsiTs102941DataContent = (ASN1Encodable)ToBeSignedRcaCtl.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 7:
        this.etsiTs102941DataContent = (ASN1Encodable)AuthorizationValidationRequest.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 8:
        this.etsiTs102941DataContent = (ASN1Encodable)AuthorizationValidationResponse.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 9:
        this.etsiTs102941DataContent = (ASN1Encodable)CaCertificateRequest.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("choice not implemented " + this.choice);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getEtsiTs102941DataContent() {
    return this.etsiTs102941DataContent;
  }
  
  public static EtsiTs102941DataContent getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs102941DataContent) ? (EtsiTs102941DataContent)paramObject : ((paramObject != null) ? new EtsiTs102941DataContent(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.etsiTs102941DataContent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\EtsiTs102941DataContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */