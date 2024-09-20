package burp;

import com.fasterxml.Zoz.Ziz;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zli;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zru6 implements Zkrr {
  private static final Zsy Zx;
  
  private static final String Zv;
  
  private static final String Ze;
  
  private static final byte[] Zp;
  
  private static final byte[] Zo;
  
  private final Zsoh Zt;
  
  private final Zkl6 Za;
  
  private final Ze3n ZC;
  
  private Zb6q ZY;
  
  private byte[] Zy;
  
  private long Zn;
  
  private Zb6q ZS;
  
  private byte[] Z_;
  
  private byte[] Zu;
  
  public Zru6(Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n) {
    this.Zt = paramZsoh;
    int[] arrayOfInt = Ziz.ZZ();
    this.Za = paramZkl6;
    this.ZC = paramZe3n;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_HttpPutEnabled;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    int[] arrayOfInt = Ziz.ZZ();
    Zy(paramZtpx);
    if (this.ZY == null) {
      Zuh.Zb(false, Zqf.Zk);
      return;
    } 
    if (Zd())
      return; 
    ZS(paramZtpx);
    if (this.ZS == null) {
      Zuh.Zb(false, Zqf.Zk);
      return;
    } 
    if (ZE())
      return; 
    paramZz4_.Zz(ZO());
    if (Zbqc.Zwu() == null)
      Ziz.Zw(new int[1]); 
  }
  
  private void Zy(Ztpx paramZtpx) {
    this.Zy = this.Za.Zs().ZO().Zj(Zsss.PUT).Zf(new Zax(this.ZC.Za(), Zp)).ZZ(Zyf.Zy(Zo)).Zr().ZiD();
    this.ZY = this.Zt.ZD(Ztao.Zc(paramZtpx, this.ZC.ZM(), this.Zy).Zz(false).ZA()).ZG().Ze();
    this.Zn = System.currentTimeMillis();
  }
  
  private boolean Zd() {
    short s = this.ZY.Ze();
    return (s < 200 || s >= 300);
  }
  
  private void ZS(Ztpx paramZtpx) {
    this.Z_ = this.Za.Zs().ZO().Zf(new Zax(this.ZC.Za(), Zp)).Zr().ZiD();
    this.ZS = this.Zt.ZD(Ztao.Zc(paramZtpx, this.ZC.ZM(), this.Z_).Zz(false).ZA()).ZG().Ze();
  }
  
  private boolean ZE() {
    this.Zu = this.ZS.Za().ZiD();
    return (Zli.ZR(this.Zu, Zo) == -1);
  }
  
  private Zx_5 ZO() {
    List<Zl1r> list1 = Zv();
    List<Zl1r> list2 = ZM();
    List<Zl1r> list3 = Zu();
    List<Zl1r> list4 = ZY();
    Zvow zvow1 = Zx(list1, list2);
    Zvow zvow2 = ZA(list3, list4);
    return Zg2v.Zl(this.ZC.Za(), this.ZC.ZN(), zvow1, zvow2, Zv);
  }
  
  private List<Zl1r> Zv() {
    ArrayList<Zl1r> arrayList = new ArrayList(2);
    Zl8v.Za(Zp, this.Zy, arrayList);
    Zl8v.Za(Zo, this.Zy, arrayList);
    return arrayList;
  }
  
  private List<Zl1r> ZM() {
    ArrayList<Zl1r> arrayList = new ArrayList(1);
    arrayList.add(Zrlp.Zj(0, ((String)this.ZY.Zm().get(0)).length()));
    return arrayList;
  }
  
  private List<Zl1r> Zu() {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zl8v.Za(Zp, this.Z_, arrayList);
    return arrayList;
  }
  
  private List<Zl1r> ZY() {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zl8v.Za(Zo, this.Zu, arrayList);
    return arrayList;
  }
  
  private Zvow Zx(List<Zl1r> paramList1, List<Zl1r> paramList2) {
    return this.ZC.ZI().ZF(this.Zn).Zp(this.Zy).ZK(paramList1).Zu(this.ZY.Za()).Z_(paramList2);
  }
  
  private Zvow ZA(List<Zl1r> paramList1, List<Zl1r> paramList2) {
    return this.ZC.ZI().Zp(this.Z_).ZK(paramList1).ZK(this.Zu).Z_(paramList2);
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc '#{\\b\\t'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #101
    //   82: goto -> 112
    //   85: bipush #103
    //   87: goto -> 112
    //   90: bipush #24
    //   92: goto -> 112
    //   95: bipush #21
    //   97: goto -> 112
    //   100: bipush #79
    //   102: goto -> 112
    //   105: bipush #92
    //   107: goto -> 112
    //   110: bipush #84
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: new net/portswigger/Zsy
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zru6.Zx : Lnet/portswigger/Zsy;
    //   164: getstatic burp/Zru6.Zx : Lnet/portswigger/Zsy;
    //   167: invokevirtual Zi : ()Lnet/portswigger/Zk5;
    //   170: invokevirtual ZG : ()Lnet/portswigger/Zk5;
    //   173: bipush #10
    //   175: invokevirtual ZK : (I)Ljava/lang/String;
    //   178: ldc '/'
    //   180: swap
    //   181: aload_0
    //   182: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   187: putstatic burp/Zru6.Zv : Ljava/lang/String;
    //   190: getstatic burp/Zru6.Zx : Lnet/portswigger/Zsy;
    //   193: invokevirtual Zi : ()Lnet/portswigger/Zk5;
    //   196: invokevirtual ZG : ()Lnet/portswigger/Zk5;
    //   199: bipush #10
    //   201: invokevirtual ZK : (I)Ljava/lang/String;
    //   204: putstatic burp/Zru6.Ze : Ljava/lang/String;
    //   207: getstatic burp/Zru6.Zv : Ljava/lang/String;
    //   210: invokestatic Zy : (Ljava/lang/String;)[B
    //   213: putstatic burp/Zru6.Zp : [B
    //   216: getstatic burp/Zru6.Ze : Ljava/lang/String;
    //   219: invokestatic Zy : (Ljava/lang/String;)[B
    //   222: putstatic burp/Zru6.Zo : [B
    //   225: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zru6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */