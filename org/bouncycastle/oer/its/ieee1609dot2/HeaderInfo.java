package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId3;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Psid;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfHashedId3;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.ThreeDLocation;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time64;

public class HeaderInfo extends ASN1Object {
  private final Psid psid;
  
  private final Time64 generationTime;
  
  private final Time64 expiryTime;
  
  private final ThreeDLocation generationLocation;
  
  private final HashedId3 p2pcdLearningRequest;
  
  private final MissingCrlIdentifier missingCrlIdentifier;
  
  private final EncryptionKey encryptionKey;
  
  private final SequenceOfHashedId3 inlineP2pcdRequest;
  
  private final Certificate requestedCertificate;
  
  private final PduFunctionalType pduFunctionalType;
  
  private final ContributedExtensionBlocks contributedExtensions;
  
  private HeaderInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 11 && paramASN1Sequence.size() != 7)
      throw new IllegalArgumentException("expected sequence size of 11 or 7"); 
    Iterator iterator = paramASN1Sequence.iterator();
    this.psid = Psid.getInstance(iterator.next());
    this.generationTime = (Time64)OEROptional.getValue(Time64.class, iterator.next());
    this.expiryTime = (Time64)OEROptional.getValue(Time64.class, iterator.next());
    this.generationLocation = (ThreeDLocation)OEROptional.getValue(ThreeDLocation.class, iterator.next());
    this.p2pcdLearningRequest = (HashedId3)OEROptional.getValue(HashedId3.class, iterator.next());
    this.missingCrlIdentifier = (MissingCrlIdentifier)OEROptional.getValue(MissingCrlIdentifier.class, iterator.next());
    this.encryptionKey = (EncryptionKey)OEROptional.getValue(EncryptionKey.class, iterator.next());
    if (paramASN1Sequence.size() > 7) {
      this.inlineP2pcdRequest = (SequenceOfHashedId3)OEROptional.getValue(SequenceOfHashedId3.class, iterator.next());
      this.requestedCertificate = (Certificate)OEROptional.getValue(Certificate.class, iterator.next());
      this.pduFunctionalType = (PduFunctionalType)OEROptional.getValue(PduFunctionalType.class, iterator.next());
      this.contributedExtensions = (ContributedExtensionBlocks)OEROptional.getValue(ContributedExtensionBlocks.class, iterator.next());
    } else {
      this.inlineP2pcdRequest = null;
      this.requestedCertificate = null;
      this.pduFunctionalType = null;
      this.contributedExtensions = null;
    } 
  }
  
  public HeaderInfo(Psid paramPsid, Time64 paramTime641, Time64 paramTime642, ThreeDLocation paramThreeDLocation, HashedId3 paramHashedId3, MissingCrlIdentifier paramMissingCrlIdentifier, EncryptionKey paramEncryptionKey, SequenceOfHashedId3 paramSequenceOfHashedId3, Certificate paramCertificate, PduFunctionalType paramPduFunctionalType, ContributedExtensionBlocks paramContributedExtensionBlocks) {
    this.psid = paramPsid;
    this.generationTime = paramTime641;
    this.expiryTime = paramTime642;
    this.generationLocation = paramThreeDLocation;
    this.p2pcdLearningRequest = paramHashedId3;
    this.missingCrlIdentifier = paramMissingCrlIdentifier;
    this.encryptionKey = paramEncryptionKey;
    this.inlineP2pcdRequest = paramSequenceOfHashedId3;
    this.requestedCertificate = paramCertificate;
    this.pduFunctionalType = paramPduFunctionalType;
    this.contributedExtensions = paramContributedExtensionBlocks;
  }
  
  public static HeaderInfo getInstance(Object paramObject) {
    return (paramObject instanceof HeaderInfo) ? (HeaderInfo)paramObject : ((paramObject != null) ? new HeaderInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public Psid getPsid() {
    return this.psid;
  }
  
  public Time64 getGenerationTime() {
    return this.generationTime;
  }
  
  public Time64 getExpiryTime() {
    return this.expiryTime;
  }
  
  public ThreeDLocation getGenerationLocation() {
    return this.generationLocation;
  }
  
  public HashedId3 getP2pcdLearningRequest() {
    return this.p2pcdLearningRequest;
  }
  
  public MissingCrlIdentifier getMissingCrlIdentifier() {
    return this.missingCrlIdentifier;
  }
  
  public EncryptionKey getEncryptionKey() {
    return this.encryptionKey;
  }
  
  public SequenceOfHashedId3 getInlineP2pcdRequest() {
    return this.inlineP2pcdRequest;
  }
  
  public Certificate getRequestedCertificate() {
    return this.requestedCertificate;
  }
  
  public PduFunctionalType getPduFunctionalType() {
    return this.pduFunctionalType;
  }
  
  public ContributedExtensionBlocks getContributedExtensions() {
    return this.contributedExtensions;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { 
          (ASN1Encodable)this.psid, (ASN1Encodable)OEROptional.getInstance(this.generationTime), (ASN1Encodable)OEROptional.getInstance(this.expiryTime), (ASN1Encodable)OEROptional.getInstance(this.generationLocation), (ASN1Encodable)OEROptional.getInstance(this.p2pcdLearningRequest), (ASN1Encodable)OEROptional.getInstance(this.missingCrlIdentifier), (ASN1Encodable)OEROptional.getInstance(this.encryptionKey), (ASN1Encodable)OEROptional.getInstance(this.inlineP2pcdRequest), (ASN1Encodable)OEROptional.getInstance(this.requestedCertificate), (ASN1Encodable)OEROptional.getInstance(this.pduFunctionalType), 
          (ASN1Encodable)OEROptional.getInstance(this.contributedExtensions) });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private Psid psid;
    
    private Time64 generationTime;
    
    private Time64 expiryTime;
    
    private ThreeDLocation generationLocation;
    
    private HashedId3 p2pcdLearningRequest;
    
    private MissingCrlIdentifier missingCrlIdentifier;
    
    private EncryptionKey encryptionKey;
    
    private SequenceOfHashedId3 inlineP2pcdRequest;
    
    private Certificate requestedCertificate;
    
    private PduFunctionalType pduFunctionalType;
    
    private ContributedExtensionBlocks contributedExtensions;
    
    public Builder setPsid(Psid param1Psid) {
      this.psid = param1Psid;
      return this;
    }
    
    public Builder setGenerationTime(Time64 param1Time64) {
      this.generationTime = param1Time64;
      return this;
    }
    
    public Builder setExpiryTime(Time64 param1Time64) {
      this.expiryTime = param1Time64;
      return this;
    }
    
    public Builder setGenerationLocation(ThreeDLocation param1ThreeDLocation) {
      this.generationLocation = param1ThreeDLocation;
      return this;
    }
    
    public Builder setP2pcdLearningRequest(HashedId3 param1HashedId3) {
      this.p2pcdLearningRequest = param1HashedId3;
      return this;
    }
    
    public Builder setEncryptionKey(EncryptionKey param1EncryptionKey) {
      this.encryptionKey = param1EncryptionKey;
      return this;
    }
    
    public Builder setMissingCrlIdentifier(MissingCrlIdentifier param1MissingCrlIdentifier) {
      this.missingCrlIdentifier = param1MissingCrlIdentifier;
      return this;
    }
    
    public Builder setInlineP2pcdRequest(SequenceOfHashedId3 param1SequenceOfHashedId3) {
      this.inlineP2pcdRequest = param1SequenceOfHashedId3;
      return this;
    }
    
    public Builder setRequestedCertificate(Certificate param1Certificate) {
      this.requestedCertificate = param1Certificate;
      return this;
    }
    
    public Builder setPduFunctionalType(PduFunctionalType param1PduFunctionalType) {
      this.pduFunctionalType = param1PduFunctionalType;
      return this;
    }
    
    public Builder setContributedExtensions(ContributedExtensionBlocks param1ContributedExtensionBlocks) {
      this.contributedExtensions = param1ContributedExtensionBlocks;
      return this;
    }
    
    public HeaderInfo createHeaderInfo() {
      return new HeaderInfo(this.psid, this.generationTime, this.expiryTime, this.generationLocation, this.p2pcdLearningRequest, this.missingCrlIdentifier, this.encryptionKey, this.inlineP2pcdRequest, this.requestedCertificate, this.pduFunctionalType, this.contributedExtensions);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\HeaderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */