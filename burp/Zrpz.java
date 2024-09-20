package burp;

import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509KeyManager;

class Zrpz implements X509KeyManager {
  private final Map<String, X509KeyManager> ZF;
  
  private final Map<String, X509KeyManager> ZH;
  
  private final String[] Zh;
  
  private final X509KeyManager ZQ;
  
  private static final String a;
  
  Zrpz(List<Zzuo> paramList) {
    HashMap<Object, Object> hashMap1 = new HashMap<>();
    HashMap<Object, Object> hashMap2 = new HashMap<>();
    String str = Zg6d.Ze();
    for (Zzuo zzuo : paramList) {
      hashMap1.put(zzuo.Zq, zzuo.ZP);
      hashMap2.put(zzuo.Zd, zzuo.ZP);
      if (str == null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    this.ZH = Collections.synchronizedMap(hashMap2);
    this.ZF = Collections.synchronizedMap(hashMap1);
    this.Zh = (String[])paramList.stream().map(Zrpz::lambda$new$0).toArray(Zrpz::lambda$new$1);
    this.ZQ = ((Zzuo)paramList.get(0)).ZP;
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    throw new UnsupportedOperationException();
  }
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    throw new UnsupportedOperationException();
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return this.Zh;
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    SSLSocket sSLSocket = (SSLSocket)paramSocket;
    SSLSession sSLSession = sSLSocket.getHandshakeSession();
    String str1 = Zg6d.Ze();
    ExtendedSSLSession extendedSSLSession = (ExtendedSSLSession)sSLSession;
    String str2 = extendedSSLSession.getRequestedServerNames().stream().map(Zrpz::lambda$chooseServerAlias$2).findFirst().orElse(null);
    X509KeyManager x509KeyManager = this.ZF.get(str2);
    if (x509KeyManager == null) {
      String str = Za(str2);
      x509KeyManager = this.ZF.getOrDefault(str, this.ZQ);
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zg6d.ZB("bdnp2b"); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return x509KeyManager.chooseServerAlias(paramString, paramArrayOfPrincipal, paramSocket);
  }
  
  public X509Certificate[] getCertificateChain(String paramString) {
    return ((X509KeyManager)this.ZH.getOrDefault(paramString, this.ZQ)).getCertificateChain(paramString);
  }
  
  public PrivateKey getPrivateKey(String paramString) {
    return ((X509KeyManager)this.ZH.getOrDefault(paramString, this.ZQ)).getPrivateKey(paramString);
  }
  
  private static String Za(String paramString) {
    try {
      if (paramString == null)
        return null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    String[] arrayOfString = paramString.split(a, 2);
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (arrayOfString.length == 1) ? arrayOfString[0] : arrayOfString[1];
  }
  
  private static String lambda$chooseServerAlias$2(SNIServerName paramSNIServerName) {
    return new String(paramSNIServerName.getEncoded(), StandardCharsets.UTF_8);
  }
  
  private static String[] lambda$new$1(int paramInt) {
    return new String[paramInt];
  }
  
  private static String lambda$new$0(Zzuo paramZzuo) {
    return paramZzuo.Zd;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #57
    //   2: ldc 'gH'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrpz.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_2
    //   81: goto -> 111
    //   84: bipush #95
    //   86: goto -> 111
    //   89: bipush #44
    //   91: goto -> 111
    //   94: bipush #19
    //   96: goto -> 111
    //   99: bipush #34
    //   101: goto -> 111
    //   104: bipush #78
    //   106: goto -> 111
    //   109: bipush #18
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrpz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */