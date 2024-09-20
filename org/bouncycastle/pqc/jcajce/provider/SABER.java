package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyFactorySpi;

public class SABER {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.saber.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyPairGeneratorSpi");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERKeyGeneratorSpi");
      SABERKeyFactorySpi sABERKeyFactorySpi = new SABERKeyFactorySpi();
      param1ConfigurableProvider.addAlgorithm("Cipher.SABER", "org.bouncycastle.pqc.jcajce.provider.saber.SABERCipherSpi$Base");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.pqc_kem_saber, "SABER");
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.pqc_kem_saber, "SABER", (AsymmetricKeyInfoConverter)sABERKeyFactorySpi);
      registerOidAlgorithmParameters(param1ConfigurableProvider, BCObjectIdentifiers.pqc_kem_saber, "SABER");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\SABER.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */