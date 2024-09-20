package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zm0i implements Zkrr {
  private static final byte[] ZY;
  
  private final Zsoh ZJ;
  
  private final Zkl6 ZC;
  
  private final Ze3n Zb;
  
  private final Zsy Zs;
  
  private Zb6q Zg;
  
  private byte[] ZD;
  
  private byte[] ZW;
  
  private byte[] ZH;
  
  private int Zf;
  
  private static String ZE;
  
  private static final String b;
  
  public Zm0i(Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n, Zsy paramZsy) {
    this.ZJ = paramZsoh;
    String str = Zs();
    this.ZC = paramZkl6;
    this.Zb = paramZe3n;
    this.Zs = paramZsy;
    if (Zbqc.Zwu() == null)
      ZW("ceUtHb"); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_TraceMethod;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    String str2 = this.Zs.Zi().ZG().ZK(10);
    this.ZD = Zkb.Zy(str2);
    String str1 = Zs();
    Zx(paramZtpx, str2);
    if (this.Zg == null) {
      Zuh.Zb(false, Zqf.Zk);
      return;
    } 
    if (ZK() || Zn())
      return; 
    paramZz4_.Zz(ZR());
    if (str1 != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private void Zx(Ztpx paramZtpx, String paramString) {
    this.ZW = this.ZC.Zs().ZO().Zj(Zsss.TRACE).Zf(new Zax(this.Zb.Za(), Zkb.Zy("/"))).Zc(new Ztnz(b, paramString)).Zr().ZiD();
    Zsxd zsxd = this.ZJ.ZD(Ztao.Zc(paramZtpx, this.Zb.ZM(), this.ZW).Zz(false).ZA());
    this.Zg = zsxd.ZG().Ze();
  }
  
  private boolean ZK() {
    return (this.Zg.Ze() != 200);
  }
  
  private boolean Zn() {
    Zstu zstu = this.Zg.Za();
    this.Zf = Zlt_.Zj(zstu, this.ZD, this.Zg.Zs(), zstu.Zpu());
    return (this.Zf == -1);
  }
  
  private Zsqx<Zrdb> ZR() {
    List<Zl1r> list1 = Ze(this.ZD);
    List<Zl1r> list2 = Zz(this.ZD);
    Zvow zvow = this.Zb.ZI().Zp(this.ZW).ZK(list1).ZK(this.ZH).Z_(list2);
    return Zxx.Zr(this.Zb.Za(), zvow);
  }
  
  private List<Zl1r> Ze(byte[] paramArrayOfbyte) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    arrayList.add(Zrlp.Zj(0, 5));
    int i = Zli.Zw(this.ZW, paramArrayOfbyte, 0, this.ZW.length);
    arrayList.add(Zrlp.Zj(i, i + paramArrayOfbyte.length));
    return arrayList;
  }
  
  private List<Zl1r> Zz(byte[] paramArrayOfbyte) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    this.ZH = this.Zg.Za().ZiD();
    int i = Zli.Zw(this.ZH, ZY, 0, this.Zg.Zs());
    arrayList.add(Zrlp.Zj(i, i + ZY.length));
    arrayList.add(Zrlp.Zj(this.Zf, this.Zf + paramArrayOfbyte.length));
    return arrayList;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zs : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'sd8DK'
    //   8: invokestatic ZW : (Ljava/lang/String;)V
    //   11: bipush #52
    //   13: ldc '@Z7W'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zm0i.b : Ljava/lang/String;
    //   22: goto -> 165
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 139
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 101, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: bipush #55
    //   94: goto -> 123
    //   97: iconst_1
    //   98: goto -> 123
    //   101: bipush #108
    //   103: goto -> 123
    //   106: bipush #93
    //   108: goto -> 123
    //   111: bipush #10
    //   113: goto -> 123
    //   116: bipush #71
    //   118: goto -> 123
    //   121: bipush #18
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 46
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 43
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 19
    //   165: iconst_3
    //   166: newarray byte
    //   168: dup
    //   169: iconst_0
    //   170: bipush #50
    //   172: bastore
    //   173: dup
    //   174: iconst_1
    //   175: bipush #48
    //   177: bastore
    //   178: dup
    //   179: iconst_2
    //   180: bipush #48
    //   182: bastore
    //   183: putstatic burp/Zm0i.ZY : [B
    //   186: return
  }
  
  public static void ZW(String paramString) {
    ZE = paramString;
  }
  
  public static String Zs() {
    return ZE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */