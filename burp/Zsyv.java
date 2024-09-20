package burp;

import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

public class Zsyv extends Zsyh {
  private final Zl7h Zl;
  
  private final Zz1m<Zt18> ZR;
  
  private static final String a;
  
  public Zsyv(ScheduledExecutorService paramScheduledExecutorService, Zlog paramZlog, Zr69 paramZr69, Zrgd paramZrgd, Zz1m<Zt18> paramZz1m) {
    super(paramZlog, paramScheduledExecutorService, new Zzoe(paramZlog, paramZr69, paramZrgd));
    this.Zl = paramZlog.ZnH();
    this.ZR = paramZz1m;
  }
  
  public Zsyv ZM(Zlli<Zt13> paramZlli, Zlli<Zt18> paramZlli1) {
    ZU(paramZlli);
    paramZlli1.ZE(Zt18.ZD, this::lambda$subscribingTo$0);
    paramZlli1.ZE(Zt18.ZW, this::lambda$subscribingTo$1);
    paramZlli1.ZE(Zt18.ZS, this::lambda$subscribingTo$1);
    return this;
  }
  
  public void Zq(Zlli<Zt35> paramZlli) {
    paramZlli.ZE(Zt35.ZT, this::lambda$subscribeToActEvents$3);
    paramZlli.ZE(Zt35.ZO, this::lambda$subscribeToActEvents$4);
    paramZlli.ZE(Zt35.Zu, this::lambda$subscribeToActEvents$5);
    paramZlli.ZE(Zt35.Za, this::lambda$subscribeToActEvents$6);
  }
  
  private void ZZ(Zez7 paramZez7) {
    ZD();
  }
  
  private void ZC(Zrp0 paramZrp0) {
    this.Zl.Zj(1);
  }
  
  private void Zd(Zrp0 paramZrp0) {
    this.Zl.ZQ(1);
    this.Zl.ZM(1);
    ZA(1);
  }
  
  private void Zf(Zbo4 paramZbo4) {
    Zg(paramZbo4).ifPresent(this::lambda$newPathStarted$7);
  }
  
  private static Optional<Zski> Zg(Zbo4 paramZbo4) {
    Zxs9 zxs9 = paramZbo4.ZK().ZV();
    if (zxs9 == null)
      return Optional.empty(); 
    Zrp0 zrp0 = zxs9.ZXL();
    return Optional.<Zski>ofNullable(zrp0.<Zski>Zv(new Zg_x())).or(zrp0::lambda$calculateCurrentUrl$8);
  }
  
  private void ZE() {
    Zn();
  }
  
  private void Zt() {
    Zm();
    ZD();
  }
  
  protected String Zk() {
    return a;
  }
  
  protected void ZD(Zlj9 paramZlj9) {
    this.ZR.ZD(new Zxr8(Zt18.Zz, paramZlj9));
  }
  
  private static Optional lambda$calculateCurrentUrl$8(Zrp0 paramZrp0) {
    return paramZrp0.Znq().ZHk();
  }
  
  private void lambda$newPathStarted$7(Zski paramZski) {
    this.ZR.ZD(new Zxr8(Zt18.Zm, paramZski));
  }
  
  private void lambda$subscribeToActEvents$6(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zf);
  }
  
  private void lambda$subscribeToActEvents$5(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zd);
  }
  
  private void lambda$subscribeToActEvents$4(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZC);
  }
  
  private void lambda$subscribeToActEvents$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZZ);
  }
  
  private void lambda$subscribingTo$1(Zxr8 paramZxr8) {
    Zt();
  }
  
  private void lambda$subscribingTo$0(Zxr8 paramZxr8) {
    ZE();
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: ldc '~Kmh_<Z'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsyv.a : Ljava/lang/String;
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
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #29
    //   87: goto -> 112
    //   90: bipush #40
    //   92: goto -> 112
    //   95: bipush #82
    //   97: goto -> 112
    //   100: bipush #32
    //   102: goto -> 112
    //   105: bipush #18
    //   107: goto -> 112
    //   110: bipush #118
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */