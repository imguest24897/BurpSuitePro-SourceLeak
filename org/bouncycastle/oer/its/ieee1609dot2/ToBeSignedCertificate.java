package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.CrlSeries;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.GeographicRegion;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId3;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfPsidSsp;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SubjectAssurance;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.ValidityPeriod;

public class ToBeSignedCertificate extends ASN1Object {
  private final CertificateId id;
  
  private final HashedId3 cracaId;
  
  private final CrlSeries crlSeries;
  
  private final ValidityPeriod validityPeriod;
  
  private final GeographicRegion region;
  
  private final SubjectAssurance assuranceLevel;
  
  private final SequenceOfPsidSsp appPermissions;
  
  private final SequenceOfPsidGroupPermissions certIssuePermissions;
  
  private final SequenceOfPsidGroupPermissions certRequestPermissions;
  
  private final ASN1Null canRequestRollover;
  
  private final PublicEncryptionKey encryptionKey;
  
  private final VerificationKeyIndicator verifyKeyIndicator;
  
  public ToBeSignedCertificate(CertificateId paramCertificateId, HashedId3 paramHashedId3, CrlSeries paramCrlSeries, ValidityPeriod paramValidityPeriod, GeographicRegion paramGeographicRegion, SubjectAssurance paramSubjectAssurance, SequenceOfPsidSsp paramSequenceOfPsidSsp, SequenceOfPsidGroupPermissions paramSequenceOfPsidGroupPermissions1, SequenceOfPsidGroupPermissions paramSequenceOfPsidGroupPermissions2, ASN1Null paramASN1Null, PublicEncryptionKey paramPublicEncryptionKey, VerificationKeyIndicator paramVerificationKeyIndicator) {
    this.id = paramCertificateId;
    this.cracaId = paramHashedId3;
    this.crlSeries = paramCrlSeries;
    this.validityPeriod = paramValidityPeriod;
    this.region = paramGeographicRegion;
    this.assuranceLevel = paramSubjectAssurance;
    this.appPermissions = paramSequenceOfPsidSsp;
    this.certIssuePermissions = paramSequenceOfPsidGroupPermissions1;
    this.certRequestPermissions = paramSequenceOfPsidGroupPermissions2;
    this.canRequestRollover = paramASN1Null;
    this.encryptionKey = paramPublicEncryptionKey;
    this.verifyKeyIndicator = paramVerificationKeyIndicator;
  }
  
  private ToBeSignedCertificate(ASN1Sequence paramASN1Sequence) {
    Iterator iterator = ASN1Sequence.getInstance(paramASN1Sequence).iterator();
    if (paramASN1Sequence.size() != 12)
      throw new IllegalArgumentException("expected sequence size of 12"); 
    this.id = CertificateId.getInstance(iterator.next());
    this.cracaId = HashedId3.getInstance(iterator.next());
    this.crlSeries = CrlSeries.getInstance(iterator.next());
    this.validityPeriod = ValidityPeriod.getInstance(iterator.next());
    this.region = (GeographicRegion)OEROptional.getValue(GeographicRegion.class, iterator.next());
    this.assuranceLevel = (SubjectAssurance)OEROptional.getValue(SubjectAssurance.class, iterator.next());
    this.appPermissions = (SequenceOfPsidSsp)OEROptional.getValue(SequenceOfPsidSsp.class, iterator.next());
    this.certIssuePermissions = (SequenceOfPsidGroupPermissions)OEROptional.getValue(SequenceOfPsidGroupPermissions.class, iterator.next());
    this.certRequestPermissions = (SequenceOfPsidGroupPermissions)OEROptional.getValue(SequenceOfPsidGroupPermissions.class, iterator.next());
    this.canRequestRollover = (ASN1Null)OEROptional.getValue(ASN1Null.class, iterator.next());
    this.encryptionKey = (PublicEncryptionKey)OEROptional.getValue(PublicEncryptionKey.class, iterator.next());
    this.verifyKeyIndicator = VerificationKeyIndicator.getInstance(iterator.next());
  }
  
  public static ToBeSignedCertificate getInstance(Object paramObject) {
    return (paramObject instanceof ToBeSignedCertificate) ? (ToBeSignedCertificate)paramObject : ((paramObject != null) ? new ToBeSignedCertificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CertificateId getId() {
    return this.id;
  }
  
  public HashedId3 getCracaId() {
    return this.cracaId;
  }
  
  public CrlSeries getCrlSeries() {
    return this.crlSeries;
  }
  
  public ValidityPeriod getValidityPeriod() {
    return this.validityPeriod;
  }
  
  public GeographicRegion getRegion() {
    return this.region;
  }
  
  public SubjectAssurance getAssuranceLevel() {
    return this.assuranceLevel;
  }
  
  public SequenceOfPsidSsp getAppPermissions() {
    return this.appPermissions;
  }
  
  public SequenceOfPsidGroupPermissions getCertIssuePermissions() {
    return this.certIssuePermissions;
  }
  
  public SequenceOfPsidGroupPermissions getCertRequestPermissions() {
    return this.certRequestPermissions;
  }
  
  public ASN1Null getCanRequestRollover() {
    return this.canRequestRollover;
  }
  
  public PublicEncryptionKey getEncryptionKey() {
    return this.encryptionKey;
  }
  
  public VerificationKeyIndicator getVerifyKeyIndicator() {
    return this.verifyKeyIndicator;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { 
          (ASN1Encodable)this.id, (ASN1Encodable)this.cracaId, (ASN1Encodable)this.crlSeries, (ASN1Encodable)this.validityPeriod, (ASN1Encodable)OEROptional.getInstance(this.region), (ASN1Encodable)OEROptional.getInstance(this.assuranceLevel), (ASN1Encodable)OEROptional.getInstance(this.appPermissions), (ASN1Encodable)OEROptional.getInstance(this.certIssuePermissions), (ASN1Encodable)OEROptional.getInstance(this.certRequestPermissions), (ASN1Encodable)OEROptional.getInstance(this.canRequestRollover), 
          (ASN1Encodable)OEROptional.getInstance(this.encryptionKey), (ASN1Encodable)this.verifyKeyIndicator });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private CertificateId id;
    
    private HashedId3 cracaId;
    
    private CrlSeries crlSeries;
    
    private ValidityPeriod validityPeriod;
    
    private GeographicRegion region;
    
    private SubjectAssurance assuranceLevel;
    
    private SequenceOfPsidSsp appPermissions;
    
    private SequenceOfPsidGroupPermissions certIssuePermissions;
    
    private SequenceOfPsidGroupPermissions certRequestPermissions;
    
    private ASN1Null canRequestRollover;
    
    private PublicEncryptionKey encryptionKey;
    
    private VerificationKeyIndicator verifyKeyIndicator;
    
    public Builder() {}
    
    public Builder(Builder param1Builder) {
      this.id = param1Builder.id;
      this.cracaId = param1Builder.cracaId;
      this.crlSeries = param1Builder.crlSeries;
      this.validityPeriod = param1Builder.validityPeriod;
      this.region = param1Builder.region;
      this.assuranceLevel = param1Builder.assuranceLevel;
      this.appPermissions = param1Builder.appPermissions;
      this.certIssuePermissions = param1Builder.certIssuePermissions;
      this.certRequestPermissions = param1Builder.certRequestPermissions;
      this.canRequestRollover = param1Builder.canRequestRollover;
      this.encryptionKey = param1Builder.encryptionKey;
      this.verifyKeyIndicator = param1Builder.verifyKeyIndicator;
    }
    
    public Builder(ToBeSignedCertificate param1ToBeSignedCertificate) {
      this.id = param1ToBeSignedCertificate.id;
      this.cracaId = param1ToBeSignedCertificate.cracaId;
      this.crlSeries = param1ToBeSignedCertificate.crlSeries;
      this.validityPeriod = param1ToBeSignedCertificate.validityPeriod;
      this.region = param1ToBeSignedCertificate.region;
      this.assuranceLevel = param1ToBeSignedCertificate.assuranceLevel;
      this.appPermissions = param1ToBeSignedCertificate.appPermissions;
      this.certIssuePermissions = param1ToBeSignedCertificate.certIssuePermissions;
      this.certRequestPermissions = param1ToBeSignedCertificate.certRequestPermissions;
      this.canRequestRollover = param1ToBeSignedCertificate.canRequestRollover;
      this.encryptionKey = param1ToBeSignedCertificate.encryptionKey;
      this.verifyKeyIndicator = param1ToBeSignedCertificate.verifyKeyIndicator;
    }
    
    public Builder setId(CertificateId param1CertificateId) {
      this.id = param1CertificateId;
      return this;
    }
    
    public Builder setCracaId(HashedId3 param1HashedId3) {
      this.cracaId = param1HashedId3;
      return this;
    }
    
    public Builder setCrlSeries(CrlSeries param1CrlSeries) {
      this.crlSeries = param1CrlSeries;
      return this;
    }
    
    public Builder setValidityPeriod(ValidityPeriod param1ValidityPeriod) {
      this.validityPeriod = param1ValidityPeriod;
      return this;
    }
    
    public Builder setRegion(GeographicRegion param1GeographicRegion) {
      this.region = param1GeographicRegion;
      return this;
    }
    
    public Builder setAssuranceLevel(SubjectAssurance param1SubjectAssurance) {
      this.assuranceLevel = param1SubjectAssurance;
      return this;
    }
    
    public Builder setAppPermissions(SequenceOfPsidSsp param1SequenceOfPsidSsp) {
      this.appPermissions = param1SequenceOfPsidSsp;
      return this;
    }
    
    public Builder setCertIssuePermissions(SequenceOfPsidGroupPermissions param1SequenceOfPsidGroupPermissions) {
      this.certIssuePermissions = param1SequenceOfPsidGroupPermissions;
      return this;
    }
    
    public Builder setCertRequestPermissions(SequenceOfPsidGroupPermissions param1SequenceOfPsidGroupPermissions) {
      this.certRequestPermissions = param1SequenceOfPsidGroupPermissions;
      return this;
    }
    
    public Builder setCanRequestRollover() {
      this.canRequestRollover = (ASN1Null)DERNull.INSTANCE;
      return this;
    }
    
    public Builder setEncryptionKey(PublicEncryptionKey param1PublicEncryptionKey) {
      this.encryptionKey = param1PublicEncryptionKey;
      return this;
    }
    
    public Builder setVerifyKeyIndicator(VerificationKeyIndicator param1VerificationKeyIndicator) {
      this.verifyKeyIndicator = param1VerificationKeyIndicator;
      return this;
    }
    
    public ToBeSignedCertificate createToBeSignedCertificate() {
      return new ToBeSignedCertificate(this.id, this.cracaId, this.crlSeries, this.validityPeriod, this.region, this.assuranceLevel, this.appPermissions, this.certIssuePermissions, this.certRequestPermissions, this.canRequestRollover, this.encryptionKey, this.verifyKeyIndicator);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\ToBeSignedCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */