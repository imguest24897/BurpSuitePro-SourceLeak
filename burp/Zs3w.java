package burp;

import burp.api.montoya.collaborator.InteractionFilter;
import burp.api.montoya.collaborator.SecretKey;
import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.HighlightColor;
import burp.api.montoya.core.Marker;
import burp.api.montoya.core.Range;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.RequestOptions;
import burp.api.montoya.http.handler.RequestToBeSentAction;
import burp.api.montoya.http.handler.ResponseReceivedAction;
import burp.api.montoya.http.message.HttpHeader;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.params.HttpParameterType;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.sessions.ActionResult;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.intruder.GeneratedPayload;
import burp.api.montoya.intruder.HttpRequestTemplate;
import burp.api.montoya.intruder.HttpRequestTemplateGenerationOptions;
import burp.api.montoya.intruder.PayloadProcessingAction;
import burp.api.montoya.intruder.PayloadProcessingResult;
import burp.api.montoya.persistence.PersistedList;
import burp.api.montoya.persistence.PersistedObject;
import burp.api.montoya.proxy.MessageReceivedAction;
import burp.api.montoya.proxy.MessageToBeSentAction;
import burp.api.montoya.proxy.http.ProxyRequestReceivedAction;
import burp.api.montoya.proxy.http.ProxyRequestToBeSentAction;
import burp.api.montoya.proxy.http.ProxyResponseReceivedAction;
import burp.api.montoya.proxy.http.ProxyResponseToBeSentAction;
import burp.api.montoya.proxy.websocket.BinaryMessageReceivedAction;
import burp.api.montoya.proxy.websocket.BinaryMessageToBeSentAction;
import burp.api.montoya.proxy.websocket.TextMessageReceivedAction;
import burp.api.montoya.proxy.websocket.TextMessageToBeSentAction;
import burp.api.montoya.scanner.AuditConfiguration;
import burp.api.montoya.scanner.AuditResult;
import burp.api.montoya.scanner.BuiltInAuditConfiguration;
import burp.api.montoya.scanner.CrawlConfiguration;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.audit.issues.AuditIssueConfidence;
import burp.api.montoya.scanner.audit.issues.AuditIssueDefinition;
import burp.api.montoya.scanner.audit.issues.AuditIssueSeverity;
import burp.api.montoya.sitemap.SiteMapFilter;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.menu.BasicMenuItem;
import burp.api.montoya.ui.menu.Menu;
import burp.api.montoya.utilities.json.JsonArrayNode;
import burp.api.montoya.utilities.json.JsonBooleanNode;
import burp.api.montoya.utilities.json.JsonNode;
import burp.api.montoya.utilities.json.JsonNullNode;
import burp.api.montoya.utilities.json.JsonNumberNode;
import burp.api.montoya.utilities.json.JsonObjectNode;
import burp.api.montoya.utilities.json.JsonStringNode;
import burp.api.montoya.websocket.BinaryMessageAction;
import burp.api.montoya.websocket.MessageAction;
import burp.api.montoya.websocket.TextMessageAction;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class Zs3w implements MontoyaObjectFactory {
  private final Zbnt Zy;
  
  private final Zey9 Zg;
  
  private final Zm6e ZK;
  
  private final Zr_4 Zt;
  
  private final Zr_4 ZX;
  
  private final Supplier<Zslu> Zs;
  
  public Zs3w(Zbnt paramZbnt, Zey9 paramZey9, Zm6e paramZm6e, Zr_4 paramZr_41, Zr_4 paramZr_42, Supplier<Zslu> paramSupplier) {
    this.Zy = paramZbnt;
    this.Zg = paramZey9;
    this.ZK = paramZm6e;
    this.Zt = paramZr_41;
    this.ZX = paramZr_42;
    this.Zs = paramSupplier;
  }
  
  public HttpService httpService(String paramString) {
    return Zzhd.Zc(paramString, this.Zy);
  }
  
  public HttpService httpService(String paramString, boolean paramBoolean) {
    return Zzhd.Zq(paramString, paramBoolean, this.Zy);
  }
  
  public HttpService httpService(String paramString, int paramInt, boolean paramBoolean) {
    return Zzhd.ZE(paramString, paramInt, paramBoolean, this.Zy);
  }
  
  public HttpHeader httpHeader(String paramString1, String paramString2) {
    return Zzn7.ZU(paramString1, paramString2);
  }
  
  public HttpHeader httpHeader(String paramString) {
    return Zzn7.Zv(paramString);
  }
  
  public HttpParameter parameter(String paramString1, String paramString2, HttpParameterType paramHttpParameterType) {
    return Zbfj.ZV(paramString1, paramString2, paramHttpParameterType);
  }
  
  public HttpRequest httpRequest(HttpService paramHttpService, ByteArray paramByteArray) {
    return Zsia.ZW(paramHttpService, paramByteArray, this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpRequest httpRequest(HttpService paramHttpService, String paramString) {
    return Zsia.Zp(paramHttpService, paramString, this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpRequest http2Request(HttpService paramHttpService, List<HttpHeader> paramList, String paramString) {
    return Zsik.Zr(paramHttpService, paramList, paramString, this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpRequest http2Request(HttpService paramHttpService, List<HttpHeader> paramList, ByteArray paramByteArray) {
    return Zsik.ZK(paramHttpService, paramList, paramByteArray, this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpRequest httpRequestFromUrl(String paramString) {
    Objects.requireNonNull(this.ZK);
    return Zsia.Zj(paramString, this.ZK::ZO, this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpResponse httpResponse() {
    return Zgtr.ZV("", this.Zy, this.ZX);
  }
  
  public HttpResponse httpResponse(String paramString) {
    return Zgtr.ZV(paramString, this.Zy, this.ZX);
  }
  
  public HttpResponse httpResponse(ByteArray paramByteArray) {
    return Zgtr.Zs(paramByteArray, this.Zy, this.ZX);
  }
  
  public HttpRequestResponse httpRequestResponse(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    return Zlbv.Zn(paramHttpRequest, paramHttpResponse, paramAnnotations);
  }
  
  public Range range(int paramInt1, int paramInt2) {
    return Zbx8.ZZ(paramInt1, paramInt2);
  }
  
  public Annotations annotations(String paramString, HighlightColor paramHighlightColor) {
    return Zs9n.ZJ(paramString, paramHighlightColor);
  }
  
  public AuditInsertionPoint auditInsertionPoint(String paramString, HttpRequest paramHttpRequest, int paramInt1, int paramInt2) {
    return Zm3b.ZY(paramString, paramHttpRequest, paramInt1, paramInt2, this.ZX, this.Zy, this.Zg, this.Zs.get());
  }
  
  public AuditIssueDefinition auditIssueDefinition(String paramString1, String paramString2, String paramString3, AuditIssueSeverity paramAuditIssueSeverity) {
    return Zs0.ZK(paramString1, paramString2, paramString3, paramAuditIssueSeverity);
  }
  
  public AuditIssue auditIssue(String paramString1, String paramString2, String paramString3, String paramString4, AuditIssueSeverity paramAuditIssueSeverity1, AuditIssueConfidence paramAuditIssueConfidence, String paramString5, String paramString6, AuditIssueSeverity paramAuditIssueSeverity2, List<HttpRequestResponse> paramList) {
    return Zmwf.ZF(paramString1, paramString2, paramString3, paramString4, paramAuditIssueSeverity1, paramAuditIssueConfidence, paramString5, paramString6, paramAuditIssueSeverity2, paramList, this.Zy);
  }
  
  public AuditIssue auditIssue(String paramString1, String paramString2, String paramString3, String paramString4, AuditIssueSeverity paramAuditIssueSeverity1, AuditIssueConfidence paramAuditIssueConfidence, String paramString5, String paramString6, AuditIssueSeverity paramAuditIssueSeverity2, HttpRequestResponse... paramVarArgs) {
    return Zmwf.ZF(paramString1, paramString2, paramString3, paramString4, paramAuditIssueSeverity1, paramAuditIssueConfidence, paramString5, paramString6, paramAuditIssueSeverity2, Arrays.asList(paramVarArgs), this.Zy);
  }
  
  public Selection selection(ByteArray paramByteArray, int paramInt1, int paramInt2) {
    return Zk7z.ZK(paramByteArray, paramInt1, paramInt2);
  }
  
  public SecretKey secretKey(String paramString) {
    return Zmnz.ZA(paramString);
  }
  
  public ProxyRequestReceivedAction proxyRequestReceivedAction(HttpRequest paramHttpRequest, Annotations paramAnnotations, MessageReceivedAction paramMessageReceivedAction) {
    return Zb0r.ZL(paramHttpRequest, paramAnnotations, paramMessageReceivedAction);
  }
  
  public ProxyRequestToBeSentAction proxyRequestToBeSentAction(HttpRequest paramHttpRequest, Annotations paramAnnotations, MessageToBeSentAction paramMessageToBeSentAction) {
    return Zm50.Zn(paramHttpRequest, paramAnnotations, paramMessageToBeSentAction);
  }
  
  public ProxyResponseReceivedAction proxyResponseReceivedAction(HttpResponse paramHttpResponse, Annotations paramAnnotations, MessageReceivedAction paramMessageReceivedAction) {
    return Zb0d.ZE(paramHttpResponse, paramAnnotations, paramMessageReceivedAction);
  }
  
  public ProxyResponseToBeSentAction proxyResponseToReturnAction(HttpResponse paramHttpResponse, Annotations paramAnnotations, MessageToBeSentAction paramMessageToBeSentAction) {
    return Zevu.Zf(paramHttpResponse, paramAnnotations, paramMessageToBeSentAction);
  }
  
  public RequestToBeSentAction requestResult(HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    return Zs5_.Zj(paramHttpRequest, paramAnnotations);
  }
  
  public ResponseReceivedAction responseResult(HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    return Zt64.Zm(paramHttpResponse, paramAnnotations);
  }
  
  public HttpRequestTemplate httpRequestTemplate(ByteArray paramByteArray, List<Range> paramList) {
    return Zk7m.Zy(paramByteArray, paramList);
  }
  
  public HttpRequestTemplate httpRequestTemplate(HttpRequest paramHttpRequest, List<Range> paramList) {
    return Zk7m.ZD(paramHttpRequest, paramList);
  }
  
  public HttpRequestTemplate httpRequestTemplate(ByteArray paramByteArray, HttpRequestTemplateGenerationOptions paramHttpRequestTemplateGenerationOptions) {
    return Zk7m.Zm(paramByteArray, paramHttpRequestTemplateGenerationOptions, this.Zy);
  }
  
  public HttpRequestTemplate httpRequestTemplate(HttpRequest paramHttpRequest, HttpRequestTemplateGenerationOptions paramHttpRequestTemplateGenerationOptions) {
    return Zk7m.ZU(paramHttpRequest, paramHttpRequestTemplateGenerationOptions, this.Zy);
  }
  
  public PayloadProcessingResult payloadProcessingResult(ByteArray paramByteArray, PayloadProcessingAction paramPayloadProcessingAction) {
    return Zm1g.ZC(paramByteArray, paramPayloadProcessingAction);
  }
  
  public PayloadProcessingResult usePayload(ByteArray paramByteArray) {
    return Zm1g.ZY(paramByteArray);
  }
  
  public PayloadProcessingResult skipPayload() {
    return Zm1g.Zk();
  }
  
  public ProxyRequestToBeSentAction requestFinalInterceptResultContinueWith(HttpRequest paramHttpRequest) {
    return Zm50.Zj(paramHttpRequest);
  }
  
  public ProxyRequestToBeSentAction requestFinalInterceptResultContinueWith(HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    return Zm50.Zh(paramHttpRequest, paramAnnotations);
  }
  
  public ProxyRequestToBeSentAction requestFinalInterceptResultDrop() {
    return Zm50.Zk();
  }
  
  public ProxyResponseToBeSentAction responseFinalInterceptResultContinueWith(HttpResponse paramHttpResponse) {
    return Zevu.Zu(paramHttpResponse);
  }
  
  public ProxyResponseToBeSentAction responseFinalInterceptResultContinueWith(HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    return Zevu.Zg(paramHttpResponse, paramAnnotations);
  }
  
  public ProxyResponseToBeSentAction responseFinalInterceptResultDrop() {
    return Zevu.Zp();
  }
  
  public ProxyResponseReceivedAction responseInitialInterceptResultIntercept(HttpResponse paramHttpResponse) {
    return Zb0d.Zo(paramHttpResponse);
  }
  
  public ProxyResponseReceivedAction responseInitialInterceptResultIntercept(HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    return Zb0d.ZW(paramHttpResponse, paramAnnotations);
  }
  
  public ProxyResponseReceivedAction responseInitialInterceptResultDoNotIntercept(HttpResponse paramHttpResponse) {
    return Zb0d.Z_(paramHttpResponse);
  }
  
  public ProxyResponseReceivedAction responseInitialInterceptResultDoNotIntercept(HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    return Zb0d.Zz(paramHttpResponse, paramAnnotations);
  }
  
  public ProxyResponseReceivedAction responseInitialInterceptResultFollowUserRules(HttpResponse paramHttpResponse) {
    return Zb0d.ZN(paramHttpResponse);
  }
  
  public ProxyResponseReceivedAction responseInitialInterceptResultFollowUserRules(HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    return Zb0d.Zo(paramHttpResponse, paramAnnotations);
  }
  
  public ProxyResponseReceivedAction responseInitialInterceptResultDrop() {
    return Zb0d.ZU();
  }
  
  public ProxyRequestReceivedAction requestInitialInterceptResultIntercept(HttpRequest paramHttpRequest) {
    return Zb0r.Zh(paramHttpRequest);
  }
  
  public ProxyRequestReceivedAction requestInitialInterceptResultIntercept(HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    return Zb0r.Zr(paramHttpRequest, paramAnnotations);
  }
  
  public ProxyRequestReceivedAction requestInitialInterceptResultDoNotIntercept(HttpRequest paramHttpRequest) {
    return Zb0r.Zd(paramHttpRequest);
  }
  
  public ProxyRequestReceivedAction requestInitialInterceptResultDoNotIntercept(HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    return Zb0r.ZN(paramHttpRequest, paramAnnotations);
  }
  
  public ProxyRequestReceivedAction requestInitialInterceptResultFollowUserRules(HttpRequest paramHttpRequest) {
    return Zb0r.ZR(paramHttpRequest);
  }
  
  public ProxyRequestReceivedAction requestInitialInterceptResultFollowUserRules(HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    return Zb0r.ZZ(paramHttpRequest, paramAnnotations);
  }
  
  public ProxyRequestReceivedAction requestInitialInterceptResultDrop() {
    return Zb0r.Zx();
  }
  
  public ResponseReceivedAction responseResult(HttpResponse paramHttpResponse) {
    return Zt64.Zi(paramHttpResponse);
  }
  
  public RequestToBeSentAction requestResult(HttpRequest paramHttpRequest) {
    return Zs5_.Zy(paramHttpRequest);
  }
  
  public InteractionFilter interactionIdFilter(String paramString) {
    return Zrm9.Za(paramString);
  }
  
  public InteractionFilter interactionPayloadFilter(String paramString) {
    return Zsyn.Zf(paramString);
  }
  
  public SiteMapFilter prefixFilter(String paramString) {
    return Ze_x.ZP(paramString);
  }
  
  public Marker marker(Range paramRange) {
    return Zl_3.ZL(paramRange);
  }
  
  public Marker marker(int paramInt1, int paramInt2) {
    return Zl_3.ZA(paramInt1, paramInt2);
  }
  
  public ByteArray byteArrayOfLength(int paramInt) {
    return Zsyg.ZS(paramInt, this.ZX);
  }
  
  public ByteArray byteArray(byte[] paramArrayOfbyte) {
    return Zsyg.Zk(paramArrayOfbyte, this.ZX);
  }
  
  public ByteArray byteArray(int[] paramArrayOfint) {
    return Zsyg.ZQ(paramArrayOfint, this.ZX);
  }
  
  public ByteArray byteArray(String paramString) {
    return Zsyg.Zu(paramString, this.ZX);
  }
  
  public TextMessageAction continueWithTextMessage(String paramString) {
    return Zsf0.Zh(paramString);
  }
  
  public TextMessageAction dropTextMessage() {
    return Zsf0.Zf();
  }
  
  public TextMessageAction textMessageAction(String paramString, MessageAction paramMessageAction) {
    return Zsf0.ZY(paramString, paramMessageAction);
  }
  
  public BinaryMessageAction binaryMessageAction(ByteArray paramByteArray, MessageAction paramMessageAction) {
    return Zx65.ZA(paramByteArray, paramMessageAction);
  }
  
  public BinaryMessageAction continueWithBinaryMessage(ByteArray paramByteArray) {
    return Zx65.Zv(paramByteArray);
  }
  
  public BinaryMessageAction dropBinaryMessage() {
    return Zx65.ZE();
  }
  
  public TextMessageReceivedAction followUserRulesInitialProxyTextMessage(String paramString) {
    return Zk8j.Zb(paramString);
  }
  
  public TextMessageReceivedAction dropInitialProxyTextMessage() {
    return Zk8j.Zl();
  }
  
  public TextMessageReceivedAction doNotInterceptInitialProxyTextMessage(String paramString) {
    return Zk8j.ZF(paramString);
  }
  
  public TextMessageReceivedAction interceptInitialProxyTextMessage(String paramString) {
    return Zk8j.Zn(paramString);
  }
  
  public BinaryMessageReceivedAction followUserRulesInitialProxyBinaryMessage(ByteArray paramByteArray) {
    return Zsl7.Zr(paramByteArray);
  }
  
  public BinaryMessageReceivedAction interceptInitialProxyBinaryMessage(ByteArray paramByteArray) {
    return Zsl7.ZG(paramByteArray);
  }
  
  public BinaryMessageReceivedAction doNotInterceptInitialProxyBinaryMessage(ByteArray paramByteArray) {
    return Zsl7.ZZ(paramByteArray);
  }
  
  public BinaryMessageReceivedAction dropInitialProxyBinaryMessage() {
    return Zsl7.Zo();
  }
  
  public TextMessageToBeSentAction continueWithFinalProxyTextMessage(String paramString) {
    return Zxa5.Zu(paramString);
  }
  
  public TextMessageToBeSentAction dropFinalProxyTextMessage() {
    return Zxa5.Zr();
  }
  
  public BinaryMessageToBeSentAction continueWithFinalProxyBinaryMessage(ByteArray paramByteArray) {
    return Zlgu.ZL(paramByteArray);
  }
  
  public BinaryMessageToBeSentAction dropFinalProxyBinaryMessage() {
    return Zlgu.ZD();
  }
  
  public PersistedObject persistedObject() {
    Zsy_ zsy_ = this.Zt.<Zsy_>ZH(new Zkih());
    return new Zkev(zsy_, this.Zy, this.Zt, this.ZX, this.Zg, this.Zs.get());
  }
  
  public PersistedList<Boolean> persistedBooleanList() {
    Zmfv zmfv = this.Zt.<Zmfv>ZH(new Zslb(8));
    return new Zeho(zmfv);
  }
  
  public PersistedList<Short> persistedShortList() {
    Zg06 zg06 = this.Zt.<Zg06>ZH(new Zz32(10));
    return new Zkbg(zg06);
  }
  
  public PersistedList<Integer> persistedIntegerList() {
    Zmg zmg = this.Zt.<Zmg>ZH(new Zkbp(10));
    return new Zluo(zmg);
  }
  
  public PersistedList<Long> persistedLongList() {
    Zxsn zxsn = this.Zt.<Zxsn>ZH(new Zl29(10));
    return new Zex1(zxsn);
  }
  
  public PersistedList<String> persistedStringList() {
    Zefg<Zgpi> zefg = Zkk.Zl(this.Zt, Zsdr.Zo, 10);
    return new Zxgu((Zefg)zefg, this.Zt);
  }
  
  public PersistedList<ByteArray> persistedByteArrayList() {
    Zefg<Zstu> zefg = Zkk.Zl(this.Zt, Zstu.Zc, 10);
    return new Zbor(zefg, this.Zt, this.ZX);
  }
  
  public PersistedList<HttpRequest> persistedHttpRequestList() {
    Zefg<Zgpi> zefg = Zkk.Zl(this.Zt, Zelu.ZB, 10);
    return new Zz4w((Zefg)zefg, this.Zy, this.Zt, this.ZX, this.Zg, this.Zs.get());
  }
  
  public PersistedList<HttpResponse> persistedHttpResponseList() {
    Zefg<Zgpi> zefg = Zkk.Zl(this.Zt, Zg0d.ZQ, 10);
    return new Zgmy((Zefg)zefg, this.Zy, this.Zt, this.ZX);
  }
  
  public PersistedList<HttpRequestResponse> persistedHttpRequestResponseList() {
    Zefg<Zgpi> zefg = Zkk.Zl(this.Zt, Zb4i.Zl, 10);
    return new Zxlt((Zefg)zefg, this.Zy, this.Zt, this.ZX, this.Zg, this.Zs.get());
  }
  
  public AuditResult auditResult(List<AuditIssue> paramList) {
    return new Zkto(paramList);
  }
  
  public AuditResult auditResult(AuditIssue... paramVarArgs) {
    return new Zkto(paramVarArgs);
  }
  
  public AuditConfiguration auditConfiguration(BuiltInAuditConfiguration paramBuiltInAuditConfiguration) {
    return Zkme.ZR(paramBuiltInAuditConfiguration);
  }
  
  public CrawlConfiguration crawlConfiguration(String... paramVarArgs) {
    return Zgk2.ZY(paramVarArgs);
  }
  
  public HttpParameter urlParameter(String paramString1, String paramString2) {
    return Zbfj.Zf(paramString1, paramString2);
  }
  
  public HttpParameter cookieParameter(String paramString1, String paramString2) {
    return Zbfj.Za(paramString1, paramString2);
  }
  
  public HttpParameter bodyParameter(String paramString1, String paramString2) {
    return Zbfj.Zh(paramString1, paramString2);
  }
  
  public GeneratedPayload payload(String paramString) {
    return Zr1_.Zt(paramString);
  }
  
  public GeneratedPayload payload(ByteArray paramByteArray) {
    return Zr1_.ZJ(paramByteArray);
  }
  
  public HighlightColor highlightColor(String paramString) {
    return Arrays.<HighlightColor>stream(HighlightColor.values()).filter(paramString::lambda$highlightColor$0).findFirst().orElse(HighlightColor.NONE);
  }
  
  public ActionResult actionResult(HttpRequest paramHttpRequest) {
    return Zmke.ZH(paramHttpRequest);
  }
  
  public ActionResult actionResult(HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    return Zmke.Zd(paramHttpRequest, paramAnnotations);
  }
  
  public Menu menu(String paramString) {
    return Zz27.Zp(paramString);
  }
  
  public BasicMenuItem basicMenuItem(String paramString) {
    return Zmys.Zb(paramString);
  }
  
  public RequestOptions requestOptions() {
    return Ze5z.Zt();
  }
  
  public GeneratedPayload payloadEnd() {
    return Zr1_.ZE();
  }
  
  public Annotations annotations(String paramString) {
    return Zs9n.ZI(paramString);
  }
  
  public Annotations annotations(HighlightColor paramHighlightColor) {
    return Zs9n.Zs(paramHighlightColor);
  }
  
  public Annotations annotations() {
    return Zs9n.ZQ();
  }
  
  public HttpRequest httpRequest(ByteArray paramByteArray) {
    return Zsia.ZW(null, paramByteArray, this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpRequest httpRequest() {
    return Zsia.Zp(this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpRequest httpRequest(String paramString) {
    return Zsia.Zp(null, paramString, this.Zy, this.ZX, this.Zg, this.Zs.get());
  }
  
  public HttpRequestResponse httpRequestResponse(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse) {
    return Zlbv.Zn(paramHttpRequest, paramHttpResponse, Zs9n.ZJ("", HighlightColor.NONE));
  }
  
  public Selection selection(ByteArray paramByteArray) {
    return Zk7z.ZM(paramByteArray);
  }
  
  public Selection selection(int paramInt1, int paramInt2) {
    return Zk7z.ZQ(paramInt1, paramInt2);
  }
  
  public JsonNode jsonNode(String paramString) {
    return Zrqy.ZD(paramString);
  }
  
  public JsonArrayNode jsonArrayNode() {
    return Zl6_.Zn();
  }
  
  public JsonArrayNode jsonArrayNode(List<? extends JsonNode> paramList) {
    return Zl6_.Zr(paramList);
  }
  
  public JsonArrayNode jsonArrayNode(JsonNode... paramVarArgs) {
    return Zl6_.ZM(paramVarArgs);
  }
  
  public JsonBooleanNode jsonBooleanNode(boolean paramBoolean) {
    return Zl60.Zw(paramBoolean);
  }
  
  public JsonNullNode jsonNullNode() {
    return Zl64.ZZ();
  }
  
  public JsonNumberNode jsonNumberNode(long paramLong) {
    return Zl6p.Zh(Long.valueOf(paramLong));
  }
  
  public JsonNumberNode jsonNumberNode(double paramDouble) {
    return Zl6p.Zh(Double.valueOf(paramDouble));
  }
  
  public JsonNumberNode jsonNumberNode(Number paramNumber) {
    return Zl6p.Zh(paramNumber);
  }
  
  public JsonObjectNode jsonObjectNode() {
    return Zl6s.ZH();
  }
  
  public JsonObjectNode jsonObjectNode(Map<String, ? extends JsonNode> paramMap) {
    return Zl6s.ZU(paramMap);
  }
  
  public JsonStringNode jsonStringNode(String paramString) {
    return Zl63.ZK(paramString);
  }
  
  private static boolean lambda$highlightColor$0(String paramString, HighlightColor paramHighlightColor) {
    return paramHighlightColor.displayName().equalsIgnoreCase(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */