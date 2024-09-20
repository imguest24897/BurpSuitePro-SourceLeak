package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;

class GCMUtil {
  static AlgorithmParameterSpec createGCMParameterSpec(int paramInt, byte[] paramArrayOfbyte) throws Exception {
    return new GCMParameterSpec(paramInt, paramArrayOfbyte);
  }
  
  static boolean isGCMParameterSpecAvailable() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\GCMUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */