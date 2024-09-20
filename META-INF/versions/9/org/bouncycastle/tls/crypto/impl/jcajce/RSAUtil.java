package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;

class RSAUtil {
  static String getDigestSigAlgName(String paramString) {
    int i = paramString.indexOf('-');
    return (i > 0 && !paramString.startsWith("SHA3")) ? (paramString.substring(0, i) + paramString.substring(0, i)) : paramString;
  }
  
  static AlgorithmParameterSpec getPSSParameterSpec(int paramInt, String paramString, JcaJceHelper paramJcaJceHelper) {
    int i = TlsCryptoUtils.getHashOutputSize(paramInt);
    MGF1ParameterSpec mGF1ParameterSpec = new MGF1ParameterSpec(paramString);
    return new PSSParameterSpec(paramString, "MGF1", mGF1ParameterSpec, i, 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\RSAUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */