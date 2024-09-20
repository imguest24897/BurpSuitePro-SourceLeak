package burp;

import java.nio.file.Path;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.javatooling.Zc;
import net.portswigger.javatooling.Ze;

public class Zs88 {
  private final Zxw1 ZW;
  
  private final Path ZE;
  
  private final Zm6x ZL;
  
  private final Zlca ZD;
  
  private final Zsn7 Zq;
  
  private final Object ZK = new Object();
  
  private boolean ZF;
  
  private Ze Zd;
  
  private static final String a;
  
  public Zs88(Zxw1 paramZxw1, Path paramPath, Zm6x paramZm6x) {
    this.ZW = paramZxw1;
    int i = Zrid.ZH();
    try {
      this.ZE = paramPath;
      this.ZL = paramZm6x;
      this.ZD = new Zlca(this::Zq);
      this.Zq = new Zsn7(paramPath);
      if (Zbqc.Zwu() == null)
        Zrid.ZB(++i); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  Zm51 ZM() {
    synchronized (this.ZK) {
      ZP();
      return this.ZF ? Zd() : Zm51.Zd;
    } 
  }
  
  private Ze28 Zd() {
    this.ZD.ZL();
    Objects.requireNonNull(this.ZD);
    return new Ze28(this.Zd.Zx(), this.ZD::Zh);
  }
  
  private void ZP() {
    if (!this.ZF)
      try {
        Zs();
        this.Zd.ZE();
        this.Zd.Zx().classPathService().addLibrary(this.Zq.ZV(), this.Zq.ZM());
        this.ZF = true;
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
        this.ZL.Zj(new Zt5k(exception));
      }  
  }
  
  private void Zs() throws Exception {
    try {
      if (!this.Zq.ZP())
        throw new IllegalStateException(a); 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zc zc = Objects.<Zc>requireNonNull(this.ZW.ZM());
    this.Zd = zc.Zo(this.ZE.toString());
  }
  
  private void Zq() {
    try {
      this.Zd.Zq();
      this.Zq.Ze();
      Zy();
      this.ZF = false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zy() {
    try {
      this.ZE.toFile().delete();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #126
    //   2: ldc '\\b,;kLD|)5uM37taWM8'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs88.a : Ljava/lang/String;
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
    //   80: bipush #34
    //   82: goto -> 112
    //   85: bipush #61
    //   87: goto -> 112
    //   90: bipush #42
    //   92: goto -> 112
    //   95: bipush #121
    //   97: goto -> 112
    //   100: bipush #10
    //   102: goto -> 112
    //   105: bipush #92
    //   107: goto -> 112
    //   110: bipush #93
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs88.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */