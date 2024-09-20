package net.portswigger.devtools.protocol.events.webauthn;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.webauthn.Credential;

@Zsi("net.portswigger.devtools.protocol.events.webauthn.CredentialAdded")
public class CredentialAdded implements Zl {
  @Zvd(Zp = "authenticatorId")
  public final String authenticatorId;
  
  @Zvd(Zp = "credential")
  public final Credential credential;
  
  @Zox
  public CredentialAdded(@Zc5(Ze = "authenticatorId") String paramString, @Zc5(Ze = "credential") Credential paramCredential) {
    this.authenticatorId = paramString;
    this.credential = paramCredential;
    boolean bool = CredentialAsserted.Zc();
    if (Zbqc.Zwu() == null)
      CredentialAsserted.ZG(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webauthn\CredentialAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */