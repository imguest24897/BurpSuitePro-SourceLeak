package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.util.Strings;

public class NTRULPRimeParameterSpec implements AlgorithmParameterSpec {
  public static final NTRULPRimeParameterSpec ntrulpr653 = new NTRULPRimeParameterSpec(NTRULPRimeParameters.ntrulpr653);
  
  public static final NTRULPRimeParameterSpec ntrulpr761 = new NTRULPRimeParameterSpec(NTRULPRimeParameters.ntrulpr761);
  
  public static final NTRULPRimeParameterSpec ntrulpr857 = new NTRULPRimeParameterSpec(NTRULPRimeParameters.ntrulpr857);
  
  public static final NTRULPRimeParameterSpec ntrulpr953 = new NTRULPRimeParameterSpec(NTRULPRimeParameters.ntrulpr953);
  
  public static final NTRULPRimeParameterSpec ntrulpr1013 = new NTRULPRimeParameterSpec(NTRULPRimeParameters.ntrulpr1013);
  
  public static final NTRULPRimeParameterSpec ntrulpr1277 = new NTRULPRimeParameterSpec(NTRULPRimeParameters.ntrulpr1277);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private NTRULPRimeParameterSpec(NTRULPRimeParameters paramNTRULPRimeParameters) {
    this.name = paramNTRULPRimeParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static NTRULPRimeParameterSpec fromName(String paramString) {
    return (NTRULPRimeParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("ntrulpr653", ntrulpr653);
    parameters.put("ntrulpr761", ntrulpr761);
    parameters.put("ntrulpr857", ntrulpr857);
    parameters.put("ntrulpr953", ntrulpr953);
    parameters.put("ntrulpr1013", ntrulpr1013);
    parameters.put("ntrulpr1277", ntrulpr1277);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\spec\NTRULPRimeParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */