package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JSeparator;

public class Zgfa implements Zrs_ {
  private final Zrs_ ZE;
  
  private Runnable Zd = Zgfa::lambda$new$0;
  
  private static final String a;
  
  private Zgfa(Zerg paramZerg, Zgli paramZgli, Zm6x paramZm6x) {
    this.ZE = new Zrqk(false, paramZerg, null, null, null, null, null, Zeew.REPEATER, paramZgli, paramZm6x, Zb9b.Zx);
  }
  
  public List<Component> Zi(Zmgv paramZmgv, Zlbp paramZlbp, Zgu3 paramZgu3, Zgsq paramZgsq, MouseEvent paramMouseEvent, Zzyl paramZzyl, Component paramComponent, boolean paramBoolean, int[] paramArrayOfint) {
    ArrayList<Zepe> arrayList = new ArrayList();
    Zepe zepe = new Zepe(a);
    String[] arrayOfString = Zku.Zr();
    zepe.addActionListener(this::lambda$getContextMenuItems$1);
    arrayList.add(zepe);
    arrayList.add(new JSeparator());
    arrayList.addAll(this.ZE.Zi(paramZmgv, paramZlbp, paramZgu3, paramZgsq, paramMouseEvent, paramZzyl, paramComponent, paramBoolean, paramArrayOfint));
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[2]); 
    return (List)arrayList;
  }
  
  public void ZB(Runnable paramRunnable) {
    this.Zd = paramRunnable;
  }
  
  private void lambda$getContextMenuItems$1(ActionEvent paramActionEvent) {
    this.Zd.run();
  }
  
  private static void lambda$new$0() {}
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc 'j%zN\\n8.4)J\\n8'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgfa.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #33
    //   82: goto -> 112
    //   85: bipush #115
    //   87: goto -> 112
    //   90: bipush #16
    //   92: goto -> 112
    //   95: bipush #44
    //   97: goto -> 112
    //   100: bipush #39
    //   102: goto -> 112
    //   105: bipush #82
    //   107: goto -> 112
    //   110: bipush #25
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */