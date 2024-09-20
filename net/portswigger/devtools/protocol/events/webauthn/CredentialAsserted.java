package net.portswigger.devtools.protocol.events.webauthn;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.webauthn.Credential;

@Zsi("net.portswigger.devtools.protocol.events.webauthn.CredentialAsserted")
public class CredentialAsserted implements Zl {
  @Zvd(Zp = "authenticatorId")
  public final String authenticatorId;
  
  @Zvd(Zp = "credential")
  public final Credential credential;
  
  private static boolean ZC;
  
  @Zox
  public CredentialAsserted(@Zc5(Ze = "authenticatorId") String paramString, @Zc5(Ze = "credential") Credential paramCredential) {
    this.authenticatorId = paramString;
    boolean bool = Zc();
    this.credential = paramCredential;
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void ZG(boolean paramBoolean) {
    ZC = paramBoolean;
  }
  
  public static boolean ZP() {
    return ZC;
  }
  
  public static boolean Zc() {
    boolean bool = ZP();
    return !bool;
  }
  
  static {
    if (Zc())
      ZG(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\webauthn\CredentialAsserted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */