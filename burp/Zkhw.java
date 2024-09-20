package burp;

import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import net.portswigger.Zbj;

class Zkhw implements Zzhk {
  private final UnaryOperator<String> Za;
  
  private final String ZU;
  
  private static final String a;
  
  Zkhw(UnaryOperator<String> paramUnaryOperator, String paramString) {
    this.Za = paramUnaryOperator;
    this.ZU = paramString;
  }
  
  public Zm3v<?> ZJ(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zm : (Lburp/Zkhw;Ljava/lang/String;)Lburp/Zm3v;
    //   7: areturn
  }
  
  private static Object Zx(Object paramObject, UnaryOperator<String> paramUnaryOperator, String paramString) {
    if (paramObject instanceof String) {
      String str = (String)paramObject;
      return paramUnaryOperator.apply(str);
    } 
    if (paramObject instanceof List) {
      List list = (List)paramObject;
      return list.stream().map(paramUnaryOperator::lambda$convert$3).filter(Objects::nonNull).toList();
    } 
    throw new IllegalArgumentException(a.formatted(new Object[] { paramString }));
  }
  
  private static String lambda$convert$3(UnaryOperator<String> paramUnaryOperator, Object paramObject) {
    String str = (String)paramObject;
    return (paramObject instanceof String) ? paramUnaryOperator.apply(str) : null;
  }
  
  private Object lambda$fromFunctionReference$2(Zm3v<Object> paramZm3v, Zzvx paramZzvx) {
    Object object = paramZm3v.Zm(paramZzvx);
    return Zx(object, this.Za, this.ZU);
  }
  
  private Object lambda$fromReference$1(Zbj paramZbj, Zzvx paramZzvx) {
    Object object = paramZzvx.ZE(paramZbj.Zj());
    return Zx(object, this.Za, this.ZU);
  }
  
  private Object lambda$fromString$0(String paramString, Zzvx paramZzvx) {
    return this.Za.apply(Zm7g.ZF(paramString).ZT(paramZzvx));
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc '\\n3mQtl!#Q1=:jYL !3wPML:&&# ;;m&i3#W i=eWM& <d'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkhw.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #115
    //   82: goto -> 111
    //   85: bipush #104
    //   87: goto -> 111
    //   90: bipush #57
    //   92: goto -> 111
    //   95: bipush #77
    //   97: goto -> 111
    //   100: iconst_4
    //   101: goto -> 111
    //   104: bipush #86
    //   106: goto -> 111
    //   109: bipush #110
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkhw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */