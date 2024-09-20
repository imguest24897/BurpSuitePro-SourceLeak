package burp;

import java.util.ArrayList;
import java.util.List;

public class Zzzp {
  private final Zb3t Zg;
  
  private final Zrn9 Zd;
  
  private final int ZH;
  
  private final Zxpd ZE;
  
  private final Zl_5 Zb;
  
  private Zkr1<Zmv4> ZU;
  
  private boolean ZN;
  
  private int ZS;
  
  private Zzzp ZQ;
  
  private List<Zkr1<Zmv4>> ZO;
  
  private Zeqy Zc;
  
  public Zzzp(Zb3t paramZb3t, Zrn9 paramZrn9, Zxpd paramZxpd) {
    this(paramZb3t, paramZrn9, 0, null, paramZxpd);
  }
  
  public Zzzp(Zb3t paramZb3t, Zrn9 paramZrn9, int paramInt, Zzzp paramZzzp, Zxpd paramZxpd) {
    this.Zg = paramZb3t;
    this.Zd = paramZrn9;
    String[] arrayOfString = Zsdd.Zv();
    this.ZH = paramInt;
    this.ZE = paramZxpd;
    this.Zb = new Zl_5(paramZxpd);
    this.ZQ = paramZzzp;
    this.ZS = paramZrn9.ZP();
    this.ZU = new Zkr1<>();
    this.ZO = new ArrayList<>(1);
    this.Zc = new Zeqy();
    if (paramZb3t != null) {
      Zeme zeme = new Zeme(paramZb3t, paramZrn9, this, paramZxpd);
      zeme.Za(paramInt);
      zeme.ZO(this.ZU);
      Zh();
      this.Zc.Zp(paramZb3t, paramZrn9.Zp().get(paramInt));
    } 
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zsdd Zy() {
    return Zo();
  }
  
  public Zsdd Zf() {
    Zsdd zsdd;
    do {
      zsdd = Zy();
    } while (zsdd != null && !this.ZN);
    return zsdd;
  }
  
  public int Zj() {
    return this.ZH;
  }
  
  private void Zh() {
    this.ZO.add(this.ZU);
    Zzzp zzzp = this.ZQ;
    String[] arrayOfString = Zsdd.Zv();
    while (zzzp != null) {
      if (zzzp.Zg == this.Zg)
        this.ZO.add(zzzp.ZU); 
      zzzp = zzzp.ZQ;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private Zsdd Zo() {
    ZR();
    Zsdd zsdd = null;
    String[] arrayOfString = Zsdd.Zv();
    while ((zsdd == null || zsdd.ZS() == 0) && this.ZU.ZP() != null) {
      zsdd = ZX();
      if (arrayOfString != null)
        break; 
    } 
    ZT(zsdd);
    return zsdd;
  }
  
  private void ZT(Zsdd paramZsdd) {
    this.ZN = (paramZsdd != null && Zr(paramZsdd.ZS()));
  }
  
  private void ZR() {
    if (this.ZN)
      this.ZU.Zc(); 
  }
  
  private Zsdd ZX() {
    Zmv4 zmv41 = this.ZU.ZP();
    int i = zmv41.ZP();
    Zmu7 zmu7 = zmv41.ZC();
    Zmv4 zmv42 = zmu7.ZT();
    if (zmv42 == null) {
      this.ZU.Zc();
      return null;
    } 
    return Zn(i, zmv42, zmu7);
  }
  
  private Zsdd Zn(int paramInt, Zmv4 paramZmv4, Zmu7 paramZmu7) {
    // Byte code:
    //   0: invokestatic Zv : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_2
    //   6: ifnull -> 260
    //   9: aload_0
    //   10: iload_1
    //   11: aload_2
    //   12: invokevirtual ZQ : (ILburp/Zmv4;)I
    //   15: istore_1
    //   16: aload_2
    //   17: invokeinterface ZM : ()Lburp/Zb3t;
    //   22: astore #5
    //   24: aload_0
    //   25: aload #5
    //   27: invokevirtual ZU : (Lburp/Zb3t;)Z
    //   30: ifeq -> 50
    //   33: new burp/Zsdd
    //   36: dup
    //   37: aload_0
    //   38: getfield ZU : Lburp/Zkr1;
    //   41: aload_0
    //   42: getfield Zd : Lburp/Zrn9;
    //   45: iload_1
    //   46: invokespecial <init> : (Lburp/Zkr1;Lburp/Zrn9;I)V
    //   49: areturn
    //   50: aload_0
    //   51: iload_1
    //   52: invokevirtual Zr : (I)Z
    //   55: ifeq -> 85
    //   58: aload_2
    //   59: aload_0
    //   60: getfield ZU : Lburp/Zkr1;
    //   63: invokeinterface ZO : (Lburp/Zkr1;)V
    //   68: new burp/Zsdd
    //   71: dup
    //   72: aload_0
    //   73: getfield ZU : Lburp/Zkr1;
    //   76: aload_0
    //   77: getfield Zd : Lburp/Zrn9;
    //   80: iload_1
    //   81: invokespecial <init> : (Lburp/Zkr1;Lburp/Zrn9;I)V
    //   84: areturn
    //   85: aload_0
    //   86: aload #5
    //   88: iload_1
    //   89: invokevirtual Zg : (Lburp/Zb3t;I)Z
    //   92: ifeq -> 241
    //   95: aload_0
    //   96: getfield Zd : Lburp/Zrn9;
    //   99: invokevirtual Zp : ()Ljava/util/List;
    //   102: iload_1
    //   103: invokeinterface get : (I)Ljava/lang/Object;
    //   108: checkcast burp/Zb3t
    //   111: astore #6
    //   113: aload #5
    //   115: aload #6
    //   117: if_acmpne -> 192
    //   120: iinc #1, 1
    //   123: aload_0
    //   124: iload_1
    //   125: invokevirtual Zr : (I)Z
    //   128: ifeq -> 165
    //   131: aload_2
    //   132: iload_1
    //   133: invokeinterface Za : (I)V
    //   138: aload_2
    //   139: aload_0
    //   140: getfield ZU : Lburp/Zkr1;
    //   143: invokeinterface ZO : (Lburp/Zkr1;)V
    //   148: new burp/Zsdd
    //   151: dup
    //   152: aload_0
    //   153: getfield ZU : Lburp/Zkr1;
    //   156: aload_0
    //   157: getfield Zd : Lburp/Zrn9;
    //   160: iload_1
    //   161: invokespecial <init> : (Lburp/Zkr1;Lburp/Zrn9;I)V
    //   164: areturn
    //   165: aload_0
    //   166: getfield Zc : Lburp/Zeqy;
    //   169: aload_0
    //   170: getfield Zg : Lburp/Zb3t;
    //   173: aload_0
    //   174: getfield Zd : Lburp/Zrn9;
    //   177: invokevirtual Zp : ()Ljava/util/List;
    //   180: iload_1
    //   181: invokeinterface get : (I)Ljava/lang/Object;
    //   186: checkcast burp/Zb3t
    //   189: invokevirtual Zp : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   192: aload_2
    //   193: iload_1
    //   194: invokeinterface Za : (I)V
    //   199: aload_2
    //   200: aload_0
    //   201: getfield ZU : Lburp/Zkr1;
    //   204: invokeinterface ZO : (Lburp/Zkr1;)V
    //   209: aload_0
    //   210: getfield Zb : Lburp/Zl_5;
    //   213: aload_0
    //   214: getfield ZU : Lburp/Zkr1;
    //   217: iload_1
    //   218: aload_0
    //   219: getfield Zd : Lburp/Zrn9;
    //   222: invokevirtual ZM : (Lburp/Zkr1;ILburp/Zrn9;)Z
    //   225: ifeq -> 260
    //   228: aload_0
    //   229: getfield ZU : Lburp/Zkr1;
    //   232: invokevirtual Zc : ()Ljava/lang/Object;
    //   235: pop
    //   236: aload #4
    //   238: ifnull -> 260
    //   241: aload_3
    //   242: invokeinterface ZT : ()Lburp/Zmv4;
    //   247: astore_2
    //   248: aload_0
    //   249: getfield ZE : Lburp/Zxpd;
    //   252: invokevirtual ZZ : ()V
    //   255: aload #4
    //   257: ifnull -> 5
    //   260: aconst_null
    //   261: areturn
  }
  
  private int ZQ(int paramInt, Zmv4 paramZmv4) {
    if (paramZmv4.ZP() > paramInt)
      paramInt = paramZmv4.ZP(); 
    return paramInt;
  }
  
  private boolean ZU(Zb3t paramZb3t) {
    return (Zl19.ZR(paramZb3t) && !Zl19.Zb(paramZb3t));
  }
  
  private boolean Zr(int paramInt) {
    return (paramInt == this.ZS);
  }
  
  private boolean Zg(Zb3t paramZb3t, int paramInt) {
    String[] arrayOfString = Zsdd.Zv();
    for (Zkr1<Zmv4> zkr1 : this.ZO) {
      if (ZQ(paramZb3t, paramInt, zkr1))
        return false; 
      if (arrayOfString != null)
        break; 
    } 
    return true;
  }
  
  private boolean ZQ(Zb3t paramZb3t, int paramInt, Zkr1<Zmv4> paramZkr1) {
    String[] arrayOfString = Zsdd.Zv();
    if (paramZkr1 == null)
      return false; 
    if (paramZb3t == null)
      return true; 
    for (Zmv4 zmv4 : paramZkr1) {
      if (zmv4.Za(paramZb3t, paramInt))
        return true; 
      if (arrayOfString != null)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzzp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */