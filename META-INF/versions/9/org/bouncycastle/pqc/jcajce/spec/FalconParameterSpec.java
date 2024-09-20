package META-INF.versions.9.org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.util.Strings;

public class FalconParameterSpec implements AlgorithmParameterSpec {
  public static final org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec falcon_512 = new org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec(FalconParameters.falcon_512);
  
  public static final org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec falcon_1024 = new org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec(FalconParameters.falcon_1024);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private FalconParameterSpec(FalconParameters paramFalconParameters) {
    this.name = Strings.toUpperCase(paramFalconParameters.getName());
  }
  
  public String getName() {
    return this.name;
  }
  
  public static org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec fromName(String paramString) {
    return (org.bouncycastle.pqc.jcajce.spec.FalconParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("falcon-512", falcon_512);
    parameters.put("falcon-1024", falcon_1024);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\spec\FalconParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */