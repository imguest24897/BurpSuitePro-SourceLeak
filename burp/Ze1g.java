package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zip;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Ze1g {
  private final Zekl Za;
  
  private final Zbnt Zz;
  
  private final Zgm5 Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze1g(Zekl paramZekl, byte[] paramArrayOfbyte, Zs68 paramZs68, Zbnt paramZbnt) {
    this.Za = paramZekl;
    this.Zz = paramZbnt;
    this.Zw = new Zgm5(paramArrayOfbyte, paramZs68, paramZbnt);
    Zm();
  }
  
  public byte[] Zn() {
    return this.Zw.ZP();
  }
  
  private static String ZS(String paramString) {
    return a(14843, 27670) + a(14843, 27670);
  }
  
  private static String Zc() {
    return a(14845, -32694);
  }
  
  private void Zm() {
    try {
      if (!ZL())
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Zx();
      Zt();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private boolean ZL() {
    return (this.Za.ZlT() || this.Za.Zl5() || this.Za.Zl7() || this.Za.Zlx() || this.Za.Zlw() || this.Za.Zlu() || this.Za.ZlF() || this.Za.ZlZ());
  }
  
  private void Zt() {
    String str = Zgaj.ZG();
    List<Ztu8> list = (this.Zw.ZL()).Zd;
    if (list == null)
      return; 
    Ztu8 ztu8 = null;
    Iterator<Ztu8> iterator = list.iterator();
    while (iterator.hasNext()) {
      Ztu8 ztu81 = iterator.next();
      if (this.Za.ZlF() && ztu81.ZlD() == 3 && ztu8 != null && ztu8.ZlD() == 0 && a(14836, 15758).equalsIgnoreCase(ztu8.ZlP().ZJ3()))
        Zm(ztu81); 
      Zi(iterator, ztu81);
      ztu8 = ztu81;
      if (str != null)
        break; 
    } 
    ZE();
  }
  
  private void Zx() {
    if (this.Za.ZlF()) {
      Zb();
      Zl();
    } 
    if (this.Za.ZlZ())
      Zq(); 
  }
  
  private void ZE() {
    int i = 0;
    Iterator<Ztu8> iterator = (this.Zw.ZL()).Zd.iterator();
    String str = Zgaj.ZG();
    while (iterator.hasNext()) {
      Ztu8 ztu8 = iterator.next();
      if ((ztu8.ZlD() != 0 && ztu8.ZlD() != 4) || !a(14828, -28029).equalsIgnoreCase(ztu8.ZlP().ZJ3()))
        continue; 
      for (Zs5n zs5n : ztu8.ZlP().ZJo()) {
        if (this.Za.ZlT() && a(14824, 11412).equalsIgnoreCase(zs5n.ZQd()) && a(14817, -17842).equalsIgnoreCase(zs5n.ZQG())) {
          Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_UNHIDE_HIDDEN_FIELDS);
          ZM(zs5n, i);
          if (this.Za.ZlU()) {
            Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_HIGHLIGHT_UNHIDDEN_FIELDS);
            byte[] arrayOfByte1 = Zkb.Zy(ZS(ztu8.ZlP().ZI2(a(14830, 24940))));
            Zt(ztu8.ZlK() + i, arrayOfByte1);
            i += arrayOfByte1.length;
            byte[] arrayOfByte2 = Zkb.Zy(Zc());
            Zt(ztu8.Zli() + i, arrayOfByte2);
            i += arrayOfByte2.length;
            this.Zw.Zl();
          } 
        } 
        if (str != null)
          break; 
      } 
      if (str != null)
        break; 
    } 
  }
  
  private void Zi(Iterator<Ztu8> paramIterator, Ztu8 paramZtu8) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: invokeinterface ZlD : ()B
    //   10: ifeq -> 24
    //   13: aload_2
    //   14: invokeinterface ZlD : ()B
    //   19: iconst_4
    //   20: if_icmpeq -> 24
    //   23: return
    //   24: sipush #14833
    //   27: sipush #-2334
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: aload_2
    //   34: invokeinterface ZlP : ()Lburp/Zs_n;
    //   39: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   44: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   47: ifeq -> 59
    //   50: aload_0
    //   51: aload_2
    //   52: invokevirtual ZR : (Lburp/Ztu8;)V
    //   55: aload_3
    //   56: ifnull -> 197
    //   59: sipush #14816
    //   62: sipush #-5577
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: aload_2
    //   69: invokeinterface ZlP : ()Lburp/Zs_n;
    //   74: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   79: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   82: ifeq -> 94
    //   85: aload_0
    //   86: aload_2
    //   87: invokevirtual Zn : (Lburp/Ztu8;)V
    //   90: aload_3
    //   91: ifnull -> 197
    //   94: sipush #14844
    //   97: sipush #16943
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: aload_2
    //   104: invokeinterface ZlP : ()Lburp/Zs_n;
    //   109: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   114: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   117: ifeq -> 130
    //   120: aload_0
    //   121: aload_1
    //   122: aload_2
    //   123: invokevirtual ZB : (Ljava/util/Iterator;Lburp/Ztu8;)V
    //   126: aload_3
    //   127: ifnull -> 197
    //   130: sipush #14832
    //   133: sipush #-9932
    //   136: invokestatic a : (II)Ljava/lang/String;
    //   139: aload_2
    //   140: invokeinterface ZlP : ()Lburp/Zs_n;
    //   145: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   150: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   153: ifeq -> 166
    //   156: aload_0
    //   157: aload_1
    //   158: aload_2
    //   159: invokevirtual Zg : (Ljava/util/Iterator;Lburp/Ztu8;)V
    //   162: aload_3
    //   163: ifnull -> 197
    //   166: sipush #14838
    //   169: sipush #-26792
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: aload_2
    //   176: invokeinterface ZlP : ()Lburp/Zs_n;
    //   181: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   186: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   189: ifeq -> 197
    //   192: aload_0
    //   193: aload_2
    //   194: invokevirtual ZV : (Lburp/Ztu8;)V
    //   197: aload_0
    //   198: getfield Za : Lburp/Zekl;
    //   201: invokeinterface Zlw : ()Z
    //   206: ifeq -> 222
    //   209: aload_0
    //   210: aload_2
    //   211: invokeinterface ZlP : ()Lburp/Zs_n;
    //   216: getstatic burp/Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_JS : Lburp/Zrrh;
    //   219: invokevirtual ZN : (Lburp/Zs_n;Lnet/portswigger/Zip;)V
    //   222: aload_0
    //   223: getfield Za : Lburp/Zekl;
    //   226: invokeinterface ZlF : ()Z
    //   231: ifeq -> 239
    //   234: aload_0
    //   235: aload_2
    //   236: invokevirtual Z_ : (Lburp/Ztu8;)V
    //   239: return
  }
  
  private void ZV(Ztu8 paramZtu8) {
    if (this.Za.ZlF()) {
      String str = paramZtu8.ZlP().ZI2(a(14834, 27674));
      Zs5n zs5n = paramZtu8.ZlP().ZIm(a(14837, -15703));
      if (str != null && a(14827, 29553).equalsIgnoreCase(str.trim()) && zs5n != null && zs5n.ZQG() != null) {
        int i = zs5n.ZQG().toLowerCase().indexOf(a(14846, 14828));
        if (i >= 0) {
          Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_CONVERT_HTTPS_LINKS_TO_HTTP);
          ZT(zs5n.ZQs() + i, 8);
        } 
      } 
    } 
  }
  
  private void Zg(Iterator<Ztu8> paramIterator, Ztu8 paramZtu8) {
    if (this.Za.Zlu()) {
      Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_OBJECT_TAGS);
      ZM(paramIterator, paramZtu8);
    } 
  }
  
  private void ZB(Iterator<Ztu8> paramIterator, Ztu8 paramZtu8) {
    if (this.Za.Zlw()) {
      Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_JS);
      ZM(paramIterator, paramZtu8);
    } 
  }
  
  private void Zn(Ztu8 paramZtu8) {
    if (this.Za.Zlx() || this.Za.Zlw())
      ZN(paramZtu8.ZlP(), this.Za.Zlw() ? Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_JS : Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_JS_VALIDATION); 
  }
  
  private void Z_(Ztu8 paramZtu8) {
    String str = Zgaj.ZG();
    for (Zs5n zs5n : paramZtu8.ZlP().ZJo()) {
      if (zs5n.ZQG() == null || !ZL(zs5n.ZQG()))
        continue; 
      Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_CONVERT_HTTPS_LINKS_TO_HTTP);
      ZT(zs5n.ZQD(), zs5n.ZQs() + 4 - zs5n.ZQD());
      if (str != null)
        break; 
    } 
  }
  
  private void ZR(Ztu8 paramZtu8) {
    String str = Zgaj.ZG();
    for (Zs5n zs5n : paramZtu8.ZlP().ZJo()) {
      if (this.Za.Zl7() && a(14829, 10616).equalsIgnoreCase(zs5n.ZQd())) {
        Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_LENGTH_LIMITS);
        ZY(zs5n);
        return;
      } 
      if (this.Za.Zl5() && a(14825, 24876).equalsIgnoreCase(zs5n.ZQd())) {
        Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_ENABLE_DISABLED_FIELDS);
        ZY(zs5n);
        return;
      } 
      if ((this.Za.Zlx() || this.Za.Zlw()) && Zo(zs5n)) {
        Zm2.ZC(this.Za.Zlw() ? Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_JS : Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_JS_VALIDATION);
        ZY(zs5n);
        return;
      } 
      if (str != null)
        break; 
    } 
  }
  
  private void Zm(Ztu8 paramZtu8) {
    byte[] arrayOfByte = this.Zw.ZP();
    Iterator<Ztkq> iterator = Zku_.Zu(paramZtu8.Zlv(), 0, paramZtu8.Zlv().length()).iterator();
    String str = Zgaj.ZG();
    while (iterator.hasNext()) {
      Ztkq ztkq = iterator.next();
      if (!ZL(ztkq.ZQ))
        continue; 
      int i = paramZtu8.ZlK() + ztkq.ZP - 1;
      byte b = arrayOfByte[i];
      if (b != 39 && b != 34)
        continue; 
      Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_CONVERT_HTTPS_LINKS_TO_HTTP);
      ZT(i, 5);
      if (str != null)
        break; 
    } 
  }
  
  private void Zq() {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zw : Lburp/Zgm5;
    //   8: invokevirtual ZL : ()Lburp/Zs68;
    //   11: astore_2
    //   12: aload_2
    //   13: getfield ZN : Ljava/util/List;
    //   16: ifnull -> 313
    //   19: aload_2
    //   20: getfield ZN : Ljava/util/List;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 313
    //   38: aload_3
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast burp/Ztbr
    //   47: astore #4
    //   49: aload #4
    //   51: invokeinterface Zqj : ()Z
    //   56: ifne -> 62
    //   59: goto -> 29
    //   62: getstatic burp/Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_REMOVE_COOKIE_SECURE_FLAG : Lburp/Zrrh;
    //   65: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   68: aload #4
    //   70: invokeinterface Zqk : ()Ljava/lang/String;
    //   75: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   78: astore #5
    //   80: aload #5
    //   82: sipush #14841
    //   85: sipush #5720
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual indexOf : (Ljava/lang/String;)I
    //   94: istore #6
    //   96: iload #6
    //   98: ifge -> 117
    //   101: aload #5
    //   103: sipush #14847
    //   106: sipush #-15310
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual indexOf : (Ljava/lang/String;)I
    //   115: istore #6
    //   117: iload #6
    //   119: ifge -> 138
    //   122: aload #5
    //   124: sipush #14842
    //   127: sipush #21899
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: invokevirtual indexOf : (Ljava/lang/String;)I
    //   136: istore #6
    //   138: iload #6
    //   140: ifge -> 161
    //   143: iconst_0
    //   144: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   147: aload #4
    //   149: invokeinterface Zqk : ()Ljava/lang/String;
    //   154: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   157: aload_1
    //   158: ifnull -> 29
    //   161: iinc #6, 1
    //   164: new java/util/ArrayList
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: astore #7
    //   173: aload_0
    //   174: getfield Zw : Lburp/Zgm5;
    //   177: invokevirtual ZP : ()[B
    //   180: iconst_0
    //   181: aload_2
    //   182: getfield Zk : I
    //   185: aload #7
    //   187: invokestatic ZQ : ([BIILjava/util/List;)Ljava/util/List;
    //   190: pop
    //   191: iconst_m1
    //   192: istore #8
    //   194: iconst_1
    //   195: istore #9
    //   197: iload #9
    //   199: aload #7
    //   201: invokeinterface size : ()I
    //   206: if_icmpge -> 252
    //   209: aload #7
    //   211: iload #9
    //   213: invokeinterface get : (I)Ljava/lang/Object;
    //   218: checkcast java/lang/Integer
    //   221: invokevirtual intValue : ()I
    //   224: istore #10
    //   226: aload #4
    //   228: invokeinterface ZqE : ()I
    //   233: iload #10
    //   235: if_icmpge -> 241
    //   238: goto -> 252
    //   241: iload #10
    //   243: istore #8
    //   245: iinc #9, 1
    //   248: aload_1
    //   249: ifnull -> 197
    //   252: iload #8
    //   254: ifge -> 268
    //   257: iconst_0
    //   258: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   261: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   264: aload_1
    //   265: ifnull -> 29
    //   268: iload #6
    //   270: iload #8
    //   272: iadd
    //   273: istore #6
    //   275: aload_0
    //   276: iload #6
    //   278: iload #6
    //   280: aload_0
    //   281: getfield Zw : Lburp/Zgm5;
    //   284: invokevirtual ZP : ()[B
    //   287: iload #6
    //   289: bipush #6
    //   291: iadd
    //   292: baload
    //   293: bipush #59
    //   295: if_icmpne -> 303
    //   298: bipush #7
    //   300: goto -> 305
    //   303: bipush #6
    //   305: iadd
    //   306: invokevirtual ZX : (II)V
    //   309: aload_1
    //   310: ifnull -> 29
    //   313: return
  }
  
  private void Zl() {
    byte[] arrayOfByte = this.Zw.ZP();
    Zs68 zs68 = this.Zw.ZL();
    Zlit zlit = ZY(arrayOfByte, zs68, 2);
    String str = Zgaj.ZG();
    if (zlit != null && zlit.Zdz() != null && zlit.Zdz().ZJZ()) {
      ArrayList<Integer> arrayList = new ArrayList();
      Zsbj.ZQ(arrayOfByte, 0, zs68.Zk, arrayList);
      byte b = 0;
      while (b < zs68.ZP.size()) {
        String str1 = ((String)zs68.ZP.get(b)).toLowerCase();
        if (str1.startsWith(a(14826, 154))) {
          Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_CONVERT_HTTPS_LINKS_TO_HTTP);
          int i = str1.indexOf(a(14839, 19492));
          if (i >= 0)
            ZT(((Integer)arrayList.get(b)).intValue() + i, 8); 
        } 
        b++;
        if (str != null)
          break; 
      } 
    } 
  }
  
  private Zlit ZY(byte[] paramArrayOfbyte, Zs68 paramZs68, int paramInt) {
    Zs0d zs0d = Zb2q.ZO(null, null, paramArrayOfbyte, paramZs68.ZP, paramZs68.Zk, paramZs68.Zb, paramInt, this.Zz);
    return (zs0d == null) ? null : zs0d.ZM();
  }
  
  private void Zb() {
    byte[] arrayOfByte = this.Zw.ZP();
    Zs68 zs68 = this.Zw.ZL();
    String str = Zgaj.ZG();
    Zlit zlit = ZY(arrayOfByte, zs68, 17);
    if (zlit != null && zlit.Zdz() != null && zlit.Zdz().ZJZ()) {
      ArrayList<Integer> arrayList = new ArrayList();
      Zsbj.ZQ(arrayOfByte, 0, zs68.Zk, arrayList);
      byte b = 0;
      while (b < zs68.ZP.size()) {
        String str1 = ((String)zs68.ZP.get(b)).toLowerCase();
        if (str1.startsWith(a(14835, 32436)) && str1.substring(9).trim().startsWith(a(14840, -1744))) {
          Zm2.ZC(Zrrh.PROXY_OPTIONS_RESPONSE_MODIFICATION_CONVERT_HTTPS_LINKS_TO_HTTP);
          int i = ((Integer)arrayList.get(b)).intValue() + 9;
          while (arrayOfByte[i] <= 32) {
            i++;
            if (str != null)
              break; 
          } 
          ZT(i, 4);
        } 
        b++;
        if (str != null)
          break; 
      } 
    } 
  }
  
  private boolean ZL(String paramString) {
    return (paramString.length() < 9) ? false : (((paramString.charAt(0) == 'h' || paramString.charAt(0) == 'H') && (paramString.charAt(1) == 't' || paramString.charAt(1) == 'T') && (paramString.charAt(2) == 't' || paramString.charAt(2) == 'T') && (paramString.charAt(3) == 'p' || paramString.charAt(3) == 'P') && (paramString.charAt(4) == 's' || paramString.charAt(4) == 'S') && paramString.charAt(5) == ':' && paramString.charAt(6) == '/' && paramString.charAt(7) == '/'));
  }
  
  private boolean Zo(Zs5n paramZs5n) {
    return paramZs5n.ZQd().toLowerCase().startsWith(a(14831, 17501));
  }
  
  private void ZX(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = this.Zw.Zy();
    int i = paramInt1;
    String str = Zgaj.ZG();
    while (i < paramInt2) {
      arrayOfByte[i] = 32;
      i++;
      if (str != null)
        break; 
    } 
  }
  
  private void ZY(Zs5n paramZs5n) {
    ZM(paramZs5n, 0);
  }
  
  private void ZM(Zs5n paramZs5n, int paramInt) {
    int i = paramZs5n.ZQD();
    int j = paramZs5n.ZQc();
    if (paramZs5n.ZQr() != 3)
      j++; 
    ZX(i + paramInt, j + paramInt);
  }
  
  private void ZM(Iterator<Ztu8> paramIterator, Ztu8 paramZtu8) {
    String str2 = paramZtu8.ZlP().ZJ3();
    int i = paramZtu8.ZlK();
    int j = paramZtu8.Zli();
    String str1 = Zgaj.ZG();
    while (paramIterator.hasNext()) {
      Ztu8 ztu8 = paramIterator.next();
      if (ztu8.ZlD() == 1 && str2.equalsIgnoreCase(ztu8.ZlP().ZJ3())) {
        j = ztu8.Zli();
        if (str1 != null)
          continue; 
        break;
      } 
      continue;
      if (str1 != null)
        break; 
    } 
    ZX(i, j);
  }
  
  private void ZN(Zs_n paramZs_n, Zip paramZip) {
    String str = Zgaj.ZG();
    for (Zs5n zs5n : paramZs_n.ZJo()) {
      if (Zo(zs5n)) {
        Zm2.ZC(paramZip);
        ZY(zs5n);
      } 
      if (str != null)
        break; 
    } 
  }
  
  private void ZT(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = this.Zw.Zy();
    if (paramInt1 + paramInt2 - paramInt1 >= 0)
      System.arraycopy(arrayOfByte, paramInt1, arrayOfByte, paramInt1 + 1, paramInt1 + paramInt2 - paramInt1); 
    arrayOfByte[paramInt1] = 32;
  }
  
  private void Zt(int paramInt, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = this.Zw.Zy();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramArrayOfbyte.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, paramInt);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte2, paramInt, paramArrayOfbyte.length);
    System.arraycopy(arrayOfByte1, paramInt, arrayOfByte2, paramInt + paramArrayOfbyte.length, arrayOfByte1.length - paramInt);
    this.Zw.Zh(arrayOfByte2);
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
    //   9: ldc '®dþåavOÖ\\b*\\rÎR6eÄ «b\\tÁZb«¹§³\\fm7ñ0lîsëÿ­@ï?r'*/l¬f®ÈiAÉ¯"\\tÃò? s± Äk­ô:÷×@Ñ©Ðú |¬©àÓõV2\\fmj9_©P}YÆÑ<"2ðÚÓ þ®lRõo\\fZâ\\fº´ÚÏl·£Ó$Ueôm\\t}¥\\tÉ[ÑC` 9p\\n©No§Np8ædÿìf\\f±Åë®ö®ÅÎý\\b³Þé«'ï»E;uW'¸\\bN¼ù;ò"Ë\\tFÆîSåt\\fã"PLFvñ&è¯*zt'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #68
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
    //   68: ldc ' !f\\b©o'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #82
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
    //   128: putstatic burp/Ze1g.a : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Ze1g.b : [Ljava/lang/String;
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
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #15
    //   219: goto -> 244
    //   222: bipush #44
    //   224: goto -> 244
    //   227: bipush #58
    //   229: goto -> 244
    //   232: bipush #75
    //   234: goto -> 244
    //   237: bipush #60
    //   239: goto -> 244
    //   242: bipush #120
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
    int i = (paramInt1 ^ 0x39F9) & 0xFFFF;
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
      byte b1 = 2;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */