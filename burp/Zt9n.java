package burp;

import java.util.function.Function;

public class Zt9n<T> implements Zs1_<T> {
  private final Zmk7<T> ZW;
  
  private final String Zt;
  
  private final Function<Object, String> ZH;
  
  private static int[] Zi;
  
  public Zt9n(Zmk7<T> paramZmk7) {
    this(paramZmk7, null, String::valueOf);
  }
  
  public Zt9n(Zmk7<T> paramZmk7, String paramString) {
    this(paramZmk7, paramString, String::valueOf);
  }
  
  public Zt9n(Zmk7<T> paramZmk7, Function<Object, String> paramFunction) {
    this(paramZmk7, null, paramFunction);
  }
  
  public Zt9n(Zmk7<T> paramZmk7, String paramString, Function<Object, String> paramFunction) {
    this.ZW = paramZmk7;
    this.Zt = paramString;
    this.ZH = paramFunction;
  }
  
  public String ZE() {
    return (this.Zt == null) ? this.ZW.ZS() : this.Zt;
  }
  
  public String ZP(T paramT) {
    Object object = this.ZW.Zx().Zl(paramT);
    return (object == null) ? "" : this.ZH.apply(object);
  }
  
  public static void Zi(int[] paramArrayOfint) {
    Zi = paramArrayOfint;
  }
  
  public static int[] Zn() {
    return Zi;
  }
  
  static {
    if (Zn() != null)
      Zi(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */