package burp;

import java.awt.Component;
import javax.swing.JList;

class Zed_ extends Zedw {
  private final byte Zv;
  
  Zed_(byte paramByte) {
    this.Zv = paramByte;
    setOpaque(true);
  }
  
  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore #6
    //   5: aload_0
    //   6: aload_2
    //   7: checkcast java/lang/String
    //   10: invokevirtual setText : (Ljava/lang/String;)V
    //   13: iload_3
    //   14: tableswitch default -> 123, -1 -> 40, 0 -> 65, 1 -> 90
    //   40: aload_0
    //   41: getstatic burp/Zlkk.SOLID_FOREGROUND : Lburp/Zlkk;
    //   44: invokevirtual ZS : ()Ljava/awt/Color;
    //   47: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   50: aload_0
    //   51: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   54: invokevirtual ZS : ()Ljava/awt/Color;
    //   57: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   60: aload #6
    //   62: ifnull -> 227
    //   65: aload_0
    //   66: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   69: invokevirtual ZS : ()Ljava/awt/Color;
    //   72: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   75: aload_0
    //   76: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   79: invokevirtual ZS : ()Ljava/awt/Color;
    //   82: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   85: aload #6
    //   87: ifnull -> 227
    //   90: aload_0
    //   91: getfield Zv : B
    //   94: iconst_2
    //   95: if_icmpeq -> 123
    //   98: aload_0
    //   99: getstatic burp/Zlkk.SOLID_FOREGROUND : Lburp/Zlkk;
    //   102: invokevirtual ZS : ()Ljava/awt/Color;
    //   105: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   108: aload_0
    //   109: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   112: invokevirtual ZS : ()Ljava/awt/Color;
    //   115: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   118: aload #6
    //   120: ifnull -> 227
    //   123: aload_0
    //   124: getfield Zv : B
    //   127: tableswitch default -> 227, 0 -> 152, 1 -> 174, 2 -> 203
    //   152: aload_0
    //   153: getstatic burp/Zz8_.ZW : [Lburp/Zz8_;
    //   156: iload_3
    //   157: iconst_1
    //   158: isub
    //   159: aaload
    //   160: getfield Zr : Lburp/Zr4_;
    //   163: getfield Zm : Ljava/awt/Color;
    //   166: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   169: aload #6
    //   171: ifnull -> 227
    //   174: aload_0
    //   175: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   178: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   181: aload_0
    //   182: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   185: iload_3
    //   186: iconst_1
    //   187: isub
    //   188: aaload
    //   189: getfield Zr : Lburp/Zr4_;
    //   192: getfield ZM : Ljava/awt/Color;
    //   195: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   198: aload #6
    //   200: ifnull -> 227
    //   203: aload_0
    //   204: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   207: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   210: aload_0
    //   211: getstatic burp/Zz8_.ZH : [Lburp/Zz8_;
    //   214: iload_3
    //   215: iconst_1
    //   216: isub
    //   217: aaload
    //   218: getfield Zr : Lburp/Zr4_;
    //   221: getfield ZM : Ljava/awt/Color;
    //   224: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   227: aload_0
    //   228: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zed_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */