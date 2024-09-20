package org.bouncycastle.jcajce.provider.util;

import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
  protected void addSignatureAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    paramConfigurableProvider.addAlgorithm("Signature." + paramString1, paramString2);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + paramASN1ObjectIdentifier, paramString1);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + paramASN1ObjectIdentifier, paramString1);
  }
  
  protected void addSignatureAlias(ConfigurableProvider paramConfigurableProvider, String paramString, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + paramASN1ObjectIdentifier, paramString);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + paramASN1ObjectIdentifier, paramString);
  }
  
  protected void addSignatureAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, String paramString3) {
    addSignatureAlgorithm(paramConfigurableProvider, paramString1, paramString2, paramString3, null);
  }
  
  protected void addSignatureAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, String paramString3, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str1 = paramString1 + "WITH" + paramString2;
    String str2 = paramString1 + "with" + paramString2;
    String str3 = paramString1 + "With" + paramString2;
    String str4 = paramString1 + "/" + paramString2;
    paramConfigurableProvider.addAlgorithm("Signature." + str1, paramString3);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + str2, str1);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + str3, str1);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + str4, str1);
    if (paramASN1ObjectIdentifier != null) {
      paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + paramASN1ObjectIdentifier, str1);
      paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + paramASN1ObjectIdentifier, str1);
    } 
  }
  
  protected void addSignatureAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, String paramString3, ASN1ObjectIdentifier paramASN1ObjectIdentifier, Map<String, String> paramMap) {
    String str1 = paramString1 + "WITH" + paramString2;
    String str2 = paramString1 + "with" + paramString2;
    String str3 = paramString1 + "With" + paramString2;
    String str4 = paramString1 + "/" + paramString2;
    paramConfigurableProvider.addAlgorithm("Signature." + str1, paramString3);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + str2, str1);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + str3, str1);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + str4, str1);
    if (paramASN1ObjectIdentifier != null) {
      paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature." + paramASN1ObjectIdentifier, str1);
      paramConfigurableProvider.addAlgorithm("Alg.Alias.Signature.OID." + paramASN1ObjectIdentifier, str1);
    } 
    paramConfigurableProvider.addAttributes("Signature." + str1, paramMap);
  }
  
  protected void addKeyPairGeneratorAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    paramConfigurableProvider.addAlgorithm("KeyPairGenerator." + paramString1, paramString2);
    if (paramASN1ObjectIdentifier != null) {
      paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + paramASN1ObjectIdentifier, paramString1);
      paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.OID." + paramASN1ObjectIdentifier, paramString1);
    } 
  }
  
  protected void addKeyFactoryAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, ASN1ObjectIdentifier paramASN1ObjectIdentifier, AsymmetricKeyInfoConverter paramAsymmetricKeyInfoConverter) {
    paramConfigurableProvider.addAlgorithm("KeyFactory." + paramString1, paramString2);
    if (paramASN1ObjectIdentifier != null) {
      paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + paramASN1ObjectIdentifier, paramString1);
      paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyFactory.OID." + paramASN1ObjectIdentifier, paramString1);
      paramConfigurableProvider.addKeyInfoConverter(paramASN1ObjectIdentifier, paramAsymmetricKeyInfoConverter);
    } 
  }
  
  protected void addKeyGeneratorAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    paramConfigurableProvider.addAlgorithm("KeyGenerator." + paramString1, paramString2);
    if (paramASN1ObjectIdentifier != null) {
      paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + paramASN1ObjectIdentifier, paramString1);
      paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.OID." + paramASN1ObjectIdentifier, paramString1);
    } 
  }
  
  protected void addCipherAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    paramConfigurableProvider.addAlgorithm("Cipher." + paramString1, paramString2);
    if (paramASN1ObjectIdentifier != null) {
      paramConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + paramASN1ObjectIdentifier, paramString1);
      paramConfigurableProvider.addAlgorithm("Alg.Alias.Cipher.OID." + paramASN1ObjectIdentifier, paramString1);
    } 
  }
  
  protected void registerKeyFactoryOid(ConfigurableProvider paramConfigurableProvider, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString, AsymmetricKeyInfoConverter paramAsymmetricKeyInfoConverter) {
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + paramASN1ObjectIdentifier, paramString);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyFactory.OID." + paramASN1ObjectIdentifier, paramString);
    paramConfigurableProvider.addKeyInfoConverter(paramASN1ObjectIdentifier, paramAsymmetricKeyInfoConverter);
  }
  
  protected void registerOid(ConfigurableProvider paramConfigurableProvider, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString, AsymmetricKeyInfoConverter paramAsymmetricKeyInfoConverter) {
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + paramASN1ObjectIdentifier, paramString);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + paramASN1ObjectIdentifier, paramString);
    paramConfigurableProvider.addKeyInfoConverter(paramASN1ObjectIdentifier, paramAsymmetricKeyInfoConverter);
  }
  
  protected void registerOidAlgorithmParameters(ConfigurableProvider paramConfigurableProvider, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    paramConfigurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + paramASN1ObjectIdentifier, paramString);
  }
  
  protected void registerOidAlgorithmParameterGenerator(ConfigurableProvider paramConfigurableProvider, ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    paramConfigurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + paramASN1ObjectIdentifier, paramString);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + paramASN1ObjectIdentifier, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provide\\util\AsymmetricAlgorithmProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */