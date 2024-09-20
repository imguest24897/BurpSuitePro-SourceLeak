package burp;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;

public class Zruv {
  public static String Zl(Zstu paramZstu) {
    return (paramZstu == null) ? null : ZO(paramZstu, 0, paramZstu.Zpu());
  }
  
  public static String ZO(Zstu paramZstu, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    if (paramZstu == null)
      return null; 
    byte[] arrayOfByte = new byte[paramInt2 * 2];
    byte b = 0;
    while (b < paramInt2) {
      arrayOfByte[2 * b + 1] = paramZstu.Zp(paramInt1 + b);
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return new String(arrayOfByte, StandardCharsets.UTF_16);
  }
  
  public static <T> byte[] ZU(Collection<T> paramCollection, Zl4h<T> paramZl4h) {
    byte[] arrayOfByte = new byte[paramCollection.size()];
    byte b = 0;
    Iterator<T> iterator = paramCollection.iterator();
    Zbqc[] arrayOfZbqc = Zyf.ZQN();
    while (iterator.hasNext()) {
      T t = iterator.next();
      arrayOfByte[b++] = paramZl4h.Zk(t);
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zruv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */