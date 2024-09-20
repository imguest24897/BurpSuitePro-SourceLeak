package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Marker;
import burp.api.montoya.http.message.Cookie;
import burp.api.montoya.http.message.HttpHeader;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.StatusCodeClass;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.message.responses.analysis.Attribute;
import burp.api.montoya.http.message.responses.analysis.AttributeType;
import burp.api.montoya.http.message.responses.analysis.KeywordCount;
import burp.api.montoya.proxy.http.InterceptedHttpMessage;
import burp.api.montoya.proxy.http.InterceptedResponse;
import java.net.InetAddress;
import java.util.List;
import java.util.regex.Pattern;

public class Zkcc implements InterceptedResponse, Proxyable {
  private final HttpResponse ZU;
  
  private final InterceptedHttpMessage ZB;
  
  private final HttpRequest Zd;
  
  private final Annotations ZT;
  
  private static final String a;
  
  public Zkcc(HttpResponse paramHttpResponse, InterceptedHttpMessage paramInterceptedHttpMessage, HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    this.ZU = paramHttpResponse;
    this.ZB = paramInterceptedHttpMessage;
    this.Zd = paramHttpRequest;
    this.ZT = paramAnnotations;
  }
  
  public HttpRequest request() {
    return initiatingRequest();
  }
  
  public HttpRequest initiatingRequest() {
    return this.Zd;
  }
  
  public Annotations annotations() {
    return this.ZT;
  }
  
  public short statusCode() {
    return this.ZU.statusCode();
  }
  
  public String reasonPhrase() {
    return this.ZU.reasonPhrase();
  }
  
  public boolean isStatusCodeClass(StatusCodeClass paramStatusCodeClass) {
    return this.ZU.isStatusCodeClass(paramStatusCodeClass);
  }
  
  public List<Cookie> cookies() {
    return this.ZU.cookies();
  }
  
  public Cookie cookie(String paramString) {
    return this.ZU.cookie(paramString);
  }
  
  public String cookieValue(String paramString) {
    return this.ZU.cookieValue(paramString);
  }
  
  public boolean hasCookie(String paramString) {
    return this.ZU.hasCookie(paramString);
  }
  
  public boolean hasCookie(Cookie paramCookie) {
    return this.ZU.hasCookie(paramCookie);
  }
  
  public MimeType mimeType() {
    return this.ZU.mimeType();
  }
  
  public MimeType statedMimeType() {
    return this.ZU.statedMimeType();
  }
  
  public MimeType inferredMimeType() {
    return this.ZU.inferredMimeType();
  }
  
  public List<KeywordCount> keywordCounts(String... paramVarArgs) {
    return this.ZU.keywordCounts(paramVarArgs);
  }
  
  public List<Attribute> attributes(AttributeType... paramVarArgs) {
    return this.ZU.attributes(paramVarArgs);
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    return this.ZU.contains(paramString, paramBoolean);
  }
  
  public boolean contains(Pattern paramPattern) {
    return this.ZU.contains(paramPattern);
  }
  
  public HttpResponse withBody(String paramString) {
    return this.ZU.withBody(paramString);
  }
  
  public HttpResponse withBody(ByteArray paramByteArray) {
    return this.ZU.withBody(paramByteArray);
  }
  
  public HttpResponse withAddedHeader(HttpHeader paramHttpHeader) {
    return this.ZU.withAddedHeader(paramHttpHeader);
  }
  
  public HttpResponse withAddedHeader(String paramString1, String paramString2) {
    return this.ZU.withAddedHeader(paramString1, paramString2);
  }
  
  public HttpResponse withAddedHeaders(List<? extends HttpHeader> paramList) {
    return this.ZU.withAddedHeaders(paramList);
  }
  
  public HttpResponse withAddedHeaders(HttpHeader... paramVarArgs) {
    return this.ZU.withAddedHeaders(paramVarArgs);
  }
  
  public HttpResponse withUpdatedHeader(HttpHeader paramHttpHeader) {
    return this.ZU.withUpdatedHeader(paramHttpHeader);
  }
  
  public HttpResponse withUpdatedHeader(String paramString1, String paramString2) {
    return this.ZU.withUpdatedHeader(paramString1, paramString2);
  }
  
  public HttpResponse withUpdatedHeaders(List<? extends HttpHeader> paramList) {
    return this.ZU.withUpdatedHeaders(paramList);
  }
  
  public HttpResponse withUpdatedHeaders(HttpHeader... paramVarArgs) {
    return this.ZU.withUpdatedHeaders(paramVarArgs);
  }
  
  public HttpResponse withRemovedHeader(HttpHeader paramHttpHeader) {
    return this.ZU.withRemovedHeader(paramHttpHeader);
  }
  
  public HttpResponse withRemovedHeader(String paramString) {
    return this.ZU.withRemovedHeader(paramString);
  }
  
  public HttpResponse withRemovedHeaders(List<? extends HttpHeader> paramList) {
    return this.ZU.withRemovedHeaders(paramList);
  }
  
  public HttpResponse withRemovedHeaders(HttpHeader... paramVarArgs) {
    return this.ZU.withRemovedHeaders(paramVarArgs);
  }
  
  public List<Marker> markers() {
    return this.ZU.markers();
  }
  
  public HttpResponse withMarkers(List<Marker> paramList) {
    return this.ZU.withMarkers(paramList);
  }
  
  public HttpResponse withMarkers(Marker... paramVarArgs) {
    return this.ZU.withMarkers(paramVarArgs);
  }
  
  public List<HttpHeader> headers() {
    return this.ZU.headers();
  }
  
  public boolean hasHeader(HttpHeader paramHttpHeader) {
    return this.ZU.hasHeader(paramHttpHeader);
  }
  
  public boolean hasHeader(String paramString) {
    return this.ZU.hasHeader(paramString);
  }
  
  public boolean hasHeader(String paramString1, String paramString2) {
    return this.ZU.hasHeader(paramString1, paramString2);
  }
  
  public HttpHeader header(String paramString) {
    return this.ZU.header(paramString);
  }
  
  public String headerValue(String paramString) {
    return this.ZU.headerValue(paramString);
  }
  
  public String httpVersion() {
    return this.ZU.httpVersion();
  }
  
  public int bodyOffset() {
    return this.ZU.bodyOffset();
  }
  
  public ByteArray toByteArray() {
    return this.ZU.toByteArray();
  }
  
  public String toString() {
    return this.ZU.toString();
  }
  
  public HttpResponse copyToTempFile() {
    return this.ZU.copyToTempFile();
  }
  
  public HttpResponse withStatusCode(short paramShort) {
    return null;
  }
  
  public HttpResponse withReasonPhrase(String paramString) {
    return null;
  }
  
  public HttpResponse withHttpVersion(String paramString) {
    return null;
  }
  
  public ByteArray body() {
    return this.ZU.body();
  }
  
  public String bodyToString() {
    return this.ZU.bodyToString();
  }
  
  public int messageId() {
    return this.ZB.messageId();
  }
  
  public String listenerInterface() {
    return this.ZB.listenerInterface();
  }
  
  public InetAddress sourceIpAddress() {
    throw new UnsupportedOperationException(a);
  }
  
  public InetAddress destinationIpAddress() {
    return this.ZB.destinationIpAddress();
  }
  
  public HttpResponse ZN() {
    return this.ZU;
  }
  
  static {
    // Byte code:
    //   0: bipush #53
    //   2: ldc 'tI7evjPgpvs_Irx'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkcc.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #15
    //   82: goto -> 112
    //   85: bipush #69
    //   87: goto -> 112
    //   90: bipush #8
    //   92: goto -> 112
    //   95: bipush #34
    //   97: goto -> 112
    //   100: bipush #41
    //   102: goto -> 112
    //   105: bipush #38
    //   107: goto -> 112
    //   110: bipush #43
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkcc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */