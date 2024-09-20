package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zlh extends Zl2 {
  private final Zxs7 ZM;
  
  private final Zxs7 ZA;
  
  private final Zt4_ ZQ;
  
  private static final String c;
  
  public Zlh(Zt4_ paramZt4_, Zxs7 paramZxs71, Zxs7 paramZxs72) {
    super(paramZt4_);
    this.ZQ = paramZt4_;
    this.ZM = paramZxs71;
    this.ZA = paramZxs72;
  }
  
  public List<Zxtl> ZA() {
    ArrayList<Zxtl> arrayList = new ArrayList();
    arrayList.addAll(this.ZM.ZA());
    arrayList.addAll(this.ZA.ZA());
    return Collections.unmodifiableList(arrayList);
  }
  
  protected byte[] Zx(byte[] paramArrayOfbyte, byte paramByte, int[] paramArrayOfint) {
    Zs2i zs2i = this.ZA.<Zs2i>Zk(new Zrrb(paramArrayOfbyte, paramByte, paramArrayOfint, paramArrayOfint));
    byte[] arrayOfByte = zs2i.ZE();
    return ((Zs2i)this.ZM.<Zs2i>Zk(new Zrrb(arrayOfByte, (byte)0, paramArrayOfint, paramArrayOfint))).ZE();
  }
  
  protected int[] ZJ(byte[] paramArrayOfbyte, byte paramByte, int[] paramArrayOfint) {
    Zs2i zs2i1 = this.ZA.<Zs2i>Zk(new Zrrb(paramArrayOfbyte, paramByte, paramArrayOfint, paramArrayOfint));
    byte[] arrayOfByte = zs2i1.ZE();
    Zs2i zs2i2 = this.ZM.<Zs2i>Zk(new Zrrb(arrayOfByte, (byte)0, paramArrayOfint, paramArrayOfint));
    return zs2i2.Zm();
  }
  
  public int ZV() {
    return this.ZQ.ZW();
  }
  
  public static Zxs7 Z_(Zxs7 paramZxs7) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    Zxs7 zxs7 = paramZxs7;
    while (zxs7 instanceof Zlh) {
      zxs7 = ((Zlh)zxs7).ZM;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zxs7;
  }
  
  public String toString() {
    return c.formatted(new Object[] { this.ZA.toString(), this.ZM.toString() });
  }
  
  public boolean Zm(Zrdu paramZrdu, String paramString, Zefx paramZefx) {
    return (Z_(this).Z_() != Zs66.Zm(paramZrdu) || !Z_(this).Zf().equals(paramString));
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: ldc 'A01(iD7'1/bf'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlh.c : Ljava/lang/String;
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
    //   80: bipush #114
    //   82: goto -> 112
    //   85: bipush #85
    //   87: goto -> 112
    //   90: bipush #7
    //   92: goto -> 112
    //   95: bipush #80
    //   97: goto -> 112
    //   100: bipush #26
    //   102: goto -> 112
    //   105: bipush #33
    //   107: goto -> 112
    //   110: bipush #85
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */