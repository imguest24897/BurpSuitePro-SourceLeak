package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;

public class Zbks extends Zbv5 implements Zt3u {
  private final Zrud ZK;
  
  private final Zr1m Zm;
  
  private final Zkf1 ZE;
  
  private final Collection<String> ZT;
  
  private final String ZL;
  
  private volatile boolean ZP;
  
  private Zbqc Z_;
  
  private Zzdy ZV;
  
  private Zedd Zo;
  
  private Zl8w ZM;
  
  private Zm99 Zv;
  
  private Zm99 Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbks(Zrud paramZrud, Zr1m paramZr1m, Zkf1 paramZkf1) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZK : Lburp/Zrud;
    //   9: invokestatic Zb : ()Ljava/lang/String;
    //   12: aload_0
    //   13: aload_2
    //   14: putfield Zm : Lburp/Zr1m;
    //   17: astore #4
    //   19: aload_0
    //   20: aload_3
    //   21: putfield ZE : Lburp/Zkf1;
    //   24: aload_0
    //   25: invokevirtual ZQ : ()V
    //   28: aload_0
    //   29: sipush #-25527
    //   32: sipush #2719
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual setName : (Ljava/lang/String;)V
    //   41: sipush #-25532
    //   44: sipush #-27843
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: astore #5
    //   52: aload_0
    //   53: aload #5
    //   55: sipush #-25530
    //   58: sipush #701
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: sipush #-25524
    //   67: sipush #14459
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: sipush #-25531
    //   76: sipush #-27334
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: sipush #-25528
    //   85: sipush #-21980
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: sipush #-25534
    //   94: sipush #990
    //   97: invokestatic a : (II)Ljava/lang/String;
    //   100: sipush #-25525
    //   103: sipush #-5630
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   112: putfield ZT : Ljava/util/Collection;
    //   115: ldc ''
    //   117: astore #6
    //   119: invokestatic ZF : ()Z
    //   122: ifeq -> 141
    //   125: sipush #-25536
    //   128: sipush #29782
    //   131: invokestatic a : (II)Ljava/lang/String;
    //   134: astore #6
    //   136: aload #4
    //   138: ifnonnull -> 158
    //   141: invokestatic ZQ : ()Z
    //   144: ifne -> 158
    //   147: sipush #-25521
    //   150: sipush #6330
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: astore #6
    //   158: aload_0
    //   159: aload #5
    //   161: aload #6
    //   163: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   168: putfield ZL : Ljava/lang/String;
    //   171: aload_0
    //   172: invokevirtual Zh : ()V
    //   175: aload_0
    //   176: getfield Zd : Lburp/Zm99;
    //   179: getstatic burp/Zxpj.WARNING_LARGE : Lburp/Zxpj;
    //   182: invokestatic ZK : (Lburp/Zxpj;)Ljavax/swing/ImageIcon;
    //   185: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   188: aload_0
    //   189: getfield Zd : Lburp/Zm99;
    //   192: getstatic burp/Zlkk.HIGHLIGHT_PANEL_BACKGROUND : Lburp/Zlkk;
    //   195: invokevirtual ZO : (Lburp/Zlkk;)V
    //   198: aload_0
    //   199: getfield ZM : Lburp/Zl8w;
    //   202: sipush #-25529
    //   205: sipush #4692
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   214: invokevirtual putClientProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   217: aload_0
    //   218: getfield ZM : Lburp/Zl8w;
    //   221: getstatic burp/Zlkk.SOLID_FOREGROUND : Lburp/Zlkk;
    //   224: invokevirtual ZH : (Lburp/Zlkk;)V
    //   227: aload_0
    //   228: getfield ZM : Lburp/Zl8w;
    //   231: getstatic burp/Zlkk.HIGHLIGHT_PANEL_BACKGROUND : Lburp/Zlkk;
    //   234: invokevirtual ZL : (Lburp/Zlkk;)V
    //   237: aload_0
    //   238: getfield ZM : Lburp/Zl8w;
    //   241: sipush #-25506
    //   244: sipush #8855
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: invokevirtual setText : (Ljava/lang/String;)V
    //   253: invokestatic ZF : ()Z
    //   256: ifeq -> 288
    //   259: aload_0
    //   260: getfield ZV : Lburp/Zzdy;
    //   263: iconst_0
    //   264: invokevirtual setEnabled : (Z)V
    //   267: aload_0
    //   268: getfield Zv : Lburp/Zm99;
    //   271: iconst_0
    //   272: invokevirtual setEnabled : (Z)V
    //   275: aload_0
    //   276: getfield Zo : Lburp/Zedd;
    //   279: iconst_0
    //   280: invokevirtual setEnabled : (Z)V
    //   283: aload #4
    //   285: ifnonnull -> 353
    //   288: invokestatic ZQ : ()Z
    //   291: ifeq -> 325
    //   294: aload_1
    //   295: aload_0
    //   296: aload_1
    //   297: <illegal opcode> ZK : (Lburp/Zbks;Lburp/Zrud;)Lburp/Zgxg;
    //   302: invokevirtual ZX : (Lburp/Zgxg;)V
    //   305: aload_0
    //   306: getfield ZV : Lburp/Zzdy;
    //   309: aload_1
    //   310: invokevirtual ZN : ()Z
    //   313: invokevirtual setSelected : (Z)V
    //   316: aload_0
    //   317: invokevirtual Zw : ()V
    //   320: aload #4
    //   322: ifnonnull -> 353
    //   325: aload_0
    //   326: getfield ZV : Lburp/Zzdy;
    //   329: iconst_0
    //   330: invokevirtual setEnabled : (Z)V
    //   333: aload_0
    //   334: getfield Zv : Lburp/Zm99;
    //   337: iconst_0
    //   338: invokevirtual setEnabled : (Z)V
    //   341: aload_0
    //   342: getfield Zo : Lburp/Zedd;
    //   345: iconst_0
    //   346: invokevirtual setEnabled : (Z)V
    //   349: aload_0
    //   350: invokevirtual Zw : ()V
    //   353: return
  }
  
  public String Zjd() {
    return this.ZL;
  }
  
  public String ZjS() {
    return a(-25526, -8415);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(-25522, -2172), Zk97.DESKTOP_SETTINGS_SUITE_UPDATES, this.Zm, new String[] { a(-25535, 29476) });
    if (Zsht.ZF() || !Zsht.ZQ())
      zbkr.ZV(false); 
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZT;
  }
  
  private void Zh() {
    this.ZP = true;
    this.Zo.removeAllItems();
    Ze9e ze9e = this.ZK.Zz();
    if (Ze9e.Zt.equals(ze9e))
      this.Zo.addItem(Ze9e.Zt); 
    Objects.requireNonNull(this.Zo);
    this.ZK.Zg().forEach(this.Zo::addItem);
    this.Zo.setEnabled(this.ZK.ZN());
    this.Zo.setSelectedItem(ze9e);
    this.ZP = false;
  }
  
  private void Zw() {
    this.Zd.setVisible(false);
    this.ZM.setVisible(false);
  }
  
  public void Zt2() {}
  
  private void ZQ() {
    this.ZV = new Zzdy();
    this.Z_ = new Zbqc();
    this.Zv = new Zm99();
    this.Zo = new Zedd();
    this.Zd = new Zm99();
    this.ZM = new Zl8w();
    setMinimumSize(new Dimension(250, 20));
    setLayout(new GridBagLayout());
    this.ZV.setText(a(-25533, -1004));
    this.ZV.addActionListener(new Zehl(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.ZV, gridBagConstraints);
    this.Z_.setBorder(BorderFactory.createEmptyBorder(6, 10, 6, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.Z_.setLayout(gridBagLayout);
    this.Zv.setText(a(-25523, -15518));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.Z_.add(this.Zv, gridBagConstraints);
    this.Zo.addActionListener(new Zxwb(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.Z_.add(this.Zo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(5, 0, 15, 0);
    add(this.Z_, gridBagConstraints);
    this.Zd.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 0));
    this.Zd.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 3;
    add(this.Zd, gridBagConstraints);
    this.ZM.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
    this.ZM.setOpaque(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZM, gridBagConstraints);
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    if (!this.ZV.isSelected())
      Zm2.ZC(Zrrh.USER_OPTIONS_MISC_AUTO_UPDATE_DISABLED); 
    this.ZK.Zq(this.ZV.isSelected());
    this.Zo.setEnabled(this.ZV.isSelected());
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    if (!this.ZP) {
      this.ZK.ZU((Ze9e)this.Zo.getSelectedItem());
      Objects.requireNonNull(this.ZE);
      SwingUtilities.invokeLater(this.ZE::ZS);
    } 
  }
  
  private void lambda$new$0(Zrud paramZrud) {
    this.ZV.setSelected(paramZrud.ZN());
    Zh();
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'úñ²¸ýí\\t¢ÆÉ­Dc¢÷Ø|Óã}·÷ñËÅ\\f*«HÝ8,ºLÈ\\b^iÓ+óiCù`÷1vg|Ðwp$ûU9;@$¯zÎ0]HâYåR`ÔòM|Gø½OPcRñÖª·ùËÐcíó<\\r\\rÄ[ \¢,ºËaÓ¶PåWáWÔ\\bàwò¹*?\\f;Zjî|æ23ê" 1¾È:RÁ©mRêCfë³Z¼^oE'&>++:ØáõÒôUÁ>ÝâÌzÖy\\tZýÕAa .Ò×&s\\r°ÙE¶ª|ÒäW9ÛÆJØ94ÑÒ¤Eì]æÐáâ'n7K£m}¼åGj9Xs|¬ÙÆÒ+I:FH}iWQ¸«u°ôÐ|@¨½f7x[Æ¥IX{'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #14
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
    //   68: ldc 'oULmV_½è³FhÏm$¼¿ĲXä[þb|És0µFâüMdéÝVøâ´¼Æ0ÁüzÒºHeü\\bì÷?[2èå?î* ©`ÆUãÛñK³~ÇsÍðY¹výÉñò®ôÎ4Å:^Õ6>d»moÉ\\tP¸MßÉ¶<Í:UÂVQ&Ògný[:¼\\rU÷ñ¦¦käJW= ÷Ó¶Ñßc.9RY\\b9½Ù×û]jN Ü¹M§7Ý$/åSÁÐa}ûl0çX$«wZE0ñepúõÛpó® A;$oO\\t\\f¸\\rMøÎIÒdºTó«&íwG®xÊ_^ÝÉò@¾ôë¨f<£DI³6DK4»Â(ì¶?ðUs${aú¯£=¯r\\bÔÂK<'¢pÅÁ ÐÝ°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #33
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
    //   129: putstatic burp/Zbks.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbks.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
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
    //   212: bipush #13
    //   214: goto -> 244
    //   217: bipush #112
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #120
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #6
    //   239: goto -> 244
    //   242: bipush #75
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9C4E) & 0xFFFF;
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
      byte b1 = 26;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */