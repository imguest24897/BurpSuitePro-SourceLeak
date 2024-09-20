package burp;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class Zt3y {
  private final Set<Zlnb<?>> Zs;
  
  private static int ZI;
  
  protected Zt3y(Zlnb<?>... paramVarArgs) {
    if (paramVarArgs != null)
      try {
        if (paramVarArgs.length != 0)
          try {
            if (!Arrays.<Zlnb<?>>stream(paramVarArgs).anyMatch(Objects::isNull)) {
              this.Zs = Set.of(paramVarArgs);
              return;
            } 
            throw new IllegalArgumentException();
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      }  
    throw new IllegalArgumentException();
  }
  
  public boolean Zl(Zlnb<?> paramZlnb) {
    return this.Zs.contains(paramZlnb);
  }
  
  public static Zlnb<Void> ZW(String paramString) {
    return new Zlnb<>(paramString, Void.class);
  }
  
  public static <T> Zlnb<T> Zo(String paramString, Class<T> paramClass) {
    return new Zlnb<>(paramString, paramClass);
  }
  
  public static void ZH(int paramInt) {
    ZI = paramInt;
  }
  
  public static int ZF() {
    return ZI;
  }
  
  public static int ZM() {
    int i = ZF();
    try {
      if (i == 0)
        return 65; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    if (ZM() != 0)
      ZH(31); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt3y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */