package burp;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.portswigger.Zsy;
import net.portswigger.browser.Zi;

public class Ze72 {
  protected boolean Zd = false;
  
  protected String Zo = Zi.ZC();
  
  protected List<Ztnz> ZJ = new LinkedList<>();
  
  protected Supplier<Integer> ZD;
  
  protected Supplier<Optional<Duration>> Zv;
  
  protected Supplier<Integer> Zf;
  
  protected boolean Ze;
  
  protected boolean Zs;
  
  protected boolean Zc;
  
  protected int Zh;
  
  protected boolean ZZ;
  
  protected int ZUy;
  
  protected boolean ZK;
  
  protected boolean ZP;
  
  protected boolean Zt;
  
  protected Zt4o ZX;
  
  protected boolean ZB;
  
  protected Duration ZQ;
  
  protected Zszj ZS = Zszj.DEFAULT;
  
  protected boolean Z_;
  
  protected boolean ZU;
  
  protected int Zu;
  
  protected int ZC;
  
  protected int ZV;
  
  protected boolean ZE;
  
  protected Zbq0 Za;
  
  protected boolean Zq;
  
  protected boolean Zp = false;
  
  protected boolean Zj = false;
  
  protected Supplier<Integer> Zl;
  
  protected int Zk;
  
  protected int ZM;
  
  protected int Zz;
  
  protected int Zr;
  
  protected Function<Integer, Integer> ZL = Ze72::lambda$new$0;
  
  protected Zv0 ZA;
  
  protected Zsug ZH = Zsug.ZI();
  
  protected Duration ZW;
  
  protected Duration Zb;
  
  protected Predicate<Zrnc> Zm = Ze72::lambda$new$1;
  
  protected Duration Zn;
  
  protected Duration ZF;
  
  protected Duration ZN;
  
  protected int ZO;
  
  protected int Zy;
  
  protected int ZY;
  
  protected boolean ZI;
  
  protected boolean Zw;
  
  protected boolean ZG;
  
  protected boolean Zg = true;
  
  protected boolean Zx = false;
  
  protected Zsy ZT;
  
  protected Zz28 Zi;
  
  protected Zt02 ZUX;
  
  protected Zskh ZR = Zskh.Zo;
  
  private static final String a;
  
  public Ze72 Zd(boolean paramBoolean) {
    this.Ze = paramBoolean;
    return this;
  }
  
  public Ze72 ZH(boolean paramBoolean) {
    this.Zs = paramBoolean;
    return this;
  }
  
  public Ze72 Zz(boolean paramBoolean) {
    this.Zc = paramBoolean;
    return this;
  }
  
  public Ze72 Zy(int paramInt) {
    this.Zh = paramInt;
    return this;
  }
  
  public Ze72 Zz(Duration paramDuration) {
    this.Zn = paramDuration;
    return this;
  }
  
  public Ze72 ZT(Duration paramDuration) {
    this.ZF = paramDuration;
    return this;
  }
  
  public Ze72 Zj(Duration paramDuration) {
    this.ZN = paramDuration;
    return this;
  }
  
  public Ze72 ZH(int paramInt) {
    this.ZY = paramInt;
    return this;
  }
  
  public Ze72 Zl(boolean paramBoolean) {
    this.Zg = paramBoolean;
    return this;
  }
  
  public Ze72 ZL(Zsy paramZsy) {
    this.ZT = paramZsy;
    return this;
  }
  
  public Ze72 ZZ(Zz28 paramZz28) {
    this.Zi = paramZz28;
    return this;
  }
  
  public Ze72 ZY(int paramInt) {
    this.Zk = paramInt;
    return this;
  }
  
  public Ze72 Ze(int paramInt) {
    this.ZM = paramInt;
    return this;
  }
  
  public Ze72 ZC(int paramInt) {
    this.Zz = paramInt;
    return this;
  }
  
  public Ze72 Zb(int paramInt) {
    this.Zr = paramInt;
    return this;
  }
  
  public Ze72 Zu(int paramInt) {
    this.Zy = paramInt;
    return this;
  }
  
  public Ze72 ZP(boolean paramBoolean) {
    this.ZE = paramBoolean;
    return this;
  }
  
  public Ze72 Zx(Zbq0 paramZbq0, boolean paramBoolean) {
    this.Za = paramZbq0;
    this.Zq = paramBoolean;
    return this;
  }
  
  public Ze72 ZK(Supplier<Integer> paramSupplier) {
    this.Zl = paramSupplier;
    return this;
  }
  
  public Ze72 ZQ(String paramString) {
    this.Zo = paramString;
    this.ZJ.removeIf(Ztnz::ZL);
    return Zd(new Ztnz(a, paramString));
  }
  
  public Ze72 Zd(Ztnz paramZtnz) {
    this.ZJ.add(paramZtnz);
    return this;
  }
  
  public Ze72 ZB(int paramInt) {
    this.ZC = paramInt;
    return this;
  }
  
  public Ze72 Zs(int paramInt) {
    this.ZV = paramInt;
    return this;
  }
  
  public Ze72 Zm(int paramInt) {
    this.ZO = paramInt;
    return this;
  }
  
  public Ze72 Za(boolean paramBoolean) {
    this.ZI = paramBoolean;
    return this;
  }
  
  public Ze72 ZQ(Supplier<Integer> paramSupplier) {
    this.ZD = paramSupplier;
    return this;
  }
  
  public Ze72 Zm(Supplier<Optional<Duration>> paramSupplier) {
    this.Zv = paramSupplier;
    return this;
  }
  
  public Ze72 Zo(Zt02 paramZt02) {
    this.ZUX = paramZt02;
    return this;
  }
  
  public Ze72 Ze(Zv0 paramZv0) {
    this.ZA = paramZv0;
    return this;
  }
  
  public Ze72 Zj(boolean paramBoolean) {
    this.ZB = paramBoolean;
    return this;
  }
  
  public Ze72 Zp(Supplier<Integer> paramSupplier) {
    this.Zf = paramSupplier;
    return this;
  }
  
  public Ze72 ZE(int paramInt) {
    this.Zu = paramInt;
    return this;
  }
  
  public Ze72 Zy(boolean paramBoolean) {
    this.ZZ = paramBoolean;
    return this;
  }
  
  public Ze72 Zp(int paramInt) {
    this.ZUy = paramInt;
    return this;
  }
  
  public Ze72 Zi(boolean paramBoolean) {
    this.ZK = paramBoolean;
    return this;
  }
  
  public Ze72 ZW(boolean paramBoolean) {
    this.ZP = paramBoolean;
    return this;
  }
  
  public Ze72 ZO(boolean paramBoolean) {
    this.Zt = paramBoolean;
    return this;
  }
  
  public Ze72 ZB(Zt4o paramZt4o) {
    this.ZX = paramZt4o;
    return this;
  }
  
  public Ze72 Z_(Duration paramDuration) {
    this.ZQ = paramDuration;
    return this;
  }
  
  public Ze72 Zk(boolean paramBoolean) {
    this.Zp = paramBoolean;
    return this;
  }
  
  public Ze72 Zp(boolean paramBoolean) {
    this.Zj = paramBoolean;
    return this;
  }
  
  public Ze72 Z_(Zszj paramZszj) {
    this.ZS = paramZszj;
    return this;
  }
  
  public Ze72 Zx(boolean paramBoolean) {
    this.Z_ = paramBoolean;
    return this;
  }
  
  public Ze72 ZR(boolean paramBoolean) {
    this.ZU = paramBoolean;
    return this;
  }
  
  public Ze72 ZF(boolean paramBoolean) {
    this.Zw = paramBoolean;
    return this;
  }
  
  public Ze72 Ze(boolean paramBoolean) {
    this.ZG = paramBoolean;
    return this;
  }
  
  public Ze72 ZL(boolean paramBoolean) {
    this.Zx = paramBoolean;
    return this;
  }
  
  public Ze72 Zq(Duration paramDuration) {
    this.ZW = paramDuration;
    return this;
  }
  
  public Ze72 ZQ(Duration paramDuration) {
    this.Zb = paramDuration;
    return this;
  }
  
  public Ze72 Zj(Zskh paramZskh) {
    this.ZR = paramZskh;
    return this;
  }
  
  public Zr69 ZC() {
    return new Zgt0(this);
  }
  
  private static Integer lambda$withMaximumNumberOfRooms$6(int paramInt) {
    return Integer.valueOf(paramInt);
  }
  
  private static Optional lambda$withTimeLimit$5(Duration paramDuration) {
    return Optional.of(paramDuration);
  }
  
  private static Integer lambda$withMinimumTooManyDestinationsThresholdForADoorway$3(int paramInt, Integer paramInteger) {
    return Integer.valueOf(paramInt);
  }
  
  private static Integer lambda$withMaximumPathDepth$2(Integer paramInteger) {
    return paramInteger;
  }
  
  private static boolean lambda$new$1(Zrnc paramZrnc) {
    return true;
  }
  
  private static Integer lambda$new$0(Integer paramInteger) {
    return Integer.valueOf(Math.max(1, (int)Math.ceil(paramInteger.intValue() * 0.85D)));
  }
  
  static {
    // Byte code:
    //   0: bipush #59
    //   2: ldc '#E!r6>'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze72.a : Ljava/lang/String;
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
    //   80: bipush #104
    //   82: goto -> 112
    //   85: bipush #107
    //   87: goto -> 112
    //   90: bipush #76
    //   92: goto -> 112
    //   95: bipush #83
    //   97: goto -> 112
    //   100: bipush #83
    //   102: goto -> 112
    //   105: bipush #91
    //   107: goto -> 112
    //   110: bipush #46
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze72.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */