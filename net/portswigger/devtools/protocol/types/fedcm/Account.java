package net.portswigger.devtools.protocol.types.fedcm;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.fedcm.Account")
public class Account {
  @Zvd(Zp = "accountId")
  public final String accountId;
  
  @Zvd(Zp = "email")
  public final String email;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "givenName")
  public final String givenName;
  
  @Zvd(Zp = "pictureUrl")
  public final String pictureUrl;
  
  @Zvd(Zp = "idpConfigUrl")
  public final String idpConfigUrl;
  
  @Zvd(Zp = "idpLoginUrl")
  public final String idpLoginUrl;
  
  @Zvd(Zp = "loginState")
  public final LoginState loginState;
  
  @Zvd(Zp = "termsOfServiceUrl")
  @Zj
  public final String termsOfServiceUrl;
  
  @Zvd(Zp = "privacyPolicyUrl")
  @Zj
  public final String privacyPolicyUrl;
  
  @Zox
  public Account(@Zc5(Ze = "accountId") String paramString1, @Zc5(Ze = "email") String paramString2, @Zc5(Ze = "name") String paramString3, @Zc5(Ze = "givenName") String paramString4, @Zc5(Ze = "pictureUrl") String paramString5, @Zc5(Ze = "idpConfigUrl") String paramString6, @Zc5(Ze = "idpLoginUrl") String paramString7, @Zc5(Ze = "loginState") LoginState paramLoginState, @Zc5(Ze = "termsOfServiceUrl", ZS = "null") String paramString8, @Zc5(Ze = "privacyPolicyUrl", ZS = "null") String paramString9) {
    this.accountId = paramString1;
    this.email = paramString2;
    this.name = paramString3;
    this.givenName = paramString4;
    this.pictureUrl = paramString5;
    this.idpConfigUrl = paramString6;
    this.idpLoginUrl = paramString7;
    this.loginState = paramLoginState;
    boolean bool = LoginState.ZT();
    this.termsOfServiceUrl = paramString8;
    this.privacyPolicyUrl = paramString9;
    if (bool)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\fedcm\Account.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */