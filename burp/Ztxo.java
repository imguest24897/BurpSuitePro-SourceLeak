package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zqf;
import net.portswigger.Zrze;
import net.portswigger.Zuh;

public class Ztxo {
  private final int Zx;
  
  private final int Zb;
  
  private final int ZR;
  
  private final String ZF;
  
  public final Zvs ZL;
  
  private static Zbqc[] Zi;
  
  private static final String a;
  
  Ztxo(int paramInt1, int paramInt2, int paramInt3, Zvs paramZvs, String paramString) {
    this.Zx = paramInt1;
    this.Zb = paramInt2;
    this.ZR = paramInt3;
    this.ZL = paramZvs;
    this.ZF = paramString;
  }
  
  public Zrsr Zz(String paramString1, String paramString2) {
    return new Zrsr(this.Zx, this.Zb, Zg(), paramString1, this.ZF, paramString2);
  }
  
  boolean Zg(Ztxo paramZtxo) {
    return (this.Zb == paramZtxo.Zb && this.Zx == paramZtxo.Zx && this.ZR == paramZtxo.ZR);
  }
  
  private String Zg() {
    if (this.ZR == 0)
      return null; 
    Matcher matcher = Pattern.compile(a).matcher(this.ZF);
    if (matcher.find())
      return matcher.group(1).split(",")[this.ZR - 1].trim(); 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  public static Map<String, Ztxo> ZH(Ztxo... paramVarArgs) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (Ztxo ztxo : paramVarArgs)
      hashMap.put(Zf(ztxo), ztxo); 
    return (Map)hashMap;
  }
  
  private static String Zf(Ztxo paramZtxo) {
    return "" + paramZtxo.Zx + "-" + paramZtxo.Zx + "-" + paramZtxo.Zb;
  }
  
  public static String ZK(Zrze paramZrze) {
    return "" + paramZrze.Zx + "-" + paramZrze.Zx + "-" + paramZrze.ZI;
  }
  
  public static Ztxo ZQ(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2) {
    return new Ztxo(paramInt1, paramInt2, paramInt3, Zzu2.ZZ(Integer.decode(paramString2).intValue()), paramString1);
  }
  
  public static void Zn(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Z_() {
    return Zi;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_1
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zn : ([Lburp/Zbqc;)V
    //   13: bipush #13
    //   15: ldc '>tP'*z'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Ztxo.a : Ljava/lang/String;
    //   24: goto -> 165
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #94
    //   94: goto -> 123
    //   97: bipush #27
    //   99: goto -> 123
    //   102: bipush #81
    //   104: goto -> 123
    //   107: bipush #36
    //   109: goto -> 123
    //   112: bipush #119
    //   114: goto -> 123
    //   117: iconst_3
    //   118: goto -> 123
    //   121: bipush #123
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
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
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */