package burp;

import java.util.Map;

public class Zgxc<T> implements Zzkg {
  public static final Zz94 Zm = new Zz94();
  
  private final Map<Long, Zsij> Zp;
  
  private final Zs4l<T, Object> Zy;
  
  public Zgxc(Zs4l<T, Object> paramZs4l) {
    this.Zy = paramZs4l;
    this.Zy.Zm(this);
    this.Zp = new Zsi1<>(50);
  }
  
  public Object ZD(T paramT, long paramLong) {
    Object object = this.Zy.ZQ(paramT, paramLong, Zm);
    Zsij zsij = this.Zp.remove(Long.valueOf(paramLong));
    return (zsij != null) ? zsij : object;
  }
  
  public void Zn(Zsij paramZsij) {
    this.Zp.put(Long.valueOf(paramZsij.ZM2()), paramZsij);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */