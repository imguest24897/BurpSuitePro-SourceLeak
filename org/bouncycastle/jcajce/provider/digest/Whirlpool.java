package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.internal.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

public class Whirlpool {
  public static class Digest extends BCMessageDigest implements Cloneable {
    public Digest() {
      super((org.bouncycastle.crypto.Digest)new WhirlpoolDigest());
    }
    
    public Object clone() throws CloneNotSupportedException {
      Digest digest = (Digest)super.clone();
      digest.digest = (org.bouncycastle.crypto.Digest)new WhirlpoolDigest((WhirlpoolDigest)this.digest);
      return digest;
    }
  }
  
  public static class HashMac extends BaseMac {
    public HashMac() {
      super((Mac)new HMac((org.bouncycastle.crypto.Digest)new WhirlpoolDigest()));
    }
  }
  
  public static class KeyGenerator extends BaseKeyGenerator {
    public KeyGenerator() {
      super("HMACWHIRLPOOL", 512, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX = Whirlpool.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("MessageDigest.WHIRLPOOL", PREFIX + "$Digest");
      param1ConfigurableProvider.addAlgorithm("MessageDigest", ISOIECObjectIdentifiers.whirlpool, PREFIX + "$Digest");
      addHMACAlgorithm(param1ConfigurableProvider, "WHIRLPOOL", PREFIX + "$HashMac", PREFIX + "$KeyGenerator");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\digest\Whirlpool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */