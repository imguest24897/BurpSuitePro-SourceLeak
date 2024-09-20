package META-INF.versions.9.org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.util.Strings;

public class NTRUParameterSpec implements AlgorithmParameterSpec {
  public static final org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec ntruhps2048509 = new org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec(NTRUParameters.ntruhps2048509);
  
  public static final org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec ntruhps2048677 = new org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec(NTRUParameters.ntruhps2048677);
  
  public static final org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec ntruhps4096821 = new org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec(NTRUParameters.ntruhps4096821);
  
  public static final org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec ntruhps40961229 = new org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec(NTRUParameters.ntruhps40961229);
  
  public static final org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec ntruhrss701 = new org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec(NTRUParameters.ntruhrss701);
  
  public static final org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec ntruhrss1373 = new org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec(NTRUParameters.ntruhrss1373);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private NTRUParameterSpec(NTRUParameters paramNTRUParameters) {
    this.name = paramNTRUParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec fromName(String paramString) {
    return (org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("ntruhps2048509", ntruhps2048509);
    parameters.put("ntruhps2048677", ntruhps2048677);
    parameters.put("ntruhps4096821", ntruhps4096821);
    parameters.put("ntruhps40961229", ntruhps40961229);
    parameters.put("ntruhrss701", ntruhrss701);
    parameters.put("ntruhrss1373", ntruhrss1373);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\spec\NTRUParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */