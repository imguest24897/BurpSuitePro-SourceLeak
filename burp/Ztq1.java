package burp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztq1 {
  private final Zgig ZZ;
  
  private static final String a;
  
  public Ztq1(Zgig paramZgig) {
    this.ZZ = paramZgig;
  }
  
  public Zryx ZJ(String paramString, Zkk7... paramVarArgs) {
    return ZA("", paramString, paramVarArgs).Zr();
  }
  
  public Zryx ZI(Path paramPath) {
    Zr1o zr1o;
    try {
      String str = Files.readString(paramPath);
      zr1o = ZA(paramPath.getFileName().toString().replaceAll(a, ""), str, new Zkk7[0]);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      zr1o = (new Zr1o()).ZV(List.of(iOException));
    } 
    return zr1o.Zl(paramPath).Zr();
  }
  
  private Zr1o ZA(String paramString1, String paramString2, Zkk7... paramVarArgs) {
    boolean bool1 = Arrays.<Zkk7>stream(paramVarArgs).anyMatch(Ztq1::lambda$loadBCheckScriptBuilder$0);
    boolean bool2 = Arrays.<Zkk7>stream(paramVarArgs).anyMatch(Ztq1::lambda$loadBCheckScriptBuilder$1);
    Zzxc zzxc = this.ZZ.Zv(paramString2);
    String str = (bool1 && zzxc.Za().isPresent()) ? zzxc.Za().get() : paramString2;
    return (new Zr1o()).Zf(zzxc.ZZ().orElse(paramString1)).Za(str).ZV(zzxc.Zz()).Zd(bool2).ZP(zzxc.Z_().orElse(null));
  }
  
  private static boolean lambda$loadBCheckScriptBuilder$1(Zkk7 paramZkk7) {
    return (paramZkk7 == Zkk7.ENABLE);
  }
  
  private static boolean lambda$loadBCheckScriptBuilder$0(Zkk7 paramZkk7) {
    return (paramZkk7 == Zkk7.FORMAT);
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: ldc '/>B='
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztq1.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #96
    //   82: goto -> 111
    //   85: iconst_3
    //   86: goto -> 111
    //   89: bipush #127
    //   91: goto -> 111
    //   94: bipush #61
    //   96: goto -> 111
    //   99: bipush #10
    //   101: goto -> 111
    //   104: bipush #17
    //   106: goto -> 111
    //   109: bipush #12
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztq1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */