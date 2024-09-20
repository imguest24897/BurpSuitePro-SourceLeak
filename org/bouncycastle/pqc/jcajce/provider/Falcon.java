package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi;

public class Falcon {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.falcon.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi");
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon512", BCObjectIdentifiers.falcon_512, (AsymmetricKeyInfoConverter)new FalconKeyFactorySpi.Falcon512());
      addKeyFactoryAlgorithm(param1ConfigurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi$Falcon1024", BCObjectIdentifiers.falcon_1024, (AsymmetricKeyInfoConverter)new FalconKeyFactorySpi.Falcon1024());
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi");
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon512", BCObjectIdentifiers.falcon_512);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyPairGeneratorSpi$Falcon1024", BCObjectIdentifiers.falcon_1024);
      addSignatureAlgorithm(param1ConfigurableProvider, "FALCON", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Base", BCObjectIdentifiers.falcon);
      addSignatureAlgorithm(param1ConfigurableProvider, "FALCON-512", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon512", BCObjectIdentifiers.falcon_512);
      addSignatureAlgorithm(param1ConfigurableProvider, "FALCON-1024", "org.bouncycastle.pqc.jcajce.provider.falcon.SignatureSpi$Falcon1024", BCObjectIdentifiers.falcon_1024);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\Falcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */