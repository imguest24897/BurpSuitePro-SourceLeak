package burp;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Zem0 {
  private final Map<Class<?>, Object> ZY = new ConcurrentHashMap<>();
  
  private static int[] Zk;
  
  public <T> Zem0 Za(Class<T> paramClass, T paramT) {
    int[] arrayOfInt = ZS();
    try {
      if (this.ZY.containsKey(paramClass))
        throw new Zxty(paramClass); 
    } catch (Zxty zxty) {
      throw a(null);
    } 
    try {
      this.ZY.put(paramClass, Objects.requireNonNull(paramT));
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (Zxty zxty) {
      throw a(null);
    } 
    return this;
  }
  
  public <T> T Zr(Class<T> paramClass) {
    int[] arrayOfInt = ZS();
    Object object = this.ZY.get(paramClass);
    try {
      if (object == null)
        throw new Zen0(paramClass); 
    } catch (Zxty zxty) {
      throw a(null);
    } 
    try {
      if (Zbqc.Zwu() == null)
        ZW(new int[1]); 
    } catch (Zxty zxty) {
      throw a(null);
    } 
    return paramClass.cast(object);
  }
  
  public static void ZW(int[] paramArrayOfint) {
    Zk = paramArrayOfint;
  }
  
  public static int[] ZS() {
    return Zk;
  }
  
  private static Zxty a(Zxty paramZxty) {
    return paramZxty;
  }
  
  static {
    if (ZS() != null)
      ZW(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zem0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */