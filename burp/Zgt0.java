package burp;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zgt0 extends Zgt_ {
  private final boolean Zw;
  
  private final String Zi;
  
  private final List<Ztnz> ZJ;
  
  private final Supplier<Integer> ZA;
  
  private final Supplier<Optional<Duration>> ZR;
  
  private final Supplier<Integer> ZC;
  
  private final boolean Z_;
  
  private final boolean ZH;
  
  private final boolean Zx;
  
  private final int ZY;
  
  private final boolean Zk;
  
  private final int ZZ;
  
  private final boolean Za;
  
  private final boolean Zd;
  
  private final boolean Zo;
  
  private final Zt4o Zh;
  
  private final boolean Zl;
  
  private final Duration Zq;
  
  private final boolean Zv;
  
  private final boolean Zm;
  
  private final int ZI;
  
  private final int Zr;
  
  private final int Zf;
  
  private final Zbq0 ZK;
  
  private final boolean ZT;
  
  private final Supplier<Integer> Zy;
  
  private final int ZB;
  
  private final int ZKd;
  
  private final int Zg;
  
  private final int ZM;
  
  private final Zv0 Zu;
  
  private final boolean Zs;
  
  private final boolean ZP;
  
  private final Predicate<Zrnc> ZKS;
  
  private final Duration ZE;
  
  private final Duration ZL;
  
  private final Duration ZS;
  
  private final int ZN;
  
  private final int ZF;
  
  private final int ZX;
  
  private final boolean ZG;
  
  private final boolean ZD;
  
  private final boolean ZQ;
  
  private final boolean ZW;
  
  private final Zszj Zz;
  
  private final Duration Zp;
  
  private final Zsy ZV;
  
  private final Zt02 Ze;
  
  private final boolean Zn;
  
  private final boolean ZO;
  
  private static final String b;
  
  public Zgt0(Ze72 paramZe72) {
    super(paramZe72.ZW, paramZe72.Zi, paramZe72.ZH, paramZe72.ZR);
    this.Zw = paramZe72.Zd;
    this.Zi = paramZe72.Zo;
    this.ZJ = paramZe72.ZJ;
    this.ZA = paramZe72.ZD;
    this.ZR = paramZe72.Zv;
    this.ZC = paramZe72.Zf;
    this.Z_ = paramZe72.Ze;
    this.ZH = paramZe72.Zs;
    this.Zx = paramZe72.Zc;
    this.ZY = paramZe72.Zh;
    this.Zk = paramZe72.ZZ;
    this.ZZ = paramZe72.ZUy;
    this.Za = paramZe72.ZK;
    this.Zd = paramZe72.ZP;
    this.Zo = paramZe72.Zt;
    this.Zh = paramZe72.ZX;
    this.Zl = paramZe72.ZB;
    this.Zq = paramZe72.ZQ;
    this.Zv = paramZe72.Z_;
    this.ZO = paramZe72.ZU;
    String[] arrayOfString = Zbq0.Zh();
    this.ZI = paramZe72.Zu;
    this.Zr = paramZe72.ZC;
    this.Zf = paramZe72.ZV;
    this.ZK = paramZe72.Za;
    this.ZT = paramZe72.Zq;
    this.Zy = paramZe72.Zl;
    this.ZB = paramZe72.Zk;
    this.ZKd = paramZe72.ZM;
    this.Zg = paramZe72.Zz;
    this.ZM = paramZe72.Zr;
    this.Zu = paramZe72.ZA;
    this.ZKS = paramZe72.Zm;
    this.ZE = paramZe72.Zn;
    this.ZL = paramZe72.ZF;
    this.ZS = paramZe72.ZN;
    this.ZN = paramZe72.ZO;
    this.ZF = paramZe72.Zy;
    this.Zn = paramZe72.ZI;
    this.ZX = paramZe72.ZY;
    this.ZD = paramZe72.Zw;
    this.ZG = paramZe72.ZG;
    this.ZQ = paramZe72.Zx;
    this.ZW = paramZe72.Zg;
    this.Zm = paramZe72.ZE;
    this.Zs = paramZe72.Zp;
    this.ZP = paramZe72.Zj;
    this.Zz = paramZe72.ZS;
    this.Zp = paramZe72.Zb;
    this.ZV = paramZe72.ZT;
    this.Ze = paramZe72.ZUX;
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public int Zz() {
    return this.ZB;
  }
  
  public int Zj() {
    return this.ZKd;
  }
  
  public int ZE() {
    return this.Zg;
  }
  
  public boolean ZT() {
    return this.ZD;
  }
  
  public boolean Z_() {
    return this.ZG;
  }
  
  public int ZM() {
    return this.ZM;
  }
  
  public int Zl() {
    return this.ZF;
  }
  
  public int Ze() {
    Integer integer = this.Zy.get();
    Zuh.Zb((integer.intValue() >= 0), Zqf.Zk);
    return integer.intValue();
  }
  
  public boolean Zm() {
    return this.Z_;
  }
  
  public List<Ztnz> Zw(Ze2m paramZe2m) {
    LinkedList<Ztnz> linkedList = new LinkedList<>(this.ZJ);
    if (this.Zw)
      linkedList.add(new Ztnz(b, paramZe2m.debugName)); 
    return Collections.unmodifiableList(linkedList);
  }
  
  public String Zw() {
    return this.Zi;
  }
  
  public int Zq() {
    return this.Zr;
  }
  
  public int Zg() {
    return this.Zf;
  }
  
  public int ZW() {
    return ((Integer)this.ZA.get()).intValue();
  }
  
  public int ZN() {
    return this.ZN;
  }
  
  public boolean ZQ() {
    return this.Zn;
  }
  
  public Zsy ZP() {
    return this.ZV;
  }
  
  public Optional<Duration> ZG() {
    return this.ZR.get();
  }
  
  public Zt02 Zf() {
    return this.Ze;
  }
  
  public int Zh() {
    return this.ZX;
  }
  
  public Zt4o ZK() {
    return this.Zh;
  }
  
  public boolean ZR() {
    return this.Zl;
  }
  
  public Duration Zy() {
    return this.Zq;
  }
  
  public Duration Zr() {
    return this.ZE;
  }
  
  public Duration ZH() {
    return this.ZL;
  }
  
  public Duration Zi() {
    return this.ZS;
  }
  
  public Zv0 ZX() {
    return this.Zu;
  }
  
  public int ZJ() {
    return ((Integer)this.ZC.get()).intValue();
  }
  
  public boolean ZV() {
    return this.Zm;
  }
  
  public int Za() {
    return this.ZI;
  }
  
  public boolean ZI() {
    return this.Zk;
  }
  
  public boolean Zo() {
    return this.Zd;
  }
  
  public boolean ZU() {
    return this.Zo;
  }
  
  public boolean Zc() {
    return this.Za;
  }
  
  public int ZA() {
    return this.ZZ;
  }
  
  public Zbq0 ZL() {
    return this.ZK;
  }
  
  public boolean Zk() {
    return this.ZT;
  }
  
  public boolean ZZ() {
    return this.ZH;
  }
  
  public boolean ZO() {
    return this.Zx;
  }
  
  public int ZB() {
    return this.ZY;
  }
  
  public boolean ZC() {
    return this.ZW;
  }
  
  public boolean Zd() {
    return this.ZQ;
  }
  
  public boolean Zb() {
    return this.Zs;
  }
  
  public boolean Zt() {
    return this.ZP;
  }
  
  public Predicate<Zrnc> Zv() {
    return this.ZKS;
  }
  
  public Zszj Zp() {
    return this.Zz;
  }
  
  public boolean ZY() {
    return this.Zv;
  }
  
  public boolean Zs() {
    return this.ZO;
  }
  
  public Duration Zn() {
    return this.Zp;
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: ldc '9hZzc=W~Oca(t'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgt0.b : Ljava/lang/String;
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
    //   80: bipush #93
    //   82: goto -> 112
    //   85: bipush #61
    //   87: goto -> 112
    //   90: bipush #82
    //   92: goto -> 112
    //   95: bipush #10
    //   97: goto -> 112
    //   100: bipush #49
    //   102: goto -> 112
    //   105: bipush #33
    //   107: goto -> 112
    //   110: bipush #104
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgt0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */