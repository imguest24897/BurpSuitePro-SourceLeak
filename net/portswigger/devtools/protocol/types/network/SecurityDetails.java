package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.network.SecurityDetails")
public class SecurityDetails {
  @Zvd(Zp = "protocol")
  public final String protocol;
  
  @Zvd(Zp = "keyExchange")
  public final String keyExchange;
  
  @Zvd(Zp = "keyExchangeGroup")
  @Zj
  public final String keyExchangeGroup;
  
  @Zvd(Zp = "cipher")
  public final String cipher;
  
  @Zvd(Zp = "mac")
  @Zj
  public final String mac;
  
  @Zvd(Zp = "certificateId")
  public final Integer certificateId;
  
  @Zvd(Zp = "subjectName")
  public final String subjectName;
  
  @Zvd(Zp = "sanList")
  public final List<String> sanList;
  
  @Zvd(Zp = "issuer")
  public final String issuer;
  
  @Zvd(Zp = "validFrom")
  public final Double validFrom;
  
  @Zvd(Zp = "validTo")
  public final Double validTo;
  
  @Zvd(Zp = "signedCertificateTimestampList")
  public final List<SignedCertificateTimestamp> signedCertificateTimestampList;
  
  @Zvd(Zp = "certificateTransparencyCompliance")
  public final CertificateTransparencyCompliance certificateTransparencyCompliance;
  
  @Zvd(Zp = "serverSignatureAlgorithm")
  @Zj
  public final Integer serverSignatureAlgorithm;
  
  @Zvd(Zp = "encryptedClientHello")
  public final Boolean encryptedClientHello;
  
  @Zox
  public SecurityDetails(@Zc5(Ze = "protocol") String paramString1, @Zc5(Ze = "keyExchange") String paramString2, @Zc5(Ze = "keyExchangeGroup", ZS = "null") String paramString3, @Zc5(Ze = "cipher") String paramString4, @Zc5(Ze = "mac", ZS = "null") String paramString5, @Zc5(Ze = "certificateId") Integer paramInteger1, @Zc5(Ze = "subjectName") String paramString6, @Zc5(Ze = "sanList") List<String> paramList, @Zc5(Ze = "issuer") String paramString7, @Zc5(Ze = "validFrom") Double paramDouble1, @Zc5(Ze = "validTo") Double paramDouble2, @Zc5(Ze = "signedCertificateTimestampList") List<SignedCertificateTimestamp> paramList1, @Zc5(Ze = "certificateTransparencyCompliance") CertificateTransparencyCompliance paramCertificateTransparencyCompliance, @Zc5(Ze = "serverSignatureAlgorithm", ZS = "null") Integer paramInteger2, @Zc5(Ze = "encryptedClientHello") Boolean paramBoolean) {
    this.protocol = paramString1;
    this.keyExchange = paramString2;
    this.keyExchangeGroup = paramString3;
    this.cipher = paramString4;
    this.mac = paramString5;
    this.certificateId = paramInteger1;
    this.subjectName = paramString6;
    this.sanList = paramList;
    this.issuer = paramString7;
    this.validFrom = paramDouble1;
    this.validTo = paramDouble2;
    this.signedCertificateTimestampList = paramList1;
    this.certificateTransparencyCompliance = paramCertificateTransparencyCompliance;
    this.serverSignatureAlgorithm = paramInteger2;
    this.encryptedClientHello = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\SecurityDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */