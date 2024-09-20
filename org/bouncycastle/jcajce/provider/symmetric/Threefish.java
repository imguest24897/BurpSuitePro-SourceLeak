package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class Threefish {
  public static class AlgParams_1024 extends IvAlgorithmParameters {
    protected String engineToString() {
      return "Threefish-1024 IV";
    }
  }
  
  public static class AlgParams_256 extends IvAlgorithmParameters {
    protected String engineToString() {
      return "Threefish-256 IV";
    }
  }
  
  public static class AlgParams_512 extends IvAlgorithmParameters {
    protected String engineToString() {
      return "Threefish-512 IV";
    }
  }
  
  public static class CMAC_1024 extends BaseMac {
    public CMAC_1024() {
      super((Mac)new CMac((BlockCipher)new ThreefishEngine(1024)));
    }
  }
  
  public static class CMAC_256 extends BaseMac {
    public CMAC_256() {
      super((Mac)new CMac((BlockCipher)new ThreefishEngine(256)));
    }
  }
  
  public static class CMAC_512 extends BaseMac {
    public CMAC_512() {
      super((Mac)new CMac((BlockCipher)new ThreefishEngine(512)));
    }
  }
  
  public static class ECB_1024 extends BaseBlockCipher {
    public ECB_1024() {
      super((BlockCipher)new ThreefishEngine(1024));
    }
  }
  
  public static class ECB_256 extends BaseBlockCipher {
    public ECB_256() {
      super((BlockCipher)new ThreefishEngine(256));
    }
  }
  
  public static class ECB_512 extends BaseBlockCipher {
    public ECB_512() {
      super((BlockCipher)new ThreefishEngine(512));
    }
  }
  
  public static class KeyGen_1024 extends BaseKeyGenerator {
    public KeyGen_1024() {
      super("Threefish-1024", 1024, new CipherKeyGenerator());
    }
  }
  
  public static class KeyGen_256 extends BaseKeyGenerator {
    public KeyGen_256() {
      super("Threefish-256", 256, new CipherKeyGenerator());
    }
  }
  
  public static class KeyGen_512 extends BaseKeyGenerator {
    public KeyGen_512() {
      super("Threefish-512", 512, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends AlgorithmProvider {
    private static final String PREFIX = Threefish.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("Mac.Threefish-256CMAC", PREFIX + "$CMAC_256");
      param1ConfigurableProvider.addAlgorithm("Mac.Threefish-512CMAC", PREFIX + "$CMAC_512");
      param1ConfigurableProvider.addAlgorithm("Mac.Threefish-1024CMAC", PREFIX + "$CMAC_1024");
      param1ConfigurableProvider.addAlgorithm("Cipher.Threefish-256", PREFIX + "$ECB_256");
      param1ConfigurableProvider.addAlgorithm("Cipher.Threefish-512", PREFIX + "$ECB_512");
      param1ConfigurableProvider.addAlgorithm("Cipher.Threefish-1024", PREFIX + "$ECB_1024");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.Threefish-256", PREFIX + "$KeyGen_256");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.Threefish-512", PREFIX + "$KeyGen_512");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.Threefish-1024", PREFIX + "$KeyGen_1024");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.Threefish-256", PREFIX + "$AlgParams_256");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.Threefish-512", PREFIX + "$AlgParams_512");
      param1ConfigurableProvider.addAlgorithm("AlgorithmParameters.Threefish-1024", PREFIX + "$AlgParams_1024");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetric\Threefish.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */