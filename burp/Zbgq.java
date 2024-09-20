package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbgq extends Zbg2 {
  private final Zt4u Zv;
  
  private final Zbn2 Zd;
  
  private final Ztov Zb;
  
  private final Zrn7 ZO;
  
  private final Zbvq ZW;
  
  private final Zbvq Zr;
  
  private Zeu1 ZI;
  
  private Zl8w ZT;
  
  private Zbkc Zi;
  
  private Zbkc Z_;
  
  private Zbkc ZG;
  
  private Zm99 Zx;
  
  private Zm99 ZX;
  
  private Ze01 Zl;
  
  private Zedd<String> Zg;
  
  private Zl8w ZK;
  
  private Zm99 Zz;
  
  private Zm9v ZM;
  
  private Zbqc Zw;
  
  private Zbqc Zf;
  
  public Zg85 ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbgq(Zt4u paramZt4u, Zbn2 paramZbn2, Ztov paramZtov, Zrn7 paramZrn7, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv) {
    this.Zv = paramZt4u;
    this.Zd = paramZbn2;
    this.Zb = paramZtov;
    this.ZO = paramZrn7;
    Zk();
    this.Zg.addItem(a(28933, 12919));
    this.Zg.addItem(a(28958, 18437));
    int i = Zbm2.Zc();
    this.Zg.addItem(a(28947, 5059));
    this.ZM.setVisible(false);
    this.ZW = new Zbvq(paramZt4u, null, 0, null, true, paramZgb6, paramZb0h, paramZtwv);
    this.Zf.add(this.ZW, a(28951, 25608));
    this.Zr = new Zbvq(paramZt4u, null, 0, null, true, paramZgb6, paramZb0h, paramZtwv);
    this.Zw.add(this.Zr, a(28952, 10817));
    this.ZB = new String[] { a(28938, 13842), a(28959, -20485) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
    this.ZK.ZH(Zlkk.BURP_ERROR);
    this.ZK.ZI(Zt00.BOLD_ITALIC_FONT);
    ZB();
    if (Zbqc.Zwu() == null)
      Zbm2.Zu(++i); 
  }
  
  private boolean ZB() {
    // Byte code:
    //   0: invokestatic Zc : ()I
    //   3: istore_1
    //   4: iconst_0
    //   5: istore_2
    //   6: aload_0
    //   7: getfield Zg : Lburp/Zedd;
    //   10: invokevirtual getSelectedIndex : ()I
    //   13: lookupswitch default -> 127, 1 -> 40, 2 -> 74
    //   40: aload_0
    //   41: getfield ZO : Lburp/Zrn7;
    //   44: invokeinterface ZM : ()Z
    //   49: ifne -> 127
    //   52: iconst_1
    //   53: istore_2
    //   54: aload_0
    //   55: getfield ZK : Lburp/Zl8w;
    //   58: sipush #28934
    //   61: sipush #23820
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: invokevirtual setText : (Ljava/lang/String;)V
    //   70: iload_1
    //   71: ifeq -> 127
    //   74: aload_0
    //   75: getfield ZO : Lburp/Zrn7;
    //   78: invokeinterface Zy : ()Z
    //   83: ifne -> 127
    //   86: aconst_null
    //   87: new javax/script/ScriptEngineManager
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: sipush #28945
    //   97: sipush #21271
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual getEngineByName : (Ljava/lang/String;)Ljavax/script/ScriptEngine;
    //   106: if_acmpne -> 127
    //   109: iconst_1
    //   110: istore_2
    //   111: aload_0
    //   112: getfield ZK : Lburp/Zl8w;
    //   115: sipush #28950
    //   118: sipush #9421
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual setText : (Ljava/lang/String;)V
    //   127: aload_0
    //   128: getfield ZK : Lburp/Zl8w;
    //   131: iload_2
    //   132: invokevirtual setVisible : (Z)V
    //   135: iload_2
    //   136: ireturn
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return Zx6o.ZY(this.Zd.ZN(), a(28939, 19652)) ? null : this;
      case 1:
        this.ZI = Zd();
        if (this.ZI == null || ZB())
          return this; 
        this.ZI.Zs = this.Zd.ZN();
        this.Zb.Zc(this.ZI);
        return this.Zd.Ze(this);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  Zeu1 ZK() {
    return this.ZI;
  }
  
  private Zeu1 Zd() {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore_1
    //   4: new java/io/File
    //   7: dup
    //   8: aload_0
    //   9: getfield ZN : Lburp/Zg85;
    //   12: invokevirtual getText : ()Ljava/lang/String;
    //   15: invokespecial <init> : (Ljava/lang/String;)V
    //   18: astore_2
    //   19: aload_2
    //   20: invokevirtual exists : ()Z
    //   23: ifeq -> 40
    //   26: aload_2
    //   27: invokevirtual canRead : ()Z
    //   30: ifne -> 52
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: new java/lang/Exception
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: athrow
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: aload_0
    //   53: getfield ZM : Lburp/Zm9v;
    //   56: iconst_0
    //   57: invokevirtual setVisible : (Z)V
    //   60: goto -> 81
    //   63: astore_3
    //   64: aload_3
    //   65: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: aload_0
    //   72: getfield ZM : Lburp/Zm9v;
    //   75: iconst_1
    //   76: invokevirtual setVisible : (Z)V
    //   79: aconst_null
    //   80: areturn
    //   81: aload_0
    //   82: getfield Zg : Lburp/Zedd;
    //   85: invokevirtual getSelectedIndex : ()I
    //   88: tableswitch default -> 140, 0 -> 116, 1 -> 124, 2 -> 132
    //   116: getstatic burp/Ztqs.JAVA_LOCAL_JAR : Lburp/Ztqs;
    //   119: astore_3
    //   120: iload_1
    //   121: ifne -> 161
    //   124: getstatic burp/Ztqs.PYTHON_LOCAL : Lburp/Ztqs;
    //   127: astore_3
    //   128: iload_1
    //   129: ifne -> 161
    //   132: getstatic burp/Ztqs.RUBY_LOCAL : Lburp/Ztqs;
    //   135: astore_3
    //   136: iload_1
    //   137: ifne -> 161
    //   140: iconst_0
    //   141: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   144: aload_0
    //   145: getfield Zg : Lburp/Zedd;
    //   148: invokevirtual getSelectedIndex : ()I
    //   151: i2l
    //   152: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   155: aconst_null
    //   156: areturn
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: new burp/Zeu1
    //   164: dup
    //   165: aload_3
    //   166: aload_2
    //   167: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   170: invokespecial <init> : (Lburp/Ztqs;Ljava/lang/String;)V
    //   173: astore #4
    //   175: aload #4
    //   177: invokevirtual ZU : ()Lburp/Zkvz;
    //   180: aload_0
    //   181: getfield ZW : Lburp/Zbvq;
    //   184: invokevirtual ZD : ()B
    //   187: aload_0
    //   188: getfield ZW : Lburp/Zbvq;
    //   191: invokevirtual ZK : ()Ljava/io/File;
    //   194: invokevirtual ZI : (BLjava/lang/Object;)V
    //   197: aload #4
    //   199: invokevirtual ZJ : ()Lburp/Zkvz;
    //   202: aload_0
    //   203: getfield Zr : Lburp/Zbvq;
    //   206: invokevirtual ZD : ()B
    //   209: aload_0
    //   210: getfield Zr : Lburp/Zbvq;
    //   213: invokevirtual ZK : ()Ljava/io/File;
    //   216: invokevirtual ZI : (BLjava/lang/Object;)V
    //   219: goto -> 250
    //   222: astore #5
    //   224: aload #5
    //   226: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   229: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   232: aload #4
    //   234: invokevirtual ZU : ()Lburp/Zkvz;
    //   237: invokevirtual close : ()V
    //   240: aload #4
    //   242: invokevirtual ZJ : ()Lburp/Zkvz;
    //   245: invokevirtual close : ()V
    //   248: aconst_null
    //   249: areturn
    //   250: aload #4
    //   252: areturn
    // Exception table:
    //   from	to	target	type
    //   4	60	63	java/lang/Exception
    //   19	33	36	java/lang/Exception
    //   26	48	48	java/lang/Exception
    //   136	157	157	java/lang/Exception
    //   175	219	222	java/lang/Exception
  }
  
  private void Zk() {
    this.ZN = new Zg85();
    this.Zl = new Ze01();
    this.ZM = new Zm9v();
    this.ZT = new Zl8w();
    this.ZX = new Zm99();
    this.Zz = new Zm99();
    this.Zg = new Zedd<>();
    this.Zf = new Zbqc();
    this.Zw = new Zbqc();
    this.Zi = new Zbkc();
    this.Z_ = new Zbkc();
    this.ZG = new Zbkc();
    this.ZK = new Zl8w();
    this.Zx = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZN.setColumns(20);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 2048;
    add(this.ZN, gridBagConstraints);
    this.Zl.setText(a(28954, 12438));
    this.Zl.setName(a(28957, 20298));
    this.Zl.addActionListener(new Zxzl(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    add(this.Zl, gridBagConstraints);
    this.ZM.setText(a(28953, -18855));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    add(this.ZM, gridBagConstraints);
    this.ZT.setText(a(28949, 25561));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZT, gridBagConstraints);
    this.ZX.setText(a(28941, 6397));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 2048;
    add(this.ZX, gridBagConstraints);
    this.Zz.setText(a(28937, -7785));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    add(this.Zz, gridBagConstraints);
    this.Zg.setName(a(28942, 17088));
    this.Zg.addActionListener(new Zlvi(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 2048;
    add(this.Zg, gridBagConstraints);
    this.Zf.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zf, gridBagConstraints);
    this.Zw.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zw, gridBagConstraints);
    this.Zi.Zx(a(28936, 3101));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 2048;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.Zi, gridBagConstraints);
    this.Z_.Zx(a(28943, -1044));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 25;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.Z_, gridBagConstraints);
    this.ZG.Zx(a(28944, 27478));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 25;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.ZG, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zx, gridBagConstraints);
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore_2
    //   4: getstatic burp/Zg1m.EXTENSIONS : Lburp/Zg1m;
    //   7: aload_0
    //   8: getfield Zv : Lburp/Zt4u;
    //   11: aload_0
    //   12: iconst_0
    //   13: invokestatic ZP : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;I)Ljava/io/File;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull -> 139
    //   21: aload_0
    //   22: getfield ZN : Lburp/Zg85;
    //   25: aload_3
    //   26: invokevirtual getPath : ()Ljava/lang/String;
    //   29: invokevirtual setText : (Ljava/lang/String;)V
    //   32: aload_0
    //   33: getfield ZM : Lburp/Zm9v;
    //   36: iconst_0
    //   37: invokevirtual setVisible : (Z)V
    //   40: aload_3
    //   41: invokevirtual getName : ()Ljava/lang/String;
    //   44: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   47: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   50: astore #4
    //   52: aload #4
    //   54: sipush #28955
    //   57: sipush #-32526
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   66: ifeq -> 81
    //   69: aload_0
    //   70: getfield Zg : Lburp/Zedd;
    //   73: iconst_0
    //   74: invokevirtual setSelectedIndex : (I)V
    //   77: iload_2
    //   78: ifne -> 134
    //   81: aload #4
    //   83: sipush #28932
    //   86: sipush #8180
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   95: ifeq -> 110
    //   98: aload_0
    //   99: getfield Zg : Lburp/Zedd;
    //   102: iconst_1
    //   103: invokevirtual setSelectedIndex : (I)V
    //   106: iload_2
    //   107: ifne -> 134
    //   110: aload #4
    //   112: sipush #28946
    //   115: bipush #26
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   123: ifeq -> 134
    //   126: aload_0
    //   127: getfield Zg : Lburp/Zedd;
    //   130: iconst_2
    //   131: invokevirtual setSelectedIndex : (I)V
    //   134: aload_0
    //   135: aconst_null
    //   136: invokevirtual Zs : (Ljava/awt/event/ActionEvent;)V
    //   139: return
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zg : Lburp/Zedd;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: tableswitch default -> 92, 0 -> 36, 1 -> 56, 2 -> 76
    //   36: aload_0
    //   37: getfield Zz : Lburp/Zm99;
    //   40: sipush #28956
    //   43: sipush #-1676
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual setText : (Ljava/lang/String;)V
    //   52: iload_2
    //   53: ifne -> 92
    //   56: aload_0
    //   57: getfield Zz : Lburp/Zm99;
    //   60: sipush #28940
    //   63: sipush #-4450
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokevirtual setText : (Ljava/lang/String;)V
    //   72: iload_2
    //   73: ifne -> 92
    //   76: aload_0
    //   77: getfield Zz : Lburp/Zm99;
    //   80: sipush #28948
    //   83: sipush #-21750
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokevirtual setText : (Ljava/lang/String;)V
    //   92: aload_0
    //   93: invokevirtual ZB : ()Z
    //   96: pop
    //   97: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Â{ ¯ðHQãÔåj!¦±Ú²aVDZöM²[åO×é0&²çõw&(Zì>ÿ0n%Óº£ÐXúü=TÞvGõ×nÌeA¶5iÄæ5°1»PO[v"/%ÈÙCPIjµ¡\\tÄ¼scÀfÇ`&^ú2ÚÛm'¹èí^7´#ÛtÙÓíiK¾s8^y\åãT'©T>[<lÖ~ù>»`úPO¶mÞj´Ç70ûoã|ätÚÅÊ¢poP_À\\f³zqÀè7²§¤÷Ü¤×Ã×ãö³:ú)*M\\nóì³RP'°¯|!P0µÇ¤_Z û|"®uò]\\tC¿¡ Ý³b¹ükdÜ\°±Û.xrÀCé0IþÄÍÿ\\tUgB­ÃóQi\\bõ.áòxÌÏj%YvX&q8)¸ Øv-§eY#¦ým#Ì1ÜÖ°ëU-ÓY¶ü.\\td$FüÆO:¯êæÄôu¡,Â]%ºÝ?r¤Õä+g,³îÖÍÛ®â%ÁO·ÿp+5,ÞEËÃ;7$ã]' Â¡3F%ÛX¹îéÆs¦m4 "ª$3µh- ÝÀ«s-¶æÃ53;VûI¿9UÐüYâÅ*HEõê\\f)»îgGw{:ßúÁ0(YFU\\t #æÎÔºOÐñu µ°lI¤F¬&æ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #117
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'Þ¹yÿ{NÝÒ/5ò_Ì|µN £âRU¡_Ü¿(°Ó^ÉR8Êî¸ú\÷¦\ÙÑÓ±Ãs&9òdü3ªË÷u5$¯IÄE]ÎÄ/SþXÃcî©X§SÓ§V9Ê\q¸·ÕRjtúhN[òM7'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #69
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbgq.a : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbgq.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #10
    //   214: goto -> 244
    //   217: bipush #11
    //   219: goto -> 244
    //   222: bipush #123
    //   224: goto -> 244
    //   227: bipush #104
    //   229: goto -> 244
    //   232: bipush #48
    //   234: goto -> 244
    //   237: bipush #7
    //   239: goto -> 244
    //   242: bipush #101
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x711C) & 0xFFFF;
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
      char c = '­';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */