package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.util.Strings;

public class SABERParameterSpec implements AlgorithmParameterSpec {
  public static final SABERParameterSpec lightsaberkem128r3 = new SABERParameterSpec(SABERParameters.lightsaberkem128r3);
  
  public static final SABERParameterSpec saberkem128r3 = new SABERParameterSpec(SABERParameters.saberkem128r3);
  
  public static final SABERParameterSpec firesaberkem128r3 = new SABERParameterSpec(SABERParameters.firesaberkem128r3);
  
  public static final SABERParameterSpec lightsaberkem192r3 = new SABERParameterSpec(SABERParameters.lightsaberkem192r3);
  
  public static final SABERParameterSpec saberkem192r3 = new SABERParameterSpec(SABERParameters.saberkem192r3);
  
  public static final SABERParameterSpec firesaberkem192r3 = new SABERParameterSpec(SABERParameters.firesaberkem192r3);
  
  public static final SABERParameterSpec lightsaberkem256r3 = new SABERParameterSpec(SABERParameters.lightsaberkem256r3);
  
  public static final SABERParameterSpec saberkem256r3 = new SABERParameterSpec(SABERParameters.saberkem256r3);
  
  public static final SABERParameterSpec firesaberkem256r3 = new SABERParameterSpec(SABERParameters.firesaberkem256r3);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private SABERParameterSpec(SABERParameters paramSABERParameters) {
    this.name = paramSABERParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static SABERParameterSpec fromName(String paramString) {
    return (SABERParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\spec\SABERParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */