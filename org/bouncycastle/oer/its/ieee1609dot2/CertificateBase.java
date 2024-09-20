package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class CertificateBase extends ASN1Object {
  private final UINT8 version;
  
  private final CertificateType type;
  
  private final IssuerIdentifier issuer;
  
  private final ToBeSignedCertificate toBeSigned;
  
  private final Signature signature;
  
  public CertificateBase(UINT8 paramUINT8, CertificateType paramCertificateType, IssuerIdentifier paramIssuerIdentifier, ToBeSignedCertificate paramToBeSignedCertificate, Signature paramSignature) {
    this.version = paramUINT8;
    this.type = paramCertificateType;
    this.issuer = paramIssuerIdentifier;
    this.toBeSigned = paramToBeSignedCertificate;
    this.signature = paramSignature;
  }
  
  protected CertificateBase(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 5)
      throw new IllegalArgumentException("expected sequence size of 5"); 
    this.version = UINT8.getInstance(paramASN1Sequence.getObjectAt(0));
    this.type = CertificateType.getInstance(paramASN1Sequence.getObjectAt(1));
    this.issuer = IssuerIdentifier.getInstance(paramASN1Sequence.getObjectAt(2));
    this.toBeSigned = ToBeSignedCertificate.getInstance(paramASN1Sequence.getObjectAt(3));
    this.signature = (Signature)OEROptional.getValue(Signature.class, paramASN1Sequence.getObjectAt(4));
  }
  
  public static CertificateBase getInstance(Object paramObject) {
    return (paramObject instanceof CertificateBase) ? (CertificateBase)paramObject : ((paramObject != null) ? new CertificateBase(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public UINT8 getVersion() {
    return this.version;
  }
  
  public CertificateType getType() {
    return this.type;
  }
  
  public IssuerIdentifier getIssuer() {
    return this.issuer;
  }
  
  public ToBeSignedCertificate getToBeSigned() {
    return this.toBeSigned;
  }
  
  public Signature getSignature() {
    return this.signature;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.version, (ASN1Encodable)this.type, (ASN1Encodable)this.issuer, (ASN1Encodable)this.toBeSigned, (ASN1Encodable)OEROptional.getInstance(this.signature) });
  }
  
  public static class Builder {
    private UINT8 version;
    
    private CertificateType type;
    
    private IssuerIdentifier issuer;
    
    private ToBeSignedCertificate toBeSigned;
    
    private Signature signature;
    
    public Builder setVersion(UINT8 param1UINT8) {
      this.version = param1UINT8;
      return this;
    }
    
    public Builder setType(CertificateType param1CertificateType) {
      this.type = param1CertificateType;
      return this;
    }
    
    public Builder setIssuer(IssuerIdentifier param1IssuerIdentifier) {
      this.issuer = param1IssuerIdentifier;
      return this;
    }
    
    public Builder setToBeSigned(ToBeSignedCertificate param1ToBeSignedCertificate) {
      this.toBeSigned = param1ToBeSignedCertificate;
      return this;
    }
    
    public Builder setSignature(Signature param1Signature) {
      this.signature = param1Signature;
      return this;
    }
    
    public Certificate createCertificate() {
      return new Certificate(this.version, this.type, this.issuer, this.toBeSigned, this.signature);
    }
    
    public ExplicitCertificate createExplicitCertificate() {
      return new ExplicitCertificate(this.version, this.issuer, this.toBeSigned, this.signature);
    }
    
    public ImplicitCertificate createImplicitCertificate() {
      return new ImplicitCertificate(this.version, this.issuer, this.toBeSigned, this.signature);
    }
    
    public CertificateBase createCertificateBase() {
      return new CertificateBase(this.version, this.type, this.issuer, this.toBeSigned, this.signature);
    }
    
    public CertificateBase createEtsiTs103097Certificate() {
      return (CertificateBase)new EtsiTs103097Certificate(this.version, this.issuer, this.toBeSigned, this.signature);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\CertificateBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */