package org.bouncycastle.oer.its.etsi102941.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.SequenceOfPsidGroupPermissions;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.GeographicRegion;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfPsidSsp;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SubjectAssurance;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.ValidityPeriod;

public class CertificateSubjectAttributes extends ASN1Object {
  private final CertificateId id;
  
  private final ValidityPeriod validityPeriod;
  
  private final GeographicRegion region;
  
  private final SubjectAssurance assuranceLevel;
  
  private final SequenceOfPsidSsp appPermissions;
  
  private final SequenceOfPsidGroupPermissions certIssuePermissions;
  
  public CertificateSubjectAttributes(CertificateId paramCertificateId, ValidityPeriod paramValidityPeriod, GeographicRegion paramGeographicRegion, SubjectAssurance paramSubjectAssurance, SequenceOfPsidSsp paramSequenceOfPsidSsp, SequenceOfPsidGroupPermissions paramSequenceOfPsidGroupPermissions) {
    this.id = paramCertificateId;
    this.validityPeriod = paramValidityPeriod;
    this.region = paramGeographicRegion;
    this.assuranceLevel = paramSubjectAssurance;
    this.appPermissions = paramSequenceOfPsidSsp;
    this.certIssuePermissions = paramSequenceOfPsidGroupPermissions;
  }
  
  private CertificateSubjectAttributes(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 6)
      throw new IllegalArgumentException("expected sequence size of 6"); 
    this.id = (CertificateId)OEROptional.getValue(CertificateId.class, paramASN1Sequence.getObjectAt(0));
    this.validityPeriod = (ValidityPeriod)OEROptional.getValue(ValidityPeriod.class, paramASN1Sequence.getObjectAt(1));
    this.region = (GeographicRegion)OEROptional.getValue(GeographicRegion.class, paramASN1Sequence.getObjectAt(2));
    this.assuranceLevel = (SubjectAssurance)OEROptional.getValue(SubjectAssurance.class, paramASN1Sequence.getObjectAt(3));
    this.appPermissions = (SequenceOfPsidSsp)OEROptional.getValue(SequenceOfPsidSsp.class, paramASN1Sequence.getObjectAt(4));
    this.certIssuePermissions = (SequenceOfPsidGroupPermissions)OEROptional.getValue(SequenceOfPsidGroupPermissions.class, paramASN1Sequence.getObjectAt(5));
  }
  
  public static CertificateSubjectAttributes getInstance(Object paramObject) {
    return (paramObject instanceof CertificateSubjectAttributes) ? (CertificateSubjectAttributes)paramObject : ((paramObject != null) ? new CertificateSubjectAttributes(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CertificateId getId() {
    return this.id;
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
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)OEROptional.getInstance(this.id), (ASN1Encodable)OEROptional.getInstance(this.validityPeriod), (ASN1Encodable)OEROptional.getInstance(this.region), (ASN1Encodable)OEROptional.getInstance(this.assuranceLevel), (ASN1Encodable)OEROptional.getInstance(this.appPermissions), (ASN1Encodable)OEROptional.getInstance(this.certIssuePermissions) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\basetypes\CertificateSubjectAttributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */