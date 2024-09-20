package burp;

import java.util.Arrays;
import java.util.Objects;

public class Z_r extends Zni implements Zgxp {
  @Zzvo(1)
  private short Zl;
  
  @Zzvo(2)
  private short ZR;
  
  @Zzvo(3)
  private int Zi;
  
  @Zzvo(4)
  private int ZG;
  
  @Zzvo(5)
  private int ZZ;
  
  @Zzvo(6)
  private long Zu;
  
  @Zzvo(7)
  private long ZM;
  
  @Zzvo(8)
  private long ZD;
  
  @Zzvo(9)
  private byte ZK;
  
  @Zzvo(10)
  private byte Zf;
  
  @Zzvo(11)
  private Zstu Ze;
  
  @Zzvo(12)
  private Zxph Zp;
  
  @Zzvo(13)
  private boolean ZL;
  
  @Zzvo(14)
  private boolean ZH;
  
  @Zzvo(15)
  private boolean Zn;
  
  @Zzvo(16)
  private Zstu Zv;
  
  @Zzvo(17)
  private Zstu Zy;
  
  @Zzvo(18)
  private Zznf Zh;
  
  @Zzvo(19)
  private Zrte<Zmzk> Zc;
  
  @Zzvo(20)
  private Zxo Zj;
  
  @Zzvo(21)
  private String ZO;
  
  @Zzvo(22)
  private Zmzk ZJ;
  
  @Zzvo(23)
  private Zlit Zs;
  
  @Zzvo(24)
  private final Zefg<Ztkk> ZQ;
  
  private final Zr_4 Zt;
  
  public Z_r(Zmzk paramZmzk, Zefg<Ztkk> paramZefg, Zr_4 paramZr_4) {
    this.ZJ = paramZmzk;
    this.ZQ = paramZefg;
    this.Zt = paramZr_4;
  }
  
  public Zeu4<? extends Zgxp> ZF() {
    return (Zeu4<? extends Zgxp>)ZN;
  }
  
  public void Zk(Zstu paramZstu) {
    this.Zv = paramZstu;
  }
  
  public void Zj(Zstu paramZstu) {
    this.Zy = paramZstu;
  }
  
  public byte[] ZcV() {
    return (this.Zy != null) ? this.Zy.ZiD() : null;
  }
  
  public Zlit ZlL() {
    if (this.Zs == null)
      this.Zs = Zsim.Zq(this, new Zbnt(this.Zt)); 
    return this.Zs;
  }
  
  public short Zl7() {
    return this.ZR;
  }
  
  public int Zlq() {
    return this.ZG;
  }
  
  public String ZIx() {
    return this.ZO;
  }
  
  public void Zxg(String paramString) {
    this.ZO = paramString;
  }
  
  public Zmzk Zod() {
    return this.ZJ;
  }
  
  public Zstu Zos() {
    return this.Zv;
  }
  
  public Zstu ZoO() {
    return this.Zy;
  }
  
  public void ZB(byte paramByte) {
    this.Zf = paramByte;
  }
  
  public byte ZaP() {
    return this.Zf;
  }
  
  public void ZWu(int paramInt) {
    this.Zi = paramInt;
  }
  
  public boolean equals(Object paramObject) {
    return Zsim.ZC(this, paramObject);
  }
  
  public int hashCode() {
    int i = Objects.hash(new Object[] { this.Zv, Integer.valueOf(Zep()), Short.valueOf(Zer()), Integer.valueOf(Arrays.hashCode(ZcV())), Short.valueOf(Zl7()) });
    i = 31 * i;
    String str = Zsim.ZE();
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
    return i;
  }
  
  public String toString() {
    return Zsim.ZM(this);
  }
  
  public void Zt(Zmzk paramZmzk) {
    this.ZJ = paramZmzk;
  }
  
  public Zefg<Ztkk> Zed() {
    return this.ZQ;
  }
  
  public int Zep() {
    return this.Zi;
  }
  
  public Zxph Ze9() {
    return this.Zp;
  }
  
  public void Zw(Zxph paramZxph) {
    this.Zp = paramZxph;
  }
  
  public short Zer() {
    return this.Zl;
  }
  
  public void ZWD(int paramInt) {
    this.Zl = (short)paramInt;
  }
  
  public long Zef() {
    return this.Zu;
  }
  
  public void ZN(long paramLong) {
    this.Zu = paramLong;
  }
  
  public void ZWs(int paramInt) {
    this.ZG = paramInt;
  }
  
  public int Ze0() {
    return this.ZZ;
  }
  
  public void ZWb(int paramInt) {
    this.ZZ = paramInt;
  }
  
  public void Zq(short paramShort) {
    this.ZR = paramShort;
  }
  
  public long Ze7() {
    return this.ZM;
  }
  
  public void ZX(long paramLong) {
    this.ZM = paramLong;
  }
  
  public long Zey() {
    return this.ZD;
  }
  
  public void ZY(long paramLong) {
    this.ZD = paramLong;
  }
  
  public boolean Ze4() {
    return this.ZL;
  }
  
  public void ZZb(boolean paramBoolean) {
    this.ZL = paramBoolean;
  }
  
  public boolean ZeZ() {
    return this.ZH;
  }
  
  public void ZZD(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public Zstu Zex() {
    return this.Ze;
  }
  
  public void ZV(Zstu paramZstu) {
    this.Ze = paramZstu;
  }
  
  public Zznf ZeD() {
    return this.Zh;
  }
  
  public void ZB(Zznf paramZznf) {
    this.Zh = paramZznf;
  }
  
  public byte Ze8() {
    return this.ZK;
  }
  
  public void ZK(byte paramByte) {
    this.ZK = paramByte;
  }
  
  public Zrte<Zmzk> ZeV() {
    return this.Zc;
  }
  
  public void ZH(Zrte<Zmzk> paramZrte) {
    this.Zc = paramZrte;
  }
  
  public Zxo ZeB() {
    return this.Zj;
  }
  
  public void ZD(Zxo paramZxo) {
    this.Zj = paramZxo;
  }
  
  public boolean Zew() {
    return this.Zn;
  }
  
  public void ZZZ(boolean paramBoolean) {
    this.Zn = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */