package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

abstract class DigestAlgorithmProvider extends AlgorithmProvider {
  protected void addHMACAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, String paramString3) {
    String str = "HMAC" + paramString1;
    paramConfigurableProvider.addAlgorithm("Mac." + str, paramString2);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + paramString1, str);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + paramString1, str);
    paramConfigurableProvider.addAlgorithm("KeyGenerator." + str, paramString3);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + paramString1, str);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + paramString1, str);
  }
  
  protected void addKMACAlgorithm(ConfigurableProvider paramConfigurableProvider, String paramString1, String paramString2, String paramString3) {
    String str = "KMAC" + paramString1;
    paramConfigurableProvider.addAlgorithm("Mac." + str, paramString2);
    paramConfigurableProvider.addAlgorithm("KeyGenerator." + str, paramString3);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + paramString1, str);
  }
  
  protected void addHMACAlias(ConfigurableProvider paramConfigurableProvider, String paramString, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = "HMAC" + paramString;
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Mac." + paramASN1ObjectIdentifier, str);
    paramConfigurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + paramASN1ObjectIdentifier, str);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\digest\DigestAlgorithmProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */