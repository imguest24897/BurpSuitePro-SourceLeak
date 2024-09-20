package burp;

import java.time.Duration;

public class Zzzx implements Zz1 {
  private static final Zlgm Zx = new Zmad();
  
  private final Zl11 Z_;
  
  private final Zgb6 ZV;
  
  private final Zzen Zg;
  
  private final Zr69 Zf;
  
  private final Zz3j Za;
  
  public Zzzx(Zl11 paramZl11, Zskh paramZskh, Zgb6 paramZgb6, Zr69 paramZr69, Ztos<Zt16> paramZtos, Zz3j paramZz3j) {
    this.Z_ = paramZl11;
    this.ZV = paramZgb6;
    this.Zf = paramZr69;
    this.Za = paramZz3j;
    this.Zg = new Zm33(paramZr69.ZD(), paramZskh, paramZtos);
  }
  
  public Ztaw ZJ(Zefx paramZefx, Duration paramDuration1, Duration paramDuration2, Zsil paramZsil) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 8
    //   4: aload_2
    //   5: goto -> 17
    //   8: aload_0
    //   9: getfield Zf : Lburp/Zr69;
    //   12: invokeinterface ZS : ()Ljava/time/Duration;
    //   17: astore_2
    //   18: aload_3
    //   19: ifnull -> 26
    //   22: aload_3
    //   23: goto -> 35
    //   26: aload_0
    //   27: getfield Zf : Lburp/Zr69;
    //   30: invokeinterface Zn : ()Ljava/time/Duration;
    //   35: astore_3
    //   36: aload_0
    //   37: getfield ZV : Lburp/Zgb6;
    //   40: invokestatic ZG : (Lburp/Zgb6;)Lburp/Zs38;
    //   43: getstatic burp/Zzzx.Zx : Lburp/Zlgm;
    //   46: invokevirtual Zp : (Lburp/Zlgm;)Lburp/Zs38;
    //   49: iconst_1
    //   50: invokevirtual Ze : (Z)Lburp/Zs38;
    //   53: aload_2
    //   54: invokevirtual Zq : (Ljava/time/Duration;)Lburp/Zs38;
    //   57: aload_3
    //   58: invokevirtual ZI : (Ljava/time/Duration;)Lburp/Zs38;
    //   61: astore #5
    //   63: aload #5
    //   65: invokevirtual Zy : ()Lburp/Zts5;
    //   68: astore #6
    //   70: aload_0
    //   71: getfield Za : Lburp/Zz3j;
    //   74: aload_0
    //   75: aload_1
    //   76: aload #6
    //   78: aload #4
    //   80: <illegal opcode> get : (Lburp/Zzzx;Lburp/Zefx;Lburp/Zts5;Lburp/Zsil;)Ljava/util/function/Supplier;
    //   85: aload_1
    //   86: invokevirtual Z_ : (Ljava/util/function/Supplier;Lburp/Zefx;)Lburp/Ztaw;
    //   89: areturn
  }
  
  public Zsxd Zf(Zlgm paramZlgm, Zefx paramZefx, Duration paramDuration1, Duration paramDuration2, Ze45 paramZe45, boolean paramBoolean, Zsil paramZsil) {
    // Byte code:
    //   0: aload_3
    //   1: ifnull -> 8
    //   4: aload_3
    //   5: goto -> 17
    //   8: aload_0
    //   9: getfield Zf : Lburp/Zr69;
    //   12: invokeinterface ZS : ()Ljava/time/Duration;
    //   17: astore_3
    //   18: aload #4
    //   20: ifnull -> 28
    //   23: aload #4
    //   25: goto -> 37
    //   28: aload_0
    //   29: getfield Zf : Lburp/Zr69;
    //   32: invokeinterface Zn : ()Ljava/time/Duration;
    //   37: astore #4
    //   39: aload_0
    //   40: getfield ZV : Lburp/Zgb6;
    //   43: invokestatic ZG : (Lburp/Zgb6;)Lburp/Zs38;
    //   46: getstatic burp/Zzzx.Zx : Lburp/Zlgm;
    //   49: invokevirtual Zp : (Lburp/Zlgm;)Lburp/Zs38;
    //   52: iconst_1
    //   53: invokevirtual Ze : (Z)Lburp/Zs38;
    //   56: aload_3
    //   57: invokevirtual Zq : (Ljava/time/Duration;)Lburp/Zs38;
    //   60: aload #5
    //   62: invokevirtual ZV : (Lburp/Ze45;)Lburp/Zs38;
    //   65: iload #6
    //   67: ifne -> 74
    //   70: iconst_1
    //   71: goto -> 75
    //   74: iconst_0
    //   75: invokevirtual Zi : (Z)Lburp/Zs38;
    //   78: aload #4
    //   80: invokevirtual ZI : (Ljava/time/Duration;)Lburp/Zs38;
    //   83: astore #8
    //   85: aload_0
    //   86: getfield Za : Lburp/Zz3j;
    //   89: aload_0
    //   90: aload_2
    //   91: aload #8
    //   93: aload #7
    //   95: <illegal opcode> get : (Lburp/Zzzx;Lburp/Zefx;Lburp/Zs38;Lburp/Zsil;)Ljava/util/function/Supplier;
    //   100: aload_2
    //   101: invokevirtual Z_ : (Ljava/util/function/Supplier;Lburp/Zefx;)Lburp/Ztaw;
    //   104: invokeinterface Zv : ()Lburp/Zsxd;
    //   109: areturn
  }
  
  private Zsxd lambda$issueWebSocketConnectRequest$1(Zefx paramZefx, Zs38 paramZs38, Zsil paramZsil) {
    return this.Z_.ZE(paramZefx, paramZs38.Zy(), paramZsil, this.Zg);
  }
  
  private Zsxd lambda$buildRequestIssuer$0(Zefx paramZefx, Zts5 paramZts5, Zsil paramZsil) {
    return this.Z_.ZE(paramZefx, paramZts5, paramZsil, this.Zg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzzx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */