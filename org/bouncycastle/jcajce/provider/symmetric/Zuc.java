package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.Zuc128Engine;
import org.bouncycastle.crypto.engines.Zuc256Engine;
import org.bouncycastle.crypto.macs.Zuc128Mac;
import org.bouncycastle.crypto.macs.Zuc256Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

public class Zuc {
  public static class AlgParams extends IvAlgorithmParameters {
    protected String engineToString() {
      return "Zuc IV";
    }
  }
  
  public static class KeyGen128 extends BaseKeyGenerator {
    public KeyGen128() {
      super("ZUC128", 128, new CipherKeyGenerator());
    }
  }
  
  public static class KeyGen256 extends BaseKeyGenerator {
    public KeyGen256() {
      super("ZUC256", 256, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends SymmetricAlgorithmProvider {
    private static final String PREFIX = Zuc.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("Cipher.ZUC-128", PREFIX + "$Zuc128");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.ZUC-128", PREFIX + "$KeyGen128");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.ZUC-128", PREFIX + "$AlgParams");
      param1ConfigurableProvider.addAlgorithm("Cipher.ZUC-256", PREFIX + "$Zuc256");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.ZUC-256", PREFIX + "$KeyGen256");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.ZUC-256", PREFIX + "$AlgParams");
      param1ConfigurableProvider.addAlgorithm("Mac.ZUC-128", PREFIX + "$ZucMac128");
      param1ConfigurableProvider.addAlgorithm("Mac.ZUC-256", PREFIX + "$ZucMac256");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Mac.ZUC-256-128", "ZUC-256");
      param1ConfigurableProvider.addAlgorithm("Mac.ZUC-256-64", PREFIX + "$ZucMac256_64");
      param1ConfigurableProvider.addAlgorithm("Mac.ZUC-256-32", PREFIX + "$ZucMac256_32");
    }
  }
  
  public static class Zuc128 extends BaseStreamCipher {
    public Zuc128() {
      super((StreamCipher)new Zuc128Engine(), 16, 128);
    }
  }
  
  public static class Zuc256 extends BaseStreamCipher {
    public Zuc256() {
      super((StreamCipher)new Zuc256Engine(), 25, 256);
    }
  }
  
  public static class ZucMac128 extends BaseMac {
    public ZucMac128() {
      super((Mac)new Zuc128Mac());
    }
  }
  
  public static class ZucMac256 extends BaseMac {
    public ZucMac256() {
      super((Mac)new Zuc256Mac(128));
    }
  }
  
  public static class ZucMac256_32 extends BaseMac {
    public ZucMac256_32() {
      super((Mac)new Zuc256Mac(32));
    }
  }
  
  public static class ZucMac256_64 extends BaseMac {
    public ZucMac256_64() {
      super((Mac)new Zuc256Mac(64));
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetric\Zuc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */