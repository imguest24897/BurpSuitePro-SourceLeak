package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.network.SignedCertificateTimestamp")
public class SignedCertificateTimestamp {
  @Zvd(Zp = "status")
  public final String status;
  
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "logDescription")
  public final String logDescription;
  
  @Zvd(Zp = "logId")
  public final String logId;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "hashAlgorithm")
  public final String hashAlgorithm;
  
  @Zvd(Zp = "signatureAlgorithm")
  public final String signatureAlgorithm;
  
  @Zvd(Zp = "signatureData")
  public final String signatureData;
  
  @Zox
  public SignedCertificateTimestamp(@Zc5(Ze = "status") String paramString1, @Zc5(Ze = "origin") String paramString2, @Zc5(Ze = "logDescription") String paramString3, @Zc5(Ze = "logId") String paramString4, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "hashAlgorithm") String paramString5, @Zc5(Ze = "signatureAlgorithm") String paramString6, @Zc5(Ze = "signatureData") String paramString7) {
    this.status = paramString1;
    this.origin = paramString2;
    this.logDescription = paramString3;
    this.logId = paramString4;
    this.timestamp = paramDouble;
    this.hashAlgorithm = paramString5;
    this.signatureAlgorithm = paramString6;
    this.signatureData = paramString7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\SignedCertificateTimestamp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */