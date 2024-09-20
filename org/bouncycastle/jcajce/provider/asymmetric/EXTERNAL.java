package org.bouncycastle.jcajce.provider.asymmetric;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bc.ExternalValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.ExternalPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

public class EXTERNAL {
  private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL";
  
  private static final Map<String, String> externalAttributes = new HashMap<>();
  
  private static AsymmetricKeyInfoConverter baseConverter;
  
  static {
    externalAttributes.put("SupportedKeyClasses", "org.bouncycastle.jcajce.ExternalPublicKey");
    externalAttributes.put("SupportedKeyFormats", "X.509");
  }
  
  private static class ExternalKeyInfoConverter implements AsymmetricKeyInfoConverter {
    private final ConfigurableProvider provider;
    
    public ExternalKeyInfoConverter(ConfigurableProvider param1ConfigurableProvider) {
      this.provider = param1ConfigurableProvider;
    }
    
    public PrivateKey generatePrivate(PrivateKeyInfo param1PrivateKeyInfo) throws IOException {
      throw new UnsupportedOperationException("no support for private key");
    }
    
    public PublicKey generatePublic(SubjectPublicKeyInfo param1SubjectPublicKeyInfo) throws IOException {
      ExternalValue externalValue = ExternalValue.getInstance(param1SubjectPublicKeyInfo.parsePublicKey());
      return (PublicKey)new ExternalPublicKey(externalValue);
    }
  }
  
  public static class KeyFactory extends BaseKeyFactorySpi {
    protected Key engineTranslateKey(Key param1Key) throws InvalidKeyException {
      try {
        if (param1Key instanceof PrivateKey)
          return generatePrivate(PrivateKeyInfo.getInstance(param1Key.getEncoded())); 
        if (param1Key instanceof PublicKey)
          return generatePublic(SubjectPublicKeyInfo.getInstance(param1Key.getEncoded())); 
      } catch (IOException iOException) {
        throw new InvalidKeyException("key could not be parsed: " + iOException.getMessage());
      } 
      throw new InvalidKeyException("key not recognized");
    }
    
    public PrivateKey generatePrivate(PrivateKeyInfo param1PrivateKeyInfo) throws IOException {
      return EXTERNAL.baseConverter.generatePrivate(param1PrivateKeyInfo);
    }
    
    public PublicKey generatePublic(SubjectPublicKeyInfo param1SubjectPublicKeyInfo) throws IOException {
      return EXTERNAL.baseConverter.generatePublic(param1SubjectPublicKeyInfo);
    }
  }
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.EXTERNAL", "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory");
      param1ConfigurableProvider.addAlgorithm("KeyFactory." + BCObjectIdentifiers.external_value, "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory");
      param1ConfigurableProvider.addAlgorithm("KeyFactory.OID." + BCObjectIdentifiers.external_value, "org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL$KeyFactory");
      EXTERNAL.baseConverter = new EXTERNAL.ExternalKeyInfoConverter(param1ConfigurableProvider);
      param1ConfigurableProvider.addKeyInfoConverter(BCObjectIdentifiers.external_value, EXTERNAL.baseConverter);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\EXTERNAL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */