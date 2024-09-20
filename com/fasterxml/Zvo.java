package com.fasterxml;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm5;
import java.util.Collection;

public class Zvo extends Zvq {
  private static final long serialVersionUID = 1L;
  
  private static final String g;
  
  public Zvo(Zg paramZg, String paramString1, Zm5 paramZm5, Class<?> paramClass, String paramString2, Collection<Object> paramCollection) {
    super(paramZg, paramString1, paramZm5, paramClass, paramString2, paramCollection);
  }
  
  public static Zvo ZM(Zg paramZg, Object paramObject, String paramString, Collection<Object> paramCollection) {
    Zbqc[] arrayOfZbqc = Zv_.ZH();
    if (paramObject instanceof Class) {
      Class<?> clazz1 = (Class)paramObject;
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[3]);
      } else {
        String str1 = String.format(g, new Object[] { paramString, clazz1.getName() });
        Zvo zvo1 = new Zvo(paramZg, str1, paramZg.Zz(), clazz1, paramString, paramCollection);
        zvo1.Zc(paramObject, paramString);
        return zvo1;
      } 
    } 
    Class<?> clazz = paramObject.getClass();
    String str = String.format(g, new Object[] { paramString, clazz.getName() });
    Zvo zvo = new Zvo(paramZg, str, paramZg.Zz(), clazz, paramString, paramCollection);
    zvo.Zc(paramObject, paramString);
    return zvo;
  }
  
  static {
    // Byte code:
    //   0: bipush #47
    //   2: ldc 'br'_Ju-A~\\t]oj\\r2MGo;\\r?]Xy&Nu[E\\fy:H~}8]\s&KsI^\\ny,\\rtA_Xh'\\r{BGkhYrGX'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zvo.g : Ljava/lang/String;
    //   11: goto -> 151
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
    //   29: if_icmpgt -> 125
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 103
    //   80: iconst_4
    //   81: goto -> 109
    //   84: bipush #87
    //   86: goto -> 109
    //   89: bipush #51
    //   91: goto -> 109
    //   94: bipush #103
    //   96: goto -> 109
    //   99: iconst_2
    //   100: goto -> 109
    //   103: bipush #53
    //   105: goto -> 109
    //   108: iconst_1
    //   109: ixor
    //   110: ixor
    //   111: i2c
    //   112: castore
    //   113: iinc #0, 1
    //   116: dup
    //   117: ifne -> 125
    //   120: dup2
    //   121: dup_x1
    //   122: goto -> 35
    //   125: dup2_x1
    //   126: pop2
    //   127: dup_x2
    //   128: iload_0
    //   129: if_icmpgt -> 32
    //   132: pop
    //   133: new java/lang/String
    //   136: dup_x1
    //   137: swap
    //   138: invokespecial <init> : ([C)V
    //   141: invokevirtual intern : ()Ljava/lang/String;
    //   144: swap
    //   145: pop
    //   146: swap
    //   147: pop
    //   148: goto -> 8
    //   151: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */