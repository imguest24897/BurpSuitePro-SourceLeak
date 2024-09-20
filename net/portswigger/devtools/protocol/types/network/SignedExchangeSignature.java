package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.SignedExchangeSignature")
public class SignedExchangeSignature {
  @Zvd(Zp = "label")
  public final String label;
  
  @Zvd(Zp = "signature")
  public final String signature;
  
  @Zvd(Zp = "integrity")
  public final String integrity;
  
  @Zvd(Zp = "certUrl")
  @Zj
  public final String certUrl;
  
  @Zvd(Zp = "certSha256")
  @Zj
  public final String certSha256;
  
  @Zvd(Zp = "validityUrl")
  public final String validityUrl;
  
  @Zvd(Zp = "date")
  public final Integer date;
  
  @Zvd(Zp = "expires")
  public final Integer expires;
  
  @Zvd(Zp = "certificates")
  @Zj
  public final List<String> certificates;
  
  @Zox
  public SignedExchangeSignature(@Zc5(Ze = "label") String paramString1, @Zc5(Ze = "signature") String paramString2, @Zc5(Ze = "integrity") String paramString3, @Zc5(Ze = "certUrl", ZS = "null") String paramString4, @Zc5(Ze = "certSha256", ZS = "null") String paramString5, @Zc5(Ze = "validityUrl") String paramString6, @Zc5(Ze = "date") Integer paramInteger1, @Zc5(Ze = "expires") Integer paramInteger2, @Zc5(Ze = "certificates", ZS = "null") List<String> paramList) {
    this.label = paramString1;
    this.signature = paramString2;
    this.integrity = paramString3;
    this.certUrl = paramString4;
    this.certSha256 = paramString5;
    this.validityUrl = paramString6;
    this.date = paramInteger1;
    this.expires = paramInteger2;
    this.certificates = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\SignedExchangeSignature.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */