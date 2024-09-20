package burp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Zeu;
import net.portswigger.browser.Zj9;

final class Zm76 implements InvocationHandler {
  private final Zeu ZB;
  
  final Zt9w Zz;
  
  private static final String a;
  
  private Zm76(Zt9w paramZt9w, Zeu paramZeu) {
    this.ZB = Objects.<Zeu>requireNonNull(paramZeu);
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
    try {
      if (paramMethod.getName().equals(a)) {
        Zuh.Zb(false, Zqf.ZC);
        return null;
      } 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    try {
      if (paramMethod.getReturnType().equals(Zj9.class))
        return Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { Zj9.class }, new Zgyl(this.Zz, this.ZB.ZM())); 
    } catch (InvocationTargetException invocationTargetException) {
      throw a(null);
    } 
    try {
      return paramMethod.invoke(this.ZB, paramArrayOfObject);
    } catch (InvocationTargetException invocationTargetException) {
      Zah.Zl(invocationTargetException.getCause(), Zk_.RETHROWN);
      throw invocationTargetException.getCause();
    } 
  }
  
  private static InvocationTargetException a(InvocationTargetException paramInvocationTargetException) {
    return paramInvocationTargetException;
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: ldc 'k;;#1\\r1v'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm76.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_5
    //   81: goto -> 111
    //   84: bipush #78
    //   86: goto -> 111
    //   89: bipush #83
    //   91: goto -> 111
    //   94: bipush #74
    //   96: goto -> 111
    //   99: bipush #72
    //   101: goto -> 111
    //   104: bipush #127
    //   106: goto -> 111
    //   109: bipush #91
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm76.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */