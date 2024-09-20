package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zze7 {
  private final List<Zey2> Zg = new CopyOnWriteArrayList<>();
  
  public void Zy(Zey2 paramZey2) {
    this.Zg.add(paramZey2);
  }
  
  public void Zh(Zey2 paramZey2) {
    this.Zg.remove(paramZey2);
  }
  
  public void Zp(Zeo2 paramZeo2, Zz1p paramZz1p) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Ljava/util/List;
    //   4: aload_1
    //   5: aload_2
    //   6: <illegal opcode> accept : (Lburp/Zeo2;Lburp/Zz1p;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  public void Zh(Zvo1 paramZvo1, Zz1p paramZz1p) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Ljava/util/List;
    //   4: aload_1
    //   5: aload_2
    //   6: <illegal opcode> accept : (Lburp/Zvo1;Lburp/Zz1p;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  public void ZM(Zz1p paramZz1p, Zstu paramZstu1, Zstu paramZstu2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Ljava/util/List;
    //   4: aload_1
    //   5: aload_2
    //   6: aload_3
    //   7: <illegal opcode> accept : (Lburp/Zz1p;Lburp/Zstu;Lburp/Zstu;)Ljava/util/function/Consumer;
    //   12: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   17: return
  }
  
  private static void lambda$newRequestFromIntruder$2(Zz1p paramZz1p, Zstu paramZstu1, Zstu paramZstu2, Zey2 paramZey2) {
    paramZey2.Zo(paramZz1p, paramZstu1, paramZstu2);
  }
  
  private static void lambda$newRequestFromRepeater$1(Zvo1 paramZvo1, Zz1p paramZz1p, Zey2 paramZey2) {
    paramZey2.ZL(paramZvo1, paramZz1p);
  }
  
  private static void lambda$newRequestFromProxy$0(Zeo2 paramZeo2, Zz1p paramZz1p, Zey2 paramZey2) {
    paramZey2.Zx(paramZeo2, paramZz1p);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zze7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */