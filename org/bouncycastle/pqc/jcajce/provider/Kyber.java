package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi;

public class Kyber {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.kyber.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi");
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber512", BCObjectIdentifiers.kyber512, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi.Kyber512());
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber768", BCObjectIdentifiers.kyber768, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi.Kyber768());
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber1024", BCObjectIdentifiers.kyber1024, (AsymmetricKeyInfoConverter)new KyberKeyFactorySpi.Kyber1024());
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi");
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber512", BCObjectIdentifiers.kyber512);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber768", BCObjectIdentifiers.kyber768);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber1024", BCObjectIdentifiers.kyber1024);
      param1ConfigurableProvider.addAlgorithm("KeyGenerator.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi");
      addKeyGeneratorAlgorithm(param1ConfigurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber512", BCObjectIdentifiers.kyber512);
      addKeyGeneratorAlgorithm(param1ConfigurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber768", BCObjectIdentifiers.kyber768);
      addKeyGeneratorAlgorithm(param1ConfigurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber1024", BCObjectIdentifiers.kyber1024);
      KyberKeyFactorySpi kyberKeyFactorySpi = new KyberKeyFactorySpi();
      param1ConfigurableProvider.addAlgorithm("Cipher.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Base");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + BCObjectIdentifiers.pqc_kem_kyber, "KYBER");
      addCipherAlgorithm(param1ConfigurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber512", BCObjectIdentifiers.kyber512);
      addCipherAlgorithm(param1ConfigurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber768", BCObjectIdentifiers.kyber768);
      addCipherAlgorithm(param1ConfigurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber1024", BCObjectIdentifiers.kyber1024);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.pqc_kem_kyber, "KYBER", (AsymmetricKeyInfoConverter)kyberKeyFactorySpi);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\Kyber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */