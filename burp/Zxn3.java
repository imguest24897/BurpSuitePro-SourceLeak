package burp;

import java.awt.Component;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxn3 implements Zzyl {
  private final Zz0n Zz;
  
  private final Zt4u ZK;
  
  private final Zr_4 Zr;
  
  private final Supplier<Ztpl> Zd;
  
  private final Component ZM;
  
  private final Zrek ZQ;
  
  private final Zbnt ZV;
  
  private final Ztwv Zo;
  
  private final Zerg ZX;
  
  private final Supplier<Zskh> ZJ;
  
  private final Ze47 Zg;
  
  private final Zey9 Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zxn3(Zz0n paramZz0n, Zt4u paramZt4u, Zr_4 paramZr_4, Supplier<Ztpl> paramSupplier, Component paramComponent, Zrek paramZrek, Zbnt paramZbnt, Ztwv paramZtwv, Zerg paramZerg, Supplier<Zskh> paramSupplier1, Ze47 paramZe47, Zey9 paramZey9) {
    this.Zz = paramZz0n;
    this.ZK = paramZt4u;
    this.Zr = paramZr_4;
    this.Zd = paramSupplier;
    this.ZM = paramComponent;
    this.ZQ = paramZrek;
    this.ZV = paramZbnt;
    this.Zo = paramZtwv;
    this.ZX = paramZerg;
    this.ZJ = paramSupplier1;
    this.Zg = paramZe47;
    this.Zq = paramZey9;
    Zuh.Zv((paramSupplier != null), Zqf.Zv, 3L);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    int[] arrayOfInt = Zzg5.Zr();
    switch (paramInt) {
      case 134832:
        ZC();
        if (arrayOfInt != null);
        return true;
      case 394160:
        Zx();
        if (arrayOfInt != null);
        return true;
      case 134864:
        ZG();
        if (arrayOfInt != null);
        return true;
      case 263184:
        ZF().Zz();
        if (arrayOfInt != null);
        return true;
      case 263192:
        ZF().ZW();
        if (arrayOfInt != null)
          break; 
        return true;
    } 
    return false;
  }
  
  private void ZC() {
    Zm2.ZC(Zrrh.REPEATER_UI_SAVE_HISTORY);
    Zg89 zg89 = new Zg89();
    File file = Zs6n.ZA(Zg1m.DATA, this.ZK, Zt2m.ZF(this.ZM), 1, a(11590, -20717), zg89);
    if (file == null)
      return; 
    Ztpl ztpl = ZF();
    String str = ztpl.Zf().ZAs();
    Zll9[] arrayOfZll9 = (Zll9[])Arrays.<Zvo1>stream(ztpl.ZP().ZP()).map(str::lambda$saveHistory$0).toArray(Zxn3::lambda$saveHistory$1);
    this.Zo.Zx(new Zzq9(arrayOfZll9, Zt2m.ZF(this.ZM), this.ZJ.get(), file, zg89.Zi(), this.ZV, this.Zz.ZM()));
  }
  
  private Ztpl ZF() {
    return this.Zd.get();
  }
  
  private void Zx() {
    Zm2.ZC(Zrrh.REPEATER_UI_PASTE_URL_AS_REQUEST);
    try {
      Zlit zlit = (new Ztr7(this.ZV)).ZN(this.Zz.ZD().Zp());
      Zrtw zrtw = ZF().Zr().Zh();
      try {
      
      } catch (MalformedURLException malformedURLException) {
        throw a(null);
      } 
      String str = zrtw.Zuq() ? a(11589, -21670) : a(11585, 2828);
      Zstu zstu = this.ZK.Ze().Zs().ZO().Zf(zlit).Zw(str).Zr();
      if (zstu != null) {
        Zmzk zmzk = zlit.Zdz();
        Zkyt zkyt = this.Zg.Zw(zmzk);
        Zefx zefx = this.Zq.Zu(zmzk, zstu);
        Zl0o zl0o = new Zl0o(Zgsq.ZW(zkyt));
        zefx.Zi(zl0o);
        Zbr zbr = Zbr.ZF(zl0o.ZJ(), zkyt);
        ZF().ZY(zmzk);
        ZF().Za(zbr);
      } 
    } catch (MalformedURLException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZG() {
    // Byte code:
    //   0: getstatic burp/Zrrh.REPEATER_UI_ADD_TO_SITE_MAP : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: invokestatic Zr : ()[I
    //   9: aload_0
    //   10: invokevirtual ZF : ()Lburp/Ztpl;
    //   13: astore_2
    //   14: astore_1
    //   15: aload_0
    //   16: getfield ZM : Ljava/awt/Component;
    //   19: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   22: sipush #11591
    //   25: sipush #-4289
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   34: ifne -> 38
    //   37: return
    //   38: aload_2
    //   39: invokevirtual ZP : ()Lburp/Zz3m;
    //   42: invokeinterface Zs : ()Lburp/Zvo1;
    //   47: astore #7
    //   49: aload #7
    //   51: ifnonnull -> 69
    //   54: aload_2
    //   55: invokevirtual Zq : ()Lburp/Zefx;
    //   58: astore_3
    //   59: aconst_null
    //   60: astore #4
    //   62: lconst_0
    //   63: lstore #5
    //   65: aload_1
    //   66: ifnull -> 136
    //   69: aload #7
    //   71: invokeinterface Zo3 : ()Lburp/Zbr;
    //   76: astore #8
    //   78: aload #7
    //   80: invokeinterface Zod : ()Lburp/Zmzk;
    //   85: astore #9
    //   87: aload #7
    //   89: invokeinterface ZoO : ()Lburp/Zstu;
    //   94: astore #4
    //   96: aload #7
    //   98: invokeinterface ZoB : ()J
    //   103: lstore #5
    //   105: aload #8
    //   107: ifnull -> 123
    //   110: aload #8
    //   112: invokevirtual Zd : ()Z
    //   115: ifne -> 123
    //   118: aload #9
    //   120: ifnonnull -> 124
    //   123: return
    //   124: aload #8
    //   126: aload #9
    //   128: aload_0
    //   129: getfield Zq : Lburp/Zey9;
    //   132: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   135: astore_3
    //   136: aload_0
    //   137: getfield Zo : Lburp/Ztwv;
    //   140: aload_0
    //   141: aload_3
    //   142: aload #4
    //   144: lload #5
    //   146: <illegal opcode> run : (Lburp/Zxn3;Lburp/Zefx;Lburp/Zstu;J)Ljava/lang/Runnable;
    //   151: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   156: pop
    //   157: return
  }
  
  private void lambda$addToSiteMap$2(Zefx paramZefx, Zstu paramZstu, long paramLong) {
    // Byte code:
    //   0: invokestatic Zr : ()[I
    //   3: astore #5
    //   5: aload_1
    //   6: invokeinterface ZF : ()Lburp/Zlit;
    //   11: astore #6
    //   13: aload #6
    //   15: ifnonnull -> 19
    //   18: return
    //   19: aload_1
    //   20: invokeinterface Zr : ()Ljava/lang/String;
    //   25: astore #7
    //   27: sipush #11588
    //   30: aload_0
    //   31: getfield Zr : Lburp/Zr_4;
    //   34: aload_1
    //   35: invokeinterface Zt : ()Lburp/Zefx;
    //   40: invokeinterface ZD : ()[B
    //   45: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   50: astore #8
    //   52: sipush #-32610
    //   55: aload_0
    //   56: getfield ZX : Lburp/Zerg;
    //   59: invokevirtual ZA : ()Lburp/Zeot;
    //   62: invokeinterface ZZ : ()Lburp/Ztdi;
    //   67: astore #9
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #7
    //   74: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   77: ifeq -> 121
    //   80: new burp/Zs_t
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: astore #11
    //   89: aload_1
    //   90: aload #11
    //   92: invokeinterface Zi : (Lburp/Zg5o;)V
    //   97: aload #9
    //   99: aload #6
    //   101: aload #8
    //   103: aload #11
    //   105: getfield Zx : I
    //   108: iconst_0
    //   109: invokeinterface ZP : (Lburp/Zlit;Lburp/Zstu;IS)Lburp/Zez3;
    //   114: astore #10
    //   116: aload #5
    //   118: ifnull -> 133
    //   121: aload #9
    //   123: aload #6
    //   125: iconst_0
    //   126: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   131: astore #10
    //   133: new burp/Zsir
    //   136: dup
    //   137: invokespecial <init> : ()V
    //   140: aload #8
    //   142: aload #7
    //   144: invokevirtual Zp : (Lburp/Zstu;Ljava/lang/String;)Lburp/Zsir;
    //   147: astore #11
    //   149: aload_2
    //   150: ifnull -> 204
    //   153: aload #6
    //   155: aload_2
    //   156: getstatic burp/Zt0k.HTML_HEAD_ANALYSIS : Lburp/Zt0k;
    //   159: aload_0
    //   160: getfield ZV : Lburp/Zbnt;
    //   163: invokestatic Zt : (Lburp/Zlit;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   166: astore #12
    //   168: aload #11
    //   170: aload_2
    //   171: aload #12
    //   173: getfield Zs : I
    //   176: aload #12
    //   178: getfield Zb : S
    //   181: aload #12
    //   183: getfield ZH : Lburp/Zk8m;
    //   186: getfield Zj : S
    //   189: aload #12
    //   191: invokestatic ZO : (Lburp/Zs68;)Ljava/lang/String;
    //   194: lload_3
    //   195: invokevirtual ZV : (Lburp/Zstu;ISSLjava/lang/String;J)Lburp/Zsir;
    //   198: iconst_2
    //   199: iconst_0
    //   200: invokevirtual ZZ : (BB)Lburp/Zsir;
    //   203: pop
    //   204: aload #11
    //   206: aload #10
    //   208: invokevirtual Zd : (Lburp/Zez3;)V
    //   211: aload #9
    //   213: aload #10
    //   215: invokeinterface ZR : (Lburp/Zez3;)V
    //   220: aload_0
    //   221: getfield ZQ : Lburp/Zrek;
    //   224: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   227: iconst_0
    //   228: getstatic burp/Zlkk.TAB_FLASH_COLOUR : Lburp/Zlkk;
    //   231: invokevirtual ZS : ()Ljava/awt/Color;
    //   234: iconst_0
    //   235: iconst_1
    //   236: iconst_1
    //   237: invokeinterface Zd : (Lburp/Zeew;ILjava/awt/Color;ZZZ)V
    //   242: goto -> 255
    //   245: astore #6
    //   247: aload #6
    //   249: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   252: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   255: return
    // Exception table:
    //   from	to	target	type
    //   5	18	245	java/lang/Exception
    //   19	242	245	java/lang/Exception
  }
  
  private static Zll9[] lambda$saveHistory$1(int paramInt) {
    return new Zll9[paramInt];
  }
  
  private static Zeg5 lambda$saveHistory$0(String paramString, Zvo1 paramZvo1) {
    return new Zeg5(paramZvo1, paramString);
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'GìXÔ¹ýê®å'àÓÆx7y(ðéøV'H{áµºAî(k¤õ¾ïq Ð³;¥ið4üµ|uìâ(°0F=5@H'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #10
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #33
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
    //   67: ldc 'F]¥bUÄëóïÕ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #13
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #115
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zxn3.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zxn3.b : [Ljava/lang/String;
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
    //   212: bipush #126
    //   214: goto -> 244
    //   217: bipush #108
    //   219: goto -> 244
    //   222: bipush #25
    //   224: goto -> 244
    //   227: bipush #120
    //   229: goto -> 244
    //   232: bipush #112
    //   234: goto -> 244
    //   237: bipush #114
    //   239: goto -> 244
    //   242: bipush #50
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2D45) & 0xFFFF;
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
      byte b1 = 102;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxn3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */