package burp;

import java.util.List;
import net.portswigger.Zto;

public interface Zrsj<T extends Zr6e> {
  public static final Zrsj<Zr6e> Zv = new Zxsq();
  
  void ZN(Zlte paramZlte);
  
  void Zr(Zlte paramZlte, boolean paramBoolean);
  
  void ZZ(Zlte paramZlte, int paramInt);
  
  Zliy<T> ZC(int paramInt);
  
  T ZD(int paramInt);
  
  default void Zz(Zlte paramZlte, Zliy<T> paramZliy, T paramT) {
    Zh(paramZlte, paramZliy, paramT, true);
  }
  
  void Zh(Zlte paramZlte, Zliy<T> paramZliy, T paramT, boolean paramBoolean);
  
  default void ZW(Zlte paramZlte, int paramInt) {
    ZI(paramZlte, paramInt, true, true);
  }
  
  default void ZJ(Zlte paramZlte, int paramInt, boolean paramBoolean) {
    ZI(paramZlte, paramInt, paramBoolean, true);
  }
  
  void ZI(Zlte paramZlte, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  void ZK(Zlte paramZlte, int paramInt);
  
  void Zu(Zlte paramZlte, int paramInt);
  
  Zto<Integer, Integer> Zt(int paramInt);
  
  Zto<Integer, Integer> Zi(Zr6e paramZr6e);
  
  List<T> ZF();
  
  int Zh();
  
  boolean Zf(int paramInt);
  
  boolean Zk(int paramInt);
  
  boolean ZL();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrsj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */