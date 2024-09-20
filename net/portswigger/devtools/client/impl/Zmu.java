package net.portswigger.devtools.client.impl;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Ztf;

public class Zmu extends Zs {
  private final Zxo ZK;
  
  private static final String a;
  
  public Zmu(Zxe paramZxe) {
    super(a);
    this.ZK = new Zxo(paramZxe);
  }
  
  public Zxv Zu() {
    try {
      this.ZK.ZB();
    } catch (Ztf ztf) {
      Zah.Zl((Throwable)ztf, Zk_.UNEXPECTED);
      return Zxv.Zj(ztf.getMessage(), new Object[0]);
    } 
    return Zxv.ZY();
  }
  
  static {
    // Byte code:
    //   0: bipush #79
    //   2: ldc '#>_`I#sl^n^?p"N`I#rlMhS.r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zmu.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #47
    //   82: goto -> 110
    //   85: iconst_3
    //   86: goto -> 110
    //   89: bipush #117
    //   91: goto -> 110
    //   94: bipush #78
    //   96: goto -> 110
    //   99: bipush #114
    //   101: goto -> 110
    //   104: iconst_5
    //   105: goto -> 110
    //   108: bipush #82
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */