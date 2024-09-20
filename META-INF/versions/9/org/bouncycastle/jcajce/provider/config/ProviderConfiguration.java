package META-INF.versions.9.org.bouncycastle.jcajce.provider.config;

import java.security.spec.DSAParameterSpec;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

public interface ProviderConfiguration {
  ECParameterSpec getEcImplicitlyCa();
  
  DHParameterSpec getDHDefaultParameters(int paramInt);
  
  DSAParameterSpec getDSADefaultParameters(int paramInt);
  
  Set getAcceptableNamedCurves();
  
  Map getAdditionalECParameters();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jcajce\provider\config\ProviderConfiguration.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */