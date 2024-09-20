package META-INF.versions.15.org.bouncycastle.jcajce.provider.asymmetric.edec;

import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

public class Ed25519 extends KeyFactorySpi {
  public Ed25519() {
    super("Ed25519", false, 112);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\15\org\bouncycastle\jcajce\provider\asymmetric\edec\KeyFactorySpi$Ed25519.class
 * Java compiler version: 15 (59.0)
 * JD-Core Version:       1.1.3
 */