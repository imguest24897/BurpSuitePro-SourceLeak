package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Marker;
import burp.api.montoya.core.ToolSource;
import burp.api.montoya.http.handler.HttpResponseReceived;
import burp.api.montoya.http.message.Cookie;
import burp.api.montoya.http.message.HttpHeader;
import burp.api.montoya.http.message.MimeType;
import burp.api.montoya.http.message.StatusCodeClass;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.message.responses.analysis.Attribute;
import burp.api.montoya.http.message.responses.analysis.AttributeType;
import burp.api.montoya.http.message.responses.analysis.KeywordCount;
import java.util.List;
import java.util.regex.Pattern;

public class Zske implements HttpResponseReceived, Proxyable {
  private final int ZW;
  
  private final HttpResponse Zh;
  
  private final HttpRequest ZA;
  
  private final Annotations ZV;
  
  private final ToolSource ZH;
  
  public Zske(int paramInt, HttpResponse paramHttpResponse, HttpRequest paramHttpRequest, Annotations paramAnnotations, ToolSource paramToolSource) {
    this.ZW = paramInt;
    this.Zh = paramHttpResponse;
    this.ZA = paramHttpRequest;
    this.ZV = paramAnnotations;
    this.ZH = paramToolSource;
  }
  
  public int messageId() {
    return this.ZW;
  }
  
  public HttpRequest initiatingRequest() {
    return this.ZA;
  }
  
  public Annotations annotations() {
    return this.ZV;
  }
  
  public ToolSource toolSource() {
    return this.ZH;
  }
  
  public short statusCode() {
    return this.Zh.statusCode();
  }
  
  public String reasonPhrase() {
    return this.Zh.reasonPhrase();
  }
  
  public boolean isStatusCodeClass(StatusCodeClass paramStatusCodeClass) {
    return this.Zh.isStatusCodeClass(paramStatusCodeClass);
  }
  
  public String httpVersion() {
    return this.Zh.httpVersion();
  }
  
  public List<HttpHeader> headers() {
    return this.Zh.headers();
  }
  
  public boolean hasHeader(HttpHeader paramHttpHeader) {
    return this.Zh.hasHeader(paramHttpHeader);
  }
  
  public boolean hasHeader(String paramString) {
    return this.Zh.hasHeader(paramString);
  }
  
  public boolean hasHeader(String paramString1, String paramString2) {
    return this.Zh.hasHeader(paramString1, paramString2);
  }
  
  public HttpHeader header(String paramString) {
    return this.Zh.header(paramString);
  }
  
  public String headerValue(String paramString) {
    return this.Zh.headerValue(paramString);
  }
  
  public ByteArray body() {
    return this.Zh.body();
  }
  
  public String bodyToString() {
    return this.Zh.bodyToString();
  }
  
  public int bodyOffset() {
    return this.Zh.bodyOffset();
  }
  
  public List<Marker> markers() {
    return this.Zh.markers();
  }
  
  public List<Cookie> cookies() {
    return this.Zh.cookies();
  }
  
  public Cookie cookie(String paramString) {
    return this.Zh.cookie(paramString);
  }
  
  public String cookieValue(String paramString) {
    return this.Zh.cookieValue(paramString);
  }
  
  public boolean hasCookie(String paramString) {
    return this.Zh.hasCookie(paramString);
  }
  
  public boolean hasCookie(Cookie paramCookie) {
    return this.Zh.hasCookie(paramCookie);
  }
  
  public MimeType mimeType() {
    return this.Zh.mimeType();
  }
  
  public MimeType statedMimeType() {
    return this.Zh.statedMimeType();
  }
  
  public MimeType inferredMimeType() {
    return this.Zh.inferredMimeType();
  }
  
  public List<KeywordCount> keywordCounts(String... paramVarArgs) {
    return this.Zh.keywordCounts(paramVarArgs);
  }
  
  public List<Attribute> attributes(AttributeType... paramVarArgs) {
    return this.Zh.attributes(paramVarArgs);
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    return this.Zh.contains(paramString, paramBoolean);
  }
  
  public boolean contains(Pattern paramPattern) {
    return this.Zh.contains(paramPattern);
  }
  
  public ByteArray toByteArray() {
    return this.Zh.toByteArray();
  }
  
  public String toString() {
    return this.Zh.toString();
  }
  
  public HttpResponse copyToTempFile() {
    return this.Zh.copyToTempFile();
  }
  
  public HttpResponse withStatusCode(short paramShort) {
    return this.Zh.withStatusCode(paramShort);
  }
  
  public HttpResponse withReasonPhrase(String paramString) {
    return this.Zh.withReasonPhrase(paramString);
  }
  
  public HttpResponse withHttpVersion(String paramString) {
    return this.Zh.withHttpVersion(paramString);
  }
  
  public HttpResponse withBody(String paramString) {
    return this.Zh.withBody(paramString);
  }
  
  public HttpResponse withBody(ByteArray paramByteArray) {
    return this.Zh.withBody(paramByteArray);
  }
  
  public HttpResponse withAddedHeader(HttpHeader paramHttpHeader) {
    return this.Zh.withAddedHeader(paramHttpHeader);
  }
  
  public HttpResponse withAddedHeader(String paramString1, String paramString2) {
    return this.Zh.withAddedHeader(paramString1, paramString2);
  }
  
  public HttpResponse withAddedHeaders(List<? extends HttpHeader> paramList) {
    return this.Zh.withAddedHeaders(paramList);
  }
  
  public HttpResponse withAddedHeaders(HttpHeader... paramVarArgs) {
    return this.Zh.withAddedHeaders(paramVarArgs);
  }
  
  public HttpResponse withUpdatedHeader(HttpHeader paramHttpHeader) {
    return this.Zh.withUpdatedHeader(paramHttpHeader);
  }
  
  public HttpResponse withUpdatedHeader(String paramString1, String paramString2) {
    return this.Zh.withUpdatedHeader(paramString1, paramString2);
  }
  
  public HttpResponse withUpdatedHeaders(List<? extends HttpHeader> paramList) {
    return this.Zh.withUpdatedHeaders(paramList);
  }
  
  public HttpResponse withUpdatedHeaders(HttpHeader... paramVarArgs) {
    return this.Zh.withUpdatedHeaders(paramVarArgs);
  }
  
  public HttpResponse withRemovedHeader(HttpHeader paramHttpHeader) {
    return this.Zh.withRemovedHeader(paramHttpHeader);
  }
  
  public HttpResponse withRemovedHeader(String paramString) {
    return this.Zh.withRemovedHeader(paramString);
  }
  
  public HttpResponse withRemovedHeaders(List<? extends HttpHeader> paramList) {
    return this.Zh.withRemovedHeaders(paramList);
  }
  
  public HttpResponse withRemovedHeaders(HttpHeader... paramVarArgs) {
    return this.Zh.withRemovedHeaders(paramVarArgs);
  }
  
  public HttpResponse withMarkers(List<Marker> paramList) {
    return this.Zh.withMarkers(paramList);
  }
  
  public HttpResponse withMarkers(Marker... paramVarArgs) {
    return this.Zh.withMarkers(paramVarArgs);
  }
  
  public HttpResponse ZB() {
    return this.Zh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zske.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */