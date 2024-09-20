package META-INF.versions.9.org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.util.Strings;

public class PicnicParameterSpec implements AlgorithmParameterSpec {
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl1fs = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl1fs);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl1ur = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl1ur);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl3fs = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl3fs);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl3ur = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl3ur);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl5fs = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl5fs);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl5ur = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl5ur);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnic3l1 = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnic3l1);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnic3l3 = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnic3l3);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnic3l5 = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnic3l5);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl1full = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl1full);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl3full = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl3full);
  
  public static final org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec picnicl5full = new org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec(PicnicParameters.picnicl5full);
  
  private static Map parameters = new HashMap<>();
  
  private final String name;
  
  private PicnicParameterSpec(PicnicParameters paramPicnicParameters) {
    this.name = paramPicnicParameters.getName();
  }
  
  public String getName() {
    return this.name;
  }
  
  public static org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec fromName(String paramString) {
    return (org.bouncycastle.pqc.jcajce.spec.PicnicParameterSpec)parameters.get(Strings.toLowerCase(paramString));
  }
  
  static {
    parameters.put("picnicl1fs", picnicl1fs);
    parameters.put("picnicl1ur", picnicl1ur);
    parameters.put("picnicl3fs", picnicl3fs);
    parameters.put("picnicl3ur", picnicl3ur);
    parameters.put("picnicl5fs", picnicl5fs);
    parameters.put("picnicl5ur", picnicl5ur);
    parameters.put("picnic3l1", picnic3l1);
    parameters.put("picnic3l3", picnic3l3);
    parameters.put("picnic3l5", picnic3l5);
    parameters.put("picnicl1full", picnicl1full);
    parameters.put("picnicl3full", picnicl3full);
    parameters.put("picnicl5full", picnicl5full);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\jcajce\spec\PicnicParameterSpec.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */