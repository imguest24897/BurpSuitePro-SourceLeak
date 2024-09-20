package net.portswigger.devtools.protocol.types.security;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.security.CertificateSecurityState")
public class CertificateSecurityState {
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
  
  @Zvd(Zp = "certificate")
  public final List<String> certificate;
  
  @Zvd(Zp = "subjectName")
  public final String subjectName;
  
  @Zvd(Zp = "issuer")
  public final String issuer;
  
  @Zvd(Zp = "validFrom")
  public final Double validFrom;
  
  @Zvd(Zp = "validTo")
  public final Double validTo;
  
  @Zvd(Zp = "certificateNetworkError")
  @Zj
  public final String certificateNetworkError;
  
  @Zvd(Zp = "certificateHasWeakSignature")
  public final Boolean certificateHasWeakSignature;
  
  @Zvd(Zp = "certificateHasSha1Signature")
  public final Boolean certificateHasSha1Signature;
  
  @Zvd(Zp = "modernSSL")
  public final Boolean modernSSL;
  
  @Zvd(Zp = "obsoleteSslProtocol")
  public final Boolean obsoleteSslProtocol;
  
  @Zvd(Zp = "obsoleteSslKeyExchange")
  public final Boolean obsoleteSslKeyExchange;
  
  @Zvd(Zp = "obsoleteSslCipher")
  public final Boolean obsoleteSslCipher;
  
  @Zvd(Zp = "obsoleteSslSignature")
  public final Boolean obsoleteSslSignature;
  
  @Zox
  public CertificateSecurityState(@Zc5(Ze = "protocol") String paramString1, @Zc5(Ze = "keyExchange") String paramString2, @Zc5(Ze = "keyExchangeGroup", ZS = "null") String paramString3, @Zc5(Ze = "cipher") String paramString4, @Zc5(Ze = "mac", ZS = "null") String paramString5, @Zc5(Ze = "certificate") List<String> paramList, @Zc5(Ze = "subjectName") String paramString6, @Zc5(Ze = "issuer") String paramString7, @Zc5(Ze = "validFrom") Double paramDouble1, @Zc5(Ze = "validTo") Double paramDouble2, @Zc5(Ze = "certificateNetworkError", ZS = "null") String paramString8, @Zc5(Ze = "certificateHasWeakSignature") Boolean paramBoolean1, @Zc5(Ze = "certificateHasSha1Signature") Boolean paramBoolean2, @Zc5(Ze = "modernSSL") Boolean paramBoolean3, @Zc5(Ze = "obsoleteSslProtocol") Boolean paramBoolean4, @Zc5(Ze = "obsoleteSslKeyExchange") Boolean paramBoolean5, @Zc5(Ze = "obsoleteSslCipher") Boolean paramBoolean6, @Zc5(Ze = "obsoleteSslSignature") Boolean paramBoolean7) {
    this.protocol = paramString1;
    this.keyExchange = paramString2;
    this.keyExchangeGroup = paramString3;
    this.cipher = paramString4;
    this.mac = paramString5;
    this.certificate = paramList;
    this.subjectName = paramString6;
    this.issuer = paramString7;
    this.validFrom = paramDouble1;
    this.validTo = paramDouble2;
    this.certificateNetworkError = paramString8;
    this.certificateHasWeakSignature = paramBoolean1;
    this.certificateHasSha1Signature = paramBoolean2;
    this.modernSSL = paramBoolean3;
    this.obsoleteSslProtocol = paramBoolean4;
    this.obsoleteSslKeyExchange = paramBoolean5;
    int i = VisibleSecurityState.Zn();
    this.obsoleteSslCipher = paramBoolean6;
    this.obsoleteSslSignature = paramBoolean7;
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\security\CertificateSecurityState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */