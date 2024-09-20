package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

public class Zrw6<E> {
  private final Zmjx<E> Zs;
  
  private final IntPredicate ZP;
  
  private final List<Zr6p<E>> Zx;
  
  public Zrw6(Zmjx<E> paramZmjx, IntPredicate paramIntPredicate) {
    this.Zs = paramZmjx;
    this.ZP = paramIntPredicate;
    this.Zx = new ArrayList<>();
  }
  
  public Zr6p<E> ZK(int paramInt) {
    int i = Zj(paramInt);
    return (this.ZP.test(paramInt) && i < this.Zx.size()) ? this.Zx.get(i) : null;
  }
  
  private int Zj(int paramInt) {
    return paramInt - this.Zs.Za();
  }
  
  public void Zz(Zr6p<E> paramZr6p) {
    this.Zx.add(paramZr6p);
    paramZr6p.Zo(this.Zs.Zf().size(), this.Zs);
  }
  
  public void Zv(int paramInt, Zr6p<E> paramZr6p) {
    this.Zs.ZL(ZK(paramInt));
    Zr6p zr6p = this.Zx.set(Zj(paramInt), paramZr6p);
    zr6p.Zz();
    this.Zs.Zd(paramInt, paramZr6p.Zk());
    this.Zs.ZE(paramZr6p);
  }
  
  public void Zu(int paramInt) {
    int i = Zj(paramInt);
    if (this.ZP.test(paramInt) && i < this.Zx.size()) {
      Zr6p<E> zr6p = this.Zx.remove(i);
      if (zr6p != null)
        zr6p.Zp(paramInt, this.Zs); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrw6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */