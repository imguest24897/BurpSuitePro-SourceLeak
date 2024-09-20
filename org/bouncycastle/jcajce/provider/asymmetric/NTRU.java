package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

public class NTRU {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntru.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyPairGeneratorSpi");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyGeneratorSpi");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + BCObjectIdentifiers.pqc_kem_ntru, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + BCObjectIdentifiers.ntruhps2048509, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + BCObjectIdentifiers.ntruhps2048677, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + BCObjectIdentifiers.ntruhps4096821, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + BCObjectIdentifiers.ntruhps40961229, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + BCObjectIdentifiers.ntruhrss701, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + BCObjectIdentifiers.ntruhrss1373, "NTRU");
      NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
      param1ConfigurableProvider.addAlgorithm("Cipher.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUCipherSpi$Base");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.pqc_kem_ntru, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.ntruhps2048509, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.ntruhps2048677, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.ntruhps4096821, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.ntruhps40961229, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.ntruhrss701, "NTRU");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.ntruhrss1373, "NTRU");
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.pqc_kem_ntru, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntruhps2048509, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntruhps2048677, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntruhps4096821, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntruhps40961229, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntruhrss701, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntruhrss1373, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\NTRU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */