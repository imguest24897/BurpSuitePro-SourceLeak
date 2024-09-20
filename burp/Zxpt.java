package burp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxpt implements Ztsg {
  private static final Pattern Zv;
  
  private Zge_ Za = Zge_.NEEDS_CHECKING_VERSION;
  
  private Zx5o ZW = Zx5o.NOT_RUN;
  
  public Zxpt(Zgb6 paramZgb6) {
    paramZgb6.Z_(this);
  }
  
  public Zxpt() {}
  
  void Zd(Zg3d paramZg3d) {
    int i = Zlp9.Zr();
    try {
      if (this.Za == Zge_.NEEDS_CHECKING_VERSION)
        try {
          if (paramZg3d.Zb() != Zvom.NO_RESPONSE_DATA) {
            for (String str : paramZg3d.Ze().Zm()) {
              Matcher matcher = Zv.matcher(str);
              try {
                if (matcher.matches() && matcher.groupCount() == 1) {
                  try {
                    if (4 > Integer.parseInt(matcher.group(1))) {
                      this.ZW = Zx5o.FAILED;
                      return;
                    } 
                  } catch (NumberFormatException numberFormatException) {
                    Zah.Zl(numberFormatException, Zk_.UNEXPECTED);
                    Zuh.ZT(false, Zqf.Zk, matcher.group(1));
                  } 
                  this.ZW = Zx5o.SUCCEEDED;
                  return;
                } 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              if (i != 0)
                break; 
            } 
            this.ZW = Zx5o.FAILED;
            return;
          } 
          return;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public Zx5o Zz() {
    try {
      if (this.Za == Zge_.ALREADY_REPORTED)
        return Zx5o.SUCCEEDED; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Za = Zge_.ALREADY_REPORTED;
    return this.ZW;
  }
  
  public void ZC() {
    this.Za = Zge_.NEEDS_CHECKING_VERSION;
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: ldc '"9Xj$}[{id<~HWB~w;xU.Gvb9aJ9"Xc8'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 153
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 127
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #69
    //   82: goto -> 111
    //   85: bipush #43
    //   87: goto -> 111
    //   90: bipush #36
    //   92: goto -> 111
    //   95: bipush #58
    //   97: goto -> 111
    //   100: bipush #119
    //   102: goto -> 111
    //   105: bipush #46
    //   107: goto -> 111
    //   110: iconst_5
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #1, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 33
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_1
    //   131: if_icmpgt -> 30
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
    //   153: aload_0
    //   154: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   157: putstatic burp/Zxpt.Zv : Ljava/util/regex/Pattern;
    //   160: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */