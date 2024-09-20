package net.portswigger.devtools.client;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;

public final class Zr {
  private static String[] Zr;
  
  private static final String a;
  
  public static String ZO(Method paramMethod) {
    return ((Zb)paramMethod.<Zb>getAnnotation(Zb.class)).value();
  }
  
  public static Optional<String> ZC(Method paramMethod) {
    return Optional.<net.portswigger.devtools.protocol.Zr>ofNullable(paramMethod.<net.portswigger.devtools.protocol.Zr>getAnnotation(net.portswigger.devtools.protocol.Zr.class)).map(net.portswigger.devtools.protocol.Zr::value);
  }
  
  public static boolean ZS(Method paramMethod) {
    String str = paramMethod.getName();
    Parameter[] arrayOfParameter = paramMethod.getParameters();
    return (str.startsWith(a) && Zs.class.equals(paramMethod.getReturnType()) && arrayOfParameter != null && arrayOfParameter.length == 1 && Zp.class.isAssignableFrom(arrayOfParameter[0].getType()));
  }
  
  public static Class<? extends Zl> ZQ(Method paramMethod) {
    ParameterizedType parameterizedType = (ParameterizedType)paramMethod.getGenericParameterTypes()[0];
    Type type = parameterizedType.getActualTypeArguments()[0];
    return (Class<? extends Zl>)type;
  }
  
  public static Type Zd(Method paramMethod) {
    Type type1 = paramMethod.getAnnotatedReturnType().getType();
    Type type2 = ((ParameterizedType)type1).getActualTypeArguments()[0];
    return ((ParameterizedType)type2).getActualTypeArguments()[0];
  }
  
  public static void ZZ(String[] paramArrayOfString) {
    Zr = paramArrayOfString;
  }
  
  public static String[] Zr() {
    return Zr;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_4
    //   7: anewarray java/lang/String
    //   10: invokestatic ZZ : ([Ljava/lang/String;)V
    //   13: iconst_1
    //   14: ldc 'W'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic net/portswigger/devtools/client/Zr.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #117
    //   94: goto -> 124
    //   97: bipush #56
    //   99: goto -> 124
    //   102: bipush #36
    //   104: goto -> 124
    //   107: bipush #79
    //   109: goto -> 124
    //   112: bipush #86
    //   114: goto -> 124
    //   117: bipush #124
    //   119: goto -> 124
    //   122: bipush #127
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\Zr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */