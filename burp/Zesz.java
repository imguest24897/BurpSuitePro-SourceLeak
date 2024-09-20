package burp;

import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zesz implements Zkrr {
  private static final List<Short> ZC;
  
  private static final byte[] Zv;
  
  private static final byte[] ZB;
  
  private static final byte[] ZP;
  
  private final Zsoh ZI;
  
  private final Zkl6 ZK;
  
  private final Ze3n Zz;
  
  private final Ztai Zh;
  
  private static int[] Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zesz(Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n, Ztai paramZtai) {
    this.ZI = paramZsoh;
    int[] arrayOfInt = Zg();
    this.ZK = paramZkl6;
    this.Zz = paramZe3n;
    this.Zh = paramZtai;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_RobotsTxtAndTlsConfig;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (this.Zh.Zr(Zzu2.ROBOTS_TXT_FILE) || this.Zh.Zr(Zzu2.TLS_CERTIFICATE)) {
      AtomicReference<SSLSession> atomicReference = new AtomicReference();
      Zsxd zsxd = ZZ(paramZtpx, atomicReference);
      if (this.Zh.Zr(Zzu2.ROBOTS_TXT_FILE))
        paramZz4_.Zz(ZA(zsxd)); 
      if (this.Zh.Zr(Zzu2.TLS_CERTIFICATE))
        paramZz4_.Zz(Zv(atomicReference.get())); 
    } 
  }
  
  private Zsxd ZZ(Ztpx paramZtpx, AtomicReference<SSLSession> paramAtomicReference) {
    byte[] arrayOfByte = this.ZK.Zs().ZO().Zf(new Zax(this.Zz.Za(), ZP)).ZK(Zxk3.HTTP_V11).Zw(a(-9427, 16039)).Zr().ZiD();
    Objects.requireNonNull(paramAtomicReference);
    return this.ZI.ZD(Ztao.Zc(paramZtpx, this.Zz.ZM(), arrayOfByte).Zz(false).Zx(Zxgd.ZZ().Zz().ZV()).Ze(paramAtomicReference::set).ZA());
  }
  
  private Zsqx<Zrdb> ZA(Zsxd paramZsxd) {
    Zstu zstu = Zsoh.ZA(paramZsxd);
    Zs68 zs68 = Zbwc.Zt((Zlit)null, zstu, Zt0k.HTML_ANALYSIS, this.ZK.ZB());
    return (zs68.Zb != 200 || Za(zs68) || ZC(zstu, zs68)) ? null : Zf(this.Zz, paramZsxd.Zz().ZR().ZD(), zstu, System.currentTimeMillis());
  }
  
  private Zsqx<Zrdb> Zv(SSLSession paramSSLSession) {
    try {
      if (this.Zz.Za().ZJZ()) {
        X509Certificate[] arrayOfX509Certificate = Zl(paramSSLSession);
        if (arrayOfX509Certificate.length > 0) {
          X509TrustManager x509TrustManager = Zlc_.ZT();
          ArrayList<Zgaq> arrayList = new ArrayList(arrayOfX509Certificate.length + 1);
          ZY(this.Zz, arrayOfX509Certificate, arrayList);
          Zs(this.Zz, arrayOfX509Certificate, arrayList, x509TrustManager);
          ZE(arrayOfX509Certificate, arrayList, x509TrustManager);
          return Zgaf.ZT(this.Zz.Za(), arrayList);
        } 
      } 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      Zah.Zl(sSLPeerUnverifiedException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return null;
  }
  
  private static X509Certificate[] Zl(SSLSession paramSSLSession) throws SSLPeerUnverifiedException {
    try {
      if (paramSSLSession == null) {
        Zuh.Zb(false, Zqf.Zr);
        return new X509Certificate[0];
      } 
    } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
      throw a(null);
    } 
    return (X509Certificate[])paramSSLSession.getPeerCertificates();
  }
  
  private static boolean Za(Zs68 paramZs68) {
    return !ZC.contains(Short.valueOf(paramZs68.ZH.Zj));
  }
  
  private static boolean ZC(Zstu paramZstu, Zs68 paramZs68) {
    return (Zlt_.Zr(paramZstu, Zv, false, paramZs68.Zk) == -1 || Zlt_.Zr(paramZstu, ZB, false, paramZs68.Zk) == -1);
  }
  
  private static Zsqx<Zrdb> Zf(Ze3n paramZe3n, byte[] paramArrayOfbyte, Zstu paramZstu, long paramLong) {
    List<Zl1r> list = ZP(paramArrayOfbyte);
    Zvow zvow = paramZe3n.ZI().ZF(paramLong).Zp(paramArrayOfbyte).ZK(list).Zu(paramZstu);
    return Zsnb.ZQ(paramZe3n.Za(), zvow);
  }
  
  private static List<Zl1r> ZP(byte[] paramArrayOfbyte) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zl8v.Za(Zsnb.Zn, paramArrayOfbyte, arrayList);
    return arrayList;
  }
  
  private static void ZY(Ze3n paramZe3n, X509Certificate[] paramArrayOfX509Certificate, List<Zgaq> paramList) {
    int[] arrayOfInt = Zg();
    byte b = 0;
    while (b < paramArrayOfX509Certificate.length) {
      paramList.add(ZQ(paramZe3n.Za(), paramArrayOfX509Certificate[b], (b == 0)));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private static void Zs(Ze3n paramZe3n, X509Certificate[] paramArrayOfX509Certificate, List<Zgaq> paramList, X509TrustManager paramX509TrustManager) {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface getAcceptedIssuers : ()[Ljava/security/cert/X509Certificate;
    //   6: astore #5
    //   8: aload #5
    //   10: astore #6
    //   12: invokestatic Zg : ()[I
    //   15: aload #6
    //   17: arraylength
    //   18: istore #7
    //   20: iconst_0
    //   21: istore #8
    //   23: astore #4
    //   25: iload #8
    //   27: iload #7
    //   29: if_icmpge -> 91
    //   32: aload #6
    //   34: iload #8
    //   36: aaload
    //   37: astore #9
    //   39: aload #9
    //   41: invokevirtual getSubjectDN : ()Ljava/security/Principal;
    //   44: aload_1
    //   45: aload_1
    //   46: arraylength
    //   47: iconst_1
    //   48: isub
    //   49: aaload
    //   50: invokevirtual getIssuerDN : ()Ljava/security/Principal;
    //   53: invokeinterface equals : (Ljava/lang/Object;)Z
    //   58: ifeq -> 83
    //   61: aload_2
    //   62: aload_0
    //   63: invokevirtual Za : ()Lburp/Zmzk;
    //   66: aload #9
    //   68: iconst_0
    //   69: invokestatic ZQ : (Lburp/Zmzk;Ljava/security/cert/X509Certificate;Z)Lburp/Zgaq;
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload #4
    //   80: ifnonnull -> 91
    //   83: iinc #8, 1
    //   86: aload #4
    //   88: ifnonnull -> 25
    //   91: return
  }
  
  private static void ZE(X509Certificate[] paramArrayOfX509Certificate, List<Zgaq> paramList, X509TrustManager paramX509TrustManager) {
    boolean bool = false;
    Iterator<String> iterator = Arrays.<String>asList(new String[] { a(-9430, -28461), a(-9428, 28672), a(-9431, -24573) }).iterator();
    int[] arrayOfInt = Zg();
    while (iterator.hasNext()) {
      String str = iterator.next();
      try {
        paramX509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, str);
        return;
      } catch (CertificateExpiredException|CertificateNotYetValidException certificateExpiredException) {
        Zah.Zl(certificateExpiredException, Zk_.COMMON_RUNTIME_FAILURE);
      } catch (CertificateException certificateException) {
        Zah.Zl(certificateException, Zk_.COMMON_RUNTIME_FAILURE);
        bool = true;
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    try {
      if (bool)
        ((Zgaq)paramList.get(0)).Zy |= 0x8; 
    } catch (CertificateExpiredException certificateExpiredException) {
      throw a(null);
    } 
  }
  
  private static Zgaq ZQ(Zmzk paramZmzk, X509Certificate paramX509Certificate, boolean paramBoolean) {
    Zgvp zgvp = Ztbq.ZE(paramX509Certificate);
    Zgaq zgaq = ZI(zgvp, paramX509Certificate);
    ZL(paramX509Certificate, zgaq);
    if (paramBoolean)
      Zx(paramZmzk, zgvp, zgaq); 
    return zgaq;
  }
  
  private static Zgaq ZI(Zgvp paramZgvp, X509Certificate paramX509Certificate) {
    return new Zgaq(Zgaq.ZK(paramZgvp), paramZgvp.Zf, paramX509Certificate.getNotBefore().toString(), paramX509Certificate.getNotAfter().toString());
  }
  
  private static void ZL(X509Certificate paramX509Certificate, Zgaq paramZgaq) {
    try {
      paramX509Certificate.checkValidity();
    } catch (CertificateExpiredException certificateExpiredException) {
      Zah.Zl(certificateExpiredException, Zk_.IGNORED);
      paramZgaq.Zy |= 0x2;
    } catch (CertificateNotYetValidException certificateNotYetValidException) {
      Zah.Zl(certificateNotYetValidException, Zk_.IGNORED);
      paramZgaq.Zy |= 0x1;
    } 
  }
  
  private static void Zx(Zmzk paramZmzk, Zgvp paramZgvp, Zgaq paramZgaq) {
    if (ZM(paramZmzk.ZJ1(), paramZgvp.ZM, paramZgvp.ZT))
      paramZgaq.Zy |= 0x4; 
  }
  
  private static boolean ZM(String paramString1, String paramString2, List<String> paramList) {
    int[] arrayOfInt = Zg();
    if (Zm(paramString1, paramString2))
      return false; 
    for (String str : paramList) {
      if (Zm(paramString1, str))
        return false; 
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  private static boolean Zm(String paramString1, String paramString2) {
    paramString2 = ZM(paramString2);
    if (paramString1.equalsIgnoreCase(paramString2))
      return true; 
    if (paramString2.startsWith(a(-9432, 6922))) {
      paramString2 = paramString2.substring(1).toLowerCase();
      return paramString1.toLowerCase().endsWith(paramString2);
    } 
    return false;
  }
  
  public static String ZM(String paramString) {
    paramString = ZW(paramString, ',');
    paramString = ZW(paramString, ';');
    paramString = ZW(paramString, '/');
    int[] arrayOfInt = Zg();
    if (Zbqc.Zwu() == null)
      Zv(new int[3]); 
    return paramString;
  }
  
  private static String ZW(String paramString, char paramChar) {
    int i = paramString.indexOf(paramChar);
    if (i >= 0)
      paramString = paramString.substring(0, i); 
    return paramString;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_3
    //   10: newarray int
    //   12: ldc 'þ\\nw³¿(Ï+yYmÕ}{îÐ5®ûâ5;ã4JÁ qö÷\\t±fÃÜq{¬'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: invokestatic Zv : ([I)V
    //   24: bipush #8
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #113
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '\\r1xÏ÷X¾Xí'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: iconst_3
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #56
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zesz.a : [Ljava/lang/String;
    //   137: bipush #8
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zesz.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #30
    //   218: goto -> 248
    //   221: bipush #108
    //   223: goto -> 248
    //   226: bipush #124
    //   228: goto -> 248
    //   231: bipush #124
    //   233: goto -> 248
    //   236: bipush #117
    //   238: goto -> 248
    //   241: bipush #50
    //   243: goto -> 248
    //   246: bipush #71
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 46, 0 -> 104
    //   304: bipush #6
    //   306: anewarray java/lang/Short
    //   309: dup
    //   310: iconst_0
    //   311: sipush #257
    //   314: invokestatic valueOf : (S)Ljava/lang/Short;
    //   317: aastore
    //   318: dup
    //   319: iconst_1
    //   320: iconst_1
    //   321: invokestatic valueOf : (S)Ljava/lang/Short;
    //   324: aastore
    //   325: dup
    //   326: iconst_2
    //   327: iconst_2
    //   328: invokestatic valueOf : (S)Ljava/lang/Short;
    //   331: aastore
    //   332: dup
    //   333: iconst_3
    //   334: sipush #1025
    //   337: invokestatic valueOf : (S)Ljava/lang/Short;
    //   340: aastore
    //   341: dup
    //   342: iconst_4
    //   343: sipush #259
    //   346: invokestatic valueOf : (S)Ljava/lang/Short;
    //   349: aastore
    //   350: dup
    //   351: iconst_5
    //   352: sipush #258
    //   355: invokestatic valueOf : (S)Ljava/lang/Short;
    //   358: aastore
    //   359: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   362: putstatic burp/Zesz.ZC : Ljava/util/List;
    //   365: sipush #-9426
    //   368: sipush #10095
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: invokestatic Zy : (Ljava/lang/String;)[B
    //   377: putstatic burp/Zesz.Zv : [B
    //   380: sipush #-9429
    //   383: sipush #-29627
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: invokestatic Zy : (Ljava/lang/String;)[B
    //   392: putstatic burp/Zesz.ZB : [B
    //   395: sipush #-9425
    //   398: sipush #21364
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: invokestatic Zy : (Ljava/lang/String;)[B
    //   407: putstatic burp/Zesz.ZP : [B
    //   410: return
  }
  
  public static void Zv(int[] paramArrayOfint) {
    Zj = paramArrayOfint;
  }
  
  public static int[] Zg() {
    return Zj;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDB2C) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */