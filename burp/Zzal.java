package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zsy;

public class Zzal implements Zm9n {
  private static final String[] Zi;
  
  private final Zmhe ZE;
  
  private final Ze3n Zy;
  
  private final Zxs7 Zo;
  
  private final Zsy ZR;
  
  private final Zgfe Zu;
  
  private static int ZK;
  
  public Zzal(Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zsy paramZsy, Zgfe paramZgfe) {
    this.ZE = paramZmhe;
    int i = Zm();
    this.Zy = paramZe3n;
    this.Zo = paramZxs7;
    this.ZR = paramZsy;
    this.Zu = paramZgfe;
    if (i == 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_HttpHeaderInjection;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    Zsqx<Zrdb> zsqx = null;
    zsqx = ZV(zsqx, Zsjk.REPLACE);
    int i = Zm();
    zsqx = ZV(zsqx, Zsjk.APPEND);
    if (zsqx != null)
      paramZz4_.Zz(zsqx); 
    if (Zbqc.Zwu() == null)
      Zi(++i); 
  }
  
  private Zsqx<Zrdb> ZV(Zsqx<Zrdb> paramZsqx, Zsjk paramZsjk) {
    Zku6 zku6 = this.Zu.Zq(paramZsjk);
    if (paramZsqx == null && zku6 != null && zku6.Zk((byte)1, (byte)1))
      paramZsqx = Zu(paramZsjk.Z_()); 
    return paramZsqx;
  }
  
  private Zsqx<Zrdb> Zu(byte paramByte) {
    int i = Zm();
    for (Zboq zboq : Zx()) {
      Zsqx<Zrdb> zsqx = ZT(paramByte, zboq.Zg, zboq.Zj, zboq.Zb);
      if (zsqx != null)
        return zsqx; 
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  private List<Zboq> Zx() {
    ArrayList<Zboq> arrayList = new ArrayList();
    String[] arrayOfString = Zi;
    int i = ZW();
    int j = arrayOfString.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString[b];
      arrayList.add(new Zboq(Zv85.Zz(str, 0), str, 0));
      arrayList.add(new Zboq(Zv85.Zz(str, 1), str, 1));
      arrayList.add(new Zboq(Zv85.Zz(str, 2), str, 2));
      b++;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  private Zsqx<Zrdb> ZT(byte paramByte, String paramString1, String paramString2, int paramInt) {
    String str = this.ZR.Zi().ZG().ZK(10);
    byte[] arrayOfByte1 = Zk(paramString1, str);
    byte[] arrayOfByte2 = Zk(paramString2, str);
    Zku6 zku6 = ZB(paramByte, arrayOfByte1, arrayOfByte2);
    Zs16 zs16 = (Zs16)zku6.ZX((byte)1, new Zxl4((byte)1));
    if (zs16 == null)
      return null; 
    Zs2i zs2i = zku6.ZV().ZY();
    Zvow zvow = this.Zy.ZI().Zp(zs2i.ZE()).ZK(zs2i.ZO()).Zo(zku6.ZI((byte)1)).Zf(Zrlp.Zj((zs16.Zw()).Z_, (zs16.Zw()).Z_ + arrayOfByte2.length));
    return Zb1q.Zj(this.Zy.Za(), this.Zy.ZN(), zvow, this.Zo, arrayOfByte1, paramInt, zs16.Zg);
  }
  
  private Zku6 ZB(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return (new Ztsh(this.ZE, paramByte, paramArrayOfbyte1, (byte)0, (byte)1)).ZA(Zxar.Zg(paramArrayOfbyte2), Zri7.ZJ(new Zrrb(paramArrayOfbyte1, paramByte)), Zlp5.Zc().Zw(Zxgd.ZZ().Zz().ZV()));
  }
  
  private byte[] Zk(String paramString1, String paramString2) {
    return Zkb.Zy(paramString2.substring(0, 5) + paramString2.substring(0, 5) + paramString1);
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: ifne -> 10
    //   6: iconst_5
    //   7: invokestatic Zi : (I)V
    //   10: bipush #106
    //   12: ldc 'E'
    //   14: iconst_m1
    //   15: goto -> 22
    //   18: astore_0
    //   19: goto -> 162
    //   22: dup_x2
    //   23: pop
    //   24: invokevirtual toCharArray : ()[C
    //   27: dup_x1
    //   28: arraylength
    //   29: dup_x2
    //   30: pop
    //   31: iconst_0
    //   32: istore_1
    //   33: dup2_x1
    //   34: pop2
    //   35: dup_x2
    //   36: iconst_1
    //   37: if_icmpgt -> 136
    //   40: dup2
    //   41: swap
    //   42: iload_1
    //   43: dup2_x1
    //   44: caload
    //   45: swap
    //   46: iload_1
    //   47: bipush #7
    //   49: irem
    //   50: tableswitch default -> 118, 0 -> 88, 1 -> 93, 2 -> 98, 3 -> 103, 4 -> 108, 5 -> 113
    //   88: bipush #102
    //   90: goto -> 120
    //   93: bipush #37
    //   95: goto -> 120
    //   98: bipush #54
    //   100: goto -> 120
    //   103: bipush #20
    //   105: goto -> 120
    //   108: bipush #66
    //   110: goto -> 120
    //   113: bipush #55
    //   115: goto -> 120
    //   118: bipush #52
    //   120: ixor
    //   121: ixor
    //   122: i2c
    //   123: castore
    //   124: iinc #1, 1
    //   127: dup
    //   128: ifne -> 136
    //   131: dup2
    //   132: dup_x1
    //   133: goto -> 43
    //   136: dup2_x1
    //   137: pop2
    //   138: dup_x2
    //   139: iload_1
    //   140: if_icmpgt -> 40
    //   143: pop
    //   144: new java/lang/String
    //   147: dup_x1
    //   148: swap
    //   149: invokespecial <init> : ([C)V
    //   152: invokevirtual intern : ()Ljava/lang/String;
    //   155: swap
    //   156: pop
    //   157: swap
    //   158: pop
    //   159: goto -> 18
    //   162: iconst_3
    //   163: anewarray java/lang/String
    //   166: dup
    //   167: iconst_0
    //   168: aload_0
    //   169: aastore
    //   170: dup
    //   171: iconst_1
    //   172: ldc '\\r'
    //   174: aastore
    //   175: dup
    //   176: iconst_2
    //   177: ldc '\\n'
    //   179: aastore
    //   180: putstatic burp/Zzal.Zi : [Ljava/lang/String;
    //   183: return
  }
  
  public static void Zi(int paramInt) {
    ZK = paramInt;
  }
  
  public static int Zm() {
    return ZK;
  }
  
  public static int ZW() {
    int i = Zm();
    return (i == 0) ? 22 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzal.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */