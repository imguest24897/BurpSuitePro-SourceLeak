package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyFactorySpi;

public class NTRUPrime {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntruprime.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyPairGeneratorSpi");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyGeneratorSpi");
      NTRULPRimeKeyFactorySpi nTRULPRimeKeyFactorySpi = new NTRULPRimeKeyFactorySpi();
      param1ConfigurableProvider.addAlgorithm("Cipher.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeCipherSpi$Base");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.pqc_kem_ntrulprime, "NTRU");
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntrulpr653, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntrulpr761, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntrulpr857, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntrulpr953, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntrulpr1013, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.ntrulpr1277, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
      param1ConfigurableProvider.addAlgorithm("KeyFactory.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyPairGeneratorSpi");
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyGeneratorSpi");
      SNTRUPrimeKeyFactorySpi sNTRUPrimeKeyFactorySpi = new SNTRUPrimeKeyFactorySpi();
      param1ConfigurableProvider.addAlgorithm("Cipher.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeCipherSpi$Base");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.pqc_kem_sntruprime, "NTRU");
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.sntrup653, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.sntrup761, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.sntrup857, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.sntrup953, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.sntrup1013, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.sntrup1277, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\NTRUPrime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */