package burp;

import java.awt.Component;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zdo;
import net.portswigger.Zm2;
import org.jetbrains.annotations.TestOnly;

public class Zgvc extends Zgvk implements Zzv5 {
  private Zm82 Zv;
  
  Zlit ZE;
  
  private boolean Zu;
  
  private boolean Za;
  
  private boolean Zp;
  
  private short ZM;
  
  private boolean Zc;
  
  private boolean Zs;
  
  private boolean ZY;
  
  private boolean Zh;
  
  private boolean Zt;
  
  private boolean ZP;
  
  private String ZI;
  
  private String Z_;
  
  private boolean ZF;
  
  private boolean Zj;
  
  private boolean ZK;
  
  private List<String> ZU;
  
  private boolean ZD;
  
  private List<String> Ze;
  
  private boolean Zg;
  
  private List<String> Zx;
  
  private boolean Zq;
  
  private int ZS;
  
  private boolean ZA;
  
  private boolean Zd;
  
  private boolean Zm;
  
  private int Zy;
  
  private Zxer ZQ;
  
  private Component ZR;
  
  private Zbmp Zo;
  
  private Zbm1 Zb;
  
  private Zbms Zn;
  
  private Zmrj Zf;
  
  private byte ZB = 0;
  
  private int ZT;
  
  private long ZX;
  
  private int ZZ;
  
  private Zl04 Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  @TestOnly
  Zgvc() {}
  
  public Zgvc(Window paramWindow, Zz0n paramZz0n, Zt4u paramZt4u, Zm82 paramZm82, Zkr0 paramZkr0, Ztdi paramZtdi, Zlit paramZlit, Zskz paramZskz, Zxgc paramZxgc, Zgzy paramZgzy, Zz28 paramZz28, Zkl6 paramZkl6, Ztwv paramZtwv, Zgx0 paramZgx0) {
    Zm2.ZC(Zrrh.SUITE_TOOLS_CONTENT_DISCOVERY);
    this.Zv = paramZm82;
    ZJ();
    this.Zo = new Zbmp(this, paramZm82.ZF());
    this.Zo.setName(a(-11233, -20235));
    this.Zb = new Zbm1(this, paramZlit, paramZz28, paramZkl6.ZB());
    Zbmu zbmu = new Zbmu(paramZt4u, this);
    Zbm3 zbm3 = new Zbm3(paramZz0n, paramZt4u, this);
    this.Zn = new Zbms(this);
    Zsz7 zsz7 = new Zsz7(new Zrx6[] { this.Zb, zbmu, zbm3, this.Zn }, a(-11224, 20194));
    this.ZR = zsz7.Z_();
    Zsa zsa = new Zsa();
    this.Zf = new Zmr6(paramZkr0, paramZskz, paramZtdi, paramZxgc, paramZgzy, paramZkl6, paramZtwv, paramZgx0, zsa);
    zsa.Zbo();
    this.Zf.Zb();
    this.ZQ = new Zxer();
    this.ZQ.setName(a(-11263, 30187));
    this.ZQ.addTab(a(-11235, -15726), this.Zo);
    this.ZQ.addTab(zsz7.Zq(), this.ZR);
    this.ZQ.addTab(a(-11217, -30835), this.Zf.ZC());
    this.Zz = new Zl04();
    this.Zz.setName(a(-11205, 18407));
    ZD(paramZlit.toString());
    this.Zz.add((Component)this.ZQ);
    this.Zz.setDefaultCloseOperation(0);
    this.Zz.addWindowListener(new Zgjw(this));
    this.Zz.pack();
    Zmse.Zf(this.Zz, 140, 40);
    this.Zz.setSize(this.Zz.getPreferredSize());
    this.Zz.ZO(paramWindow);
    this.Zz.setVisible(true);
  }
  
  void ZJ() {
    this.ZU = new ArrayList<>();
    this.ZU.add(a(-11264, 18485));
    this.ZU.add(a(-11213, -1617));
    this.ZU.add(a(-11225, -12725));
    this.ZU.add(a(-11228, -14786));
    this.ZU.add(a(-11208, -20424));
    this.ZU.add(a(-11254, -1906));
    this.ZU.sort(Ze8r.ZP);
    this.Zx = new ArrayList<>();
    this.Zx.add(a(-11202, 12044));
    this.Zx.add(a(-11230, -2929));
    this.Zx.add("1");
    this.Zx.add(a(-11200, 29261));
    this.Zx.add(a(-11262, -30926));
    this.Zx.add(a(-11210, 8334));
    this.Zx.add(a(-11231, -3569));
    this.Zx.add(a(-11216, 11331));
    this.Zx.add(a(-11207, -1638));
    this.Zx.add(a(-11234, 27074));
    this.Zx.add(a(-11194, 13489));
    this.Zx.add(a(-11252, -15244));
    this.Zx.add(a(-11218, -21657));
    this.Zx.add(a(-11229, 10130));
    this.Zx.add(a(-11197, -23739));
    this.Zx.add(a(-11250, 4332));
    this.Zx.add(a(-11236, 10842));
    this.Zx.add(a(-11220, 20290));
    this.Zx.add(a(-11232, -4507));
    this.Zx.add(a(-11211, 22363));
    this.Zx.add("0");
    this.Zx.add(a(-11237, -16929));
    this.Zx.add(a(-11245, 31042));
    this.Zx.add(a(-11242, 6933));
    this.Zx.add(a(-11256, -25171));
    this.Zx.add(a(-11196, -13151));
    this.Zx.add(a(-11257, -29885));
    this.Zx.add(a(-11185, 18720));
    this.Zx.add(a(-11201, 18349));
    this.Zx.add(a(-11261, -27298));
    this.Zx.add(a(-11251, 5934));
    this.Zx.add(a(-11247, -953));
    this.Zx.add(a(-11241, -9640));
    this.Zx.add(a(-11226, 17800));
    this.Zx.add(a(-11212, 2785));
    this.Zx.add(a(-11240, -26712));
    this.Zx.sort(Ze8r.ZP);
    this.Ze = new ArrayList<>();
    this.Ze.add(a(-11253, -23707));
    this.Ze.add(a(-11203, -32633));
    this.Ze.add(a(-11260, -27081));
    this.Ze.add(a(-11219, 12248));
    this.Ze.add(a(-11244, -9757));
    this.Ze.add(a(-11206, 13620));
    this.Ze.add(a(-11239, -21580));
    this.Ze.add(a(-11204, 2585));
    this.Ze.add(a(-11258, 16796));
    this.Ze.add(a(-11215, -587));
    this.Ze.add(a(-11214, 13103));
    this.Ze.add(a(-11255, 19529));
    this.Ze.add(a(-11249, 1255));
    this.Ze.add(a(-11238, -27046));
    this.Ze.add(a(-11243, 24665));
    this.Ze.add(a(-11246, 11376));
    this.Ze.add(a(-11195, 9087));
    this.Ze.add(a(-11198, -10724));
    this.Ze.add(a(-11227, 17134));
    this.Ze.add(a(-11209, -24423));
    this.Ze.add(a(-11259, 25030));
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    this.Ze.add(a(-11199, 21844));
    this.Ze.add(a(-11222, 32733));
    this.Ze.add(a(-11193, 1485));
    this.Ze.add(a(-11221, -20164));
    this.Ze.sort(Ze8r.ZP);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  void ZD(String paramString) {
    this.Zz.setTitle(a(-11223, -31469) + a(-11223, -31469));
  }
  
  Zl04 ZB() {
    return this.Zz;
  }
  
  boolean Zq(boolean paramBoolean) {
    boolean bool = this.Zv.ZS(paramBoolean);
    if (!bool)
      this.ZQ.setSelectedComponent(this.ZR); 
    return bool;
  }
  
  private void Zu() {
    if (Zx6o.ZY(this.Zz, a(-11248, -17316))) {
      this.Zv.ZN();
      this.Zz.setVisible(false);
      this.Zz.dispose();
      this.Zf.Z_();
    } 
  }
  
  void ZO(boolean paramBoolean1, boolean paramBoolean2) {
    this.Zu = paramBoolean1;
    this.Za = paramBoolean2;
  }
  
  void Zx(boolean paramBoolean) {
    this.Zp = paramBoolean;
  }
  
  void Zc(short paramShort) {
    this.ZM = paramShort;
  }
  
  void ZO(boolean paramBoolean) {
    this.Zc = paramBoolean;
  }
  
  void Zo(boolean paramBoolean) {
    this.Zs = paramBoolean;
  }
  
  void Za(boolean paramBoolean) {
    this.ZY = paramBoolean;
  }
  
  void ZP(boolean paramBoolean) {
    this.Zh = paramBoolean;
  }
  
  void Z_(boolean paramBoolean) {
    this.Zt = paramBoolean;
  }
  
  void Zt(boolean paramBoolean) {
    this.ZP = paramBoolean;
  }
  
  void Zo(String paramString) {
    this.ZI = paramString;
  }
  
  void ZU(String paramString) {
    this.Z_ = paramString;
  }
  
  void Zv(boolean paramBoolean) {
    this.ZF = paramBoolean;
  }
  
  void Zi(boolean paramBoolean) {
    this.Zj = paramBoolean;
  }
  
  void Zd(boolean paramBoolean) {
    this.ZK = paramBoolean;
  }
  
  void Zl(boolean paramBoolean) {
    this.ZD = paramBoolean;
  }
  
  void Zy(boolean paramBoolean) {
    this.Zg = paramBoolean;
  }
  
  void ZV(boolean paramBoolean) {
    this.Zq = paramBoolean;
  }
  
  void ZB(int paramInt) {
    this.ZS = paramInt;
  }
  
  void ZS(byte paramByte) {
    this.Zv.Zr(paramByte);
  }
  
  void ZB(boolean paramBoolean) {
    this.ZA = paramBoolean;
  }
  
  void ZR(boolean paramBoolean) {
    this.Zd = paramBoolean;
  }
  
  void ZW(boolean paramBoolean) {
    this.Zm = paramBoolean;
  }
  
  void Zp(int paramInt) {
    this.Zy = paramInt;
  }
  
  public boolean ZP() {
    return (this.ZB == 1);
  }
  
  public void ZI(int paramInt) {
    this.Zo.Zt(paramInt);
  }
  
  public void Zr(int paramInt) {
    this.Zo.Zz(paramInt);
  }
  
  public boolean ZQ(Zlit paramZlit, short paramShort) {
    return (this.ZE == null) ? false : ((paramShort > 16) ? false : (!this.Zp ? ((paramZlit.equals(this.ZE) || Zmg3.ZU(paramZlit).equals(this.ZE))) : Zmg3.ZR(paramZlit, this.ZE)));
  }
  
  public boolean Zp(Zmzk paramZmzk) {
    return (this.ZE != null && Zewd.ZI(this.ZE.Zdz(), paramZmzk));
  }
  
  public int Zr() {
    return this.Zy;
  }
  
  public int ZF() {
    return 16;
  }
  
  public Zlit Zv() {
    this.ZE = this.Zb.ZL();
    return this.ZE;
  }
  
  public byte[] Zb() {
    return Zdo.ZQ;
  }
  
  public boolean ZL() {
    return this.Zu;
  }
  
  public boolean ZS() {
    return this.Za;
  }
  
  public boolean Zy() {
    return this.Zp;
  }
  
  public short ZH() {
    return this.ZM;
  }
  
  public boolean Z_() {
    return this.Zc;
  }
  
  public boolean ZZ() {
    return this.Zs;
  }
  
  public boolean Za() {
    return this.ZY;
  }
  
  public boolean ZN() {
    return this.Zh;
  }
  
  public boolean ZW() {
    return this.Zt;
  }
  
  public boolean ZV() {
    return this.ZP;
  }
  
  public String ZX() {
    return this.ZI;
  }
  
  public String Zj() {
    return this.Z_;
  }
  
  public boolean ZY() {
    return this.ZF;
  }
  
  public boolean Zm() {
    return this.Zj;
  }
  
  public boolean ZI() {
    return this.ZK;
  }
  
  public List<String> Zh() {
    return this.ZU;
  }
  
  public boolean Zz() {
    return this.ZD;
  }
  
  public List<String> Zd() {
    return this.Ze;
  }
  
  public boolean ZK() {
    return this.Zg;
  }
  
  public List<String> ZG() {
    return this.Zx;
  }
  
  public boolean Zt() {
    return this.Zq;
  }
  
  public int ZO() {
    return this.ZS;
  }
  
  public boolean ZU() {
    return this.ZA;
  }
  
  public boolean Zi() {
    return this.Zd;
  }
  
  public boolean ZA() {
    return this.Zm;
  }
  
  public byte Zq() {
    return this.Zn.Zf();
  }
  
  public void ZB(byte paramByte) {
    this.ZB = paramByte;
  }
  
  public void Zu(int paramInt) {
    this.ZT++;
    this.ZX += paramInt;
    this.Zo.ZK(this.ZT, this.ZX);
  }
  
  public void Zb(int paramInt) {
    this.Zo.ZG(paramInt);
  }
  
  public void Zg() {
    this.ZZ++;
    this.Zo.Ze(this.ZZ);
  }
  
  static {
    // Byte code:
    //   0: bipush #73
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'l\XÜv´¯·t@N#IfüB§CKH\\rHÝäD¸fc5X/à9WwOnøí²ãmZZ&7¶¾¹y µI\\r:5\\råË½ä©/å¥ä\\b\\b:=HMÈyêá=§c¸Øå-\\f4­r/âûQ{-å\\fëôÀ­(UËN¨¢â,Äl¶=Ìªª0ZìÓÎå5Sèm\ÀªFÑ!ðá=\\f£õÀÖÔÇ\\bÐwO²Éj¤¿¡÷Ú¨Qç#,ë¿Ì8öOi;)9 'ß\\f³¿êÛ!¿hÔ,Ö;Æb\\bâQ9²þ\¡9%£V­ß1þ-Ê©gÔ²¿íG§åÇÙ÷Ñ*tµ g *¤ÖWkØÆ¡î®å4ÕËø÷b3i!íÉÕ<Ú´I¥ChMÜ»P[3I9D(¦ÑÃÅ÷úe¦îpßµk"@ïÉÂþôÈÖ¼ºëXl£mZ±Ø[ÚÎÉ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #37
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'p!Ý~2'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #110
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zgvc.a : [Ljava/lang/String;
    //   130: bipush #73
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zgvc.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #60
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #70
    //   224: goto -> 244
    //   227: bipush #68
    //   229: goto -> 244
    //   232: bipush #11
    //   234: goto -> 244
    //   237: bipush #116
    //   239: goto -> 244
    //   242: bipush #115
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD407) & 0xFFFF;
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
      byte b1 = 116;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */