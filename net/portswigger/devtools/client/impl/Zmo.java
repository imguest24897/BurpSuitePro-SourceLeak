package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

public class Zmo implements InvocationHandler {
  private final InvocationHandler Zd;
  
  private static final String a;
  
  public Zmo(InvocationHandler paramInvocationHandler) {
    String[] arrayOfString = Zx9.Zc();
    this.Zd = Objects.<InvocationHandler>requireNonNull(paramInvocationHandler);
    if (Zbqc.Zwu() == null)
      Zx9.Zn(new String[3]); 
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
    String[] arrayOfString = Zx9.Zc();
    try {
      if (paramMethod.getName().equals(a))
        return this.Zd.toString(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Class<?> clazz = paramMethod.getReturnType();
    Object object = Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] { clazz }, this.Zd);
    try {
      if (arrayOfString == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    return clazz.cast(object);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #43
    //   2: ldc 'aKX~'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zmo.a : Ljava/lang/String;
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
    //   80: bipush #73
    //   82: goto -> 111
    //   85: bipush #71
    //   87: goto -> 111
    //   90: bipush #25
    //   92: goto -> 111
    //   95: bipush #20
    //   97: goto -> 111
    //   100: iconst_1
    //   101: goto -> 111
    //   104: bipush #76
    //   106: goto -> 111
    //   109: bipush #59
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */