package net.portswigger;

import burp.Zbqc;

public class Zen {
  public final Zco Zv;
  
  public final int Zb;
  
  public final String ZO;
  
  private final byte[] Zn = Zna.Zl();
  
  private static int Zg;
  
  public Zen(Zco paramZco, int paramInt, String paramString) {
    this.Zv = paramZco;
    this.Zb = paramInt;
    this.ZO = paramString;
  }
  
  public Zen(byte[] paramArrayOfbyte, Zco paramZco, int paramInt, String paramString) {
    this.Zv = paramZco;
    this.Zb = paramInt;
    this.ZO = paramString;
  }
  
  public String toString() {
    String str1 = this.Zv.toString() + this.Zv.toString() + "g" + Integer.toHexString(this.Zb) + "z";
    String str2 = Zcu.Zc(this.Zn, str1);
    char c = Zrx9.ZQ(this.Zn[0], this.Zn[1]);
    int i = Zx();
    if (Zbqc.Zwu() == null)
      ZE(++i); 
    return Zkb.Zo(this.Zn, 0, this.Zn.length) + Zkb.Zo(this.Zn, 0, this.Zn.length) + c;
  }
  
  public byte[] ZZ() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lnet/portswigger/Zco;
    //   4: invokevirtual Zp : ()Ljava/lang/String;
    //   7: aload_0
    //   8: getfield Zb : I
    //   11: aload_0
    //   12: getfield ZO : Ljava/lang/String;
    //   15: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   20: astore_2
    //   21: invokestatic ZE : ()I
    //   24: aload_2
    //   25: invokevirtual length : ()I
    //   28: newarray byte
    //   30: astore_3
    //   31: iconst_0
    //   32: istore #4
    //   34: istore_1
    //   35: iload #4
    //   37: aload_2
    //   38: invokevirtual length : ()I
    //   41: if_icmpge -> 90
    //   44: aload_2
    //   45: iload #4
    //   47: invokevirtual charAt : (I)C
    //   50: istore #5
    //   52: iload #5
    //   54: bipush #122
    //   56: if_icmpne -> 69
    //   59: aload_3
    //   60: iload #4
    //   62: bipush #122
    //   64: bastore
    //   65: iload_1
    //   66: ifne -> 83
    //   69: aload_3
    //   70: iload #4
    //   72: aload_2
    //   73: iload #4
    //   75: invokevirtual charAt : (I)C
    //   78: i2b
    //   79: invokestatic Zd : (B)B
    //   82: bastore
    //   83: iinc #4, 1
    //   86: iload_1
    //   87: ifne -> 35
    //   90: aload_3
    //   91: areturn
  }
  
  public boolean ZL(byte[] paramArrayOfbyte) {
    return (Zt1.Zn(paramArrayOfbyte, ZZ(), true, 0, paramArrayOfbyte.length) != -1);
  }
  
  public static Zen Zh(Zen paramZen) {
    int i = paramZen.ZO.lastIndexOf("w") + 1;
    if (i >= paramZen.ZO.length())
      return null; 
    Zrze zrze = Zrze.Zi(paramZen.ZO.substring(i));
    return (zrze == null) ? null : new Zen(Zcu.ZS(paramZen.Zn, zrze.ZI), paramZen.Zv, 1, paramZen.ZO.substring(0, paramZen.ZO.indexOf("w")));
  }
  
  public static Zen Zj(Zen paramZen, int paramInt, String paramString) {
    return new Zen(Zna.Zw(paramZen.Zn, paramInt), paramZen.Zv, paramZen.Zb, paramString);
  }
  
  public static Zen ZR(Zen paramZen, int paramInt, String paramString) {
    return new Zen(Zna.Zw(paramZen.Zn, -paramInt), paramZen.Zv, paramZen.Zb, paramString);
  }
  
  public static void ZE(int paramInt) {
    Zg = paramInt;
  }
  
  public static int Zx() {
    return Zg;
  }
  
  public static int ZE() {
    int i = Zx();
    return (i == 0) ? 14 : 0;
  }
  
  static {
    if (ZE() == 0)
      ZE(112); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */