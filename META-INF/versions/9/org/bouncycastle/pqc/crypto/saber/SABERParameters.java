package META-INF.versions.9.org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.saber.SABEREngine;

public class SABERParameters implements KEMParameters {
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters lightsaberkem128r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("lightsaberkem128r3", 2, 128, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters saberkem128r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("saberkem128r3", 3, 128, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters firesaberkem128r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("firesaberkem128r3", 4, 128, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters lightsaberkem192r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("lightsaberkem192r3", 2, 192, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters saberkem192r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("saberkem192r3", 3, 192, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters firesaberkem192r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("firesaberkem192r3", 4, 192, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters lightsaberkem256r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("lightsaberkem256r3", 2, 256, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters saberkem256r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("saberkem256r3", 3, 256, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters firesaberkem256r3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("firesaberkem256r3", 4, 256, false, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters lightsaberkem90sr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("lightsaberkem90sr3", 2, 256, true, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters saberkem90sr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("saberkem90sr3", 3, 256, true, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters firesaberkem90sr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("firesaberkem90sr3", 4, 256, true, false);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters ulightsaberkemr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("ulightsaberkemr3", 2, 256, false, true);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters usaberkemr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("usaberkemr3", 3, 256, false, true);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters ufiresaberkemr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("ufiresaberkemr3", 4, 256, false, true);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters ulightsaberkem90sr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("ulightsaberkem90sr3", 2, 256, true, true);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters usaberkem90sr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("usaberkem90sr3", 3, 256, true, true);
  
  public static final org.bouncycastle.pqc.crypto.saber.SABERParameters ufiresaberkem90sr3 = new org.bouncycastle.pqc.crypto.saber.SABERParameters("ufiresaberkem90sr3", 4, 256, true, true);
  
  private final String name;
  
  private final int l;
  
  private final int defaultKeySize;
  
  private final SABEREngine engine;
  
  public SABERParameters(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    this.name = paramString;
    this.l = paramInt1;
    this.defaultKeySize = paramInt2;
    this.engine = new SABEREngine(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getL() {
    return this.l;
  }
  
  public int getSessionKeySize() {
    return this.defaultKeySize;
  }
  
  public SABEREngine getEngine() {
    return this.engine;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\saber\SABERParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */