package META-INF.versions.9.org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.util.Strings;

public class CMCEParameterSpec implements AlgorithmParameterSpec {
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece348864 = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece348864r3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece348864f = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece348864fr3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece460896 = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece460896r3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece460896f = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece460896fr3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece6688128 = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece6688128r3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece6688128f = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece6688128fr3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece6960119 = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece6960119r3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece6960119f = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece6960119fr3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece8192128 = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece8192128r3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec mceliece8192128f = new org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec(CMCEParameters.mceliece8192128fr3);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private CMCEParameterSpec(CMCEParameters paramCMCEParameters) {
    this.name = paramCMCEParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec fromName(String paramString) {
    return (org.bouncycastle.pqc.jcajce.spec.CMCEParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("mceliece348864", mceliece348864);
    parameters.put("mceliece348864f", mceliece348864f);
    parameters.put("mceliece460896", mceliece460896);
    parameters.put("mceliece460896f", mceliece460896f);
    parameters.put("mceliece6688128", mceliece6688128);
    parameters.put("mceliece6688128f", mceliece6688128f);
    parameters.put("mceliece6960119", mceliece6960119);
    parameters.put("mceliece6960119f", mceliece6960119f);
    parameters.put("mceliece8192128", mceliece8192128);
    parameters.put("mceliece8192128f", mceliece8192128f);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\spec\CMCEParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */