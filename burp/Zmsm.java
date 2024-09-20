package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zmsm {
  private final List<Zeih> ZV = new CopyOnWriteArrayList<>();
  
  public void ZO(Zeih paramZeih) {
    this.ZV.add(paramZeih);
  }
  
  public void ZM(Zeih paramZeih) {
    this.ZV.remove(paramZeih);
  }
  
  public void ZK(Zmup paramZmup, Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, Zz1p paramZz1p, long paramLong1, long paramLong2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZV : Ljava/util/List;
    //   4: aload_1
    //   5: aload_2
    //   6: aload_3
    //   7: aload #4
    //   9: aload #5
    //   11: lload #6
    //   13: lload #8
    //   15: <illegal opcode> accept : (Lburp/Zmup;Lburp/Zmzk;Lburp/Zstu;Lburp/Zstu;Lburp/Zz1p;JJ)Ljava/util/function/Consumer;
    //   20: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   25: return
  }
  
  private static void lambda$newRequest$0(Zmup paramZmup, Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, Zz1p paramZz1p, long paramLong1, long paramLong2, Zeih paramZeih) {
    paramZeih.Zk(paramZmup, paramZmzk, paramZstu1, paramZstu2, paramZz1p, paramLong1, paramLong2, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmsm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */