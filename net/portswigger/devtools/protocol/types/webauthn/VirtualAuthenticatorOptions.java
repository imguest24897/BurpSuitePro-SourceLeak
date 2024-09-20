package net.portswigger.devtools.protocol.types.webauthn;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.webauthn.VirtualAuthenticatorOptions")
public class VirtualAuthenticatorOptions {
  @Zvd(Zp = "protocol")
  public final AuthenticatorProtocol protocol;
  
  @Zvd(Zp = "ctap2Version")
  @Zj
  public final Ctap2Version ctap2Version;
  
  @Zvd(Zp = "transport")
  public final AuthenticatorTransport transport;
  
  @Zvd(Zp = "hasResidentKey")
  @Zj
  public final Boolean hasResidentKey;
  
  @Zvd(Zp = "hasUserVerification")
  @Zj
  public final Boolean hasUserVerification;
  
  @Zvd(Zp = "hasLargeBlob")
  @Zj
  public final Boolean hasLargeBlob;
  
  @Zvd(Zp = "hasCredBlob")
  @Zj
  public final Boolean hasCredBlob;
  
  @Zvd(Zp = "hasMinPinLength")
  @Zj
  public final Boolean hasMinPinLength;
  
  @Zvd(Zp = "hasPrf")
  @Zj
  public final Boolean hasPrf;
  
  @Zvd(Zp = "automaticPresenceSimulation")
  @Zj
  public final Boolean automaticPresenceSimulation;
  
  @Zvd(Zp = "isUserVerified")
  @Zj
  public final Boolean isUserVerified;
  
  @Zvd(Zp = "defaultBackupEligibility")
  @Zj
  public final Boolean defaultBackupEligibility;
  
  @Zvd(Zp = "defaultBackupState")
  @Zj
  public final Boolean defaultBackupState;
  
  private static String ZP;
  
  @Zox
  public VirtualAuthenticatorOptions(@Zc5(Ze = "protocol") AuthenticatorProtocol paramAuthenticatorProtocol, @Zc5(Ze = "ctap2Version", ZS = "null") Ctap2Version paramCtap2Version, @Zc5(Ze = "transport") AuthenticatorTransport paramAuthenticatorTransport, @Zc5(Ze = "hasResidentKey", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "hasUserVerification", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "hasLargeBlob", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "hasCredBlob", ZS = "null") Boolean paramBoolean4, @Zc5(Ze = "hasMinPinLength", ZS = "null") Boolean paramBoolean5, @Zc5(Ze = "hasPrf", ZS = "null") Boolean paramBoolean6, @Zc5(Ze = "automaticPresenceSimulation", ZS = "null") Boolean paramBoolean7, @Zc5(Ze = "isUserVerified", ZS = "null") Boolean paramBoolean8, @Zc5(Ze = "defaultBackupEligibility", ZS = "null") Boolean paramBoolean9, @Zc5(Ze = "defaultBackupState", ZS = "null") Boolean paramBoolean10) {
    this.protocol = paramAuthenticatorProtocol;
    this.ctap2Version = paramCtap2Version;
    this.transport = paramAuthenticatorTransport;
    this.hasResidentKey = paramBoolean1;
    this.hasUserVerification = paramBoolean2;
    String str = Zl();
    this.hasLargeBlob = paramBoolean3;
    this.hasCredBlob = paramBoolean4;
    this.hasMinPinLength = paramBoolean5;
    this.hasPrf = paramBoolean6;
    this.automaticPresenceSimulation = paramBoolean7;
    this.isUserVerified = paramBoolean8;
    this.defaultBackupEligibility = paramBoolean9;
    this.defaultBackupState = paramBoolean10;
    if (str != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void Zi(String paramString) {
    ZP = paramString;
  }
  
  public static String Zl() {
    return ZP;
  }
  
  static {
    if (Zl() != null)
      Zi("LwqrK"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\webauthn\VirtualAuthenticatorOptions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */