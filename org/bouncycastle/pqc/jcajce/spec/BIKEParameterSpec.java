package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.util.Strings;

public class BIKEParameterSpec implements AlgorithmParameterSpec {
  public static final BIKEParameterSpec bike128 = new BIKEParameterSpec(BIKEParameters.bike128);
  
  public static final BIKEParameterSpec bike192 = new BIKEParameterSpec(BIKEParameters.bike192);
  
  public static final BIKEParameterSpec bike256 = new BIKEParameterSpec(BIKEParameters.bike256);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private BIKEParameterSpec(BIKEParameters paramBIKEParameters) {
    this.name = paramBIKEParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static BIKEParameterSpec fromName(String paramString) {
    return (BIKEParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("bike128", bike128);
    parameters.put("bike192", bike192);
    parameters.put("bike256", bike256);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\spec\BIKEParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */