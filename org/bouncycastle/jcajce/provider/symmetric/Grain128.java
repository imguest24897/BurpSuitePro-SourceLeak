package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.Grain128Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

public final class Grain128 {
  public static class Base extends BaseStreamCipher {
    public Base() {
      super((StreamCipher)new Grain128Engine(), 12);
    }
  }
  
  public static class KeyGen extends BaseKeyGenerator {
    public KeyGen() {
      super("Grain128", 128, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends AlgorithmProvider {
    private static final String PREFIX = Grain128.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("Cipher.Grain128", PREFIX + "$Base");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.Grain128", PREFIX + "$KeyGen");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetric\Grain128.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */