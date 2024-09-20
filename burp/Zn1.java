package burp;

import java.util.Collections;
import java.util.function.Supplier;
import javax.swing.tree.TreePath;
import net.portswigger.Zm2;

class Zn1 implements Zzyl {
  private final Ztdi ZG;
  
  private final Zs0g Zu;
  
  private final Ztwv Zm;
  
  private final Zor Zo;
  
  private final Zltk ZA;
  
  private final Supplier<TreePath> ZP;
  
  private static final String a;
  
  Zn1(Ztdi paramZtdi, Zs0g paramZs0g, Ztwv paramZtwv, Zor paramZor, Zltk paramZltk, Supplier<TreePath> paramSupplier) {
    this.ZG = paramZtdi;
    this.Zu = paramZs0g;
    this.Zm = paramZtwv;
    this.Zo = paramZor;
    this.ZA = paramZltk;
    this.ZP = paramSupplier;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    TreePath treePath = this.ZP.get();
    if (treePath == null)
      return false; 
    Zble zble = (Zble)treePath.getLastPathComponent();
    Zmnm zmnm = zble.Zg();
    switch (paramInt) {
      case 525312:
      
      case 525376:
      
      case 530688:
      
      case 530944:
      
    } 
    return false;
  }
  
  private boolean Zh(Zble paramZble) {
    (new Zta6(this.Zo, this.ZA, this.Zm)).ZG(Collections.singletonList(paramZble));
    return true;
  }
  
  private boolean Zz(Zble paramZble) {
    (new Zta6(this.Zo, this.ZA, this.Zm)).Zl(Collections.singletonList(paramZble));
    return true;
  }
  
  private boolean Zs(Zmnm paramZmnm) {
    if (this.Zu != null)
      this.Zu.Zu(paramZmnm.ZO1()); 
    return true;
  }
  
  private boolean Zv(Zmnm paramZmnm) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zo : Lburp/Zor;
    //   4: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   7: getstatic burp/Zn1.a : Ljava/lang/String;
    //   10: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   13: ifne -> 18
    //   16: iconst_1
    //   17: ireturn
    //   18: aload_0
    //   19: getfield Zm : Lburp/Ztwv;
    //   22: aload_0
    //   23: aload_1
    //   24: <illegal opcode> run : (Lburp/Zn1;Lburp/Zmnm;)Ljava/lang/Runnable;
    //   29: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   34: pop
    //   35: iconst_1
    //   36: ireturn
  }
  
  private void lambda$deleteIssues$0(Zmnm paramZmnm) {
    Zm2.ZC(Zrrh.SCANNER_ISSUES_DELETE);
    this.ZG.ZP(paramZmnm.ZO1());
  }
  
  static {
    // Byte code:
    //   0: bipush #119
    //   2: ldc '"e_RgCdOBN(\\fbGJfCcUOmc_JdC~IC^mCqUB|7IUGmr^B|('
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zn1.a : Ljava/lang/String;
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
    //   80: bipush #20
    //   82: goto -> 112
    //   85: bipush #96
    //   87: goto -> 112
    //   90: bipush #77
    //   92: goto -> 112
    //   95: bipush #71
    //   97: goto -> 112
    //   100: bipush #92
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #16
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zn1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */