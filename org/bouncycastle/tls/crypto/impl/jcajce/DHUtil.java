package org.bouncycastle.tls.crypto.impl.jcajce;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jcajce.spec.DHExtendedPublicKeySpec;
import org.bouncycastle.tls.crypto.DHGroup;

class DHUtil {
  static AlgorithmParameterSpec createInitSpec(DHGroup paramDHGroup) {
    return (AlgorithmParameterSpec)new DHDomainParameterSpec(paramDHGroup.getP(), paramDHGroup.getQ(), paramDHGroup.getG(), paramDHGroup.getL());
  }
  
  static KeySpec createPublicKeySpec(BigInteger paramBigInteger, DHParameterSpec paramDHParameterSpec) {
    return (KeySpec)new DHExtendedPublicKeySpec(paramBigInteger, paramDHParameterSpec);
  }
  
  static AlgorithmParameters getAlgorithmParameters(JcaTlsCrypto paramJcaTlsCrypto, DHGroup paramDHGroup) {
    return getAlgorithmParameters(paramJcaTlsCrypto, createInitSpec(paramDHGroup));
  }
  
  static AlgorithmParameters getAlgorithmParameters(JcaTlsCrypto paramJcaTlsCrypto, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    try {
      AlgorithmParameters algorithmParameters = paramJcaTlsCrypto.getHelper().createAlgorithmParameters("DiffieHellman");
      algorithmParameters.init(paramAlgorithmParameterSpec);
      DHParameterSpec dHParameterSpec = algorithmParameters.<DHParameterSpec>getParameterSpec(DHParameterSpec.class);
      if (null != dHParameterSpec)
        return algorithmParameters; 
    } catch (AssertionError assertionError) {
    
    } catch (Exception exception) {}
    return null;
  }
  
  static DHParameterSpec getDHParameterSpec(JcaTlsCrypto paramJcaTlsCrypto, DHGroup paramDHGroup) {
    return getDHParameterSpec(paramJcaTlsCrypto, createInitSpec(paramDHGroup));
  }
  
  static DHParameterSpec getDHParameterSpec(JcaTlsCrypto paramJcaTlsCrypto, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    try {
      AlgorithmParameters algorithmParameters = paramJcaTlsCrypto.getHelper().createAlgorithmParameters("DiffieHellman");
      algorithmParameters.init(paramAlgorithmParameterSpec);
      DHParameterSpec dHParameterSpec = algorithmParameters.<DHParameterSpec>getParameterSpec(DHParameterSpec.class);
      if (null != dHParameterSpec)
        return dHParameterSpec; 
    } catch (AssertionError assertionError) {
    
    } catch (Exception exception) {}
    return null;
  }
  
  static BigInteger getQ(DHParameterSpec paramDHParameterSpec) {
    return (paramDHParameterSpec instanceof DHDomainParameterSpec) ? ((DHDomainParameterSpec)paramDHParameterSpec).getQ() : null;
  }
  
  static boolean isGroupSupported(JcaTlsCrypto paramJcaTlsCrypto, DHGroup paramDHGroup) {
    return (null != paramDHGroup && null != getDHParameterSpec(paramJcaTlsCrypto, paramDHGroup));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\DHUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */