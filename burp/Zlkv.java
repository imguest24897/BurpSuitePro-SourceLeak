package burp;

import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

class Zlkv implements HierarchyListener {
  private boolean Zm;
  
  final Zr3d ZQ;
  
  private Zlkv(Zr3d paramZr3d) {}
  
  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent) {
    // Byte code:
    //   0: invokestatic Zg : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getChangeFlags : ()J
    //   8: ldc2_w 4
    //   11: land
    //   12: lconst_0
    //   13: lcmp
    //   14: ifle -> 78
    //   17: aload_0
    //   18: getfield ZQ : Lburp/Zr3d;
    //   21: getfield Zq : Lburp/Zbup;
    //   24: invokevirtual isShowing : ()Z
    //   27: istore_3
    //   28: aload_0
    //   29: getfield Zm : Z
    //   32: ifne -> 55
    //   35: iload_3
    //   36: ifeq -> 55
    //   39: aload_0
    //   40: iconst_1
    //   41: putfield Zm : Z
    //   44: aload_0
    //   45: getfield ZQ : Lburp/Zr3d;
    //   48: invokevirtual ZY : ()V
    //   51: aload_2
    //   52: ifnonnull -> 78
    //   55: aload_0
    //   56: getfield Zm : Z
    //   59: ifeq -> 78
    //   62: iload_3
    //   63: ifne -> 78
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield Zm : Z
    //   71: aload_0
    //   72: getfield ZQ : Lburp/Zr3d;
    //   75: invokevirtual Zy : ()V
    //   78: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */