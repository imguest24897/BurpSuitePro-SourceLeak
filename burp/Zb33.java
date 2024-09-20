package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Marker;
import burp.api.montoya.core.ToolSource;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.handler.HttpRequestToBeSent;
import burp.api.montoya.http.message.ContentType;
import burp.api.montoya.http.message.HttpHeader;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.params.HttpParameterType;
import burp.api.montoya.http.message.params.ParsedHttpParameter;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.requests.HttpTransformation;
import java.util.List;
import java.util.regex.Pattern;

public class Zb33 implements HttpRequestToBeSent, Zztj, Proxyable {
  private final int Ze;
  
  private final Zztj ZA;
  
  private final Annotations Zi;
  
  private final ToolSource ZR;
  
  public Zb33(int paramInt, Zztj paramZztj, Annotations paramAnnotations, ToolSource paramToolSource) {
    this.Ze = paramInt;
    this.ZA = paramZztj;
    this.Zi = paramAnnotations;
    this.ZR = paramToolSource;
  }
  
  public int messageId() {
    return this.Ze;
  }
  
  public Annotations annotations() {
    return this.Zi;
  }
  
  public ToolSource toolSource() {
    return this.ZR;
  }
  
  public boolean isInScope() {
    return this.ZA.isInScope();
  }
  
  public HttpService httpService() {
    return this.ZA.httpService();
  }
  
  public String url() {
    return this.ZA.url();
  }
  
  public String method() {
    return this.ZA.method();
  }
  
  public String path() {
    return this.ZA.path();
  }
  
  public String query() {
    return this.ZA.query();
  }
  
  public String pathWithoutQuery() {
    return this.ZA.pathWithoutQuery();
  }
  
  public String fileExtension() {
    return this.ZA.fileExtension();
  }
  
  public String httpVersion() {
    return this.ZA.httpVersion();
  }
  
  public List<HttpHeader> headers() {
    return this.ZA.headers();
  }
  
  public boolean hasHeader(HttpHeader paramHttpHeader) {
    return this.ZA.hasHeader(paramHttpHeader);
  }
  
  public boolean hasHeader(String paramString) {
    return this.ZA.hasHeader(paramString);
  }
  
  public boolean hasHeader(String paramString1, String paramString2) {
    return this.ZA.hasHeader(paramString1, paramString2);
  }
  
  public HttpHeader header(String paramString) {
    return this.ZA.header(paramString);
  }
  
  public String headerValue(String paramString) {
    return this.ZA.headerValue(paramString);
  }
  
  public ContentType contentType() {
    return this.ZA.contentType();
  }
  
  public List<ParsedHttpParameter> parameters() {
    return this.ZA.parameters();
  }
  
  public List<ParsedHttpParameter> parameters(HttpParameterType paramHttpParameterType) {
    return this.ZA.parameters(paramHttpParameterType);
  }
  
  public boolean hasParameters() {
    return this.ZA.hasParameters();
  }
  
  public boolean hasParameters(HttpParameterType paramHttpParameterType) {
    return this.ZA.hasParameters(paramHttpParameterType);
  }
  
  public ParsedHttpParameter parameter(String paramString, HttpParameterType paramHttpParameterType) {
    return this.ZA.parameter(paramString, paramHttpParameterType);
  }
  
  public String parameterValue(String paramString, HttpParameterType paramHttpParameterType) {
    return this.ZA.parameterValue(paramString, paramHttpParameterType);
  }
  
  public boolean hasParameter(String paramString, HttpParameterType paramHttpParameterType) {
    return this.ZA.hasParameter(paramString, paramHttpParameterType);
  }
  
  public boolean hasParameter(HttpParameter paramHttpParameter) {
    return this.ZA.hasParameter(paramHttpParameter);
  }
  
  public ByteArray body() {
    return this.ZA.body();
  }
  
  public String bodyToString() {
    return this.ZA.bodyToString();
  }
  
  public int bodyOffset() {
    return this.ZA.bodyOffset();
  }
  
  public List<Marker> markers() {
    return this.ZA.markers();
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    return false;
  }
  
  public boolean contains(Pattern paramPattern) {
    return false;
  }
  
  public ByteArray toByteArray() {
    return this.ZA.toByteArray();
  }
  
  public String toString() {
    return this.ZA.toString();
  }
  
  public HttpRequest copyToTempFile() {
    return this.ZA.copyToTempFile();
  }
  
  public HttpRequest withService(HttpService paramHttpService) {
    return this.ZA.withService(paramHttpService);
  }
  
  public HttpRequest withPath(String paramString) {
    return this.ZA.withPath(paramString);
  }
  
  public HttpRequest withMethod(String paramString) {
    return this.ZA.withMethod(paramString);
  }
  
  public HttpRequest withHeader(HttpHeader paramHttpHeader) {
    return this.ZA.withHeader(paramHttpHeader);
  }
  
  public HttpRequest withHeader(String paramString1, String paramString2) {
    return this.ZA.withHeader(paramString1, paramString2);
  }
  
  public HttpRequest withParameter(HttpParameter paramHttpParameter) {
    return this.ZA.withParameter(paramHttpParameter);
  }
  
  public HttpRequest withAddedParameters(List<? extends HttpParameter> paramList) {
    return this.ZA.withAddedParameters(paramList);
  }
  
  public HttpRequest withAddedParameters(HttpParameter... paramVarArgs) {
    return this.ZA.withAddedParameters(paramVarArgs);
  }
  
  public HttpRequest withRemovedParameters(List<? extends HttpParameter> paramList) {
    return this.ZA.withRemovedParameters(paramList);
  }
  
  public HttpRequest withRemovedParameters(HttpParameter... paramVarArgs) {
    return this.ZA.withRemovedParameters(paramVarArgs);
  }
  
  public HttpRequest withUpdatedParameters(List<? extends HttpParameter> paramList) {
    return this.ZA.withUpdatedParameters(paramList);
  }
  
  public HttpRequest withUpdatedParameters(HttpParameter... paramVarArgs) {
    return this.ZA.withUpdatedParameters(paramVarArgs);
  }
  
  public HttpRequest withTransformationApplied(HttpTransformation paramHttpTransformation) {
    return this.ZA.withTransformationApplied(paramHttpTransformation);
  }
  
  public HttpRequest withBody(String paramString) {
    return this.ZA.withBody(paramString);
  }
  
  public HttpRequest withBody(ByteArray paramByteArray) {
    return this.ZA.withBody(paramByteArray);
  }
  
  public HttpRequest withAddedHeader(String paramString1, String paramString2) {
    return this.ZA.withAddedHeader(paramString1, paramString2);
  }
  
  public HttpRequest withAddedHeader(HttpHeader paramHttpHeader) {
    return this.ZA.withAddedHeader(paramHttpHeader);
  }
  
  public HttpRequest withAddedHeaders(List<? extends HttpHeader> paramList) {
    return this.ZA.withAddedHeaders(paramList);
  }
  
  public HttpRequest withAddedHeaders(HttpHeader... paramVarArgs) {
    return this.ZA.withAddedHeaders(paramVarArgs);
  }
  
  public HttpRequest withUpdatedHeader(String paramString1, String paramString2) {
    return this.ZA.withUpdatedHeader(paramString1, paramString2);
  }
  
  public HttpRequest withUpdatedHeader(HttpHeader paramHttpHeader) {
    return this.ZA.withUpdatedHeader(paramHttpHeader);
  }
  
  public HttpRequest withUpdatedHeaders(List<? extends HttpHeader> paramList) {
    return this.ZA.withUpdatedHeaders(paramList);
  }
  
  public HttpRequest withUpdatedHeaders(HttpHeader... paramVarArgs) {
    return this.ZA.withUpdatedHeaders(paramVarArgs);
  }
  
  public HttpRequest withRemovedHeader(String paramString) {
    return this.ZA.withRemovedHeader(paramString);
  }
  
  public HttpRequest withRemovedHeader(HttpHeader paramHttpHeader) {
    return this.ZA.withRemovedHeader(paramHttpHeader);
  }
  
  public HttpRequest withRemovedHeaders(List<? extends HttpHeader> paramList) {
    return this.ZA.withRemovedHeaders(paramList);
  }
  
  public HttpRequest withRemovedHeaders(HttpHeader... paramVarArgs) {
    return this.ZA.withRemovedHeaders(paramVarArgs);
  }
  
  public HttpRequest withMarkers(List<Marker> paramList) {
    return this.ZA.withMarkers(paramList);
  }
  
  public HttpRequest withMarkers(Marker... paramVarArgs) {
    return this.ZA.withMarkers(paramVarArgs);
  }
  
  public HttpRequest withDefaultHeaders() {
    return this.ZA.withDefaultHeaders();
  }
  
  public Zztj ZG(Zr_4 paramZr_4) {
    return this.ZA.ZG(paramZr_4);
  }
  
  public Zelu Zx() {
    return this.ZA.Zx();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb33.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */