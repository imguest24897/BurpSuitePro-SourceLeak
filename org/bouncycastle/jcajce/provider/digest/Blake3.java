package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.Blake3Digest;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

public class Blake3 {
  public static class Blake3_256 extends BCMessageDigest implements Cloneable {
    public Blake3_256() {
      super((Digest)new Blake3Digest(256));
    }
    
    public Object clone() throws CloneNotSupportedException {
      Blake3_256 blake3_256 = (Blake3_256)super.clone();
      blake3_256.digest = (Digest)new Blake3Digest((Blake3Digest)this.digest);
      return blake3_256;
    }
  }
  
  public static class Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX = Blake3.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("MessageDigest.BLAKE3-256", PREFIX + "$Blake3_256");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + MiscObjectIdentifiers.blake3_256, "BLAKE3-256");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\digest\Blake3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */