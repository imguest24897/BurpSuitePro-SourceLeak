package burp;

import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Zmh4 {
  private static final Pattern ZU;
  
  private final List<Ztro> ZI = (List<Ztro>)Zlt.Zb.stream().map(Zmh4::lambda$new$0).collect(Collectors.toList());
  
  private static int[] ZX;
  
  public Collection<Ztro> ZK() {
    return this.ZI;
  }
  
  public Collection<Ztro> ZT() {
    return (Collection<Ztro>)Zlt.ZG.stream().map(Zmh4::lambda$javaDocFiles$1).collect(Collectors.toUnmodifiableList());
  }
  
  private static String ZD(String paramString) {
    Matcher matcher = ZU.matcher(paramString);
    return matcher.matches() ? matcher.group(1) : paramString;
  }
  
  private static Ztih lambda$javaDocFiles$1(String paramString) {
    return new Ztih(ZD(paramString), paramString);
  }
  
  private static Zmds lambda$new$0(String paramString) {
    return new Zmds(ZD(paramString), paramString);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zd : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_3
    //   7: newarray int
    //   9: invokestatic ZB : ([I)V
    //   12: bipush #25
    //   14: ldc '`PWH,1g&u-{'
    //   16: iconst_m1
    //   17: goto -> 24
    //   20: astore_0
    //   21: goto -> 165
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_1
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 139
    //   42: dup2
    //   43: swap
    //   44: iload_1
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_1
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #87
    //   94: goto -> 123
    //   97: bipush #99
    //   99: goto -> 123
    //   102: bipush #49
    //   104: goto -> 123
    //   107: bipush #102
    //   109: goto -> 123
    //   112: bipush #13
    //   114: goto -> 123
    //   117: bipush #66
    //   119: goto -> 123
    //   122: iconst_3
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #1, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 45
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_1
    //   143: if_icmpgt -> 42
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
    //   162: goto -> 20
    //   165: aload_0
    //   166: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   169: putstatic burp/Zmh4.ZU : Ljava/util/regex/Pattern;
    //   172: return
  }
  
  public static void ZB(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return ZX;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmh4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */