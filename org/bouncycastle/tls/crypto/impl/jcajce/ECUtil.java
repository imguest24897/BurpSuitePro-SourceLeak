package org.bouncycastle.tls.crypto.impl.jcajce;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.interfaces.ECKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.ec.ECCurve;

class ECUtil {
  static ECCurve convertCurve(EllipticCurve paramEllipticCurve, BigInteger paramBigInteger, int paramInt) {
    ECField eCField = paramEllipticCurve.getField();
    BigInteger bigInteger1 = paramEllipticCurve.getA();
    BigInteger bigInteger2 = paramEllipticCurve.getB();
    if (eCField instanceof ECFieldFp)
      return (ECCurve)new ECCurve.Fp(((ECFieldFp)eCField).getP(), bigInteger1, bigInteger2, paramBigInteger, BigInteger.valueOf(paramInt)); 
    ECFieldF2m eCFieldF2m = (ECFieldF2m)eCField;
    int i = eCFieldF2m.getM();
    int[] arrayOfInt = convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
    return (ECCurve)new ECCurve.F2m(i, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], bigInteger1, bigInteger2, paramBigInteger, BigInteger.valueOf(paramInt));
  }
  
  static int[] convertMidTerms(int[] paramArrayOfint) {
    int[] arrayOfInt = new int[3];
    if (paramArrayOfint.length == 1) {
      arrayOfInt[0] = paramArrayOfint[0];
    } else {
      if (paramArrayOfint.length != 3)
        throw new IllegalArgumentException("Only Trinomials and pentanomials supported"); 
      if (paramArrayOfint[0] < paramArrayOfint[1] && paramArrayOfint[0] < paramArrayOfint[2]) {
        arrayOfInt[0] = paramArrayOfint[0];
        if (paramArrayOfint[1] < paramArrayOfint[2]) {
          arrayOfInt[1] = paramArrayOfint[1];
          arrayOfInt[2] = paramArrayOfint[2];
        } else {
          arrayOfInt[1] = paramArrayOfint[2];
          arrayOfInt[2] = paramArrayOfint[1];
        } 
      } else if (paramArrayOfint[1] < paramArrayOfint[2]) {
        arrayOfInt[0] = paramArrayOfint[1];
        if (paramArrayOfint[0] < paramArrayOfint[2]) {
          arrayOfInt[1] = paramArrayOfint[0];
          arrayOfInt[2] = paramArrayOfint[2];
        } else {
          arrayOfInt[1] = paramArrayOfint[2];
          arrayOfInt[2] = paramArrayOfint[0];
        } 
      } else {
        arrayOfInt[0] = paramArrayOfint[2];
        if (paramArrayOfint[0] < paramArrayOfint[1]) {
          arrayOfInt[1] = paramArrayOfint[0];
          arrayOfInt[2] = paramArrayOfint[1];
        } else {
          arrayOfInt[1] = paramArrayOfint[1];
          arrayOfInt[2] = paramArrayOfint[0];
        } 
      } 
    } 
    return arrayOfInt;
  }
  
  static AlgorithmParameterSpec createInitSpec(String paramString) {
    return new ECGenParameterSpec(paramString);
  }
  
  static AlgorithmParameters getAlgorithmParameters(JcaTlsCrypto paramJcaTlsCrypto, String paramString) {
    return getAlgorithmParameters(paramJcaTlsCrypto, new ECGenParameterSpec(paramString));
  }
  
  static AlgorithmParameters getAlgorithmParameters(JcaTlsCrypto paramJcaTlsCrypto, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    try {
      AlgorithmParameters algorithmParameters = paramJcaTlsCrypto.getHelper().createAlgorithmParameters("EC");
      algorithmParameters.init(paramAlgorithmParameterSpec);
      ECParameterSpec eCParameterSpec = algorithmParameters.<ECParameterSpec>getParameterSpec(ECParameterSpec.class);
      if (null != eCParameterSpec)
        return algorithmParameters; 
    } catch (AssertionError assertionError) {
    
    } catch (Exception exception) {}
    return null;
  }
  
  static ECParameterSpec getECParameterSpec(JcaTlsCrypto paramJcaTlsCrypto, String paramString) {
    return getECParameterSpec(paramJcaTlsCrypto, createInitSpec(paramString));
  }
  
  static ECParameterSpec getECParameterSpec(JcaTlsCrypto paramJcaTlsCrypto, AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    KeyPairGenerator keyPairGenerator;
    try {
      keyPairGenerator = paramJcaTlsCrypto.getHelper().createKeyPairGenerator("EC");
      keyPairGenerator.initialize(paramAlgorithmParameterSpec, paramJcaTlsCrypto.getSecureRandom());
    } catch (AssertionError assertionError) {
      return null;
    } catch (Exception exception) {
      return null;
    } 
    try {
      AlgorithmParameters algorithmParameters = paramJcaTlsCrypto.getHelper().createAlgorithmParameters("EC");
      algorithmParameters.init(paramAlgorithmParameterSpec);
      ECParameterSpec eCParameterSpec = algorithmParameters.<ECParameterSpec>getParameterSpec(ECParameterSpec.class);
      if (null != eCParameterSpec)
        return eCParameterSpec; 
    } catch (AssertionError assertionError) {
    
    } catch (Exception exception) {}
    try {
      KeyPair keyPair = keyPairGenerator.generateKeyPair();
      return ((ECKey)keyPair.getPrivate()).getParams();
    } catch (AssertionError assertionError) {
    
    } catch (Exception exception) {}
    return null;
  }
  
  static boolean isECPrivateKey(PrivateKey paramPrivateKey) {
    return (paramPrivateKey instanceof java.security.interfaces.ECPrivateKey || "EC".equalsIgnoreCase(paramPrivateKey.getAlgorithm()));
  }
  
  static boolean isCurveSupported(JcaTlsCrypto paramJcaTlsCrypto, String paramString) {
    return (null != paramString && isCurveSupported(paramJcaTlsCrypto, new ECGenParameterSpec(paramString)));
  }
  
  static boolean isCurveSupported(JcaTlsCrypto paramJcaTlsCrypto, ECGenParameterSpec paramECGenParameterSpec) {
    return (null != getECParameterSpec(paramJcaTlsCrypto, paramECGenParameterSpec));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\ECUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */