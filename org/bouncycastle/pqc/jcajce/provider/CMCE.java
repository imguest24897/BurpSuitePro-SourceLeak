package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi;

public class CMCE {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.cmce.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyPairGeneratorSpi");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyGeneratorSpi");
      CMCEKeyFactorySpi cMCEKeyFactorySpi = new CMCEKeyFactorySpi();
      param1ConfigurableProvider.addAlgorithm("Cipher.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$Base");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.pqc_kem_mceliece, "CMCE");
      addCipherAlgorithm(param1ConfigurableProvider, "mceliece348864", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE348864", BCObjectIdentifiers.mceliece348864_r3);
      addCipherAlgorithm(param1ConfigurableProvider, "mceliece460896", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE460896", BCObjectIdentifiers.mceliece460896_r3);
      addCipherAlgorithm(param1ConfigurableProvider, "mceliece6688128", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE6688128", BCObjectIdentifiers.mceliece6688128_r3);
      addCipherAlgorithm(param1ConfigurableProvider, "mceliece6960119", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE6960119", BCObjectIdentifiers.mceliece6960119_r3);
      addCipherAlgorithm(param1ConfigurableProvider, "mceliece8192128", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$MCE8192128", BCObjectIdentifiers.mceliece8192128_r3);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.pqc_kem_mceliece, "CMCE", (AsymmetricKeyInfoConverter)cMCEKeyFactorySpi);
      registerOidAlgorithmParameters(param1ConfigurableProvider, BCObjectIdentifiers.pqc_kem_mceliece, "CMCE");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\CMCE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */