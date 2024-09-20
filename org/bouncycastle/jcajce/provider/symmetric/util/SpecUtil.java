package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.spec.AlgorithmParameterSpec;

class SpecUtil {
  static AlgorithmParameterSpec extractSpec(AlgorithmParameters paramAlgorithmParameters, Class[] paramArrayOfClass) {
    try {
      return paramAlgorithmParameters.getParameterSpec(AlgorithmParameterSpec.class);
    } catch (Exception exception) {
      for (byte b = 0; b != paramArrayOfClass.length; b++) {
        if (paramArrayOfClass[b] != null)
          try {
            return paramAlgorithmParameters.getParameterSpec(paramArrayOfClass[b]);
          } catch (Exception exception1) {} 
      } 
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetri\\util\SpecUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */