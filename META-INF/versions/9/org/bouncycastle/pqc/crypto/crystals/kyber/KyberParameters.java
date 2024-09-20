package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

public class KyberParameters implements KEMParameters {
  public static final org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters kyber512 = new org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters("kyber512", 2, 256, false);
  
  public static final org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters kyber768 = new org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters("kyber768", 3, 256, false);
  
  public static final org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters kyber1024 = new org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters("kyber1024", 4, 256, false);
  
  private final String name;
  
  private final int k;
  
  private final int sessionKeySize;
  
  private final boolean usingAes;
  
  private KyberParameters(String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.name = paramString;
    this.k = paramInt1;
    this.sessionKeySize = paramInt2;
    this.usingAes = paramBoolean;
  }
  
  public String getName() {
    return this.name;
  }
  
  KyberEngine getEngine() {
    return new KyberEngine(this.k, this.usingAes);
  }
  
  public int getSessionKeySize() {
    return this.sessionKeySize;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\kyber\KyberParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */