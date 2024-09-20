package burp;

import java.util.Objects;

public interface Zm72 extends Zgyy {
  public static final Zkzh ZT = new Zkzh();
  
  default <T> T ZJ(Zzbv<T> paramZzbv) {
    return paramZzbv.ZD(this);
  }
  
  Zko4 Zej();
  
  default boolean Zu(Zgyy paramZgyy) {
    if (paramZgyy instanceof Zm72) {
      Zm72 zm72 = (Zm72)paramZgyy;
      if (Objects.equals(Zej().ZRc(), zm72.Zej().ZRc()));
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm72.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */