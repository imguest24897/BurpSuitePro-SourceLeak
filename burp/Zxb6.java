package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxb6 extends Zxsr implements Zzi8 {
  private static final String a;
  
  Zxb6(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZaY() {
    return this.Za.Zi(this, Zks5.ZN);
  }
  
  public Zefg<Zrrc> ZaC() {
    return (Zefg<Zrrc>)this.Za.ZJ(this, Zks5.ZU);
  }
  
  public Zefg<Zrrc> Zae() {
    return (Zefg<Zrrc>)this.Za.ZJ(this, Zks5.ZM);
  }
  
  public Zstu ZL(Zmzk paramZmzk, Zey9 paramZey9) {
    return this.Za.ZZ(ZB(paramZmzk, paramZey9));
  }
  
  public byte[] ZB(Zmzk paramZmzk, Zey9 paramZey9) {
    Zbr zbr = Zo3();
    if (zbr == null)
      return null; 
    Zefx zefx = zbr.ZP(paramZmzk, paramZey9);
    return zefx.Zb().ZD();
  }
  
  public boolean Za3() {
    return this.Za.Zi(this, Zks5.ZV);
  }
  
  public Zefg<Zl2_> ZaV() {
    return (Zefg<Zl2_>)this.Za.ZJ(this, Zks5.ZR);
  }
  
  public Zeew Ze2() {
    return Zeew.SCANNER;
  }
  
  public short Zl7() {
    return this.Za.ZQ(this, Zks5.ZF);
  }
  
  public int Zlq() {
    return this.Za.Zx(this, Zks5.ZC);
  }
  
  public String ZIx() {
    return null;
  }
  
  public Zmzk Zod() {
    return this.Za.<Zmzk>ZJ(this, Zks5.Z_);
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return Ztx6.Zr(paramComponent);
  }
  
  public Zlit ZlL() {
    return this.Za.<Zlit>ZJ(this, Zks5.Zd);
  }
  
  public Zbr Zo3() {
    Zefg<Zk94> zefg = (Zefg)this.Za.ZJ(this, Zks5.ZD);
    Zstu zstu = this.Za.<Zstu>ZA(this, Zks5.Zi);
    byte b = this.Za.ZL(this, Zks5.Za);
    return (zefg == null && zstu == null) ? null : Zbr.ZK(zefg, zstu, Zkyt.Zf(b));
  }
  
  public Zstu Zos() {
    Zefg zefg = (Zefg)this.Za.ZJ(this, Zks5.ZD);
    Zuh.ZT((zefg == null), Zqf.Zr, a);
    return this.Za.<Zstu>ZA(this, Zks5.Zi);
  }
  
  public Zstu ZoO() {
    return this.Za.<Zstu>ZA(this, Zks5.ZA);
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return this.Za.ZL(this, Zks5.Zv);
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Ztx6.Zy(this, paramZkl6.ZH());
  }
  
  public Zeu4<Zzi8> ZF() {
    return ZP;
  }
  
  public boolean equals(Object paramObject) {
    return Ztx6.ZH(this, paramObject);
  }
  
  public int hashCode() {
    return Ztx6.ZW(this);
  }
  
  public String toString() {
    return Ztx6.Zi(this);
  }
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc 'b<A;X{21Q=`#Q=U<N&fW<DXy3U*D\\n\|'*X!Hd";UnH{#TyY N|#Q='
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxb6.a : Ljava/lang/String;
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
    //   80: bipush #74
    //   82: goto -> 112
    //   85: bipush #35
    //   87: goto -> 112
    //   90: bipush #74
    //   92: goto -> 112
    //   95: bipush #52
    //   97: goto -> 112
    //   100: bipush #71
    //   102: goto -> 112
    //   105: bipush #114
    //   107: goto -> 112
    //   110: bipush #60
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxb6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */