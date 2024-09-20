package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zp8 extends Zni implements Zbza {
  @Zzvo(0)
  private final Zmzk ZK;
  
  @Zzvo(3)
  private final String Zm;
  
  @Zzvo(6)
  private int ZE;
  
  @Zzvo(7)
  private byte ZG;
  
  @Zzvo(8)
  private int Zi;
  
  @Zzvo(9)
  private int ZT;
  
  @Zzvo(12)
  private int Zy;
  
  @Zzvo(13)
  private Zrdb ZA;
  
  @Zzvo(14)
  private final Zefg<Zrdb> ZC = new Zyu<>(Zrdb.ZW, 0);
  
  @Zzvo(1)
  private final Zstu ZD;
  
  @Zzvo(2)
  private Zstu Z_;
  
  private Zz1p Zu;
  
  @Zzvo(4)
  private long Zq;
  
  @Zzvo(5)
  private long ZZ;
  
  @Zzvo(18)
  private long ZX;
  
  @Zzvo(19)
  private long ZO;
  
  @Zzvo(34)
  private final Zzwo<Zro0, Zga> Zd;
  
  @Zzvo(15)
  private final Zefg<Zrrc> ZY;
  
  @Zzvo(16)
  private String Zk;
  
  @Zzvo(17)
  private byte Zf;
  
  private final Object Zj = new Object();
  
  private final Object Zb = new Object();
  
  @Zzvo(20)
  private final boolean Zz;
  
  @Zzvo(32)
  private final Zzg0 Zs;
  
  @Zzvo(21)
  private int Zw;
  
  @Zzvo(22)
  private int ZF;
  
  @Zzvo(23)
  private int Zv;
  
  @Zzvo(24)
  private int Zn;
  
  @Zzvo(25)
  private long Zg;
  
  @Zzvo(26)
  private final Zefg<Zrdb> ZL = new Zyu<>(Zrdb.ZW, 0);
  
  @Zzvo(27)
  private Zefg<Zsdr> Zc;
  
  @Zzvo(28)
  private byte ZJ;
  
  @Zzvo(29)
  private Zkv9 Ze;
  
  @Zzvo(30)
  private Zefg<Zsdr> Zx;
  
  @Zzvo(31)
  private Zefg<Zb09> Zl;
  
  Zp8(int paramInt1, Zmzk paramZmzk, Zstu paramZstu1, Zzg0 paramZzg0, Zstu paramZstu2, String paramString1, long paramLong1, long paramLong2, Zzwo<Zro0, Zga> paramZzwo, Zefg<Zrrc> paramZefg, byte paramByte1, String paramString2, byte paramByte2, long paramLong3, long paramLong4, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    String[] arrayOfString = Zlby.ZL();
    this.ZE = paramInt1;
    this.ZK = paramZmzk;
    this.Zs = paramZzg0;
    this.Z_ = paramZstu2;
    this.ZD = paramZstu1;
    this.Zm = paramString1;
    this.Zq = paramLong1;
    this.ZZ = paramLong2;
    this.Zd = paramZzwo;
    this.ZY = paramZefg;
    this.ZG = paramByte1;
    this.Zk = paramString2;
    this.Zf = paramByte2;
    this.ZX = paramLong3;
    this.ZO = paramLong4;
    this.Zz = paramBoolean;
    this.Zw = paramInt2;
    this.ZF = paramInt3;
    this.Zv = paramInt4;
    this.Zn = paramInt5;
    if (Zbqc.Zwu() == null)
      Zlby.Zg(new String[2]); 
  }
  
  public Ze3n Zv(Zbnt paramZbnt, Zlg4 paramZlg4, Zxdk paramZxdk, Zlox paramZlox, Zz1m<Zt1o> paramZz1m) {
    return Ztcb.Zk(this, paramZlg4, paramZxdk, paramZlox, paramZz1m);
  }
  
  public Zbza ZP(Zr_4 paramZr_4, boolean paramBoolean) {
    return Ztcb.ZU(this, paramZr_4, paramBoolean);
  }
  
  public String Zgu() {
    return Ztcb.ZO(this);
  }
  
  public boolean ZgL() {
    return (this.Z_ != null);
  }
  
  public long Zgd() {
    return this.ZZ;
  }
  
  public void ZF(long paramLong) {
    this.ZZ = paramLong;
  }
  
  public void ZR(Zstu paramZstu, long paramLong) {
    this.Z_ = paramZstu;
    this.Zq = paramLong;
  }
  
  public byte[] ZgC() {
    return (this.ZD == null) ? null : this.ZD.ZiD();
  }
  
  public byte[] ZgV() {
    return (this.Z_ == null) ? null : this.Z_.ZiD();
  }
  
  public Zstu Zgy() {
    return this.ZD;
  }
  
  public Zstu Zgz() {
    return this.Z_;
  }
  
  public Zz1p ZU(Zbnt paramZbnt) {
    synchronized (Zz6()) {
      if (Zgy() != null && this.Zu == null)
        this.Zu = Zghc.ZY(Zg0(), Zgy(), (byte)3, paramZbnt); 
      return this.Zu;
    } 
  }
  
  public int hashCode() {
    return Ztcb.ZY(this);
  }
  
  public Zmzk Zg0() {
    return this.ZK;
  }
  
  public String ZgY() {
    return this.Zm;
  }
  
  public int Zgv() {
    return this.ZE;
  }
  
  public void ZgZ(int paramInt) {
    this.ZE = paramInt;
  }
  
  public byte Zg6() {
    return this.ZG;
  }
  
  public void ZN(byte paramByte) {
    this.ZG = paramByte;
  }
  
  public int ZgR() {
    return this.Zi;
  }
  
  public void ZgM() {
    this.Zi++;
  }
  
  public int Zgx() {
    return this.ZT;
  }
  
  public void Zgq() {
    this.ZT++;
  }
  
  public void Zg9(int paramInt) {
    this.Zy = paramInt;
  }
  
  public Zrdb ZgI() {
    return this.ZA;
  }
  
  public void ZU(Zrdb paramZrdb) {
    this.ZA = paramZrdb;
    Zuh.Zb(this.Zz, Zqf.Zr);
  }
  
  public void Ze(List<Zrdb> paramList) {
    String[] arrayOfString = Zlby.ZL();
    synchronized (this.Zj) {
      if (this.Zz)
        this.ZC.addAll(paramList); 
      for (Zrdb zrdb : paramList) {
        if (this.Zz && (ZgI() == null || Zb3i.ZZ(ZgI(), zrdb) == 1))
          ZU(zrdb); 
        switch (zrdb.Zaw()) {
          case 1:
            this.Zw++;
          case 2:
            this.ZF++;
          case 3:
            this.Zv++;
          case 4:
            this.Zn++;
          default:
            Zuh.Zv(false, Zqf.Zr, zrdb.Zaw());
            break;
        } 
        continue;
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  public List<Zrdb> Zgr() {
    synchronized (this.Zj) {
      return List.copyOf(this.ZC);
    } 
  }
  
  public int ZgS() {
    return this.Zn;
  }
  
  public int Zg9() {
    return this.Zv;
  }
  
  public int ZgH() {
    return this.ZF;
  }
  
  public int ZgJ() {
    return this.Zw;
  }
  
  public long Zgw() {
    return this.Zq;
  }
  
  public void Zl(long paramLong) {
    this.Zq = paramLong;
  }
  
  public long ZgK() {
    return this.ZX;
  }
  
  public void Zt(long paramLong) {
    this.ZX = paramLong;
  }
  
  public long Zg5() {
    return this.ZO;
  }
  
  public void Zp(long paramLong) {
    this.ZO = paramLong;
  }
  
  public Zefg<Zrrc> Zgf() {
    return this.ZY;
  }
  
  public Zmfj ZgW() {
    return Zsou.ZY(this);
  }
  
  public boolean ZO(Zl5x paramZl5x) {
    return Ztcb.Zf(this.Zg, paramZl5x);
  }
  
  public void ZR(Zl5x paramZl5x) {
    this.Zg = Ztcb.ZI(this.Zg, paramZl5x);
  }
  
  public void Zy(Zl5x paramZl5x) {
    this.Zg = Ztcb.Za(this.Zg, paramZl5x);
  }
  
  public Collection<Zb09> ZgA() {
    return (this.Zl == null) ? Collections.<Zb09>emptySet() : this.Zl;
  }
  
  public void Zq(Zb09 paramZb09) {
    if (this.Zl == null)
      this.Zl = new Zyu<>(Zb09.Zh, 5); 
    if (!this.Zl.contains(paramZb09))
      this.Zl.add(paramZb09); 
  }
  
  public Zlby ZW(Zl5x paramZl5x) {
    return Ztcb.Zv(this.Zg, paramZl5x);
  }
  
  public void Zu(Zl5x paramZl5x, Zlby paramZlby) {
    this.Zg = Ztcb.ZH(this.Zg, paramZl5x, paramZlby);
  }
  
  public boolean Zge() {
    return (this.Zs != null);
  }
  
  public Zzg0 Zg3() {
    return this.Zs;
  }
  
  public List<Zrdb> Zgc() {
    synchronized (this.Zb) {
      return List.copyOf(this.ZL);
    } 
  }
  
  public void Zi(Zrdb paramZrdb) {
    synchronized (this.Zb) {
      this.ZL.add(paramZrdb);
    } 
  }
  
  public void Zo(Zro0 paramZro0, boolean paramBoolean) {
    if (this.Zc == null)
      this.Zc = new Zyu<>(Zsdr.Zo, 0); 
    String str = paramBoolean ? (paramZro0.toString() + "|") : paramZro0.toString();
    this.Zc.add(new Zw_(str));
  }
  
  public void Zq(Zro0 paramZro0, boolean paramBoolean) {
    if (this.Zc != null) {
      String str = paramBoolean ? (paramZro0.toString() + "|") : paramZro0.toString();
      this.Zc.remove(new Zw_(str));
    } 
  }
  
  public boolean ZM(Zro0 paramZro0) {
    return (this.Zc != null && this.Zc.contains(new Zw_(paramZro0.toString())));
  }
  
  public boolean Zm(Zro0 paramZro0) {
    return (this.Zc != null && this.Zc.contains(new Zw_(paramZro0.toString() + "|")));
  }
  
  public String ZIx() {
    return this.Zk;
  }
  
  public void Zxg(String paramString) {
    this.Zk = paramString;
  }
  
  public void ZB(byte paramByte) {
    this.Zf = paramByte;
  }
  
  public byte ZaP() {
    return this.Zf;
  }
  
  public boolean Zd(Zz28 paramZz28) {
    return Ztcb.ZK(this, paramZz28);
  }
  
  public Zeu4<Zbza> ZF() {
    return Zp;
  }
  
  public Zkv9 Zgh() {
    if (this.Ze == null)
      this.Ze = new Zpz(this.ZE); 
    return this.Ze;
  }
  
  public boolean ZgD() {
    return (this.Ze != null);
  }
  
  public int Zgo() {
    return (this.Zx == null) ? 0 : this.Zx.size();
  }
  
  public void Zi(int paramInt, Zro0 paramZro0) {
    if (this.Zx == null)
      this.Zx = new Zyu<>(Zsdr.Zo, 10); 
    Zw_ zw_ = new Zw_(Ztcb.Zi(paramInt, paramZro0));
    if (!this.Zx.contains(zw_))
      this.Zx.add(zw_); 
  }
  
  public void ZgX() {
    synchronized (Zz6()) {
      this.ZJ = Ztcb.Zm(this.ZJ);
    } 
  }
  
  public boolean Zgt() {
    return Ztcb.Zq(this.ZJ);
  }
  
  public void Zg2() {
    synchronized (Zz6()) {
      this.ZJ = Ztcb.Zo(this.ZJ);
    } 
  }
  
  public boolean Zga() {
    return Ztcb.Zn(this.ZJ);
  }
  
  public Zzwo<Zro0, Zga> ZgT() {
    return this.Zd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zp8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */