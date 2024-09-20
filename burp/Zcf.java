package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zcf extends Zni implements Zm39 {
  @Zzvo(0)
  private boolean Zi;
  
  @Zzvo(1)
  private boolean ZW;
  
  @Zzvo(73)
  private int ZF;
  
  @Zzvo(2)
  private int Zp;
  
  @Zzvo(3)
  private int Zx;
  
  @Zzvo(4)
  private int ZQm;
  
  @Zzvo(5)
  private int ZT;
  
  @Zzvo(60)
  private boolean ZH = true;
  
  @Zzvo(6)
  private boolean ZQe;
  
  @Zzvo(7)
  private String ZQ1 = "";
  
  @Zzvo(8)
  private int Zg;
  
  @Zzvo(9)
  private String Zn = "";
  
  @Zzvo(10)
  private final Zs1t ZQ4;
  
  @Zzvo(11)
  private boolean Zq;
  
  @Zzvo(12)
  private boolean Zo;
  
  @Zzvo(13)
  private boolean ZS;
  
  @Zzvo(14)
  private boolean ZI;
  
  @Zzvo(15)
  private boolean Zy;
  
  @Zzvo(16)
  private boolean ZR;
  
  @Zzvo(20)
  private boolean ZB;
  
  @Zzvo(61)
  private boolean Zc = true;
  
  @Zzvo(28)
  private boolean ZA;
  
  @Zzvo(29)
  private boolean ZV;
  
  @Zzvo(30)
  private boolean Z_;
  
  @Zzvo(31)
  private boolean Zr;
  
  @Zzvo(35)
  private boolean Zs;
  
  @Zzvo(36)
  private final boolean[] Zw = new boolean[9];
  
  @Zzvo(44)
  private String ZZ = "";
  
  @Zzvo(45)
  private String Zd = "";
  
  @Zzvo(46)
  private int ZM;
  
  @Zzvo(47)
  private boolean ZY;
  
  @Zzvo(62)
  private boolean Zb = true;
  
  @Zzvo(53)
  private final Zefg<Zl5v> Zk;
  
  @Zzvo(63)
  private boolean Zj = true;
  
  @Zzvo(59)
  private final Zefg<Zrer> Zl;
  
  @Zzvo(48)
  private final Zeek Ze = new Zcz(2);
  
  @Zzvo(49)
  private final Zl34 ZC = new Zcl(true);
  
  @Zzvo(50)
  private final Zefg<Zmk5> ZK = new Zyu<>(Zmk5.ZY);
  
  @Zzvo(51)
  private final Zefg<Zt9r> ZL = new Zyu<>(Zt9r.Zp);
  
  @Zzvo(52)
  private final Zelo Zv;
  
  @Zzvo(54)
  private final Zefg<Zmg8> ZQO;
  
  @Zzvo(55)
  private final Zefg<Zzp3> Za;
  
  @Zzvo(56)
  private final Zefg<Zsdr> ZO;
  
  @Zzvo(57)
  private final Zefg<Zsdr> ZD;
  
  @Zzvo(65)
  private final Zrte<Zsdr> ZQK;
  
  @Zzvo(66)
  private final Zrte<Zsdr> Zu;
  
  @Zzvo(67)
  private boolean ZJ;
  
  private Zbii Zm;
  
  @Zzvo(70)
  private boolean Zf;
  
  @Zzvo(69)
  private boolean ZE;
  
  @Zzvo(71)
  private boolean ZG;
  
  @Zzvo(72)
  private byte ZX;
  
  @Zzvo(74)
  private boolean Zz;
  
  @Zzvo(75)
  private boolean Zt;
  
  @Zzvo(76)
  private boolean Zh;
  
  public Zcf() {
    int[] arrayOfInt = Zok.Zi();
    this.Zv = new Zaj();
    this.Zk = new Zyu<>(Zl5v.ZX);
    this.ZQO = new Zyu<>(Zmg8.Zm);
    this.Za = new Zyu<>(Zzp3.Zc);
    this.ZO = new Zyu<>(Zsdr.Zo);
    this.ZD = new Zyu<>(Zsdr.Zo);
    this.Zl = new Zyu<>(Zrer.Zg);
    this.ZQ4 = new Za8();
    this.ZQK = new Zyp<>(Zsdr.Zo, 10);
    this.Zu = new Zyp<>(Zsdr.Zo, 10);
    this.Zm = Zbii.USE_ALL_SUPPORTED;
    this.ZX = -1;
    this.Zh = true;
    if (Zbqc.Zwu() == null)
      Zok.ZE(new int[1]); 
  }
  
  public void ZCG(boolean paramBoolean) {
    this.Zi = paramBoolean;
  }
  
  public boolean ZO6() {
    return this.Zi;
  }
  
  public void ZCp(boolean paramBoolean) {
    this.ZW = paramBoolean;
  }
  
  public boolean Zfc() {
    return this.ZW;
  }
  
  public void ZDX(int paramInt) {
    this.ZF = paramInt;
  }
  
  public int ZfW() {
    return this.ZF;
  }
  
  public void ZDB(int paramInt) {
    this.Zp = paramInt;
  }
  
  public int Zf_() {
    return this.Zp;
  }
  
  public void ZDi(int paramInt) {
    this.Zx = paramInt;
  }
  
  public int ZfA() {
    return this.Zx;
  }
  
  public int ZfL() {
    return this.ZQm;
  }
  
  public void ZDa(int paramInt) {
    this.ZQm = paramInt;
  }
  
  public int Zfa() {
    return this.ZT;
  }
  
  public void ZD8(int paramInt) {
    this.ZT = paramInt;
  }
  
  public boolean Zfw() {
    return this.ZQe;
  }
  
  public void ZCN(boolean paramBoolean) {
    this.ZQe = paramBoolean;
  }
  
  public String ZfO() {
    return this.ZQ1;
  }
  
  public void ZAQ(String paramString) {
    this.ZQ1 = paramString;
  }
  
  public int ZfR() {
    return this.Zg;
  }
  
  public void ZDp(int paramInt) {
    this.Zg = paramInt;
  }
  
  public String ZfF() {
    return this.Zn;
  }
  
  public void ZAw(String paramString) {
    this.Zn = paramString;
  }
  
  public Zs1t Zff() {
    return this.ZQ4;
  }
  
  public boolean Zfp() {
    return this.ZH;
  }
  
  public void ZCF(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public boolean Zfm() {
    return this.Zq;
  }
  
  public void ZCq(boolean paramBoolean) {
    this.Zq = paramBoolean;
  }
  
  public boolean Zfl() {
    return this.Zo;
  }
  
  public void ZCK(boolean paramBoolean) {
    this.Zo = paramBoolean;
  }
  
  public boolean ZfN() {
    return this.ZS;
  }
  
  public void ZC6(boolean paramBoolean) {
    this.ZS = paramBoolean;
  }
  
  public boolean Zfv() {
    return this.ZI;
  }
  
  public void ZCe(boolean paramBoolean) {
    this.ZI = paramBoolean;
  }
  
  public boolean Zf8() {
    return this.Zy;
  }
  
  public void ZCc(boolean paramBoolean) {
    this.Zy = paramBoolean;
  }
  
  public boolean ZfV() {
    return this.ZR;
  }
  
  public void ZCR(boolean paramBoolean) {
    this.ZR = paramBoolean;
  }
  
  public boolean ZOr() {
    return this.ZB;
  }
  
  public void ZCT(boolean paramBoolean) {
    this.ZB = paramBoolean;
  }
  
  public boolean ZO9() {
    return this.Zc;
  }
  
  public void ZCU(boolean paramBoolean) {
    this.Zc = paramBoolean;
  }
  
  public boolean Zft() {
    return this.ZA;
  }
  
  public void ZCg(boolean paramBoolean) {
    this.ZA = paramBoolean;
  }
  
  public boolean ZfB() {
    return this.ZV;
  }
  
  public void ZCM(boolean paramBoolean) {
    this.ZV = paramBoolean;
  }
  
  public Zelo ZOh() {
    return this.Zv;
  }
  
  public boolean ZO3() {
    return this.Z_;
  }
  
  public void ZC9(boolean paramBoolean) {
    this.Z_ = paramBoolean;
  }
  
  public boolean Zf1() {
    return this.Zr;
  }
  
  public void ZCD(boolean paramBoolean) {
    this.Zr = paramBoolean;
  }
  
  public boolean ZfP() {
    return this.Zs;
  }
  
  public void ZCW(boolean paramBoolean) {
    this.Zs = paramBoolean;
  }
  
  public boolean ZO4() {
    return this.ZJ;
  }
  
  public void ZCs(boolean paramBoolean) {
    this.ZJ = paramBoolean;
  }
  
  public boolean ZOu() {
    return this.Zt;
  }
  
  public void ZCk(boolean paramBoolean) {
    this.Zt = paramBoolean;
  }
  
  public boolean Zo(Zeew paramZeew) {
    return this.Zw[Zok.ZD(paramZeew)];
  }
  
  public void ZJ(Zeew paramZeew, boolean paramBoolean) {
    this.Zw[Zok.ZD(paramZeew)] = paramBoolean;
  }
  
  public boolean[] ZOt() {
    boolean[] arrayOfBoolean = new boolean[9];
    System.arraycopy(this.Zw, 0, arrayOfBoolean, 0, 9);
    return arrayOfBoolean;
  }
  
  public void Zr(boolean[] paramArrayOfboolean) {
    Zuh.Zb((paramArrayOfboolean.length == this.Zw.length && paramArrayOfboolean.length == 9), Zqf.Zr);
    System.arraycopy(paramArrayOfboolean, 0, this.Zw, 0, 9);
  }
  
  public String ZfI() {
    return this.ZZ;
  }
  
  public void ZA_(String paramString) {
    this.ZZ = paramString;
  }
  
  public String ZOF() {
    return this.Zd;
  }
  
  public void ZAP(String paramString) {
    this.Zd = paramString;
  }
  
  public int ZOP() {
    return this.ZM;
  }
  
  public void ZDv(int paramInt) {
    this.ZM = paramInt;
  }
  
  public boolean ZfH() {
    return this.ZY;
  }
  
  public void ZCS(boolean paramBoolean) {
    this.ZY = paramBoolean;
  }
  
  public Zeek Zfr() {
    return this.Ze;
  }
  
  public Zl34 Zf9() {
    return this.ZC;
  }
  
  public Zefg<Zmk5> Zf6() {
    return this.ZK;
  }
  
  public Zefg<Zt9r> Zfu() {
    return this.ZL;
  }
  
  public boolean Zfb() {
    return this.Zb;
  }
  
  public void ZCO(boolean paramBoolean) {
    this.Zb = paramBoolean;
  }
  
  public Zefg<Zl5v> ZfZ() {
    return this.Zk;
  }
  
  public Zefg<Zmg8> Zfg() {
    return this.ZQO;
  }
  
  public Zefg<Zzp3> ZOz() {
    return this.Za;
  }
  
  public Zefg<Zsdr> ZfY() {
    return this.ZO;
  }
  
  public Zefg<Zsdr> Zfo() {
    return this.ZD;
  }
  
  public Zeu4<? extends Zm39> ZF() {
    return ZQ;
  }
  
  public boolean Zfj() {
    return this.Zj;
  }
  
  public void ZCy(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  public Zefg<Zrer> Zfs() {
    return this.Zl;
  }
  
  public String Zi(Zeew paramZeew) {
    Zsdr zsdr = this.ZQK.ZdF(Zok.ZD(paramZeew));
    return (zsdr == null) ? null : zsdr.toString();
  }
  
  public void ZQ(Zeew paramZeew, String paramString) {
    this.ZQK.ZU(Zok.ZD(paramZeew), (paramString == null) ? null : new Zw_(paramString));
  }
  
  public String Zm(Zeew paramZeew) {
    Zsdr zsdr = this.Zu.ZdF(Zok.ZD(paramZeew));
    return (zsdr == null) ? null : zsdr.toString();
  }
  
  public void ZK(Zeew paramZeew, String paramString) {
    this.Zu.ZU(Zok.ZD(paramZeew), (paramString == null) ? null : new Zw_(paramString));
  }
  
  public Zbii ZO0() {
    return this.Zm;
  }
  
  public void Zr(Zbii paramZbii) {
    this.Zm = paramZbii;
  }
  
  public void ZC3(boolean paramBoolean) {
    this.Zf = paramBoolean;
  }
  
  public boolean ZOR() {
    return this.Zf;
  }
  
  public void ZCE(boolean paramBoolean) {
    this.Zz = paramBoolean;
  }
  
  public boolean Zf0() {
    return this.Zz;
  }
  
  public byte ZfX() {
    return this.ZX;
  }
  
  public void Z_(byte paramByte) {
    this.ZX = paramByte;
  }
  
  public boolean ZOC() {
    return this.Zh;
  }
  
  public void ZCX(boolean paramBoolean) {
    this.Zh = paramBoolean;
  }
  
  @Zzvo(68)
  private byte ZHg() {
    return this.Zm.id;
  }
  
  public boolean ZfS() {
    return this.ZE;
  }
  
  public void ZCx(boolean paramBoolean) {
    this.ZE = paramBoolean;
  }
  
  public boolean Zfi() {
    return this.ZG;
  }
  
  public void ZCm(boolean paramBoolean) {
    this.ZG = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zcf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */