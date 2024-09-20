package burp;

import java.util.List;

public class Zzed extends Zzek {
  protected void ZJ(Zstu paramZstu, Zs68 paramZs68, List<Zl1r> paramList) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Zd : ()I
    //   4: istore #4
    //   6: aload_1
    //   7: iload #4
    //   9: aload_1
    //   10: invokeinterface Zpu : ()I
    //   15: invokeinterface Zb : (II)Lburp/Zstu;
    //   20: invokestatic Zw : (Lburp/Zstu;)Ljava/util/Set;
    //   23: aload_3
    //   24: iload #4
    //   26: <illegal opcode> accept : (Ljava/util/List;I)Ljava/util/function/Consumer;
    //   31: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   36: return
  }
  
  private static void lambda$highlightResponseIndependent$0(List<Zl1r> paramList, int paramInt, Zq3 paramZq3) {
    paramList.add(new Zl1r(paramZq3.ZFG() + paramInt, paramZq3.ZFS() + paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzed.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */