package burp;

import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zrwn implements Zmgx {
  private final Zxs7 ZZ;
  
  private final Zsy Zu;
  
  private final Zs6l ZT;
  
  private final Zspd Zv;
  
  private static final Zs2i Zo;
  
  private static final String a;
  
  Zrwn(Zxs7 paramZxs7, Zsy paramZsy, Zs6l paramZs6l, Zspd paramZspd) {
    this.ZZ = paramZxs7;
    this.Zu = paramZsy;
    this.ZT = paramZs6l;
    this.Zv = paramZspd;
  }
  
  public void ZM(byte paramByte) {
    byte[] arrayOfByte = Zkb.Zy(this.Zu.Zi().ZG().ZK(10));
    Zsjk zsjk = Zsjk.ZU(Zsjk.FILE_UPLOAD_FILE_EXTENSION_HTML_TYPES, paramByte);
    if (!(this.ZZ instanceof Zlv)) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    Zlv zlv = (Zlv)this.ZZ;
    if (zlv.Zt() == null || zlv.Zt().endsWith(a)) {
      this.Zv.accept(null, zsjk);
      return;
    } 
    Ztsh ztsh = this.ZT.ZO(paramByte, arrayOfByte);
    Zku6 zku6 = ztsh.ZA(Zxar.ZK(arrayOfByte), Zri7.ZJ(new Zrrk(arrayOfByte, paramByte)), Zlp5.Zc());
    this.Zv.accept(zku6, zsjk);
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: ldc 'c7'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrwn.a : Ljava/lang/String;
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
    //   80: bipush #92
    //   82: goto -> 112
    //   85: bipush #78
    //   87: goto -> 112
    //   90: bipush #120
    //   92: goto -> 112
    //   95: bipush #120
    //   97: goto -> 112
    //   100: bipush #115
    //   102: goto -> 112
    //   105: bipush #20
    //   107: goto -> 112
    //   110: bipush #97
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
    //   154: new burp/Zmpn
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zrwn.Zo : Lburp/Zs2i;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */