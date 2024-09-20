package burp;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public final class Zkqz extends Record {
  private final Zres zhd;
  
  private final List<Ztnz> Zb;
  
  private final List<Zlou> Zd;
  
  public Zkqz(Zres paramZres, List<Ztnz> paramList, List<Zlou> paramList1) {
    this.zhd = paramZres;
    this.Zb = paramList;
    this.Zd = paramList1;
  }
  
  public Zefx ZB(Zkl6 paramZkl6, Function<Ze7n, Zkg3> paramFunction) {
    Zefx zefx = this.zhd.ZL(paramZkl6, this.Zb, paramFunction, null);
    Iterator<Zlou> iterator = this.Zd.iterator();
    int[] arrayOfInt = Zg7g.Zf();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      zefx = zefx.ZH(zlou);
      if (arrayOfInt == null)
        break; 
    } 
    return zefx;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zkqz;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zkqz;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zkqz;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zres Zhd() {
    return this.zhd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkqz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */