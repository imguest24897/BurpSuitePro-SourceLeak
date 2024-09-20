package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Box;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbaj extends Zbv5 implements Zt3u {
  private final Zqe ZR;
  
  private final Zr1m Zy;
  
  private final Set<String> ZA;
  
  Zzdy ZQ;
  
  private Box.Filler ZK;
  
  private Zm99 ZV;
  
  private Zm99 Zu;
  
  private Zm99 Z_;
  
  private Zm9v ZX;
  
  private Zm9v Zg;
  
  private Zm9v Zv;
  
  Zgff ZD;
  
  Zgff ZO;
  
  Zgff ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbaj(Zqe paramZqe, Zr1m paramZr1m) {
    this.ZR = paramZqe;
    this.Zy = paramZr1m;
    this.ZA = Set.of(Zjd(), a(-9758, -5193), a(-9747, -15980), a(-9759, 27318), a(-9753, -27223), a(-9750, -25683), a(-9746, 4961));
    Zq();
    setName(a(-9754, 19701));
  }
  
  public String Zjd() {
    return a(-9749, 8404);
  }
  
  public String ZjS() {
    return a(-9757, -24223);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZM(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_SEQUENCER_SAMPLE_LIVE_CAPTURE_OPTIONS, this.Zy, this, true, new String[] { a(-9755, 26219) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZA;
  }
  
  public void Zt2() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Lburp/Zqe;
    //   4: invokeinterface ZGj : ()I
    //   9: istore_1
    //   10: aload_0
    //   11: getfield ZR : Lburp/Zqe;
    //   14: invokeinterface ZGw : ()I
    //   19: istore_2
    //   20: aload_0
    //   21: getfield ZR : Lburp/Zqe;
    //   24: invokeinterface ZGb : ()I
    //   29: istore_3
    //   30: aload_0
    //   31: getfield ZR : Lburp/Zqe;
    //   34: invokeinterface ZGa : ()Z
    //   39: istore #4
    //   41: aload_0
    //   42: getfield ZO : Lburp/Zgff;
    //   45: iload_1
    //   46: invokestatic toString : (I)Ljava/lang/String;
    //   49: invokevirtual setText : (Ljava/lang/String;)V
    //   52: aload_0
    //   53: getfield ZD : Lburp/Zgff;
    //   56: iload_2
    //   57: invokestatic toString : (I)Ljava/lang/String;
    //   60: invokevirtual setText : (Ljava/lang/String;)V
    //   63: aload_0
    //   64: getfield ZG : Lburp/Zgff;
    //   67: iload_3
    //   68: i2l
    //   69: invokestatic toString : (J)Ljava/lang/String;
    //   72: invokevirtual setText : (Ljava/lang/String;)V
    //   75: aload_0
    //   76: getfield ZQ : Lburp/Zzdy;
    //   79: iload #4
    //   81: invokevirtual setSelected : (Z)V
    //   84: aload_0
    //   85: getfield ZD : Lburp/Zgff;
    //   88: iload #4
    //   90: invokevirtual setEnabled : (Z)V
    //   93: aload_0
    //   94: getfield Zg : Lburp/Zm9v;
    //   97: iload_1
    //   98: ifle -> 114
    //   101: iload_1
    //   102: bipush #20
    //   104: if_icmple -> 122
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   113: athrow
    //   114: iconst_1
    //   115: goto -> 123
    //   118: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   121: athrow
    //   122: iconst_0
    //   123: invokevirtual setVisible : (Z)V
    //   126: aload_0
    //   127: getfield Zv : Lburp/Zm9v;
    //   130: iload_3
    //   131: ifge -> 142
    //   134: iconst_1
    //   135: goto -> 143
    //   138: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   141: athrow
    //   142: iconst_0
    //   143: invokevirtual setVisible : (Z)V
    //   146: aload_0
    //   147: getfield ZX : Lburp/Zm9v;
    //   150: iload #4
    //   152: ifeq -> 174
    //   155: iload_2
    //   156: ifge -> 174
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   165: athrow
    //   166: iconst_1
    //   167: goto -> 175
    //   170: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   173: athrow
    //   174: iconst_0
    //   175: invokevirtual setVisible : (Z)V
    //   178: return
    // Exception table:
    //   from	to	target	type
    //   41	107	110	java/lang/NumberFormatException
    //   101	118	118	java/lang/NumberFormatException
    //   123	138	138	java/lang/NumberFormatException
    //   143	159	162	java/lang/NumberFormatException
    //   155	170	170	java/lang/NumberFormatException
  }
  
  private void Zq() {
    this.ZV = new Zm99();
    this.ZO = new Zgff();
    this.Zu = new Zm99();
    this.ZG = new Zgff();
    this.ZQ = new Zzdy();
    this.ZD = new Zgff();
    this.Z_ = new Zm99();
    this.Zg = new Zm9v();
    this.Zv = new Zm9v();
    this.ZX = new Zm9v();
    this.ZK = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZV.setText(a(-9752, 16318));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(this.ZV, gridBagConstraints);
    this.ZO.setColumns(5);
    this.ZO.setText("5");
    this.ZO.ZH(Zlw9.NUMBER);
    this.ZO.addKeyListener(new Zttt(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 512;
    add(this.ZO, gridBagConstraints);
    this.Zu.setText(a(-9745, 28075));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    add(this.Zu, gridBagConstraints);
    this.ZG.setColumns(5);
    this.ZG.setText("0");
    this.ZG.ZH(Zlw9.NUMBER);
    this.ZG.addKeyListener(new Zlh5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 512;
    add(this.ZG, gridBagConstraints);
    this.ZQ.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZQ.setSelected(true);
    this.ZQ.setText(a(-9748, 16110));
    this.ZQ.setMargin(new Insets(0, 0, 0, 0));
    this.ZQ.addActionListener(new Zzcy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 21;
    add(this.ZQ, gridBagConstraints);
    this.ZD.setColumns(5);
    this.ZD.setText("5");
    this.ZD.ZH(Zlw9.NUMBER);
    this.ZD.addKeyListener(new Zlo_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 512;
    add(this.ZD, gridBagConstraints);
    this.Z_.setText(a(-9751, 5347));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 512;
    add(this.Z_, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 512;
    add(this.Zg, gridBagConstraints);
    this.Zv.setText(a(-9760, -2701));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 512;
    add(this.Zv, gridBagConstraints);
    this.ZX.setText(a(-9756, 29728));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 512;
    add(this.ZX, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZK, gridBagConstraints);
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    boolean bool = this.ZQ.isSelected();
    this.ZD.setEnabled(bool);
    this.ZR.ZKj(bool);
    Zi((KeyEvent)null);
  }
  
  private void Zm(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZO : Lburp/Zgff;
    //   4: invokevirtual getText : ()Ljava/lang/String;
    //   7: invokestatic parseInt : (Ljava/lang/String;)I
    //   10: istore_2
    //   11: aload_0
    //   12: getfield Zg : Lburp/Zm9v;
    //   15: iload_2
    //   16: ifle -> 32
    //   19: iload_2
    //   20: bipush #20
    //   22: if_icmple -> 40
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   31: athrow
    //   32: iconst_1
    //   33: goto -> 41
    //   36: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   39: athrow
    //   40: iconst_0
    //   41: invokevirtual setVisible : (Z)V
    //   44: goto -> 65
    //   47: astore_3
    //   48: aload_3
    //   49: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: iconst_m1
    //   56: istore_2
    //   57: aload_0
    //   58: getfield Zg : Lburp/Zm9v;
    //   61: iconst_1
    //   62: invokevirtual setVisible : (Z)V
    //   65: aload_0
    //   66: getfield ZR : Lburp/Zqe;
    //   69: iload_2
    //   70: invokeinterface ZN : (I)V
    //   75: return
    // Exception table:
    //   from	to	target	type
    //   0	44	47	java/lang/NumberFormatException
    //   11	25	28	java/lang/NumberFormatException
    //   19	36	36	java/lang/NumberFormatException
  }
  
  private void Zl(KeyEvent paramKeyEvent) {
    byte b;
    try {
      b = Integer.parseInt(this.ZG.getText());
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      this.Zv.setVisible((b < 0));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      b = -1;
      this.Zv.setVisible(true);
    } 
    this.ZR.Zg(b);
  }
  
  private void Zi(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZD : Lburp/Zgff;
    //   4: invokevirtual getText : ()Ljava/lang/String;
    //   7: invokestatic parseInt : (Ljava/lang/String;)I
    //   10: istore_2
    //   11: aload_0
    //   12: getfield ZX : Lburp/Zm9v;
    //   15: aload_0
    //   16: getfield ZQ : Lburp/Zzdy;
    //   19: invokevirtual isSelected : ()Z
    //   22: ifeq -> 44
    //   25: iload_2
    //   26: ifge -> 44
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   35: athrow
    //   36: iconst_1
    //   37: goto -> 45
    //   40: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   43: athrow
    //   44: iconst_0
    //   45: invokevirtual setVisible : (Z)V
    //   48: goto -> 69
    //   51: astore_3
    //   52: aload_3
    //   53: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   56: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   59: iconst_m1
    //   60: istore_2
    //   61: aload_0
    //   62: getfield ZX : Lburp/Zm9v;
    //   65: iconst_1
    //   66: invokevirtual setVisible : (Z)V
    //   69: aload_0
    //   70: getfield ZR : Lburp/Zqe;
    //   73: iload_2
    //   74: invokeinterface ZG : (I)V
    //   79: return
    // Exception table:
    //   from	to	target	type
    //   0	48	51	java/lang/NumberFormatException
    //   11	29	32	java/lang/NumberFormatException
    //   25	40	40	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ',Ø±g®{¢Xu)»+ú¿^·¨×kàeAjúLWrµß*EÖ+Qàc4yEöoÞeJ&ãsSZò?¾WàË8©®âòé9½M8®­¹v·µw¿i¹­Ü¯Å¨¾jb<NÔg¼ÊÂ5Hq±õÀ>§X»¾füÜ;÷Î@\\f£¼æf\\rÐ&¤¾[ ÈHpåäUB¤MªkÉ%&¦\\n÷C±¯S(_&aÔl®®þ3Öy\\t«ÞªO/f.Q'*Ï¤oH³"ýE¹!wp°*ÔMoë%|¬tëu02¸\\rñ\\f\\t¼àÐ¹aS(73´+ú\ªÍW9!Çæ·(Yuä­\\r¼§\\bg»oû´dîx~\\tÍ§C©¿|ëåucÑ>KÅiZòÂE\Â:ç «2Ú¨¬Þ8îoè))â~F¬|ñôS@JW/Ä­r5æ;6Í|¢?;-Q"üçH\\bËW­\\nmydL94\\f%¿Ûí6YÄx.õ:S+-\\rÉõ£¦¯ýr'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '¾uå¹$ Æ´¦÷Õ9Í~P $&ôÏÂÁÏ"'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #107
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zbaj.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbaj.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #8
    //   214: goto -> 243
    //   217: bipush #102
    //   219: goto -> 243
    //   222: bipush #35
    //   224: goto -> 243
    //   227: bipush #31
    //   229: goto -> 243
    //   232: bipush #46
    //   234: goto -> 243
    //   237: bipush #86
    //   239: goto -> 243
    //   242: iconst_4
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD9EE) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '¦';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbaj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */