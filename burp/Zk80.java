package burp;

import java.awt.Container;
import java.awt.Toolkit;
import java.util.Map;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

public final class Zk80 implements SwingConstants {
  private static final char[] Zy;
  
  private static final char[] ZI;
  
  private static final char[] ZZ;
  
  private static final String a;
  
  public static Map<?, ?> Zw() {
    return (Map<?, ?>)Toolkit.getDefaultToolkit().getDesktopProperty(a);
  }
  
  public static Zsqn Zh(Zmgw paramZmgw) {
    Zsqn zsqn = null;
    Container container = paramZmgw.getParent();
    if (container instanceof javax.swing.JViewport) {
      container = container.getParent();
      if (container instanceof Zvol) {
        Zvol zvol = (Zvol)container;
        zsqn = zvol.Zx();
      } 
    } 
    return zsqn;
  }
  
  public static Zska Zf(Ze9f paramZe9f, int paramInt) {
    Element element = paramZe9f.getDefaultRootElement();
    int i = element.getElementIndex(paramInt);
    Ze7g ze7g = paramZe9f.Zw(i);
    return ZU(ze7g, paramInt);
  }
  
  public static Zska ZU(Ze7g paramZe7g, int paramInt) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    for (Zska zska : paramZe7g) {
      if (zska.Zc(paramInt))
        return zska; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  public static boolean ZC(char paramChar) {
    return (paramChar == ' ' || paramChar == '\t');
  }
  
  public static boolean Zs(Zska paramZska) {
    char c;
    return (paramZska == null || (paramZska.Za() == 1 && ((c = paramZska.Zg(0)) == '=' || c == '(' || c == ',' || c == '?' || c == ':' || c == '[' || c == '!' || c == '&')) || (paramZska.ZX() == 24 && (paramZska.Zg(paramZska.Za() - 1) == '=' || paramZska.ZQ(ZI) || paramZska.ZQ(ZZ))) || paramZska.ZE(7, Zy));
  }
  
  public static String ZJ(String paramString) {
    byte b = 0;
    int i = paramString.length();
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    while (b < i && ZC(paramString.charAt(b))) {
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramString.substring(0, b);
  }
  
  public static String ZV(Ze9f paramZe9f, int paramInt) throws BadLocationException {
    Element element1 = paramZe9f.getDefaultRootElement();
    int i = element1.getElementIndex(paramInt);
    Element element2 = element1.getElement(i);
    int j = element2.getStartOffset();
    int k = paramZe9f.Zz(element2.getEndOffset());
    String str = paramZe9f.getText(j, k - j);
    return ZJ(str);
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc 'J[F9KTS#MGXN$'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk80.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #86
    //   82: goto -> 111
    //   85: bipush #16
    //   87: goto -> 111
    //   90: iconst_2
    //   91: goto -> 111
    //   94: bipush #28
    //   96: goto -> 111
    //   99: bipush #13
    //   101: goto -> 111
    //   104: bipush #87
    //   106: goto -> 111
    //   109: bipush #122
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
    //   153: bipush #6
    //   155: newarray char
    //   157: dup
    //   158: iconst_0
    //   159: bipush #114
    //   161: castore
    //   162: dup
    //   163: iconst_1
    //   164: bipush #101
    //   166: castore
    //   167: dup
    //   168: iconst_2
    //   169: bipush #116
    //   171: castore
    //   172: dup
    //   173: iconst_3
    //   174: bipush #117
    //   176: castore
    //   177: dup
    //   178: iconst_4
    //   179: bipush #114
    //   181: castore
    //   182: dup
    //   183: iconst_5
    //   184: bipush #110
    //   186: castore
    //   187: putstatic burp/Zk80.Zy : [C
    //   190: iconst_2
    //   191: newarray char
    //   193: dup
    //   194: iconst_0
    //   195: bipush #38
    //   197: castore
    //   198: dup
    //   199: iconst_1
    //   200: bipush #38
    //   202: castore
    //   203: putstatic burp/Zk80.ZI : [C
    //   206: iconst_2
    //   207: newarray char
    //   209: dup
    //   210: iconst_0
    //   211: bipush #124
    //   213: castore
    //   214: dup
    //   215: iconst_1
    //   216: bipush #124
    //   218: castore
    //   219: putstatic burp/Zk80.ZZ : [C
    //   222: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk80.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */