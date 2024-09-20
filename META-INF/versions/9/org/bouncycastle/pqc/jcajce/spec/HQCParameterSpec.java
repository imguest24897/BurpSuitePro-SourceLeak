package META-INF.versions.9.org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.util.Strings;

public class HQCParameterSpec implements AlgorithmParameterSpec {
  public static final org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec hqc128 = new org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec(HQCParameters.hqc128);
  
  public static final org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec hqc192 = new org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec(HQCParameters.hqc192);
  
  public static final org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec hqc256 = new org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec(HQCParameters.hqc256);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private HQCParameterSpec(HQCParameters paramHQCParameters) {
    this.name = paramHQCParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec fromName(String paramString) {
    return (org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("hqc128", hqc128);
    parameters.put("hqc192", hqc192);
    parameters.put("hqc256", hqc256);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\spec\HQCParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */