package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.tree.TreePath;

public class Zb37 implements Zzyl {
  private final Zkqf Za;
  
  private final Zg_q ZC;
  
  private final Zzi Zk;
  
  private final Zbiv ZR;
  
  private final boolean Zz;
  
  private final Zor Zl;
  
  private final Zets Zi;
  
  private boolean ZS;
  
  private Ze3h Zn;
  
  private Zz_1 Zp;
  
  private Zxya ZM;
  
  private boolean Zf;
  
  private boolean ZH;
  
  private Zkj9 ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb37(Zg_q paramZg_q, Zzi paramZzi, Zz28 paramZz28, Zbiv paramZbiv, boolean paramBoolean, Zerg paramZerg, Zgso paramZgso) {
    this.ZC = paramZg_q;
    this.Zk = paramZzi;
    this.ZR = paramZbiv;
    this.Zz = paramBoolean;
    this.Zl = paramZg_q.ZD();
    this.Zi = paramZg_q.ZR();
    this.Za = new Zkqf(paramZerg, paramZgso, paramZz28, this);
  }
  
  void ZO(Ze3h paramZe3h, MouseEvent paramMouseEvent) {
    Component component = paramMouseEvent.getComponent();
    Point point = paramMouseEvent.getPoint();
    if (paramZe3h.ZF()) {
      Zf(component, point);
      return;
    } 
    this.Zn = paramZe3h;
    this.ZS = true;
    this.ZH = (paramZe3h.Zw() > 1);
    this.Zp = paramZe3h.ZJ();
    this.ZM = (Zxya)this.Zp.Z_();
    this.Zf = !this.Zp.isLeaf();
    boolean bool = (this.ZM.Zt() || this.ZM.ZF()) ? true : false;
    this.ZO = ZW();
    this.Za.Zr(this.ZO, this.ZM.Zq(), this.ZH);
    this.Za.Zr(this.ZO);
    ZF();
    this.Za.ZW(this.ZO, this.ZH, bool, this.ZM.ZV);
    this.Za.ZM(this.ZO, paramMouseEvent, Zrpb.CONTEXT_TARGET_SITE_MAP_TREE, (Zmgv[])paramZe3h.Zi());
    this.Za.Zr(this.ZO);
    ZU();
    this.Za.Zr(this.ZO);
    Z_();
    Zm();
    this.Za.ZY(this.ZO, this.ZH, this.Zp);
    this.Za.Zc(this.ZO, this.ZH, this.Zp);
    this.Za.ZF(this.ZO, this.ZH, this.Zf);
    this.Za.Zr(this.ZO);
    if (this.Zz) {
      Zg();
      Ze();
      this.Za.Zr(this.ZO);
    } 
    Zm(component);
    this.ZO.show(component, point.x, point.y);
  }
  
  void ZZ(Ze3h paramZe3h, InputEvent paramInputEvent, Point paramPoint, Component paramComponent) {
    if (paramZe3h == null || paramZe3h.ZF()) {
      Zf(paramComponent, paramPoint);
      return;
    } 
    this.Zn = paramZe3h;
    this.ZS = false;
    this.ZH = (paramZe3h.Zw() > 1);
    this.Zp = paramZe3h.ZJ();
    this.ZM = (Zxya)this.Zp.Z_();
    this.Zf = !this.Zp.isLeaf();
    boolean bool = (this.ZM.Zt() || this.ZM.ZF()) ? true : false;
    this.ZO = ZW();
    this.Za.Zr(this.ZO, this.ZM.Zq(), this.ZH);
    this.Za.Zr(this.ZO);
    ZJ();
    this.Za.ZW(this.ZO, this.ZH, bool, this.ZM.ZV);
    this.Za.ZM(this.ZO, paramInputEvent, Zrpb.CONTEXT_TARGET_SITE_MAP_TABLE, (Zmgv[])paramZe3h.Zi());
    Zi();
    this.Za.Zr(this.ZO);
    Z_();
    Zz5n.ZL(this.ZM.Zy(), this.ZO, this);
    this.Za.ZY(this.ZO, this.ZH, this.Zp);
    this.Za.Zc(this.ZO, this.ZH, this.Zp);
    this.Za.ZF(this.ZO, this.ZH, this.Zf);
    this.Za.Zr(this.ZO);
    if (this.Zz) {
      Ze();
      this.Za.Zr(this.ZO);
    } 
    Zm(paramComponent);
    this.ZO.show(paramComponent, paramPoint.x, paramPoint.y);
  }
  
  private void Zf(Component paramComponent, Point paramPoint) {
    this.ZO = new Zkj9();
    if (this.Zz) {
      Ze();
      this.Za.Zr(this.ZO);
    } 
    Zm(paramComponent);
    this.ZO.show(paramComponent, paramPoint.x, paramPoint.y);
  }
  
  private Zkj9 ZW() {
    String str1 = Zz_1.ZG();
    if (this.ZH)
      return Zsn5.ZA(this.Zn.Zw()); 
    if (this.ZM.ZF()) {
      String str = this.ZM.Zr + this.ZM.Zr + a(-9852, 4167);
      if (str1 == null) {
        str = this.ZM.Zq().toString();
        return Zsn5.Zy(str, this.Zi.Zz(this.Zp, false));
      } 
      return Zsn5.Zy(str, this.Zi.Zz(this.Zp, false));
    } 
    String str2 = this.ZM.Zq().toString();
    return Zsn5.Zy(str2, this.Zi.Zz(this.Zp, false));
  }
  
  private void ZF() {
    String str1 = null;
    String str2 = null;
    if (this.ZH) {
      str1 = a(-9854, 24035);
      str2 = a(-9850, -1851);
    } else if (this.ZM.ZX()) {
      str1 = a(-9833, 27933);
      str2 = a(-9853, 1110);
    } else if (this.Zf) {
      str1 = a(-9849, 26482);
      str2 = a(-9856, -30120);
    } 
    this.ZR.ZQ(this.ZO, str1, str2, this::lambda$addTreeScanMenuItems$0, this);
  }
  
  private void ZJ() {
    this.ZR.ZA(this.ZO, this::lambda$addTableScanMenuItems$1, this);
  }
  
  private void Zg() {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual ZE : ()Z
    //   8: ifne -> 12
    //   11: return
    //   12: ldc ''
    //   14: astore_2
    //   15: aload_0
    //   16: getfield ZH : Z
    //   19: ifeq -> 36
    //   22: sipush #-9851
    //   25: sipush #-10353
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: astore_2
    //   32: aload_1
    //   33: ifnonnull -> 77
    //   36: aload_0
    //   37: getfield ZM : Lburp/Zxya;
    //   40: invokevirtual ZX : ()Z
    //   43: ifeq -> 60
    //   46: sipush #-9848
    //   49: sipush #-10183
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: astore_2
    //   56: aload_1
    //   57: ifnonnull -> 77
    //   60: aload_0
    //   61: getfield Zf : Z
    //   64: ifeq -> 77
    //   67: sipush #-9835
    //   70: sipush #-31809
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: astore_2
    //   77: new burp/Zztv
    //   80: dup
    //   81: sipush #-9843
    //   84: sipush #-31247
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: astore_3
    //   94: aload_3
    //   95: aload_0
    //   96: ldc 530688
    //   98: aload_2
    //   99: sipush #-9840
    //   102: sipush #32595
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: swap
    //   109: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   114: iconst_1
    //   115: invokestatic ZP : (Lburp/Zzyl;ILjava/lang/String;Z)Lburp/Zepk;
    //   118: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   121: pop
    //   122: aload_3
    //   123: aload_0
    //   124: ldc 530944
    //   126: aload_2
    //   127: sipush #-9841
    //   130: sipush #31240
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: swap
    //   137: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   142: iconst_1
    //   143: invokestatic ZP : (Lburp/Zzyl;ILjava/lang/String;Z)Lburp/Zepk;
    //   146: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   149: pop
    //   150: aload_0
    //   151: getfield ZO : Lburp/Zkj9;
    //   154: aload_3
    //   155: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   158: pop
    //   159: aload_0
    //   160: getfield Za : Lburp/Zkqf;
    //   163: aload_0
    //   164: getfield ZO : Lburp/Zkj9;
    //   167: invokevirtual Zr : (Lburp/Zkj9;)V
    //   170: return
  }
  
  private boolean ZE() {
    String str = Zz_1.ZG();
    for (Zz_1 zz_1 : this.Zn.Zd().ZL()) {
      List<Zrdb> list = ((Zxya)zz_1.Z_()).ZK();
      if (list != null && !list.isEmpty())
        return true; 
      if (str == null)
        break; 
    } 
    return false;
  }
  
  private void Ze() {
    Zztv zztv = new Zztv(a(-9844, 30906));
    ButtonGroup buttonGroup = new ButtonGroup();
    Ze77 ze771 = Ztsr.ZS(this, 530432, null);
    buttonGroup.add(ze771);
    zztv.add(ze771);
    Ze77 ze772 = Ztsr.ZS(this, 530176, null);
    buttonGroup.add(ze772);
    zztv.add(ze772);
    Zzpl zzpl = this.Zk.Zaf();
    buttonGroup.setSelected(ze771.getModel(), (zzpl == Zzpl.SIDE_BY_SIDE));
    buttonGroup.setSelected(ze772.getModel(), (zzpl == Zzpl.TABBED));
    this.ZO.add(zztv);
    this.ZO.add(Ztsr.ZW(this, 527168));
  }
  
  private void ZU() {
    Zztv zztv = new Zztv(a(-9837, -18839));
    zztv.setName(a(-9834, -14017));
    this.ZO.add(zztv);
    zztv.add(Ztsr.ZY(this, 525824, true));
    zztv.add(Ztsr.ZY(this, 526080, true));
    zztv.add(Ztsr.ZY(this, 526336, true));
    if (!this.ZH)
      zztv.add(Ztsr.ZY(this, 133376, true)); 
    zztv.add(Ztsr.ZY(this, 526592, true));
    if (!this.ZH) {
      Zepk zepk = Ztsr.ZY(this, 133632, true);
      zepk.setName(a(-9838, -8760));
      zztv.add(zepk);
      zztv.add(Ztsr.ZY(this, 133888, true));
      zztv.add(Ztsr.ZY(this, 527104, true));
    } 
  }
  
  private void Zi() {
    if (!this.ZH) {
      this.Za.Zr(this.ZO);
      Zztv zztv = new Zztv(a(-9847, -31445));
      this.ZO.add(zztv);
      zztv.add(Ztsr.ZY(this, 133376, true));
      zztv.add(Ztsr.ZY(this, 133632, true));
      zztv.add(Ztsr.ZY(this, 133888, true));
      zztv.add(Ztsr.ZY(this, 134144, true));
      zztv.add(Ztsr.ZY(this, 527104, true));
    } 
  }
  
  private void Z_() {
    this.ZO.add(Ztsr.ZW(this, 526848));
  }
  
  private void Zm() {
    String str = Zz_1.ZG();
    if (this.ZH) {
      Zepk zepk1 = Ztsr.ZW(this, 525312);
      zepk1.setName(a(-9836, -31367));
      this.ZO.add(zepk1);
      Zepk zepk2 = Ztsr.ZW(this, 525376);
      zepk2.setName(a(-9846, -1204));
      this.ZO.add(zepk2);
      if (str == null) {
        if (this.Zf) {
          zepk1 = Ztsr.ZW(this, 525312);
          zepk1.setName(a(-9842, -13439));
          this.ZO.add(zepk1);
          this.ZO.add(Ztsr.ZW(this, 525568));
        } 
        Zkmc zkmc1 = (Zkmc)this.Zl.getModel();
        if (!this.Zl.isCollapsed(new TreePath((Object[])zkmc1.Zb(this.ZM)))) {
          zepk2 = Ztsr.ZW(this, 525376);
          zepk2.setName(a(-9845, 25502));
          this.ZO.add(zepk2);
        } 
        return;
      } 
      return;
    } 
    if (this.Zf) {
      Zepk zepk = Ztsr.ZW(this, 525312);
      zepk.setName(a(-9842, -13439));
      this.ZO.add(zepk);
      this.ZO.add(Ztsr.ZW(this, 525568));
    } 
    Zkmc zkmc = (Zkmc)this.Zl.getModel();
    if (!this.Zl.isCollapsed(new TreePath((Object[])zkmc.Zb(this.ZM)))) {
      Zepk zepk = Ztsr.ZW(this, 525376);
      zepk.setName(a(-9845, 25502));
      this.ZO.add(zepk);
    } 
  }
  
  private void Zm(Component paramComponent) {
    this.ZO.add(new Zepa(a(-9855, 13924), Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP, Zt2m.ZF(paramComponent)));
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZC.ZJ(paramInt, this.Zn, this.ZS);
  }
  
  private void lambda$addTableScanMenuItems$1(Ztj1 paramZtj1) {
    (new Zb_0(paramZtj1, false)).Zc(this.Zn);
  }
  
  private void lambda$addTreeScanMenuItems$0(Ztj1 paramZtj1) {
    (new Zb_0(paramZtj1, true)).Zc(this.Zn);
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'iMB-ÑÉÜ5tçL£ÉZ:ÐPBÎxmU²¶\\rÓÅ'x¿Ó\ÁÏçJ;V07¾Ø¦ýNyéñ?NHg¼Õ­\\r·Òl=^|Ñ¶fÛJ#Ï *ÀÄ¢¾G7Á!j_|Ø¢LÛsõ9ý%ß_[r÷!z½#QDß5\\r#¤¬Ûâ`Ec,õéX¥ô÷¡1WðÁìd´°é)þê6*æG´A\\bQ|ë@]ÂÕâëØ¾¹2ÏQ0Î\_ô°S\\fÎ±;©íí×X\\rz^3*uéë·¯~ ·´f!3Ó}¹\\rÒÓ³ËéH,æf ÂÑ¹kÉ:tÿ¢z¨³!SÃÞx¸Æ¬G~±\ÕW´øäÞÀòOQN¯ £M½ÃÎnN¶ý)GÅö_pV©´«@+ËÇ^´¶Ê³JpPÖXK¢ÎÉLÁõ!åøÝ9¨cÊß©âf¡t\\nÿBÖ¤@£À¾»´¾-NYf­³îuR*¯áÅÞ'*<zíªÚbûtY§¶·Ô$v»Álû/CÍÖÏ/eIo*<ÚvñÛ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #31
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #8
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
    //   68: ldc 'åÎÛf6èeCüKKh\\rèÞ $ÇÙíÉÇ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #20
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
    //   129: putstatic burp/Zb37.a : [Ljava/lang/String;
    //   132: bipush #23
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb37.b : [Ljava/lang/String;
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
    //   212: bipush #24
    //   214: goto -> 244
    //   217: bipush #77
    //   219: goto -> 244
    //   222: bipush #120
    //   224: goto -> 244
    //   227: bipush #66
    //   229: goto -> 244
    //   232: bipush #19
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #89
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
    int i = (paramInt1 ^ 0xFFFFD986) & 0xFFFF;
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
      char c = 'Û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb37.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */