package burp;

public class Zz2j {
  private final Ze6o Zt;
  
  private final Zzp7 ZU;
  
  private final Zzp7 Ze;
  
  private final Zzp7 Zq;
  
  private final Zzp7 Zj;
  
  private final Zzp7 Zp;
  
  private final Zzp7 ZT;
  
  private Zgsq ZG;
  
  private Zbnt Zv;
  
  private Zmzk Zm;
  
  private Zefx Zk;
  
  private Zz1p ZH;
  
  private Zs68 ZV;
  
  private Zzp7 ZQ;
  
  private Zzp7 ZW;
  
  private Zey9 Zi;
  
  private static String[] ZN;
  
  public Zz2j(Ze6o paramZe6o) {
    this.Zt = paramZe6o;
    this.ZU = new Zzp7();
    this.Ze = new Zzp7();
    this.Zq = new Zzp7();
    this.Zj = new Zzp7();
    this.Zp = new Zzp7();
    this.ZT = new Zzp7();
    this.ZG = Zgsq.AUTO;
  }
  
  void Zn(Zbnt paramZbnt) {
    this.Zv = paramZbnt;
  }
  
  public void Zf(Zey9 paramZey9) {
    this.Zi = paramZey9;
  }
  
  void ZN(byte[] paramArrayOfbyte) {
    this.ZU.ZM(paramArrayOfbyte);
    this.ZH = null;
  }
  
  byte[] Zm() {
    return this.ZU.ZE();
  }
  
  Zstu ZN() {
    return this.ZU.Zr(this.Zt);
  }
  
  public void Zc(byte[] paramArrayOfbyte) {
    this.Ze.ZM(paramArrayOfbyte);
    this.ZV = null;
  }
  
  Zstu ZO() {
    return this.Ze.Zr(this.Zt);
  }
  
  void Zs(byte[] paramArrayOfbyte) {
    this.Zq.ZM(paramArrayOfbyte);
    this.ZH = null;
  }
  
  Zstu Za() {
    return this.Zq.Zr(this.Zt);
  }
  
  void Zv(byte[] paramArrayOfbyte) {
    this.Zj.ZM(paramArrayOfbyte);
    this.ZV = null;
  }
  
  Zstu ZF() {
    return this.Zj.Zr(this.Zt);
  }
  
  void ZQ(byte[] paramArrayOfbyte) {
    this.Zp.ZM(paramArrayOfbyte);
    this.ZH = null;
  }
  
  byte[] ZU() {
    return this.Zp.ZE();
  }
  
  Zstu ZP() {
    return this.Zp.Zr(this.Zt);
  }
  
  void Zt(byte[] paramArrayOfbyte) {
    this.ZT.ZM(paramArrayOfbyte);
    this.ZV = null;
  }
  
  Zstu Zv() {
    return this.ZT.Zr(this.Zt);
  }
  
  private Zzp7 Zl() {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zp : Lburp/Zzp7;
    //   8: invokevirtual ZP : ()Z
    //   11: ifeq -> 23
    //   14: aload_0
    //   15: getfield Zp : Lburp/Zzp7;
    //   18: astore_2
    //   19: aload_1
    //   20: ifnonnull -> 47
    //   23: aload_0
    //   24: getfield Zq : Lburp/Zzp7;
    //   27: invokevirtual ZP : ()Z
    //   30: ifeq -> 42
    //   33: aload_0
    //   34: getfield Zq : Lburp/Zzp7;
    //   37: astore_2
    //   38: aload_1
    //   39: ifnonnull -> 47
    //   42: aload_0
    //   43: getfield ZU : Lburp/Zzp7;
    //   46: astore_2
    //   47: aload_0
    //   48: aload_2
    //   49: invokevirtual ZI : (Lburp/Zzp7;)V
    //   52: aload_2
    //   53: areturn
  }
  
  private void ZI(Zzp7 paramZzp7) {
    if (paramZzp7 != this.ZQ) {
      this.ZQ = paramZzp7;
      this.Zk = null;
      this.ZH = null;
    } 
  }
  
  public byte[] ZA() {
    return Zl().ZE();
  }
  
  private Zzp7 Zn() {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZT : Lburp/Zzp7;
    //   8: invokevirtual ZP : ()Z
    //   11: ifeq -> 23
    //   14: aload_0
    //   15: getfield ZT : Lburp/Zzp7;
    //   18: astore_2
    //   19: aload_1
    //   20: ifnonnull -> 47
    //   23: aload_0
    //   24: getfield Zj : Lburp/Zzp7;
    //   27: invokevirtual ZP : ()Z
    //   30: ifeq -> 42
    //   33: aload_0
    //   34: getfield Zj : Lburp/Zzp7;
    //   37: astore_2
    //   38: aload_1
    //   39: ifnonnull -> 47
    //   42: aload_0
    //   43: getfield Ze : Lburp/Zzp7;
    //   46: astore_2
    //   47: aload_0
    //   48: aload_2
    //   49: invokevirtual ZD : (Lburp/Zzp7;)V
    //   52: aload_2
    //   53: areturn
  }
  
  private void ZD(Zzp7 paramZzp7) {
    if (paramZzp7 != this.ZW) {
      this.ZW = paramZzp7;
      this.ZV = null;
    } 
  }
  
  public byte[] Zt() {
    return Zn().ZE();
  }
  
  public Zgsq ZM() {
    return this.ZG;
  }
  
  public void Zl(Zgsq paramZgsq) {
    this.ZG = paramZgsq;
  }
  
  public void ZF(Zmzk paramZmzk) {
    this.Zm = paramZmzk;
  }
  
  public Zmzk Zx() {
    return this.Zm;
  }
  
  public void ZJ(Zlit paramZlit) {
    this.ZH = Ztvi.ZA(this.ZH).ZO(paramZlit).Zi();
  }
  
  private void ZY() {
    byte[] arrayOfByte = ZA();
    this.Zk = (arrayOfByte == null) ? null : this.Zi.ZY(this.Zm, arrayOfByte);
  }
  
  public Zefx ZH() {
    if (this.Zk == null)
      ZY(); 
    return this.Zk;
  }
  
  private void ZW() {
    byte[] arrayOfByte = ZA();
    this.ZH = (arrayOfByte == null) ? null : Zekx.Zu(this.Zm, arrayOfByte, (byte)3, this.Zv);
  }
  
  public Zz1p Zk() {
    if (this.ZH == null)
      ZW(); 
    return this.ZH;
  }
  
  private void ZX() {
    byte[] arrayOfByte = Zt();
    this.ZV = (arrayOfByte == null) ? null : Zmre.ZK(Zk(), arrayOfByte, Zt0k.HTML_ANALYSIS, this.Zv);
  }
  
  public Zs68 Zo() {
    if (this.ZV == null)
      ZX(); 
    return this.ZV;
  }
  
  public static void Zj(String[] paramArrayOfString) {
    ZN = paramArrayOfString;
  }
  
  public static String[] ZJ() {
    return ZN;
  }
  
  static {
    if (ZJ() == null)
      Zj(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */