package META-INF.versions.9.org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.pqc.crypto.rainbow.Version;

public class RainbowParameters implements CipherParameters {
  public static final org.bouncycastle.pqc.crypto.rainbow.RainbowParameters rainbowIIIclassic = new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters("rainbow-III-classic", 3, Version.CLASSIC);
  
  public static final org.bouncycastle.pqc.crypto.rainbow.RainbowParameters rainbowIIIcircumzenithal = new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters("rainbow-III-circumzenithal", 3, Version.CIRCUMZENITHAL);
  
  public static final org.bouncycastle.pqc.crypto.rainbow.RainbowParameters rainbowIIIcompressed = new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters("rainbow-III-compressed", 3, Version.COMPRESSED);
  
  public static final org.bouncycastle.pqc.crypto.rainbow.RainbowParameters rainbowVclassic = new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters("rainbow-V-classic", 5, Version.CLASSIC);
  
  public static final org.bouncycastle.pqc.crypto.rainbow.RainbowParameters rainbowVcircumzenithal = new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters("rainbow-V-circumzenithal", 5, Version.CIRCUMZENITHAL);
  
  public static final org.bouncycastle.pqc.crypto.rainbow.RainbowParameters rainbowVcompressed = new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters("rainbow-V-compressed", 5, Version.COMPRESSED);
  
  private final int v1;
  
  private final int v2;
  
  private final int o1;
  
  private final int o2;
  
  private final int n;
  
  private final int m;
  
  private static final int len_pkseed = 32;
  
  private static final int len_skseed = 32;
  
  private static final int len_salt = 16;
  
  private final Digest hash_algo;
  
  private final Version version;
  
  private final String name;
  
  private RainbowParameters(String paramString, int paramInt, Version paramVersion) {
    this.name = paramString;
    switch (paramInt) {
      case 3:
        this.v1 = 68;
        this.o1 = 32;
        this.o2 = 48;
        this.hash_algo = (Digest)new SHA384Digest();
        break;
      case 5:
        this.v1 = 96;
        this.o1 = 36;
        this.o2 = 64;
        this.hash_algo = (Digest)new SHA512Digest();
        break;
      default:
        throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
    } 
    this.v2 = this.v1 + this.o1;
    this.n = this.v1 + this.o1 + this.o2;
    this.m = this.o1 + this.o2;
    this.version = paramVersion;
  }
  
  public String getName() {
    return this.name;
  }
  
  Version getVersion() {
    return this.version;
  }
  
  int getV1() {
    return this.v1;
  }
  
  int getO1() {
    return this.o1;
  }
  
  int getO2() {
    return this.o2;
  }
  
  Digest getHash_algo() {
    return this.hash_algo;
  }
  
  int getV2() {
    return this.v2;
  }
  
  int getN() {
    return this.n;
  }
  
  int getM() {
    return this.m;
  }
  
  int getLen_pkseed() {
    return 32;
  }
  
  int getLen_skseed() {
    return 32;
  }
  
  int getLen_salt() {
    return 16;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\rainbow\RainbowParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */