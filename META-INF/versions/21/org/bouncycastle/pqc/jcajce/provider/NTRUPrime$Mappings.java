package META-INF.versions.21.org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.NTRUPrime;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyFactorySpi;

public class Mappings extends AsymmetricAlgorithmProvider {
  public void configure(ConfigurableProvider paramConfigurableProvider) {
    paramConfigurableProvider.addAlgorithm("KeyFactory.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyFactorySpi");
    paramConfigurableProvider.addAlgorithm("KeyPairGenerator.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyPairGeneratorSpi");
    paramConfigurableProvider.addAlgorithm("KeyGenerator.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyGeneratorSpi");
    NTRULPRimeKeyFactorySpi nTRULPRimeKeyFactorySpi = new NTRULPRimeKeyFactorySpi();
    paramConfigurableProvider.addAlgorithm("Cipher.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeCipherSpi$Base");
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + String.valueOf(BCObjectIdentifiers.pqc_kem_ntrulprime), "NTRU");
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntrulpr653, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntrulpr761, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntrulpr857, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntrulpr953, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntrulpr1013, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntrulpr1277, "NTRULPRIME", (AsymmetricKeyInfoConverter)nTRULPRimeKeyFactorySpi);
    paramConfigurableProvider.addAlgorithm("KeyFactory.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyFactorySpi");
    paramConfigurableProvider.addAlgorithm("KeyPairGenerator.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyPairGeneratorSpi");
    paramConfigurableProvider.addAlgorithm("KeyGenerator.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyGeneratorSpi");
    SNTRUPrimeKeyFactorySpi sNTRUPrimeKeyFactorySpi = new SNTRUPrimeKeyFactorySpi();
    paramConfigurableProvider.addAlgorithm("Cipher.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeCipherSpi$Base");
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + String.valueOf(BCObjectIdentifiers.pqc_kem_sntruprime), "NTRU");
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.sntrup653, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.sntrup761, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.sntrup857, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.sntrup953, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.sntrup1013, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.sntrup1277, "SNTRUPRIME", (AsymmetricKeyInfoConverter)sNTRUPrimeKeyFactorySpi);
    paramConfigurableProvider.addAlgorithm("Kem.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKEMSpi");
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Kem." + String.valueOf(BCObjectIdentifiers.pqc_kem_sntruprime), "SNTRUPRIME");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\org\bouncycastle\pqc\jcajce\provider\NTRUPrime$Mappings.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */