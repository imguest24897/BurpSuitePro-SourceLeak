package burp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public abstract class Zrgr implements Zgd8<Zgpe> {
  private final Zgpe ZI;
  
  protected Matcher ZN;
  
  private static int ZY;
  
  private static final String a;
  
  protected Zrgr(Zgpe paramZgpe, boolean paramBoolean) throws Ztrx {
    this.ZI = paramZgpe;
    if (paramBoolean) {
      String str = paramZgpe.ZTw();
      try {
        Pattern pattern = Pattern.compile(str, 34);
        this.ZN = pattern.matcher("");
      } catch (PatternSyntaxException patternSyntaxException) {
        Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
        throw new Ztrx(a + a);
      } 
    } 
  }
  
  public abstract boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7);
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    return ZV(paramZml3, paramZrgd, paramZgb6, paramZz28, paramZr1j, paramZkh7);
  }
  
  public boolean Zt() {
    return this.ZI.ZTj();
  }
  
  public void ZP(boolean paramBoolean) {
    this.ZI.Zax(paramBoolean);
  }
  
  public int ZW() {
    return this.ZI.ZT6();
  }
  
  public int Zd() {
    return this.ZI.ZTW();
  }
  
  public int ZC() {
    return this.ZI.ZTS();
  }
  
  public String Zf() {
    return this.ZI.ZTw();
  }
  
  public Zgpe Zo() {
    return this.ZI;
  }
  
  public void Zk(Zzqw paramZzqw) {
    paramZzqw.Zx(Zeh3.Zq(this));
  }
  
  public static void ZE(int paramInt) {
    ZY = paramInt;
  }
  
  public static int ZU() {
    return ZY;
  }
  
  public static int Zi() {
    int i = ZU();
    try {
      if (i == 0)
        return 111; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZU : ()I
    //   3: ifeq -> 11
    //   6: bipush #26
    //   8: invokestatic ZE : (I)V
    //   11: bipush #39
    //   13: ldc 'mrur\\t!ns{'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zrgr.a : Ljava/lang/String;
    //   22: goto -> 165
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 139
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 121, 0 -> 92, 1 -> 96, 2 -> 101, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: iconst_3
    //   93: goto -> 123
    //   96: bipush #59
    //   98: goto -> 123
    //   101: bipush #67
    //   103: goto -> 123
    //   106: bipush #51
    //   108: goto -> 123
    //   111: bipush #57
    //   113: goto -> 123
    //   116: bipush #71
    //   118: goto -> 123
    //   121: bipush #98
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 46
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 43
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 19
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */