package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.params.ParsedHttpParameter;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.requests.HttpTransformation;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.message.responses.analysis.ResponseKeywordsAnalyzer;
import burp.api.montoya.http.message.responses.analysis.ResponseVariationsAnalyzer;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Ztu;

public class Zrnh implements IExtensionHelpers {
  private final Zbnt Zv;
  
  private final MontoyaApi ZI;
  
  private final Ztx8 Zj;
  
  private final Zzqf ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zrnh(Zbnt paramZbnt, MontoyaApi paramMontoyaApi, Ztx8 paramZtx8, Zzqf paramZzqf) {
    this.Zv = paramZbnt;
    this.ZI = paramMontoyaApi;
    this.Zj = paramZtx8;
    this.ZR = paramZzqf;
  }
  
  public static IExtensionHelpers Zy(Zbnt paramZbnt, MontoyaApi paramMontoyaApi, Ztx8 paramZtx8, Zzqf paramZzqf) {
    return new Zg2j(new Zrnh(paramZbnt, paramMontoyaApi, paramZtx8, paramZzqf));
  }
  
  public IParameter getRequestParameter(byte[] paramArrayOfbyte, String paramString) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(7256, -14885)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (paramString == null)
          throw new NullPointerException(a(7253, 22770)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpRequest httpRequest = this.ZR.Zj((IHttpService)null, paramArrayOfbyte);
      return httpRequest.parameters().stream().filter(paramString::lambda$getRequestParameter$0).map(Zbox::ZT).findFirst().orElse(null);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public byte[] urlDecode(byte[] paramArrayOfbyte) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw this.Zj.Zf(new NullPointerException(a(7263, -16575))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return Ztu.ZS(paramArrayOfbyte);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7255, 28443)));
    } 
  }
  
  public String urlDecode(String paramString) {
    try {
      try {
        if (paramString == null)
          throw this.Zj.Zf(new NullPointerException(a(7262, 23182))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return bytesToString(urlDecode(stringToBytes(paramString)));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public byte[] urlEncode(byte[] paramArrayOfbyte) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw this.Zj.Zf(new NullPointerException(a(7262, 23182))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return Ztu.Z_(paramArrayOfbyte);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public String urlEncode(String paramString) {
    try {
      try {
        if (paramString == null)
          throw this.Zj.Zf(new NullPointerException(a(7262, 23182))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return bytesToString(urlEncode(stringToBytes(paramString)));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public byte[] base64Decode(byte[] paramArrayOfbyte) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw this.Zj.Zf(new NullPointerException(a(7262, 23182))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return Ztu.Zx(paramArrayOfbyte);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public byte[] base64Decode(String paramString) {
    try {
      try {
        if (paramString == null)
          throw this.Zj.Zf(new NullPointerException(a(7262, 23182))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return base64Decode(stringToBytes(paramString));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public String base64Encode(byte[] paramArrayOfbyte) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw this.Zj.Zf(new NullPointerException(a(7262, 23182))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return bytesToString(Ztu.Zt(paramArrayOfbyte));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public String base64Encode(String paramString) {
    try {
      try {
        if (paramString == null)
          throw this.Zj.Zf(new NullPointerException(a(7262, 23182))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return base64Encode(stringToBytes(paramString));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public IRequestInfo analyzeRequest(IHttpRequestResponse paramIHttpRequestResponse) {
    try {
      try {
        if (paramIHttpRequestResponse == null)
          throw new NullPointerException(a(7249, -5382)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return analyzeRequest(paramIHttpRequestResponse.getHttpService(), paramIHttpRequestResponse.getRequest());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public IRequestInfo analyzeRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    Zmzk zmzk = null;
    try {
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(7256, -14885)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      if (paramIHttpService != null)
        zmzk = Zb28.Zs(paramIHttpService, this.Zv); 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
    try {
      Zz1p zz1p = Zekx.Zu(zmzk, paramArrayOfbyte, (byte)2, this.Zv);
      return Zx6b.ZY(zz1p);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7250, -28341)));
    } 
  }
  
  public IResponseInfo analyzeResponse(byte[] paramArrayOfbyte) {
    try {
      HttpResponse httpResponse = this.ZR.Zc(paramArrayOfbyte);
      return Zmc7.ZM(httpResponse);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public byte[] buildHttpMessage(List<String> paramList, byte[] paramArrayOfbyte) {
    try {
      if (paramList == null)
        throw new NullPointerException(a(7234, 17958)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    if (paramArrayOfbyte == null)
      paramArrayOfbyte = new byte[0]; 
    try {
      null = Zljl.ZY(paramList, paramArrayOfbyte);
      return Zsbj.ZQ(null);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw new IllegalArgumentException(a(7248, -2079));
    } 
  }
  
  public byte[] stringToBytes(String paramString) {
    try {
      return this.ZI.utilities().byteUtils().convertFromString(paramString);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public String bytesToString(byte[] paramArrayOfbyte) {
    try {
      return this.ZI.utilities().byteUtils().convertToString(paramArrayOfbyte);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public int indexOf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt1, int paramInt2) {
    try {
      try {
        if (paramArrayOfbyte1 == null)
          throw new NullPointerException(a(7262, 23182)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (paramArrayOfbyte2 == null)
          throw new NullPointerException(a(7251, -25914)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return this.ZI.utilities().byteUtils().indexOf(paramArrayOfbyte1, paramArrayOfbyte2, paramBoolean, paramInt1, paramInt2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public IHttpService buildHttpService(String paramString1, int paramInt, String paramString2) {
    // Byte code:
    //   0: invokestatic ZB : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_3
    //   6: sipush #7259
    //   9: sipush #29155
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   18: ifeq -> 29
    //   21: iconst_1
    //   22: istore #5
    //   24: aload #4
    //   26: ifnull -> 72
    //   29: aload_3
    //   30: sipush #7261
    //   33: sipush #-29729
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   42: ifeq -> 60
    //   45: goto -> 52
    //   48: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   51: athrow
    //   52: iconst_0
    //   53: istore #5
    //   55: aload #4
    //   57: ifnull -> 72
    //   60: new java/lang/Exception
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: athrow
    //   68: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   71: athrow
    //   72: goto -> 118
    //   75: astore #6
    //   77: aload #6
    //   79: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   82: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   85: aload_0
    //   86: getfield Zj : Lburp/Ztx8;
    //   89: new java/lang/IllegalArgumentException
    //   92: dup
    //   93: aload_3
    //   94: sipush #7235
    //   97: sipush #-13007
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: swap
    //   104: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   109: invokespecial <init> : (Ljava/lang/String;)V
    //   112: invokeinterface Zf : (Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   117: athrow
    //   118: aload_0
    //   119: aload_1
    //   120: iload_2
    //   121: iload #5
    //   123: invokevirtual buildHttpService : (Ljava/lang/String;IZ)Lburp/IHttpService;
    //   126: areturn
    // Exception table:
    //   from	to	target	type
    //   5	72	75	java/lang/Throwable
    //   24	45	48	java/lang/Throwable
    //   55	68	68	java/lang/Throwable
  }
  
  public IHttpService buildHttpService(String paramString, int paramInt, boolean paramBoolean) {
    try {
      try {
        if (paramString == null)
          throw new NullPointerException(a(7258, -2090)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return Zb28.ZU(this.Zv.ZY(paramString, paramInt, paramBoolean));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public IScannerInsertionPoint makeScannerInsertionPoint(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      AuditInsertionPoint auditInsertionPoint = this.ZR.Zx(paramString, paramArrayOfbyte, paramInt1, paramInt2);
      return new Zg_2(auditInsertionPoint, this.ZR);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public IResponseVariations analyzeResponseVariations(byte[]... paramVarArgs) {
    try {
      ResponseVariationsAnalyzer responseVariationsAnalyzer = this.ZI.http().createResponseVariationsAnalyzer();
      Objects.requireNonNull(this.ZR);
      return Zejl.ZP(responseVariationsAnalyzer, this.ZR::Zc, this.Zj, paramVarArgs);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public IResponseKeywords analyzeResponseKeywords(List<String> paramList, byte[]... paramVarArgs) {
    try {
      ResponseKeywordsAnalyzer responseKeywordsAnalyzer = this.ZI.http().createResponseKeywordsAnalyzer(paramList);
      Objects.requireNonNull(this.ZR);
      return Zt0q.Zc(responseKeywordsAnalyzer, paramList, this.ZR::Zc, this.Zj, paramVarArgs);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public byte[] addParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(7256, -14885)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (paramIParameter == null)
          throw new NullPointerException(a(7252, 1146)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpRequest httpRequest1 = this.ZR.Zj((IHttpService)null, paramArrayOfbyte);
      HttpRequest httpRequest2 = httpRequest1.withAddedParameters(new HttpParameter[] { this.ZR.ZU(paramIParameter) });
      return httpRequest2.toByteArray().getBytes();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public byte[] removeParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(7256, -14885)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (paramIParameter == null)
          throw new NullPointerException(a(7252, 1146)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpRequest httpRequest1 = this.ZR.Zj((IHttpService)null, paramArrayOfbyte);
      HttpRequest httpRequest2 = httpRequest1.withRemovedParameters(new HttpParameter[] { this.ZR.ZU(paramIParameter) });
      return httpRequest2.toByteArray().getBytes();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public byte[] buildHttpRequest(URL paramURL) {
    try {
      try {
        if (paramURL == null)
          throw new NullPointerException(a(7257, 10616)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return this.ZR.Z_(paramURL.toExternalForm()).toByteArray().getBytes();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public byte[] toggleRequestMethod(byte[] paramArrayOfbyte) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(7256, -14885)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpRequest httpRequest1 = this.ZR.Zj((IHttpService)null, paramArrayOfbyte);
      HttpRequest httpRequest2 = httpRequest1.withTransformationApplied(HttpTransformation.TOGGLE_METHOD);
      return httpRequest2.toByteArray().getBytes();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(new IllegalArgumentException(a(7248, -2079)));
    } 
  }
  
  public IRequestInfo analyzeRequest(byte[] paramArrayOfbyte) {
    return analyzeRequest(null, paramArrayOfbyte);
  }
  
  public byte[] updateParameter(byte[] paramArrayOfbyte, IParameter paramIParameter) {
    String[] arrayOfString = Zmu0.ZB();
    try {
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(7256, -14885)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (paramIParameter == null)
          throw new NullPointerException(a(7232, -2145)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpParameter httpParameter = this.ZR.ZU(paramIParameter);
      HttpRequest httpRequest = this.ZR.Zj((IHttpService)null, paramArrayOfbyte);
      httpRequest = httpRequest.withRemovedParameters(new HttpParameter[] { httpParameter });
      httpRequest = httpRequest.withAddedParameters(new HttpParameter[] { httpParameter });
      if (Zbqc.Zwu() == null)
        Zmu0.ZI(new String[2]); 
      return httpRequest.toByteArray().getBytes();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  public IParameter buildParameter(String paramString1, String paramString2, byte paramByte) {
    String[] arrayOfString = Zmu0.ZB();
    try {
      if (paramString1 == null)
        throw this.Zj.Zf(new NullPointerException(a(7233, 12036))); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramString2 == null)
        throw this.Zj.Zf(new NullPointerException(a(7254, -30142))); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      switch (paramByte) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
          try {
            if (arrayOfString != null)
              break; 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          return new Zxw(this, paramByte, paramString1, paramString2);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    throw this.Zj.Zf(new IllegalArgumentException(a(7260, -29301)));
  }
  
  public IHttpHeader buildHeader(String paramString1, String paramString2) {
    try {
      return Zgdb.ZG(paramString1, paramString2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zj.Zf(throwable);
    } 
  }
  
  private static boolean lambda$getRequestParameter$0(String paramString, ParsedHttpParameter paramParsedHttpParameter) {
    return Objects.equals(paramString, paramParsedHttpParameter.name());
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '>ba£´4òUÏÙè÷FëtüÀµ4´ó^º\\f2ì)²»Töù)ß¨D'bóÍðõy{yÎ8#ÚNXöÜ5Ë¡,Ó¦ÂÝÒgÚåQ \\fÈbËaÂ£Ïû0\\fEÒ¤¶Wèi»q®ÿÎr(g+IÐå[Ï¨¬Ö«YÓ|n2ç#Æü¢EÆÎw8&ýõÂHA[<¿*ÿ}2 Qj¦w±\\b0 «W é«b2Â\\n?Ø1Ü¾±àgk;¤ç¾â«¹i\\ròª^¯\\b@_lFð}-ü6¶Sö²Ö@¦Ëaü{cÂd`A?{tFè»ÌØK6ÒIÍÐ¯08<.¥² Zº+Ò°?§1E cðíñuûi·Ì>cFlÆ_õP1ß¥iJ\\nÊ´N¸'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #105
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
    //   68: ldc '{Ó®»AÆÉûBn\\t°Í&Ý3p_ÞsÍ.RUÀp<JwâÙ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #88
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
    //   129: putstatic burp/Zrnh.a : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrnh.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #28
    //   214: goto -> 243
    //   217: bipush #45
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #14
    //   228: goto -> 243
    //   231: bipush #75
    //   233: goto -> 243
    //   236: bipush #46
    //   238: goto -> 243
    //   241: bipush #63
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
    int i = (paramInt1 ^ 0x1C52) & 0xFFFF;
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
      char c = 'µ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrnh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */