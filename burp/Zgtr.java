package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Marker;
import burp.api.montoya.http.message.Cookie;
import burp.api.montoya.http.message.HttpHeader;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.StatusCodeClass;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.message.responses.analysis.Attribute;
import burp.api.montoya.http.message.responses.analysis.AttributeType;
import burp.api.montoya.http.message.responses.analysis.KeywordCount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.portswigger.Zkb;
import net.portswigger.Zmw;

public class Zgtr implements HttpResponse, Proxyable {
  private static final Zruo Zd;
  
  final Zg0d ZQ;
  
  private final Zbnt Zm;
  
  private final List<Marker> ZV;
  
  private final Zr_4 ZN;
  
  private final boolean Zf;
  
  private Zezj ZR;
  
  private List<HttpHeader> Zq;
  
  private List<Cookie> ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zgtr(Zg0d paramZg0d, Zbnt paramZbnt, List<Marker> paramList, Zr_4 paramZr_4, boolean paramBoolean) {
    this.Zm = paramZbnt;
    this.ZQ = paramZg0d;
    this.ZV = paramList;
    this.ZN = paramZr_4;
    this.ZR = Zezj.Zl;
    this.Zf = paramBoolean;
  }
  
  private Zgtr(Zstu paramZstu, Zbnt paramZbnt, List<Marker> paramList, Zr_4 paramZr_4) {
    this(Zd.<Zg0d>ZH(new Zld4(paramZstu)), paramZbnt, paramList, paramZr_4, false);
  }
  
  public short statusCode() {
    return (Zw(Zt0k.NO_HTML_ANALYSIS)).ZP.Zb;
  }
  
  public String reasonPhrase() {
    return (Zw(Zt0k.NO_HTML_ANALYSIS)).ZP.ZT;
  }
  
  public boolean isStatusCodeClass(StatusCodeClass paramStatusCodeClass) {
    return paramStatusCodeClass.contains(statusCode());
  }
  
  public List<Cookie> cookies() {
    try {
      if (this.ZT == null)
        this.ZT = Zw(Zt0k.NO_HTML_ANALYSIS).ZA(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZT;
  }
  
  public Cookie cookie(String paramString) {
    List<Cookie> list = cookies();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (list == null) ? null : list.stream().filter(paramString::lambda$cookie$0).findFirst().orElse(null);
  }
  
  public String cookieValue(String paramString) {
    List<Cookie> list = cookies();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (list == null) ? null : list.stream().filter(paramString::lambda$cookie$0).findFirst().map(Cookie::value).orElse(null);
  }
  
  public boolean hasCookie(String paramString) {
    List<Cookie> list = cookies();
    try {
      if (list != null)
        try {
          if (list.stream().anyMatch(paramString::lambda$cookie$0));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean hasCookie(Cookie paramCookie) {
    List<Cookie> list = cookies();
    try {
      if (list != null)
        try {
          if (list.stream().anyMatch(paramCookie::lambda$hasCookie$3));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean ZE(Cookie paramCookie1, Cookie paramCookie2) {
    try {
      if (paramCookie1.name().equals(paramCookie2.name()))
        try {
          if (paramCookie1.value().equals(paramCookie2.value()));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public MimeType mimeType() {
    MimeType mimeType = statedMimeType();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (mimeType == MimeType.NONE) ? inferredMimeType() : mimeType;
  }
  
  public MimeType statedMimeType() {
    return Ztc3.Zp((Zw(Zt0k.NO_HTML_ANALYSIS)).ZP.ZH.ZJ);
  }
  
  public MimeType inferredMimeType() {
    return Ztc3.Zp((Zw(Zt0k.NO_HTML_ANALYSIS)).ZP.ZH.Zj);
  }
  
  public List<KeywordCount> keywordCounts(String... paramVarArgs) {
    ArrayList<Zz8l> arrayList = new ArrayList();
    String[] arrayOfString = paramVarArgs;
    boolean bool = Zsie.Zv();
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString[b];
      byte b1 = 0;
      byte[] arrayOfByte = Zkb.Zy(str);
      Zbu4 zbu4 = new Zbu4(0, 0, true);
      Zzrd zzrd = Zzrd.ZJ(arrayOfByte, true, true);
      while (zbu4.ZP()) {
        Zstu zstu = this.ZQ.ZDR();
        zbu4 = zzrd.Zi(zstu, zbu4.ZQ(), zstu.Zpu());
        try {
          if (zbu4.ZP())
            b1++; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        if (!bool)
          break; 
      } 
      byte b2 = b1;
      arrayList.add(new Zz8l(this, str, b2));
      b++;
      if (!bool)
        break; 
    } 
    return (List)arrayList;
  }
  
  public List<Attribute> attributes(AttributeType... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic burp/Zt0k.HTML_ANALYSIS : Lburp/Zt0k;
    //   4: invokevirtual Zw : (Lburp/Zt0k;)Lburp/Zezj;
    //   7: getfield ZP : Lburp/Zs68;
    //   10: astore_2
    //   11: new burp/Zm4c
    //   14: dup
    //   15: aload_0
    //   16: getfield Zm : Lburp/Zbnt;
    //   19: invokespecial <init> : (Lburp/Zbnt;)V
    //   22: invokevirtual Zn : ()Lburp/Zm4c;
    //   25: invokevirtual Zw : ()Lburp/Zlio;
    //   28: aconst_null
    //   29: aload_2
    //   30: invokevirtual ZW : (Lburp/Zski;Lburp/Zs68;)Ljava/util/List;
    //   33: astore_3
    //   34: new burp/Zk1s
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: aload_0
    //   42: getfield ZQ : Lburp/Zg0d;
    //   45: invokeinterface ZDR : ()Lburp/Zstu;
    //   50: aload_2
    //   51: invokevirtual Zx : (Lburp/Zstu;Lburp/Zs68;)Lburp/Zk1s;
    //   54: aload_3
    //   55: invokevirtual Zw : (Ljava/util/List;)Lburp/Zk1s;
    //   58: invokevirtual ZF : ()Lburp/Zs6y;
    //   61: astore #4
    //   63: new java/util/ArrayList
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: astore #5
    //   72: aload_1
    //   73: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   76: astore #6
    //   78: invokestatic values : ()[Lburp/Zlug;
    //   81: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   84: aload #6
    //   86: <illegal opcode> test : (Ljava/util/List;)Ljava/util/function/Predicate;
    //   91: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   96: aload_0
    //   97: aload #4
    //   99: aload #5
    //   101: <illegal opcode> accept : (Lburp/Zgtr;Lburp/Zs6y;Ljava/util/List;)Ljava/util/function/Consumer;
    //   106: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   111: aload #5
    //   113: areturn
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (toByteArray().indexOf(paramString, paramBoolean) != -1);
  }
  
  public boolean contains(Pattern paramPattern) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (toByteArray().indexOf(paramPattern) != -1);
  }
  
  public HttpResponse withBody(String paramString) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return withBody((paramString == null) ? null : Zsyg.Zu(paramString, this.ZN));
  }
  
  public HttpResponse withBody(ByteArray paramByteArray) {
    boolean bool = Zsie.Z_();
    try {
      if (paramByteArray == null)
        throw new IllegalArgumentException(a(20311, 28004)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = bodyOffset();
    byte[] arrayOfByte1 = this.ZQ.ZDR().ZiD();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int j = (i == -1) ? arrayOfByte1.length : i;
    byte[] arrayOfByte2 = new byte[j + paramByteArray.length()];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, j);
    System.arraycopy(paramByteArray.getBytes(), 0, arrayOfByte2, j, paramByteArray.length());
    Zyf zyf = Zyf.Zy(arrayOfByte2);
    Zstu zstu = Zgyj.Ze(zyf);
    if (Zbqc.Zwu() == null) {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Zsie.ZB(!bool);
    } 
    return new Zgtr(zstu, this.Zm, this.ZV, this.ZN);
  }
  
  public HttpResponse withAddedHeader(HttpHeader paramHttpHeader) {
    Zstu zstu = Zgyj.Zp(this.ZQ.ZDR(), paramHttpHeader.toString());
    return Zk(zstu, this.Zm, this.ZN);
  }
  
  public HttpResponse withAddedHeader(String paramString1, String paramString2) {
    return withAddedHeader(Zzn7.ZU(paramString1, paramString2));
  }
  
  public HttpResponse withAddedHeaders(List<? extends HttpHeader> paramList) {
    HttpResponse httpResponse = this;
    Iterator<? extends HttpHeader> iterator = paramList.iterator();
    boolean bool = Zsie.Z_();
    while (iterator.hasNext()) {
      HttpHeader httpHeader = iterator.next();
      httpResponse = httpResponse.withAddedHeader(httpHeader);
      if (bool)
        break; 
    } 
    return httpResponse;
  }
  
  public HttpResponse withAddedHeaders(HttpHeader... paramVarArgs) {
    return withAddedHeaders(Arrays.asList(paramVarArgs));
  }
  
  public HttpResponse withUpdatedHeader(String paramString1, String paramString2) {
    return withUpdatedHeader(Zzn7.ZU(paramString1, paramString2));
  }
  
  public HttpResponse withUpdatedHeaders(List<? extends HttpHeader> paramList) {
    HttpResponse httpResponse = this;
    Iterator<? extends HttpHeader> iterator = paramList.iterator();
    boolean bool = Zsie.Z_();
    while (iterator.hasNext()) {
      HttpHeader httpHeader = iterator.next();
      httpResponse = httpResponse.withUpdatedHeader(httpHeader);
      if (bool)
        break; 
    } 
    return httpResponse;
  }
  
  public HttpResponse withUpdatedHeaders(HttpHeader... paramVarArgs) {
    return withUpdatedHeaders(Arrays.asList(paramVarArgs));
  }
  
  public HttpResponse withUpdatedHeader(HttpHeader paramHttpHeader) {
    try {
      if (Zz(paramHttpHeader))
        return this; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zstu zstu = Zgyj.Zh(this.ZQ.ZDR(), paramHttpHeader.name(), true, paramHttpHeader.toString(), false, false);
    return Zk(zstu, this.Zm, this.ZN);
  }
  
  public HttpResponse withRemovedHeader(String paramString) {
    return withRemovedHeader(Zzn7.Zv(paramString));
  }
  
  public HttpResponse withRemovedHeaders(List<? extends HttpHeader> paramList) {
    HttpResponse httpResponse = this;
    Iterator<? extends HttpHeader> iterator = paramList.iterator();
    boolean bool = Zsie.Zv();
    while (iterator.hasNext()) {
      HttpHeader httpHeader = iterator.next();
      httpResponse = httpResponse.withRemovedHeader(httpHeader);
      if (!bool)
        break; 
    } 
    return httpResponse;
  }
  
  public HttpResponse withRemovedHeaders(HttpHeader... paramVarArgs) {
    return withRemovedHeaders(Arrays.asList(paramVarArgs));
  }
  
  public List<Marker> markers() {
    return this.ZV;
  }
  
  public HttpResponse withMarkers(List<Marker> paramList) {
    return new Zgtr(this.ZQ, this.Zm, paramList, this.ZN, false);
  }
  
  public HttpResponse withMarkers(Marker... paramVarArgs) {
    return withMarkers(List.of(paramVarArgs));
  }
  
  public HttpResponse withRemovedHeader(HttpHeader paramHttpHeader) {
    try {
      if (Zz(paramHttpHeader))
        return this; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zstu zstu = Zgyj.Zh(this.ZQ.ZDR(), paramHttpHeader.name(), true, null, false, false);
    return Zk(zstu, this.Zm, this.ZN);
  }
  
  public boolean hasHeader(HttpHeader paramHttpHeader) {
    List<HttpHeader> list = headers();
    try {
      if (list != null)
        try {
          if (list.stream().anyMatch(paramHttpHeader::lambda$hasHeader$6));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean hasHeader(String paramString) {
    List<HttpHeader> list = headers();
    try {
      if (list != null)
        try {
          if (list.stream().anyMatch(paramString::lambda$hasHeader$7));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean hasHeader(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual headers : ()Ljava/util/List;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 45
    //   9: aload_3
    //   10: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   15: aload_1
    //   16: aload_2
    //   17: <illegal opcode> test : (Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
    //   22: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   27: ifeq -> 45
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: iconst_1
    //   38: goto -> 46
    //   41: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   44: athrow
    //   45: iconst_0
    //   46: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	30	33	java/lang/IllegalArgumentException
    //   9	41	41	java/lang/IllegalArgumentException
  }
  
  public HttpHeader header(String paramString) {
    List<HttpHeader> list = headers();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (list == null) ? null : list.stream().filter(paramString::lambda$hasHeader$7).findFirst().orElse(null);
  }
  
  public String headerValue(String paramString) {
    List<HttpHeader> list = headers();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (list == null) ? null : list.stream().filter(paramString::lambda$hasHeader$7).findFirst().map(HttpHeader::value).orElse(null);
  }
  
  public synchronized List<HttpHeader> headers() {
    try {
      if (this.Zq == null)
        this.Zq = (List<HttpHeader>)Zw(Zt0k.NO_HTML_ANALYSIS).Zi().stream().skip(1L).map(Zzn7::Zv).collect(Collectors.toList()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.Zq;
  }
  
  public String httpVersion() {
    return (Zw(Zt0k.NO_HTML_ANALYSIS)).ZP.Zf;
  }
  
  public int bodyOffset() {
    return (Zw(Zt0k.NO_HTML_ANALYSIS)).ZP.Zk;
  }
  
  public ByteArray toByteArray() {
    return Zsyg.Zk(this.ZQ.ZDR().ZiD(), this.ZN);
  }
  
  public String toString() {
    return this.ZQ.ZDR().Zis();
  }
  
  public HttpResponse copyToTempFile() {
    Zg0d zg0d = Zm5l.ZT(this, this.ZN, true);
    return new Zgtr(zg0d, this.Zm, this.ZV, this.ZN, false);
  }
  
  public HttpResponse withStatusCode(short paramShort) {
    Zstu zstu = (new Zmyp(this.ZQ.ZDR())).Zw(paramShort).Ze();
    return new Zgtr(zstu, this.Zm, this.ZV, this.ZN);
  }
  
  public HttpResponse withReasonPhrase(String paramString) {
    Zstu zstu = (new Zmyp(this.ZQ.ZDR())).ZN(paramString).Ze();
    return new Zgtr(zstu, this.Zm, this.ZV, this.ZN);
  }
  
  public HttpResponse withHttpVersion(String paramString) {
    Zstu zstu = (new Zmyp(this.ZQ.ZDR())).Zb(paramString).Ze();
    return new Zgtr(zstu, this.Zm, this.ZV, this.ZN);
  }
  
  public ByteArray body() {
    int i = (Zw(Zt0k.NO_HTML_ANALYSIS)).ZP.Zk;
    Zstu zstu = this.ZQ.ZDR();
    byte[] arrayOfByte = Zmw.Zz(zstu.ZiD(), i, zstu.Zpu());
    return Zsyg.Zk(arrayOfByte, this.ZN);
  }
  
  public String bodyToString() {
    return body().toString();
  }
  
  boolean Zv() {
    return this.Zf;
  }
  
  private boolean Zz(HttpHeader paramHttpHeader) {
    return headers().stream().noneMatch(paramHttpHeader::lambda$headerDoesNotExist$11);
  }
  
  private synchronized Zezj Zw(Zt0k paramZt0k) {
    try {
      if (this.ZR.Z_())
        return this.ZR; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zs68 zs68 = Zbwc.Zr(null, this.ZQ.ZDR(), paramZt0k, true, true, this.Zm, Zgtr::lambda$analysedResponseData$12);
    this.ZR = new Zezj(zs68);
    return this.ZR;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zgtr zgtr = (Zgtr)paramObject;
    try {
      if (Objects.equals(this.ZQ, zgtr.ZQ))
        try {
          if (Objects.equals(this.ZV, zgtr.ZV));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZQ, this.ZV });
  }
  
  static Zgtr ZW(byte[] paramArrayOfbyte, Zbnt paramZbnt, Zr_4 paramZr_4) {
    try {
      if (paramArrayOfbyte == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zgtr(Zyf.Zy(paramArrayOfbyte), paramZbnt, Collections.emptyList(), paramZr_4);
  }
  
  static Zgtr Zk(Zstu paramZstu, Zbnt paramZbnt, Zr_4 paramZr_4) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zgtr(paramZstu, paramZbnt, Collections.emptyList(), paramZr_4);
  }
  
  static HttpResponse Zs(ByteArray paramByteArray, Zbnt paramZbnt, Zr_4 paramZr_4) {
    try {
      if (paramByteArray == null)
        throw new IllegalArgumentException(a(20309, 25740)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zx(paramByteArray.getBytes(), paramZbnt, paramZr_4);
  }
  
  static HttpResponse Zx(byte[] paramArrayOfbyte, Zbnt paramZbnt, Zr_4 paramZr_4) {
    try {
      if (paramArrayOfbyte == null)
        throw new IllegalArgumentException(a(20308, -12546)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZW(paramArrayOfbyte, paramZbnt, paramZr_4);
  }
  
  static HttpResponse ZV(String paramString, Zbnt paramZbnt, Zr_4 paramZr_4) {
    return Zx(Zkb.Zy(paramString), paramZbnt, paramZr_4);
  }
  
  static Zgtr Zr(Zg0d paramZg0d, Zbnt paramZbnt, Zr_4 paramZr_4) {
    try {
      if (paramZg0d == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zgtr(paramZg0d, paramZbnt, Collections.emptyList(), paramZr_4, true);
  }
  
  private static Boolean lambda$analysedResponseData$12() {
    return Boolean.valueOf(false);
  }
  
  private static boolean lambda$headerDoesNotExist$11(HttpHeader paramHttpHeader1, HttpHeader paramHttpHeader2) {
    return paramHttpHeader2.name().equals(paramHttpHeader1.name());
  }
  
  private static boolean lambda$hasHeader$8(String paramString1, String paramString2, HttpHeader paramHttpHeader) {
    try {
      if (paramHttpHeader.name().equalsIgnoreCase(paramString1))
        try {
          if (paramHttpHeader.value().equals(paramString2));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean lambda$hasHeader$7(String paramString, HttpHeader paramHttpHeader) {
    return paramHttpHeader.name().equalsIgnoreCase(paramString);
  }
  
  private static boolean lambda$hasHeader$6(HttpHeader paramHttpHeader1, HttpHeader paramHttpHeader2) {
    return paramHttpHeader2.equals(paramHttpHeader1);
  }
  
  private void lambda$attributes$5(Zs6y paramZs6y, List<Zlgn> paramList, Zlug paramZlug) {
    AttributeType attributeType = paramZlug.montoyaAttributeType;
    int i = paramZs6y.Zi(paramZlug);
    paramList.add(new Zlgn(this, attributeType, i));
  }
  
  private static boolean lambda$attributes$4(List paramList, Zlug paramZlug) {
    return paramList.contains(paramZlug.montoyaAttributeType);
  }
  
  private static boolean lambda$hasCookie$3(Cookie paramCookie1, Cookie paramCookie2) {
    return ZE(paramCookie2, paramCookie1);
  }
  
  private static boolean lambda$cookie$0(String paramString, Cookie paramCookie) {
    return paramCookie.name().equals(paramString);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '7*ã·Ã%-ÿÔsÅ"ÌMá¡þ`êó«Øq¤LÉ6g³¯V}×82}yõË ãÖ{\\f§UÃxí*ü^Ò'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #23
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #42
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zgtr.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zgtr.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #56
    //   154: goto -> 184
    //   157: bipush #42
    //   159: goto -> 184
    //   162: bipush #120
    //   164: goto -> 184
    //   167: bipush #53
    //   169: goto -> 184
    //   172: bipush #22
    //   174: goto -> 184
    //   177: bipush #102
    //   179: goto -> 184
    //   182: bipush #62
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: new burp/Zruo
    //   230: dup
    //   231: invokespecial <init> : ()V
    //   234: putstatic burp/Zgtr.Zd : Lburp/Zruo;
    //   237: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4F55) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgtr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */