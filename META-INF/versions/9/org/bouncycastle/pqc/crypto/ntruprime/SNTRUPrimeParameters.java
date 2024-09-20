package META-INF.versions.9.org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.pqc.crypto.KEMParameters;

public class SNTRUPrimeParameters implements KEMParameters {
  public static final org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters sntrup653 = new org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters("sntrup653", 653, 4621, 288, 994, 865, 994, 1518, 32);
  
  public static final org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters sntrup761 = new org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters("sntrup761", 761, 4591, 286, 1158, 1007, 1158, 1763, 32);
  
  public static final org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters sntrup857 = new org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters("sntrup857", 857, 5167, 322, 1322, 1152, 1322, 1999, 32);
  
  public static final org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters sntrup953 = new org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters("sntrup953", 953, 6343, 396, 1505, 1317, 1505, 2254, 32);
  
  public static final org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters sntrup1013 = new org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters("sntrup1013", 1013, 7177, 448, 1623, 1423, 1623, 2417, 32);
  
  public static final org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters sntrup1277 = new org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters("sntrup1277", 1277, 7879, 492, 2067, 1815, 2067, 3059, 32);
  
  private final String name;
  
  private final int p;
  
  private final int q;
  
  private final int w;
  
  private final int rqPolynomialBytes;
  
  private final int roundedPolynomialBytes;
  
  private final int publicKeyBytes;
  
  private final int privateKeyBytes;
  
  private final int sharedKeyBytes;
  
  private SNTRUPrimeParameters(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    this.name = paramString;
    this.p = paramInt1;
    this.q = paramInt2;
    this.w = paramInt3;
    this.rqPolynomialBytes = paramInt4;
    this.roundedPolynomialBytes = paramInt5;
    this.publicKeyBytes = paramInt6;
    this.privateKeyBytes = paramInt7;
    this.sharedKeyBytes = paramInt8;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getP() {
    return this.p;
  }
  
  public int getQ() {
    return this.q;
  }
  
  public int getW() {
    return this.w;
  }
  
  public int getPublicKeyBytes() {
    return this.publicKeyBytes;
  }
  
  public int getPrivateKeyBytes() {
    return this.privateKeyBytes;
  }
  
  public int getRqPolynomialBytes() {
    return this.rqPolynomialBytes;
  }
  
  public int getRoundedPolynomialBytes() {
    return this.roundedPolynomialBytes;
  }
  
  public int getSessionKeySize() {
    return this.sharedKeyBytes * 8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\ntruprime\SNTRUPrimeParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */