package META-INF.versions.9.org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.util.Strings;

public class DilithiumParameterSpec implements AlgorithmParameterSpec {
  public static final org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec dilithium2 = new org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec(DilithiumParameters.dilithium2);
  
  public static final org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec dilithium3 = new org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec(DilithiumParameters.dilithium3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec dilithium5 = new org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec(DilithiumParameters.dilithium5);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private DilithiumParameterSpec(DilithiumParameters paramDilithiumParameters) {
    this.name = Strings.toUpperCase(paramDilithiumParameters.getName());
  }
  
  public String getName() {
    return this.name;
  }
  
  public static org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec fromName(String paramString) {
    return (org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("dilithium2", dilithium2);
    parameters.put("dilithium3", dilithium3);
    parameters.put("dilithium5", dilithium5);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\spec\DilithiumParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */