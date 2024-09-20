package com.fasterxml.Zor;

import com.fasterxml.Zj.Zf;
import com.fasterxml.Zoz.Zi6;
import com.fasterxml.Zoz.Zin;
import com.fasterxml.Zoz.Ziq;
import java.util.logging.Logger;

@Deprecated
public abstract class Zx extends Ze {
  protected Zx() {
    this(true);
  }
  
  protected Zx(boolean paramBoolean) {
    if (paramBoolean) {
      String str = getClass().getSimpleName();
      Logger.getLogger(getClass().getName()).warning("PropertyNamingStrategy." + str + " is used but it has been deprecated due to risk of deadlock. Consider using PropertyNamingStrategies." + str + " instead. See https://github.com/FasterXML/jackson-databind/issues/2715 for more details.");
    } 
  }
  
  public String ZY(Zf<?> paramZf, Zi6 paramZi6, String paramString) {
    return Zh(paramString);
  }
  
  public String ZO(Zf<?> paramZf, Ziq paramZiq, String paramString) {
    return Zh(paramString);
  }
  
  public String ZG(Zf<?> paramZf, Ziq paramZiq, String paramString) {
    return Zh(paramString);
  }
  
  public String Zn(Zf<?> paramZf, Zin paramZin, String paramString) {
    return Zh(paramString);
  }
  
  public abstract String Zh(String paramString);
  
  protected static String ZC(String paramString, char paramChar) {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: ifnonnull -> 10
    //   8: aload_0
    //   9: areturn
    //   10: aload_0
    //   11: invokevirtual length : ()I
    //   14: istore_3
    //   15: iload_3
    //   16: ifne -> 21
    //   19: aload_0
    //   20: areturn
    //   21: new java/lang/StringBuilder
    //   24: dup
    //   25: iload_3
    //   26: iload_3
    //   27: iconst_1
    //   28: ishr
    //   29: iadd
    //   30: invokespecial <init> : (I)V
    //   33: astore #4
    //   35: iconst_0
    //   36: istore #5
    //   38: iconst_0
    //   39: istore #6
    //   41: iload #6
    //   43: iload_3
    //   44: if_icmpge -> 131
    //   47: aload_0
    //   48: iload #6
    //   50: invokevirtual charAt : (I)C
    //   53: istore #7
    //   55: iload #7
    //   57: invokestatic toLowerCase : (C)C
    //   60: istore #8
    //   62: iload #8
    //   64: iload #7
    //   66: if_icmpne -> 96
    //   69: iload #5
    //   71: iconst_1
    //   72: if_icmple -> 89
    //   75: aload #4
    //   77: aload #4
    //   79: invokevirtual length : ()I
    //   82: iconst_1
    //   83: isub
    //   84: iload_1
    //   85: invokevirtual insert : (IC)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: iconst_0
    //   90: istore #5
    //   92: iload_2
    //   93: ifeq -> 116
    //   96: iload #5
    //   98: ifne -> 113
    //   101: iload #6
    //   103: ifle -> 113
    //   106: aload #4
    //   108: iload_1
    //   109: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: iinc #5, 1
    //   116: aload #4
    //   118: iload #8
    //   120: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: iinc #6, 1
    //   127: iload_2
    //   128: ifeq -> 41
    //   131: aload #4
    //   133: invokevirtual toString : ()Ljava/lang/String;
    //   136: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */