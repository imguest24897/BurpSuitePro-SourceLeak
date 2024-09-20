package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi;

public class Rainbow {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.rainbow.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.RAINBOW", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.RAINBOW", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi");
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "RAINBOW-III-CLASSIC", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi$RainbowIIIclassic", BCObjectIdentifiers.rainbow_III_classic);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "RAINBOW-III-CIRCUMZENITHAL", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi$RainbowIIIcircum", BCObjectIdentifiers.rainbow_III_circumzenithal);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "RAINBOW-III-COMPRESSED", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi$RainbowIIIcomp", BCObjectIdentifiers.rainbow_III_compressed);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "RAINBOW-V-CLASSIC", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi$RainbowVclassic", BCObjectIdentifiers.rainbow_V_classic);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "RAINBOW-V-CIRCUMZENITHAL", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi$RainbowVcircum", BCObjectIdentifiers.rainbow_V_circumzenithal);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "RAINBOW-V-COMPRESSED", "org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi$RainbowVcomp", BCObjectIdentifiers.rainbow_V_compressed);
      addSignatureAlgorithm(param1ConfigurableProvider, "RAINBOW", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$Base", BCObjectIdentifiers.rainbow);
      addSignatureAlgorithm(param1ConfigurableProvider, "RAINBOW-III-CLASSIC", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$RainbowIIIclassic", BCObjectIdentifiers.rainbow_III_classic);
      addSignatureAlgorithm(param1ConfigurableProvider, "RAINBOW-III-CIRCUMZENITHAL", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$RainbowIIIcircum", BCObjectIdentifiers.rainbow_III_circumzenithal);
      addSignatureAlgorithm(param1ConfigurableProvider, "RAINBOW-III-COMPRESSED", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$RainbowIIIcomp", BCObjectIdentifiers.rainbow_III_compressed);
      addSignatureAlgorithm(param1ConfigurableProvider, "RAINBOW-V-CLASSIC", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$RainbowVclassic", BCObjectIdentifiers.rainbow_V_classic);
      addSignatureAlgorithm(param1ConfigurableProvider, "RAINBOW-V-CIRCUMZENITHAL", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$RainbowVcircum", BCObjectIdentifiers.rainbow_V_circumzenithal);
      addSignatureAlgorithm(param1ConfigurableProvider, "RAINBOW-v-COMPRESSED", "org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi$RainbowVcomp", BCObjectIdentifiers.rainbow_V_compressed);
      RainbowKeyFactorySpi rainbowKeyFactorySpi = new RainbowKeyFactorySpi();
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.rainbow_III_classic, "RAINBOW", (AsymmetricKeyInfoConverter)rainbowKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.rainbow_III_circumzenithal, "RAINBOW", (AsymmetricKeyInfoConverter)rainbowKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.rainbow_III_compressed, "RAINBOW", (AsymmetricKeyInfoConverter)rainbowKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.rainbow_V_classic, "RAINBOW", (AsymmetricKeyInfoConverter)rainbowKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.rainbow_V_circumzenithal, "RAINBOW", (AsymmetricKeyInfoConverter)rainbowKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.rainbow_V_compressed, "RAINBOW", (AsymmetricKeyInfoConverter)rainbowKeyFactorySpi);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\Rainbow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */