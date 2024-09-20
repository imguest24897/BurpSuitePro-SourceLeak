package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbr2 extends Zbg2 {
  private final Zt4u ZK;
  
  private final Zr45 ZE;
  
  private final int Zo;
  
  private Zm2o ZR;
  
  private Zm99 Zj;
  
  private Zm99 Zt;
  
  private Ze01 ZS;
  
  private Ze01 Z_;
  
  private Zl8w Zv;
  
  private Zl8w Zz;
  
  private Zm9v Zu;
  
  private Zm9v Zf;
  
  private Zm9v ZZ;
  
  private Zbqc Zx;
  
  private Zbqc Zw;
  
  private Zbqc Zb;
  
  public Zg85 ZN;
  
  public Zg85 Zd;
  
  private Ztln ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbr2(Zt4u paramZt4u, Zr45 paramZr45, Zbr9 paramZbr9) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zi : ()[Lburp/Zbqc;
    //   7: aload_0
    //   8: aload_1
    //   9: putfield ZK : Lburp/Zt4u;
    //   12: aload_0
    //   13: aload_2
    //   14: putfield ZE : Lburp/Zr45;
    //   17: aload_0
    //   18: invokevirtual ZH : ()V
    //   21: astore #4
    //   23: aload_0
    //   24: getfield Zu : Lburp/Zm9v;
    //   27: iconst_0
    //   28: invokevirtual setVisible : (Z)V
    //   31: aload_0
    //   32: getfield Zf : Lburp/Zm9v;
    //   35: iconst_0
    //   36: invokevirtual setVisible : (Z)V
    //   39: aload_0
    //   40: getfield ZZ : Lburp/Zm9v;
    //   43: iconst_0
    //   44: invokevirtual setVisible : (Z)V
    //   47: aload_0
    //   48: iconst_2
    //   49: anewarray java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: sipush #-11971
    //   57: sipush #14965
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: sipush #-11982
    //   69: sipush #14354
    //   72: invokestatic a : (II)Ljava/lang/String;
    //   75: aastore
    //   76: putfield ZB : [Ljava/lang/String;
    //   79: aload_0
    //   80: iconst_2
    //   81: newarray boolean
    //   83: dup
    //   84: iconst_0
    //   85: iconst_1
    //   86: bastore
    //   87: dup
    //   88: iconst_1
    //   89: iconst_1
    //   90: bastore
    //   91: putfield ZA : [Z
    //   94: aload_0
    //   95: iconst_1
    //   96: putfield Zh : I
    //   99: aload_0
    //   100: aload_3
    //   101: invokevirtual Zv : ()I
    //   104: putfield Zo : I
    //   107: aload_0
    //   108: getfield Zo : I
    //   111: tableswitch default -> 323, 0 -> 144, 1 -> 188, 2 -> 225, 3 -> 254, 4 -> 299
    //   144: aload_0
    //   145: getfield Zv : Lburp/Zl8w;
    //   148: sipush #-11981
    //   151: sipush #-15351
    //   154: invokestatic a : (II)Ljava/lang/String;
    //   157: invokevirtual setText : (Ljava/lang/String;)V
    //   160: aload_0
    //   161: aload_0
    //   162: getfield Zw : Lburp/Zbqc;
    //   165: invokevirtual remove : (Ljava/awt/Component;)V
    //   168: aload_0
    //   169: aload_0
    //   170: getfield Zb : Lburp/Zbqc;
    //   173: invokevirtual remove : (Ljava/awt/Component;)V
    //   176: aload #4
    //   178: ifnonnull -> 323
    //   181: iconst_1
    //   182: anewarray burp/Zbqc
    //   185: invokestatic Zr : ([Lburp/Zbqc;)V
    //   188: aload_0
    //   189: getfield Zv : Lburp/Zl8w;
    //   192: sipush #-11970
    //   195: sipush #-22588
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokevirtual setText : (Ljava/lang/String;)V
    //   204: aload_0
    //   205: aload_0
    //   206: getfield Zw : Lburp/Zbqc;
    //   209: invokevirtual remove : (Ljava/awt/Component;)V
    //   212: aload_0
    //   213: aload_0
    //   214: getfield Zb : Lburp/Zbqc;
    //   217: invokevirtual remove : (Ljava/awt/Component;)V
    //   220: aload #4
    //   222: ifnonnull -> 323
    //   225: aload_0
    //   226: getfield Zv : Lburp/Zl8w;
    //   229: sipush #-11972
    //   232: sipush #8668
    //   235: invokestatic a : (II)Ljava/lang/String;
    //   238: invokevirtual setText : (Ljava/lang/String;)V
    //   241: aload_0
    //   242: aload_0
    //   243: getfield Zw : Lburp/Zbqc;
    //   246: invokevirtual remove : (Ljava/awt/Component;)V
    //   249: aload #4
    //   251: ifnonnull -> 323
    //   254: aload_0
    //   255: getfield Zv : Lburp/Zl8w;
    //   258: sipush #-11975
    //   261: sipush #17494
    //   264: invokestatic a : (II)Ljava/lang/String;
    //   267: invokevirtual setText : (Ljava/lang/String;)V
    //   270: aload_0
    //   271: getfield Zz : Lburp/Zl8w;
    //   274: sipush #-11969
    //   277: sipush #-17852
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: invokevirtual setText : (Ljava/lang/String;)V
    //   286: aload_0
    //   287: aload_0
    //   288: getfield Zb : Lburp/Zbqc;
    //   291: invokevirtual remove : (Ljava/awt/Component;)V
    //   294: aload #4
    //   296: ifnonnull -> 323
    //   299: aload_0
    //   300: getfield Zv : Lburp/Zl8w;
    //   303: sipush #-11974
    //   306: sipush #5206
    //   309: invokestatic a : (II)Ljava/lang/String;
    //   312: invokevirtual setText : (Ljava/lang/String;)V
    //   315: aload_0
    //   316: aload_0
    //   317: getfield Zw : Lburp/Zbqc;
    //   320: invokevirtual remove : (Ljava/awt/Component;)V
    //   323: return
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 147, 0 -> 32, 1 -> 41
    //   32: aload_0
    //   33: getfield ZE : Lburp/Zr45;
    //   36: aload_0
    //   37: invokevirtual ZE : (Lburp/Zsic;)Lburp/Zsic;
    //   40: areturn
    //   41: aload_0
    //   42: aload_0
    //   43: getfield ZN : Lburp/Zg85;
    //   46: invokevirtual getText : ()Ljava/lang/String;
    //   49: aload_0
    //   50: getfield Zu : Lburp/Zm9v;
    //   53: invokevirtual Zu : (Ljava/lang/String;Lburp/Zm9v;)Z
    //   56: istore_3
    //   57: aload_0
    //   58: getfield Zo : I
    //   61: iconst_3
    //   62: if_icmpne -> 83
    //   65: iload_3
    //   66: aload_0
    //   67: aload_0
    //   68: getfield Zd : Lburp/Zg85;
    //   71: invokevirtual getText : ()Ljava/lang/String;
    //   74: aload_0
    //   75: getfield Zf : Lburp/Zm9v;
    //   78: invokevirtual Zu : (Ljava/lang/String;Lburp/Zm9v;)Z
    //   81: ior
    //   82: istore_3
    //   83: aload_0
    //   84: getfield Zo : I
    //   87: iconst_2
    //   88: if_icmpeq -> 99
    //   91: aload_0
    //   92: getfield Zo : I
    //   95: iconst_4
    //   96: if_icmpne -> 132
    //   99: aload_0
    //   100: getfield ZW : Lburp/Ztln;
    //   103: invokevirtual getPassword : ()[C
    //   106: arraylength
    //   107: ifne -> 124
    //   110: aload_0
    //   111: getfield ZZ : Lburp/Zm9v;
    //   114: iconst_1
    //   115: invokevirtual setVisible : (Z)V
    //   118: iconst_1
    //   119: istore_3
    //   120: aload_2
    //   121: ifnonnull -> 132
    //   124: aload_0
    //   125: getfield ZZ : Lburp/Zm9v;
    //   128: iconst_0
    //   129: invokevirtual setVisible : (Z)V
    //   132: iload_3
    //   133: ifeq -> 138
    //   136: aload_0
    //   137: areturn
    //   138: aload_0
    //   139: getfield ZE : Lburp/Zr45;
    //   142: aload_0
    //   143: invokevirtual Zs : (Lburp/Zsic;)Lburp/Zsic;
    //   146: areturn
    //   147: iconst_0
    //   148: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   151: iload_1
    //   152: i2l
    //   153: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   156: aload_0
    //   157: areturn
  }
  
  private boolean Zu(String paramString, Zm9v paramZm9v) {
    try {
      try {
        if (paramString.isEmpty())
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      new File(paramString);
      paramZm9v.setVisible(false);
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      paramZm9v.setVisible(true);
      return true;
    } 
  }
  
  String Zf() {
    return this.ZN.getText();
  }
  
  String Za() {
    return this.Zd.getText();
  }
  
  char[] Zj() {
    return this.ZW.getPassword();
  }
  
  private void ZH() {
    this.ZR = new Zm2o();
    this.Zj = new Zm99();
    this.Zx = new Zbqc();
    this.Zv = new Zl8w();
    this.ZS = new Ze01();
    this.ZN = new Zg85();
    this.Zu = new Zm9v();
    this.Zw = new Zbqc();
    this.Zz = new Zl8w();
    this.Z_ = new Ze01();
    this.Zd = new Zg85();
    this.Zf = new Zm9v();
    this.Zb = new Zbqc();
    this.Zt = new Zm99();
    this.ZW = new Ztln();
    this.ZZ = new Zm9v();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
    setLayout(gridBagLayout1);
    this.ZR.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_EXPORTING_AND_IMPORTING_THE_CA_CERTIFICATE);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZR, gridBagConstraints);
    this.Zj.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zj, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.Zx.setLayout(gridBagLayout2);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.Zx.add(this.Zv, gridBagConstraints);
    this.ZS.setText(a(-11978, -26142));
    this.ZS.addActionListener(new Zmwc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.Zx.add(this.ZS, gridBagConstraints);
    this.ZN.setColumns(25);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    this.Zx.add(this.ZN, gridBagConstraints);
    this.Zu.setText(a(-11977, 28318));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.Zx.add(this.Zu, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zx, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.Zw.setLayout(gridBagLayout3);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.Zw.add(this.Zz, gridBagConstraints);
    this.Z_.setText(a(-11976, 3716));
    this.Z_.addActionListener(new Zzms(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.Zw.add(this.Z_, gridBagConstraints);
    this.Zd.setColumns(25);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    this.Zw.add(this.Zd, gridBagConstraints);
    this.Zf.setText(a(-11980, 29477));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.Zw.add(this.Zf, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zw, gridBagConstraints);
    GridBagLayout gridBagLayout4 = new GridBagLayout();
    gridBagLayout4.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout4.rowHeights = new int[] { 0, 5, 0 };
    this.Zb.setLayout(gridBagLayout4);
    this.Zt.setText(a(-11979, -21128));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zb.add(this.Zt, gridBagConstraints);
    this.ZW.setColumns(15);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.Zb.add(this.ZW, gridBagConstraints);
    this.ZZ.setText(a(-11973, -27252));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    this.Zb.add(this.ZZ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zb, gridBagConstraints);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    boolean bool = true;
    if (this.Zo == 3 || this.Zo == 4)
      bool = false; 
    File file = Zs6n.ZP(Zg1m.CONFIG, this.ZK, this, bool);
    if (file != null) {
      this.ZN.setText(file.getPath());
      this.Zu.setVisible(false);
    } 
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    boolean bool = true;
    if (this.Zo == 3 || this.Zo == 4)
      bool = false; 
    File file = Zs6n.ZP(Zg1m.CONFIG, this.ZK, this, bool);
    if (file != null) {
      this.Zd.setText(file.getPath());
      this.Zf.setVisible(false);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼³¦3Låq+ö\\r¶Ëí9 ñ¦íº4õ¼îs{=9¹u?P5mêV9ÔÆWôeMM&mþÔéX¬¹Ò`^alæ@¦HÆ¯èæf;o°íÁ_ÑoúÎ\\t;4m²)eKÔPÅ5×Ï$óëÖ!J\\bñdÅlìANéºSjÇ¯qâ\\r\\nCo}\\nmbÿ4µbªÛÓ#k+p_Z\\t¥bV&¥\-)ø\\tHÂ¼¡@h3.¢5¶ØmÀób-Û¹ãùïù%ÞÞ@G¼þàÔ[ËÛ¹°[¸V{rb¨`)ÜJë>BAa.eW¯BÒ@2¥óÞãPªT2%Y#Ï2çÃ"|!^×·Ôr© áç"6pùaVòÀ1°zW!-É£Ù ÷»3üÜv8ôwÄ.»\§l6®vµÓ×fmJõXñbÈQ%vãêÅû"qR©%Ì-íúÝÿ;ÐKWbG¯heÇ²\\f¼£Æ\\tUAFjù\\b§`køuîÎ²ßÁÜæÈßæ¡Ê\\fª/}äoö³wÇòhÚÞýëécoHo!Tvø´ETÕ âtRÕ´)W¡8Îõ6iE¹e¿tæçsA¸Ä¿Uúçù¯iëjMc7LkÒe?MäÓò\\f¯IÖ°5äáÙ¤¸ÛÇt:(¯IäÙ·ñ;Nô" \\b[çsq,À{é¿ìK«Õª\\tùl.ö®Y'Íd Éó0º(9ã'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #53
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
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
    //   68: ldc 'VÝKþÏò\\tÝ#h²²#N{a&b¢ñÈÿ@3°PØOOc*ñÖ×êvÒÞàáî'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #43
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #69
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
    //   129: putstatic burp/Zbr2.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbr2.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #98
    //   214: goto -> 243
    //   217: bipush #29
    //   219: goto -> 243
    //   222: bipush #100
    //   224: goto -> 243
    //   227: iconst_1
    //   228: goto -> 243
    //   231: bipush #116
    //   233: goto -> 243
    //   236: bipush #58
    //   238: goto -> 243
    //   241: bipush #29
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
    int i = (paramInt1 ^ 0xFFFFD13F) & 0xFFFF;
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
      byte b1 = 108;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbr2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */