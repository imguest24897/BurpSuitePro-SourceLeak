package burp;

import java.math.BigInteger;
import java.util.Objects;

public class Zldz {
  static BigInteger ZW(Zstu paramZstu) {
    return (paramZstu == null) ? null : new BigInteger(paramZstu.ZiD());
  }
  
  static void Zv(BigInteger paramBigInteger, Ztju paramZtju, Zkit paramZkit) {
    // Byte code:
    //   0: invokestatic Zf : ()Z
    //   3: istore_3
    //   4: aload_0
    //   5: ifnonnull -> 21
    //   8: aload_2
    //   9: aload_1
    //   10: getstatic burp/Zkny.Zt : Lburp/Zeki;
    //   13: aconst_null
    //   14: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   17: iload_3
    //   18: ifne -> 41
    //   21: aload_2
    //   22: aload_0
    //   23: invokevirtual toByteArray : ()[B
    //   26: invokevirtual ZZ : ([B)Lburp/Zstu;
    //   29: astore #4
    //   31: aload_2
    //   32: aload_1
    //   33: getstatic burp/Zkny.Zt : Lburp/Zeki;
    //   36: aload #4
    //   38: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   41: invokestatic Zwu : ()[Lburp/Zbqc;
    //   44: ifnonnull -> 59
    //   47: iload_3
    //   48: ifeq -> 55
    //   51: iconst_0
    //   52: goto -> 56
    //   55: iconst_1
    //   56: invokestatic ZM : (Z)V
    //   59: return
  }
  
  static boolean Z_(Ztju paramZtju, Object paramObject) {
    if (paramZtju == null || paramObject == null)
      return (paramZtju == null && paramObject == null); 
    if (Zewd.ZI(paramZtju, (Zgpi)paramObject))
      return true; 
    if (paramZtju.getClass() != paramObject.getClass())
      return false; 
    Ztju ztju = (Ztju)paramObject;
    return Objects.equals(paramZtju.ZtG(), ztju.ZtG());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */