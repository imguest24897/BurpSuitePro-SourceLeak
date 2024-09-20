package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.PsidGroupPermissions;
import org.bouncycastle.oer.its.ieee1609dot2.SequenceOfPsidGroupPermissions;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.CrlSeries;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId3;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PsidSsp;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfPsidSsp;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class ITSCertificateBuilder {
  protected final ToBeSignedCertificate.Builder tbsCertificateBuilder;
  
  protected final ITSCertificate issuer;
  
  protected UINT8 version = new UINT8(3);
  
  protected HashedId3 cracaId = new HashedId3(new byte[3]);
  
  protected CrlSeries crlSeries = new CrlSeries(0);
  
  public ITSCertificateBuilder(ToBeSignedCertificate.Builder paramBuilder) {
    this(null, paramBuilder);
  }
  
  public ITSCertificateBuilder(ITSCertificate paramITSCertificate, ToBeSignedCertificate.Builder paramBuilder) {
    this.issuer = paramITSCertificate;
    this.tbsCertificateBuilder = paramBuilder;
    this.tbsCertificateBuilder.setCracaId(this.cracaId);
    this.tbsCertificateBuilder.setCrlSeries(this.crlSeries);
  }
  
  public ITSCertificate getIssuer() {
    return this.issuer;
  }
  
  public ITSCertificateBuilder setVersion(int paramInt) {
    this.version = new UINT8(paramInt);
    return this;
  }
  
  public ITSCertificateBuilder setCracaId(byte[] paramArrayOfbyte) {
    this.cracaId = new HashedId3(paramArrayOfbyte);
    this.tbsCertificateBuilder.setCracaId(this.cracaId);
    return this;
  }
  
  public ITSCertificateBuilder setCrlSeries(int paramInt) {
    this.crlSeries = new CrlSeries(paramInt);
    this.tbsCertificateBuilder.setCrlSeries(this.crlSeries);
    return this;
  }
  
  public ITSCertificateBuilder setValidityPeriod(ITSValidityPeriod paramITSValidityPeriod) {
    this.tbsCertificateBuilder.setValidityPeriod(paramITSValidityPeriod.toASN1Structure());
    return this;
  }
  
  public ITSCertificateBuilder setCertIssuePermissions(PsidGroupPermissions... paramVarArgs) {
    this.tbsCertificateBuilder.setCertIssuePermissions(SequenceOfPsidGroupPermissions.builder().addGroupPermission(paramVarArgs).createSequenceOfPsidGroupPermissions());
    return this;
  }
  
  public ITSCertificateBuilder setAppPermissions(PsidSsp... paramVarArgs) {
    SequenceOfPsidSsp.Builder builder = SequenceOfPsidSsp.builder();
    for (byte b = 0; b != paramVarArgs.length; b++) {
      builder.setItem(new PsidSsp[] { paramVarArgs[b] });
    } 
    this.tbsCertificateBuilder.setAppPermissions(builder.createSequenceOfPsidSsp());
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSCertificateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */