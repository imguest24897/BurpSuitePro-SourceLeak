package burp;

import java.awt.Window;
import javax.swing.border.EmptyBorder;

public class Zrvm extends Zrh7 {
  private final Zg8q ZY;
  
  private static final String a;
  
  public Zrvm(Window paramWindow, String paramString1, String paramString2, Zkk3 paramZkk3, Ze4m paramZe4m, Zmzk paramZmzk, byte[] paramArrayOfbyte, Zt84 paramZt84, Zgb6 paramZgb6, Zbnt paramZbnt, Zb0h paramZb0h, Ztwv paramZtwv, Zr_4 paramZr_4, Zey9 paramZey9) {
    super(paramWindow, true, Zzv7.RESPONSE_EXTRACTOR_DIALOG);
    ZD();
    setTitle(paramString1);
    this.ZY = new Zg8q(paramString2, paramZkk3, paramZe4m, paramZmzk, paramArrayOfbyte, paramZt84, paramZgb6, paramZbnt, paramZb0h, paramZtwv, paramZr_4, paramZey9);
    this.ZY.setBorder(new EmptyBorder(15, 15, 15, 15));
    Zbqc[] arrayOfZbqc = Zg8q.Z_();
    add(this.ZY, a);
    pack();
    Zq(paramWindow);
    if (Zbqc.Zwu() == null)
      Zg8q.ZB(new Zbqc[1]); 
  }
  
  public Zkk3 ZM() {
    return this.ZY.ZF();
  }
  
  public Zxjb Zn() {
    setVisible(true);
    return (ZM() == null) ? Zxjb.CANCEL : Zxjb.OK;
  }
  
  private void ZD() {
    setDefaultCloseOperation(0);
    pack();
  }
  
  static {
    // Byte code:
    //   0: bipush #62
    //   2: ldc 'O'}Nj'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrvm.a : Ljava/lang/String;
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
    //   80: bipush #50
    //   82: goto -> 112
    //   85: bipush #66
    //   87: goto -> 112
    //   90: bipush #119
    //   92: goto -> 112
    //   95: bipush #55
    //   97: goto -> 112
    //   100: bipush #21
    //   102: goto -> 112
    //   105: bipush #38
    //   107: goto -> 112
    //   110: bipush #75
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */