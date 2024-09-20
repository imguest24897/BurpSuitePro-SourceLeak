package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.util.Strings;

public class KyberParameterSpec implements AlgorithmParameterSpec {
  public static final KyberParameterSpec kyber512 = new KyberParameterSpec(KyberParameters.kyber512);
  
  public static final KyberParameterSpec kyber768 = new KyberParameterSpec(KyberParameters.kyber768);
  
  public static final KyberParameterSpec kyber1024 = new KyberParameterSpec(KyberParameters.kyber1024);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private KyberParameterSpec(KyberParameters paramKyberParameters) {
    this.name = Strings.toUpperCase(paramKyberParameters.getName());
  }
  
  public String getName() {
    return this.name;
  }
  
  public static KyberParameterSpec fromName(String paramString) {
    return (KyberParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("kyber512", kyber512);
    parameters.put("kyber768", kyber768);
    parameters.put("kyber1024", kyber1024);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\spec\KyberParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */