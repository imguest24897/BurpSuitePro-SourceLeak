package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi;

public class Dilithium {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.dilithium.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi");
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base2", BCObjectIdentifiers.dilithium2, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi.Base2());
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base3", BCObjectIdentifiers.dilithium3, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi.Base3());
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base5", BCObjectIdentifiers.dilithium5, (AsymmetricKeyInfoConverter)new DilithiumKeyFactorySpi.Base5());
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi");
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base2", BCObjectIdentifiers.dilithium2);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base3", BCObjectIdentifiers.dilithium3);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base5", BCObjectIdentifiers.dilithium5);
      addSignatureAlgorithm(param1ConfigurableProvider, "DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base", BCObjectIdentifiers.dilithium);
      addSignatureAlgorithm(param1ConfigurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base2", BCObjectIdentifiers.dilithium2);
      addSignatureAlgorithm(param1ConfigurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base3", BCObjectIdentifiers.dilithium3);
      addSignatureAlgorithm(param1ConfigurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base5", BCObjectIdentifiers.dilithium5);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\Dilithium.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */