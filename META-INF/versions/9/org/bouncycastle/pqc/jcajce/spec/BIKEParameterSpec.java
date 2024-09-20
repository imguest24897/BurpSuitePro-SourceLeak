package META-INF.versions.9.org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.util.Strings;

public class BIKEParameterSpec implements AlgorithmParameterSpec {
  public static final org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec bike128 = new org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec(BIKEParameters.bike128);
  
  public static final org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec bike192 = new org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec(BIKEParameters.bike192);
  
  public static final org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec bike256 = new org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec(BIKEParameters.bike256);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private BIKEParameterSpec(BIKEParameters paramBIKEParameters) {
    this.name = paramBIKEParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec fromName(String paramString) {
    return (org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("bike128", bike128);
    parameters.put("bike192", bike192);
    parameters.put("bike256", bike256);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\spec\BIKEParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */