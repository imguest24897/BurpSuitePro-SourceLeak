package burp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreePath;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zta6 {
  private final Zor Zl;
  
  private final Zltk Zh;
  
  private final Ztwv Zi;
  
  private final List<TreePath> ZC;
  
  private int Zp;
  
  private static final String a;
  
  public Zta6(Zor paramZor, Zltk paramZltk, Ztwv paramZtwv) {
    this.Zl = paramZor;
    this.Zh = paramZltk;
    this.Zi = paramZtwv;
    this.ZC = new ArrayList<>(10);
  }
  
  public boolean ZG(List<Zble> paramList) {
    return ZM(paramList, true);
  }
  
  public boolean Zl(List<Zble> paramList) {
    return ZM(paramList, false);
  }
  
  private boolean ZM(List<Zble> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: iload_2
    //   7: <illegal opcode> run : (Lburp/Zta6;Ljava/util/List;Z)Ljava/lang/Runnable;
    //   12: getstatic burp/Zta6.a : Ljava/lang/String;
    //   15: invokeinterface Zl : (Ljava/lang/Runnable;Ljava/lang/String;)Ljava/util/concurrent/Future;
    //   20: pop
    //   21: iconst_1
    //   22: ireturn
  }
  
  private boolean ZH(Zble paramZble, boolean paramBoolean, Zboe paramZboe, float paramFloat1, float paramFloat2) {
    int[] arrayOfInt = Ztpr.ZJx();
    try {
      if (!paramZboe.Zq(paramFloat1, null))
        return false; 
      int i = paramZble.getChildCount();
      if (i > 0) {
        float f1 = paramFloat2 / i;
        float f2 = paramFloat1;
        byte b = 0;
        while (b < paramZble.getChildCount()) {
          try {
            if (!ZH((Zble)paramZble.getChildAt(b), paramBoolean, paramZboe, f2, f1))
              return false; 
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            Zah.Zl(indexOutOfBoundsException, Zk_.UNEXPECTED);
            return false;
          } 
          f2 += f1;
          b++;
          if (arrayOfInt != null)
            break; 
        } 
        Zv(new TreePath((Object[])paramZble.getPath()), paramBoolean);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return true;
  }
  
  private void Zv(TreePath paramTreePath, boolean paramBoolean) {
    try {
      this.ZC.add(paramTreePath);
      if (++this.Zp >= 10)
        ZL(paramBoolean); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private void ZL(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> run : (Lburp/Zta6;Z)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: aload_0
    //   11: getfield ZC : Ljava/util/List;
    //   14: invokeinterface clear : ()V
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield Zp : I
    //   24: return
  }
  
  private void lambda$processPaths$1(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZJx : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZC : Ljava/util/List;
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore_3
    //   14: aload_3
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 78
    //   23: aload_3
    //   24: invokeinterface next : ()Ljava/lang/Object;
    //   29: checkcast javax/swing/tree/TreePath
    //   32: astore #4
    //   34: iload_1
    //   35: ifeq -> 58
    //   38: aload_0
    //   39: getfield Zl : Lburp/Zor;
    //   42: aload #4
    //   44: invokevirtual expandPath : (Ljavax/swing/tree/TreePath;)V
    //   47: aload_2
    //   48: ifnull -> 74
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
    //   57: athrow
    //   58: aload_0
    //   59: getfield Zl : Lburp/Zor;
    //   62: aload #4
    //   64: invokevirtual collapsePath : (Ljavax/swing/tree/TreePath;)V
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/IndexOutOfBoundsException;)Ljava/lang/IndexOutOfBoundsException;
    //   73: athrow
    //   74: aload_2
    //   75: ifnull -> 14
    //   78: return
    // Exception table:
    //   from	to	target	type
    //   34	51	54	java/lang/IndexOutOfBoundsException
    //   38	67	70	java/lang/IndexOutOfBoundsException
  }
  
  private void lambda$process$0(List paramList, boolean paramBoolean) {
    Zboe zboe = new Zboe(Zt2m.ZF(this.Zl), this.Zi);
    this.Zh.ZQ();
    int[] arrayOfInt = Ztpr.ZJx();
    float f1 = 0.0F;
    float f2 = 100.0F / paramList.size();
    for (Zble zble : paramList) {
      try {
        if (!ZH(zble, paramBoolean, zboe, f1, f2))
          break; 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      f1 += f2;
      if (arrayOfInt != null)
        break; 
    } 
    try {
      if (this.Zp > 0)
        ZL(paramBoolean); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    this.Zh.Zs();
    zboe.Zd(true);
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: ldc 'an`\\n^ snnEsJrfD"^rF}e'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zta6.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #60
    //   82: goto -> 111
    //   85: iconst_3
    //   86: goto -> 111
    //   89: bipush #30
    //   91: goto -> 111
    //   94: bipush #123
    //   96: goto -> 111
    //   99: bipush #105
    //   101: goto -> 111
    //   104: bipush #41
    //   106: goto -> 111
    //   109: bipush #31
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zta6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */