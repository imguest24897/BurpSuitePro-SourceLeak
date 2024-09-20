package burp;

public class Zxh8 extends Zxsr implements Zznf {
  protected Zxh8(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public byte[] ZTt() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_k.ZF);
    if (zstu != null)
      return zstu.ZiD(); 
    Zsqo zsqo = this.Za.<Zsqo>ZA(this, Zk_k.Zv);
    if (zsqo != null) {
      byte[] arrayOfByte = Zkv.Za(zsqo.ZK4());
      Zk(arrayOfByte);
      return arrayOfByte;
    } 
    return null;
  }
  
  public void Zk(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZZ : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Za : Lburp/Zkit;
    //   8: aload_0
    //   9: getstatic burp/Zk_k.Zv : Lburp/Zeki;
    //   12: aconst_null
    //   13: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   16: aload_1
    //   17: ifnonnull -> 33
    //   20: aload_0
    //   21: getfield Za : Lburp/Zkit;
    //   24: aload_0
    //   25: getstatic burp/Zk_k.ZF : Lburp/Zeki;
    //   28: aconst_null
    //   29: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   32: return
    //   33: aload_0
    //   34: getfield Za : Lburp/Zkit;
    //   37: aload_0
    //   38: getstatic burp/Zk_k.ZF : Lburp/Zeki;
    //   41: invokevirtual ZA : (Lburp/Zgpi;Lburp/Zeki;)Lburp/Ze34;
    //   44: checkcast burp/Zstu
    //   47: astore_3
    //   48: aload_3
    //   49: ifnull -> 87
    //   52: aload_1
    //   53: arraylength
    //   54: aload_3
    //   55: invokeinterface Zpu : ()I
    //   60: if_icmpne -> 87
    //   63: aload_3
    //   64: aload_1
    //   65: invokeinterface Zt : ([B)Lburp/Zstu;
    //   70: pop
    //   71: aload_0
    //   72: getfield Za : Lburp/Zkit;
    //   75: aload_0
    //   76: getstatic burp/Zk_k.ZF : Lburp/Zeki;
    //   79: aload_3
    //   80: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   83: aload_2
    //   84: ifnonnull -> 126
    //   87: aload_0
    //   88: getfield Za : Lburp/Zkit;
    //   91: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   94: aload_1
    //   95: arraylength
    //   96: invokevirtual Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   99: checkcast burp/Zstu
    //   102: astore #4
    //   104: aload #4
    //   106: aload_1
    //   107: invokeinterface Zt : ([B)Lburp/Zstu;
    //   112: pop
    //   113: aload_0
    //   114: getfield Za : Lburp/Zkit;
    //   117: aload_0
    //   118: getstatic burp/Zk_k.ZF : Lburp/Zeki;
    //   121: aload #4
    //   123: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   126: invokestatic Zwu : ()[Lburp/Zbqc;
    //   129: ifnonnull -> 137
    //   132: ldc 'ENdALb'
    //   134: invokestatic ZZ : (Ljava/lang/String;)V
    //   137: return
  }
  
  public Zrte<Zstu> ZTL() {
    return this.Za.<Zrte<Zstu>>ZA(this, Zk_k.ZQ);
  }
  
  public void ZV(Zrte<Zstu> paramZrte) {
    this.Za.ZQ(this, Zk_k.ZQ, paramZrte);
  }
  
  public byte[] ZT8() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zk_k.Za);
    if (zstu != null)
      return zstu.ZiD(); 
    Zsqo zsqo = this.Za.<Zsqo>ZA(this, Zk_k.ZV);
    if (zsqo != null) {
      byte[] arrayOfByte = Zkv.Zm(zsqo.ZK4());
      ZY(arrayOfByte);
      return arrayOfByte;
    } 
    return null;
  }
  
  public void ZY(byte[] paramArrayOfbyte) {
    String str = Zkv.ZZ();
    this.Za.ZQ(this, Zk_k.ZV, null);
    if (paramArrayOfbyte == null) {
      this.Za.ZQ(this, Zk_k.Za, null);
      return;
    } 
    Zstu zstu1 = this.Za.<Zstu>ZA(this, Zk_k.Za);
    if (zstu1 != null && paramArrayOfbyte.length == zstu1.Zpu()) {
      zstu1.Zt(paramArrayOfbyte);
      this.Za.ZQ(this, Zk_k.Za, zstu1);
      if (str == null) {
        Zbqc.Zr(new Zbqc[2]);
      } else {
        return;
      } 
    } 
    Zstu zstu2 = this.Za.<Zstu>Zv(Zstu.Zc, paramArrayOfbyte.length);
    zstu2.Zt(paramArrayOfbyte);
    this.Za.ZQ(this, Zk_k.Za, zstu2);
  }
  
  public Zeu4<? extends Zznf> ZF() {
    return Zznf.ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxh8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */