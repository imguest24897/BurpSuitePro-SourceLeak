package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Marker;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.ContentType;
import burp.api.montoya.http.message.HttpHeader;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.params.HttpParameterType;
import burp.api.montoya.http.message.params.ParsedHttpParameter;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.requests.HttpTransformation;
import burp.api.montoya.proxy.http.InterceptedHttpMessage;
import burp.api.montoya.proxy.http.InterceptedRequest;
import java.net.InetAddress;
import java.util.List;
import java.util.regex.Pattern;

public class Zs5r implements InterceptedRequest, Zztj, Proxyable {
  private final Zztj Zn;
  
  private final InterceptedHttpMessage Zi;
  
  private final Annotations ZH;
  
  private static final String a;
  
  public Zs5r(Zztj paramZztj, InterceptedHttpMessage paramInterceptedHttpMessage, Annotations paramAnnotations) {
    this.Zn = paramZztj;
    this.Zi = paramInterceptedHttpMessage;
    this.ZH = paramAnnotations;
  }
  
  public Annotations annotations() {
    return this.ZH;
  }
  
  public boolean isInScope() {
    return this.Zn.isInScope();
  }
  
  public HttpService httpService() {
    return this.Zn.httpService();
  }
  
  public String method() {
    return this.Zn.method();
  }
  
  public String path() {
    return this.Zn.path();
  }
  
  public String query() {
    return this.Zn.query();
  }
  
  public String pathWithoutQuery() {
    return this.Zn.pathWithoutQuery();
  }
  
  public String fileExtension() {
    return this.Zn.fileExtension();
  }
  
  public String url() {
    return this.Zn.url();
  }
  
  public ContentType contentType() {
    return this.Zn.contentType();
  }
  
  public List<ParsedHttpParameter> parameters() {
    return this.Zn.parameters();
  }
  
  public List<ParsedHttpParameter> parameters(HttpParameterType paramHttpParameterType) {
    return this.Zn.parameters(paramHttpParameterType);
  }
  
  public boolean hasParameters() {
    return this.Zn.hasParameters();
  }
  
  public boolean hasParameters(HttpParameterType paramHttpParameterType) {
    return this.Zn.hasParameters(paramHttpParameterType);
  }
  
  public ParsedHttpParameter parameter(String paramString, HttpParameterType paramHttpParameterType) {
    return this.Zn.parameter(paramString, paramHttpParameterType);
  }
  
  public String parameterValue(String paramString, HttpParameterType paramHttpParameterType) {
    return this.Zn.parameterValue(paramString, paramHttpParameterType);
  }
  
  public boolean hasParameter(String paramString, HttpParameterType paramHttpParameterType) {
    return this.Zn.hasParameter(paramString, paramHttpParameterType);
  }
  
  public boolean hasParameter(HttpParameter paramHttpParameter) {
    return this.Zn.hasParameter(paramHttpParameter);
  }
  
  public HttpRequest withService(HttpService paramHttpService) {
    return this.Zn.withService(paramHttpService);
  }
  
  public HttpRequest withPath(String paramString) {
    return this.Zn.withPath(paramString);
  }
  
  public HttpRequest withMethod(String paramString) {
    return this.Zn.withMethod(paramString);
  }
  
  public HttpRequest withHeader(HttpHeader paramHttpHeader) {
    return this.Zn.withHeader(paramHttpHeader);
  }
  
  public HttpRequest withHeader(String paramString1, String paramString2) {
    return this.Zn.withHeader(paramString1, paramString2);
  }
  
  public HttpRequest withParameter(HttpParameter paramHttpParameter) {
    return this.Zn.withParameter(paramHttpParameter);
  }
  
  public HttpRequest withAddedParameters(List<? extends HttpParameter> paramList) {
    return this.Zn.withAddedParameters(paramList);
  }
  
  public HttpRequest withAddedParameters(HttpParameter... paramVarArgs) {
    return this.Zn.withAddedParameters(paramVarArgs);
  }
  
  public HttpRequest withRemovedParameters(List<? extends HttpParameter> paramList) {
    return this.Zn.withRemovedParameters(paramList);
  }
  
  public HttpRequest withRemovedParameters(HttpParameter... paramVarArgs) {
    return this.Zn.withRemovedParameters(paramVarArgs);
  }
  
  public HttpRequest withUpdatedParameters(List<? extends HttpParameter> paramList) {
    return this.Zn.withUpdatedParameters(paramList);
  }
  
  public HttpRequest withUpdatedParameters(HttpParameter... paramVarArgs) {
    return this.Zn.withUpdatedParameters(paramVarArgs);
  }
  
  public HttpRequest withTransformationApplied(HttpTransformation paramHttpTransformation) {
    return this.Zn.withTransformationApplied(paramHttpTransformation);
  }
  
  public HttpRequest withBody(String paramString) {
    return this.Zn.withBody(paramString);
  }
  
  public HttpRequest withBody(ByteArray paramByteArray) {
    return this.Zn.withBody(paramByteArray);
  }
  
  public HttpRequest withAddedHeader(String paramString1, String paramString2) {
    return this.Zn.withAddedHeader(paramString1, paramString2);
  }
  
  public List<HttpHeader> headers() {
    return this.Zn.headers();
  }
  
  public boolean hasHeader(HttpHeader paramHttpHeader) {
    return this.Zn.hasHeader(paramHttpHeader);
  }
  
  public boolean hasHeader(String paramString) {
    return this.Zn.hasHeader(paramString);
  }
  
  public boolean hasHeader(String paramString1, String paramString2) {
    return this.Zn.hasHeader(paramString1, paramString2);
  }
  
  public HttpHeader header(String paramString) {
    return this.Zn.header(paramString);
  }
  
  public String headerValue(String paramString) {
    return this.Zn.headerValue(paramString);
  }
  
  public String httpVersion() {
    return this.Zn.httpVersion();
  }
  
  public HttpRequest withAddedHeader(HttpHeader paramHttpHeader) {
    return this.Zn.withAddedHeader(paramHttpHeader);
  }
  
  public HttpRequest withAddedHeaders(List<? extends HttpHeader> paramList) {
    return this.Zn.withAddedHeaders(paramList);
  }
  
  public HttpRequest withAddedHeaders(HttpHeader... paramVarArgs) {
    return this.Zn.withAddedHeaders(paramVarArgs);
  }
  
  public HttpRequest withUpdatedHeader(String paramString1, String paramString2) {
    return this.Zn.withUpdatedHeader(paramString1, paramString2);
  }
  
  public HttpRequest withUpdatedHeader(HttpHeader paramHttpHeader) {
    return this.Zn.withUpdatedHeader(paramHttpHeader);
  }
  
  public HttpRequest withUpdatedHeaders(List<? extends HttpHeader> paramList) {
    return this.Zn.withUpdatedHeaders(paramList);
  }
  
  public HttpRequest withUpdatedHeaders(HttpHeader... paramVarArgs) {
    return this.Zn.withUpdatedHeaders(paramVarArgs);
  }
  
  public HttpRequest withRemovedHeader(String paramString) {
    return this.Zn.withRemovedHeader(paramString);
  }
  
  public HttpRequest withRemovedHeader(HttpHeader paramHttpHeader) {
    return this.Zn.withRemovedHeader(paramHttpHeader);
  }
  
  public HttpRequest withRemovedHeaders(List<? extends HttpHeader> paramList) {
    return this.Zn.withRemovedHeaders(paramList);
  }
  
  public HttpRequest withRemovedHeaders(HttpHeader... paramVarArgs) {
    return this.Zn.withRemovedHeaders(paramVarArgs);
  }
  
  public List<Marker> markers() {
    return this.Zn.markers();
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    return this.Zn.contains(paramString, paramBoolean);
  }
  
  public boolean contains(Pattern paramPattern) {
    return this.Zn.contains(paramPattern);
  }
  
  public HttpRequest withMarkers(List<Marker> paramList) {
    return this.Zn.withMarkers(paramList);
  }
  
  public HttpRequest withMarkers(Marker... paramVarArgs) {
    return this.Zn.withMarkers(paramVarArgs);
  }
  
  public HttpRequest withDefaultHeaders() {
    return this.Zn.withDefaultHeaders();
  }
  
  public int bodyOffset() {
    return this.Zn.bodyOffset();
  }
  
  public ByteArray toByteArray() {
    return this.Zn.toByteArray();
  }
  
  public String toString() {
    return this.Zn.toString();
  }
  
  public HttpRequest copyToTempFile() {
    return this.Zn.copyToTempFile();
  }
  
  public ByteArray body() {
    return this.Zn.body();
  }
  
  public String bodyToString() {
    return this.Zn.bodyToString();
  }
  
  public int messageId() {
    return this.Zi.messageId();
  }
  
  public String listenerInterface() {
    return this.Zi.listenerInterface();
  }
  
  public InetAddress sourceIpAddress() {
    return this.Zi.sourceIpAddress();
  }
  
  public InetAddress destinationIpAddress() {
    throw new UnsupportedOperationException(a);
  }
  
  public Zztj ZG(Zr_4 paramZr_4) {
    return this.Zn.ZG(paramZr_4);
  }
  
  public Zelu Zx() {
    return this.Zn.Zx();
  }
  
  static {
    // Byte code:
    //   0: bipush #38
    //   2: ldc 'rnp.h>hi~\\bh'Yopk '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs5r.a : Ljava/lang/String;
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
    //   80: bipush #26
    //   82: goto -> 112
    //   85: bipush #39
    //   87: goto -> 112
    //   90: bipush #34
    //   92: goto -> 112
    //   95: bipush #40
    //   97: goto -> 112
    //   100: bipush #66
    //   102: goto -> 112
    //   105: bipush #43
    //   107: goto -> 112
    //   110: bipush #108
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */