package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeSignaturesConstants;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public class CompositeSignatures {
  private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.";
  
  private static final Map<String, String> compositesAttributes = new HashMap<>();
  
  static {
    compositesAttributes.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
    compositesAttributes.put("SupportedKeyFormats", "PKCS#8|X.509");
  }
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      for (ASN1ObjectIdentifier aSN1ObjectIdentifier : CompositeSignaturesConstants.supportedIdentifiers) {
        CompositeSignaturesConstants.CompositeName compositeName = (CompositeSignaturesConstants.CompositeName)CompositeSignaturesConstants.ASN1IdentifierAlgorithmNameMap.get(aSN1ObjectIdentifier);
        param1ConfigurableProvider.addAlgorithm("KeyFactory." + compositeName.getId(), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi");
        param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyFactory", aSN1ObjectIdentifier, compositeName.getId());
        param1ConfigurableProvider.addAlgorithm("KeyPairGenerator." + compositeName.getId(), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyPairGeneratorSpi$" + compositeName);
        param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator", aSN1ObjectIdentifier, compositeName.getId());
        param1ConfigurableProvider.addAlgorithm("Signature." + compositeName.getId(), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$" + compositeName);
        param1ConfigurableProvider.addAlgorithm("Alg.Alias.Signature", aSN1ObjectIdentifier, compositeName.getId());
        param1ConfigurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, (AsymmetricKeyInfoConverter)new KeyFactorySpi());
      } 
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\CompositeSignatures.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */