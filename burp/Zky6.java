package burp;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import net.portswigger.Zkb;

public class Zky6 extends Zkte {
  private final Zkc7 Zv;
  
  public Zky6(Zr_4 paramZr_4, Zkc7 paramZkc7) {
    super(paramZr_4, paramZkc7);
    this.Zv = paramZkc7;
  }
  
  public void Zy4() throws Ztku {
    this.Zv.Zy4();
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zmn3.ZU();
    if (this.Zv.ZvX()) {
      if (Zs(this.Zv.Zv7().ZtG()))
        return null; 
      byte[] arrayOfByte1 = ZxH();
      if (arrayOfInt == null) {
        if (Zh(this.Zv.Zv8().Z_s()))
          return null; 
        arrayOfByte1 = Zxx();
        ZxK();
        return this.Zv.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, arrayOfByte1);
      } 
      ZxK();
      return this.Zv.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, arrayOfByte1);
    } 
    if (Zh(this.Zv.Zv8().Z_s()))
      return null; 
    byte[] arrayOfByte = Zxx();
    ZxK();
    return this.Zv.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, arrayOfByte);
  }
  
  public void ZyK() {
    this.Zv.ZyK();
  }
  
  private boolean Zs(BigInteger paramBigInteger) {
    BigDecimal bigDecimal = this.Zv.ZvH().Z_s();
    return this.Zv.ZvJ() ? ((this.Zv.ZvL() >= this.Zv.Zv3())) : ((bigDecimal.compareTo(this.Zv.ZvG().Z_s()) >= 0) ? ((paramBigInteger.compareTo(bigDecimal.toBigInteger()) > 0)) : ((paramBigInteger.compareTo(bigDecimal.toBigInteger()) < 0)));
  }
  
  private boolean Zh(BigDecimal paramBigDecimal) {
    BigDecimal bigDecimal = this.Zv.ZvH().Z_s();
    return this.Zv.ZvJ() ? ((this.Zv.ZvL() >= this.Zv.Zv3())) : ((bigDecimal.compareTo(this.Zv.ZvG().Z_s()) >= 0) ? ((paramBigDecimal.compareTo(bigDecimal) > 0)) : ((paramBigDecimal.compareTo(bigDecimal) < 0)));
  }
  
  private byte[] ZxH() {
    if (this.Zv.ZvJ()) {
      BigInteger bigInteger = ZxU().toBigInteger();
      this.Zv.ZW(Zlc9.Z_(bigInteger, this.Zn));
    } 
    return Zx7();
  }
  
  private BigDecimal ZxU() {
    BigDecimal bigDecimal1 = BigDecimal.valueOf(Math.random());
    BigDecimal bigDecimal2 = this.Zv.ZvH().Z_s().subtract(this.Zv.ZvG().Z_s());
    return this.Zv.ZvG().Z_s().add(bigDecimal1.multiply(bigDecimal2));
  }
  
  private byte[] Zx7() {
    byte b = this.Zv.Zv5();
    StringBuilder stringBuilder = new StringBuilder(this.Zv.Zv7().ZtG().toString(16));
    int[] arrayOfInt = Zmn3.ZU();
    while (stringBuilder.length() < this.Zv.ZvK()) {
      stringBuilder.insert(0, '0');
      if (arrayOfInt == null)
        break; 
    } 
    if (stringBuilder.length() > b)
      stringBuilder.setLength(b); 
    return Zkb.Zy(stringBuilder.toString());
  }
  
  private byte[] Zxx() {
    if (this.Zv.ZvJ()) {
      BigDecimal bigDecimal = ZxU();
      this.Zv.Zj(Zlct.ZV(bigDecimal, this.Zn));
    } 
    return Zxl();
  }
  
  private byte[] Zxl() {
    byte[] arrayOfByte;
    Zl_n zl_n = this.Zv.Zve();
    synchronized (zl_n.Zz6()) {
      arrayOfByte = Zkb.Zy(zl_n.ZXN().format(this.Zv.Zv8().Z_s()));
    } 
    return arrayOfByte;
  }
  
  private void ZxK() {
    // Byte code:
    //   0: invokestatic ZU : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zv : Lburp/Zkc7;
    //   8: invokeinterface ZvJ : ()Z
    //   13: ifne -> 134
    //   16: aload_0
    //   17: getfield Zv : Lburp/Zkc7;
    //   20: invokeinterface Zv6 : ()Lburp/Zmu9;
    //   25: invokeinterface Z_s : ()Ljava/math/BigDecimal;
    //   30: astore_2
    //   31: aload_0
    //   32: getfield Zv : Lburp/Zkc7;
    //   35: invokeinterface ZvX : ()Z
    //   40: ifeq -> 90
    //   43: aload_0
    //   44: getfield Zv : Lburp/Zkc7;
    //   47: invokeinterface Zv7 : ()Lburp/Ztju;
    //   52: invokeinterface ZtG : ()Ljava/math/BigInteger;
    //   57: astore_3
    //   58: aload_3
    //   59: aload_2
    //   60: invokevirtual toBigInteger : ()Ljava/math/BigInteger;
    //   63: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   66: astore #4
    //   68: aload_0
    //   69: getfield Zv : Lburp/Zkc7;
    //   72: aload #4
    //   74: aload_0
    //   75: getfield Zn : Lburp/Zr_4;
    //   78: invokestatic Z_ : (Ljava/math/BigInteger;Lburp/Zr_4;)Lburp/Ztju;
    //   81: invokeinterface ZW : (Lburp/Ztju;)V
    //   86: aload_1
    //   87: ifnonnull -> 130
    //   90: aload_0
    //   91: getfield Zv : Lburp/Zkc7;
    //   94: invokeinterface Zv8 : ()Lburp/Zmu9;
    //   99: invokeinterface Z_s : ()Ljava/math/BigDecimal;
    //   104: astore_3
    //   105: aload_3
    //   106: aload_2
    //   107: invokevirtual add : (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    //   110: astore #4
    //   112: aload_0
    //   113: getfield Zv : Lburp/Zkc7;
    //   116: aload #4
    //   118: aload_0
    //   119: getfield Zn : Lburp/Zr_4;
    //   122: invokestatic ZV : (Ljava/math/BigDecimal;Lburp/Zr_4;)Lburp/Zmu9;
    //   125: invokeinterface Zj : (Lburp/Zmu9;)V
    //   130: aload_1
    //   131: ifnonnull -> 154
    //   134: aload_0
    //   135: getfield Zv : Lburp/Zkc7;
    //   138: aload_0
    //   139: getfield Zv : Lburp/Zkc7;
    //   142: invokeinterface ZvL : ()I
    //   147: iconst_1
    //   148: iadd
    //   149: invokeinterface ZNi : (I)V
    //   154: return
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.Zv.ZS(paramZs4f);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zky6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */