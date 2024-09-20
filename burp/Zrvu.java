package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrvu extends Zrh7 {
  private final Zbad ZV;
  
  private final Zecc ZA;
  
  private Zbqc Zy;
  
  private Ze01 ZW;
  
  private Ze01 ZO;
  
  private Zedd ZF;
  
  private Zl8w Z_;
  
  private Zm2o ZX;
  
  private Zm99 ZT;
  
  private Zm99 ZG;
  
  private Zm99 ZU;
  
  private Zm99 ZN;
  
  private Zm99 Zb;
  
  private Zm99 Zi;
  
  private Zbqc Zl;
  
  private Zm9v ZL;
  
  private Zgff ZM;
  
  private Zgff Zu;
  
  private Zgff Zp;
  
  private Ztln ZY;
  
  private Zgff Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zrvu(Window paramWindow, Zbad paramZbad, Zr6v paramZr6v, Zecc paramZecc) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.CONFIG_PANEL_PLATFORM_AUTH_POPUP : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: aload_0
    //   10: aload #4
    //   12: putfield ZA : Lburp/Zecc;
    //   15: aload_0
    //   16: aload_2
    //   17: putfield ZV : Lburp/Zbad;
    //   20: invokestatic Zb : ()Ljava/lang/String;
    //   23: aload_0
    //   24: invokevirtual Za : ()V
    //   27: astore #5
    //   29: aload_0
    //   30: aload_3
    //   31: ifnonnull -> 46
    //   34: sipush #27493
    //   37: sipush #11913
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: goto -> 55
    //   46: sipush #27491
    //   49: sipush #29662
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokevirtual setTitle : (Ljava/lang/String;)V
    //   58: aload_0
    //   59: getfield ZF : Lburp/Zedd;
    //   62: ldc ''
    //   64: invokevirtual addItem : (Ljava/lang/Object;)V
    //   67: aload_0
    //   68: getfield ZF : Lburp/Zedd;
    //   71: sipush #27497
    //   74: sipush #16187
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: invokevirtual addItem : (Ljava/lang/Object;)V
    //   83: aload_0
    //   84: getfield ZF : Lburp/Zedd;
    //   87: sipush #27494
    //   90: sipush #31349
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: invokevirtual addItem : (Ljava/lang/Object;)V
    //   99: aload_0
    //   100: getfield ZF : Lburp/Zedd;
    //   103: sipush #27499
    //   106: sipush #11393
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual addItem : (Ljava/lang/Object;)V
    //   115: aload_3
    //   116: ifnull -> 201
    //   119: aload_3
    //   120: invokevirtual ZO : ()Lburp/Zkjm;
    //   123: astore #6
    //   125: aload_0
    //   126: getfield ZM : Lburp/Zgff;
    //   129: aload_3
    //   130: invokevirtual ZE : ()Ljava/lang/String;
    //   133: invokevirtual setText : (Ljava/lang/String;)V
    //   136: aload_0
    //   137: getfield ZF : Lburp/Zedd;
    //   140: aload #6
    //   142: invokevirtual Zn : ()I
    //   145: invokevirtual setSelectedIndex : (I)V
    //   148: aload_0
    //   149: getfield Zn : Lburp/Zgff;
    //   152: aload #6
    //   154: invokevirtual Zk : ()Ljava/lang/String;
    //   157: invokevirtual setText : (Ljava/lang/String;)V
    //   160: aload_0
    //   161: getfield ZY : Lburp/Ztln;
    //   164: aload #6
    //   166: invokevirtual ZK : ()Ljava/lang/String;
    //   169: invokevirtual setText : (Ljava/lang/String;)V
    //   172: aload_0
    //   173: getfield Zu : Lburp/Zgff;
    //   176: aload #6
    //   178: invokevirtual Zd : ()Ljava/lang/String;
    //   181: invokevirtual setText : (Ljava/lang/String;)V
    //   184: aload_0
    //   185: getfield Zp : Lburp/Zgff;
    //   188: aload #6
    //   190: invokevirtual ZJ : ()Ljava/lang/String;
    //   193: invokevirtual setText : (Ljava/lang/String;)V
    //   196: aload #5
    //   198: ifnonnull -> 209
    //   201: aload_0
    //   202: getfield ZF : Lburp/Zedd;
    //   205: iconst_0
    //   206: invokevirtual setSelectedIndex : (I)V
    //   209: aload_0
    //   210: new burp/Zlif
    //   213: dup
    //   214: aload_0
    //   215: invokespecial <init> : (Lburp/Zrvu;)V
    //   218: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   221: aload_0
    //   222: invokevirtual pack : ()V
    //   225: aload_0
    //   226: aload_1
    //   227: invokevirtual Zq : (Ljava/awt/Window;)V
    //   230: return
  }
  
  private void Za() {
    this.Zy = new Zbqc();
    this.Z_ = new Zl8w();
    this.ZX = new Zm2o();
    this.ZG = new Zm99();
    this.ZF = new Zedd();
    this.ZN = new Zm99();
    this.ZU = new Zm99();
    this.Zb = new Zm99();
    this.ZT = new Zm99();
    this.Zp = new Zgff();
    this.Zu = new Zgff();
    this.ZY = new Ztln();
    this.Zn = new Zgff();
    this.Zi = new Zm99();
    this.ZM = new Zgff();
    this.Zl = new Zbqc();
    this.ZW = new Ze01();
    this.ZO = new Ze01();
    this.ZL = new Zm9v();
    setDefaultCloseOperation(2);
    this.Zy.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    this.Zy.setLayout(gridBagLayout);
    this.Z_.setText(a(27495, -13428));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.Zy.add(this.Z_, gridBagConstraints);
    this.ZX.Zi(Zk97.DESKTOP_SETTINGS_NETWORK_CONNECTIONS_PLATFORM_AUTHENTICATION);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zy.add(this.ZX, gridBagConstraints);
    this.ZG.setText(a(27490, -17947));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZG, gridBagConstraints);
    this.ZF.addActionListener(new Zro6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZF, gridBagConstraints);
    this.ZN.setText(a(27502, -19911));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZN, gridBagConstraints);
    this.ZU.setText(a(27498, 17578));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZU, gridBagConstraints);
    this.Zb.setText(a(27503, -17620));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.Zb, gridBagConstraints);
    this.ZT.setText(a(27489, 15777));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZT, gridBagConstraints);
    this.Zp.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.Zp, gridBagConstraints);
    this.Zu.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.Zu, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZY, gridBagConstraints);
    this.Zn.ZH(Zlw9.USERNAME);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.Zn, gridBagConstraints);
    this.Zi.setText(a(27496, -8102));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.Zi, gridBagConstraints);
    this.ZM.setColumns(30);
    this.ZM.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZM, gridBagConstraints);
    this.Zl.setLayout(new GridLayout(1, 2, 5, 0));
    this.ZW.setText(a(27501, -28096));
    this.ZW.addActionListener(new Zx5t(this));
    this.Zl.add(this.ZW);
    this.ZO.setText(a(27517, 6276));
    this.ZO.addActionListener(new Zzt_(this));
    this.Zl.add(this.ZO);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weighty = 1.0D;
    this.Zy.add(this.Zl, gridBagConstraints);
    this.ZL.setText(a(27516, -1450));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZL, gridBagConstraints);
    getContentPane().add(this.Zy, a(27492, 22440));
    pack();
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zedd;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: tableswitch default -> 147, 0 -> 40, 1 -> 76, 2 -> 112, 3 -> 112
    //   40: aload_0
    //   41: getfield Zn : Lburp/Zgff;
    //   44: iconst_0
    //   45: invokevirtual setEnabled : (Z)V
    //   48: aload_0
    //   49: getfield ZY : Lburp/Ztln;
    //   52: iconst_0
    //   53: invokevirtual setEnabled : (Z)V
    //   56: aload_0
    //   57: getfield Zu : Lburp/Zgff;
    //   60: iconst_0
    //   61: invokevirtual setEnabled : (Z)V
    //   64: aload_0
    //   65: getfield Zp : Lburp/Zgff;
    //   68: iconst_0
    //   69: invokevirtual setEnabled : (Z)V
    //   72: aload_2
    //   73: ifnonnull -> 147
    //   76: aload_0
    //   77: getfield Zn : Lburp/Zgff;
    //   80: iconst_1
    //   81: invokevirtual setEnabled : (Z)V
    //   84: aload_0
    //   85: getfield ZY : Lburp/Ztln;
    //   88: iconst_1
    //   89: invokevirtual setEnabled : (Z)V
    //   92: aload_0
    //   93: getfield Zu : Lburp/Zgff;
    //   96: iconst_0
    //   97: invokevirtual setEnabled : (Z)V
    //   100: aload_0
    //   101: getfield Zp : Lburp/Zgff;
    //   104: iconst_0
    //   105: invokevirtual setEnabled : (Z)V
    //   108: aload_2
    //   109: ifnonnull -> 147
    //   112: aload_0
    //   113: getfield Zn : Lburp/Zgff;
    //   116: iconst_1
    //   117: invokevirtual setEnabled : (Z)V
    //   120: aload_0
    //   121: getfield ZY : Lburp/Ztln;
    //   124: iconst_1
    //   125: invokevirtual setEnabled : (Z)V
    //   128: aload_0
    //   129: getfield Zu : Lburp/Zgff;
    //   132: iconst_1
    //   133: invokevirtual setEnabled : (Z)V
    //   136: aload_0
    //   137: getfield Zp : Lburp/Zgff;
    //   140: iconst_1
    //   141: invokevirtual setEnabled : (Z)V
    //   144: goto -> 147
    //   147: return
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    String str;
    Zkjm zkjm;
    try {
      str = this.ZM.getText();
      try {
        if (!Zgxs.Zc(str))
          throw new Exception(a(27488, -25213)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      zkjm = this.ZA.ZH((byte)this.ZF.getSelectedIndex(), this.Zn.getText(), new String(this.ZY.getPassword()), this.Zu.getText(), this.Zp.getText(), a(27500, 3871));
      try {
        if (zkjm.Zn() == 0)
          throw new Exception(a(27518, -14209)); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZL.setText(exception.getMessage());
      return;
    } 
    setVisible(false);
    dispose();
    this.ZV.Zo(str, zkjm);
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.ZV.Zo(null, null);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'rpF7dàÅ(*ß¨»TÚ¢ñ¥¶NåË¬°\\trª@ûñÑf^:¶v|>¹gP{îÉ|O·|FQÜL=Ã\\bÒ\\tg¾öb`Í9ù\\tã\\f÷ÇÞíÃÆ'^hõNòr}ð\\tMF<?gÆ3ríCõÇÿ!BZ7(¶Jcü£gl¨B\\n,ëÈ!²á'x-D(5îÂ\\b*Í5&«­Lð\\bñÝÇL%]Ê\\fÿ:wH¸Ú qmpõó²Ø÷mÆ8hÙ\\ru "2ä!gUà\\f½÷kA³&nGZE¦WEí9Ýp,åÔJI$J¡4îbS&?ü¬göo0Åò¼¡ù5Ø(Ä>/ÐUc<Õ:¢YX7Éá@60þÒ³ë`ü×kþºQÛu#µs)'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #20
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
    //   68: ldc 'v¦ZKð%êËXjk%>¯.ÎöØ¿¦odZ,»~@h®RdÎq'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #87
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
    //   129: putstatic burp/Zrvu.a : [Ljava/lang/String;
    //   132: bipush #19
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrvu.b : [Ljava/lang/String;
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
    //   212: bipush #117
    //   214: goto -> 244
    //   217: bipush #59
    //   219: goto -> 244
    //   222: bipush #11
    //   224: goto -> 244
    //   227: bipush #122
    //   229: goto -> 244
    //   232: bipush #35
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #44
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
    int i = (paramInt1 ^ 0x6B6C) & 0xFFFF;
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
      byte b1 = 119;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */