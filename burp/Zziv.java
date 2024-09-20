package burp;

import java.io.OutputStream;
import java.util.Optional;

public class Zziv implements Zsug {
  private static Zbqc[] ZN;
  
  private static final String a;
  
  public boolean Zt() {
    return false;
  }
  
  public Optional<OutputStream> Z_() {
    return Optional.empty();
  }
  
  public String toString() {
    return a;
  }
  
  public static void Zh(Zbqc[] paramArrayOfZbqc) {
    ZN = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZF() {
    return ZN;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZF : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_3
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zh : ([Lburp/Zbqc;)V
    //   13: bipush #83
    //   15: ldc 'Mj,x"4m'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zziv.a : Ljava/lang/String;
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
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #90
    //   94: goto -> 123
    //   97: bipush #36
    //   99: goto -> 123
    //   102: bipush #74
    //   104: goto -> 123
    //   107: bipush #30
    //   109: goto -> 123
    //   112: bipush #73
    //   114: goto -> 123
    //   117: bipush #29
    //   119: goto -> 123
    //   122: iconst_2
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zziv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */