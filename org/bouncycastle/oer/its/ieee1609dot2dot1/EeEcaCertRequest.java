package org.bouncycastle.oer.its.ieee1609dot2dot1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateType;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class EeEcaCertRequest extends ASN1Object {
  private final UINT8 version;
  
  private final Time32 generationTime;
  
  private final CertificateType type;
  
  private final ToBeSignedCertificate tbsCert;
  
  private final ASN1IA5String canonicalId;
  
  public EeEcaCertRequest(UINT8 paramUINT8, Time32 paramTime32, CertificateType paramCertificateType, ToBeSignedCertificate paramToBeSignedCertificate, ASN1IA5String paramASN1IA5String) {
    this.version = paramUINT8;
    this.generationTime = paramTime32;
    this.type = paramCertificateType;
    this.tbsCert = paramToBeSignedCertificate;
    this.canonicalId = paramASN1IA5String;
  }
  
  private EeEcaCertRequest(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 5)
      throw new IllegalArgumentException("expected sequence size of 5"); 
    this.version = UINT8.getInstance(paramASN1Sequence.getObjectAt(0));
    this.generationTime = Time32.getInstance(paramASN1Sequence.getObjectAt(1));
    this.type = CertificateType.getInstance(paramASN1Sequence.getObjectAt(2));
    this.tbsCert = ToBeSignedCertificate.getInstance(paramASN1Sequence.getObjectAt(3));
    this.canonicalId = (ASN1IA5String)OEROptional.getInstance(paramASN1Sequence.getObjectAt(4)).getObject(ASN1IA5String.class);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static EeEcaCertRequest getInstance(Object paramObject) {
    return (paramObject instanceof EeEcaCertRequest) ? (EeEcaCertRequest)paramObject : ((paramObject != null) ? new EeEcaCertRequest(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.version, (ASN1Encodable)this.generationTime, (ASN1Encodable)this.type, (ASN1Encodable)this.tbsCert, (ASN1Encodable)OEROptional.getInstance(this.canonicalId) });
  }
  
  public UINT8 getVersion() {
    return this.version;
  }
  
  public Time32 getGenerationTime() {
    return this.generationTime;
  }
  
  public CertificateType getType() {
    return this.type;
  }
  
  public ToBeSignedCertificate getTbsCert() {
    return this.tbsCert;
  }
  
  public ASN1IA5String getCanonicalId() {
    return this.canonicalId;
  }
  
  public static class Builder {
    private UINT8 version;
    
    private Time32 generationTime;
    
    private CertificateType type;
    
    private ToBeSignedCertificate tbsCert;
    
    private DERIA5String canonicalId;
    
    public Builder setVersion(UINT8 param1UINT8) {
      this.version = param1UINT8;
      return this;
    }
    
    public Builder setGenerationTime(Time32 param1Time32) {
      this.generationTime = param1Time32;
      return this;
    }
    
    public Builder setType(CertificateType param1CertificateType) {
      this.type = param1CertificateType;
      return this;
    }
    
    public Builder setTbsCert(ToBeSignedCertificate param1ToBeSignedCertificate) {
      this.tbsCert = param1ToBeSignedCertificate;
      return this;
    }
    
    public Builder setCanonicalId(DERIA5String param1DERIA5String) {
      this.canonicalId = param1DERIA5String;
      return this;
    }
    
    public Builder setCanonicalId(String param1String) {
      this.canonicalId = new DERIA5String(param1String);
      return this;
    }
    
    public EeEcaCertRequest createEeEcaCertRequest() {
      return new EeEcaCertRequest(this.version, this.generationTime, this.type, this.tbsCert, (ASN1IA5String)this.canonicalId);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2dot1\EeEcaCertRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */