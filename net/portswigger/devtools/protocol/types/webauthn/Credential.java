package net.portswigger.devtools.protocol.types.webauthn;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.webauthn.Credential")
public class Credential {
  @Zvd(Zp = "credentialId")
  public final String credentialId;
  
  @Zvd(Zp = "isResidentCredential")
  public final Boolean isResidentCredential;
  
  @Zvd(Zp = "rpId")
  @Zj
  public final String rpId;
  
  @Zvd(Zp = "privateKey")
  public final String privateKey;
  
  @Zvd(Zp = "userHandle")
  @Zj
  public final String userHandle;
  
  @Zvd(Zp = "signCount")
  public final Integer signCount;
  
  @Zvd(Zp = "largeBlob")
  @Zj
  public final String largeBlob;
  
  @Zvd(Zp = "backupEligibility")
  @Zj
  public final Boolean backupEligibility;
  
  @Zvd(Zp = "backupState")
  @Zj
  public final Boolean backupState;
  
  @Zox
  public Credential(@Zc5(Ze = "credentialId") String paramString1, @Zc5(Ze = "isResidentCredential") Boolean paramBoolean1, @Zc5(Ze = "rpId", ZS = "null") String paramString2, @Zc5(Ze = "privateKey") String paramString3, @Zc5(Ze = "userHandle", ZS = "null") String paramString4, @Zc5(Ze = "signCount") Integer paramInteger, @Zc5(Ze = "largeBlob", ZS = "null") String paramString5, @Zc5(Ze = "backupEligibility", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "backupState", ZS = "null") Boolean paramBoolean3) {
    this.credentialId = paramString1;
    this.isResidentCredential = paramBoolean1;
    this.rpId = paramString2;
    this.privateKey = paramString3;
    this.userHandle = paramString4;
    this.signCount = paramInteger;
    this.largeBlob = paramString5;
    String str = VirtualAuthenticatorOptions.Zl();
    this.backupEligibility = paramBoolean2;
    this.backupState = paramBoolean3;
    if (Zbqc.Zwu() == null)
      VirtualAuthenticatorOptions.Zi("XoM5Mb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\webauthn\Credential.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */