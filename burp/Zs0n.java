package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.HighlightColor;
import burp.api.montoya.core.Range;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.handler.TimingData;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.intruder.HttpRequestTemplate;
import burp.api.montoya.scanner.AuditConfiguration;
import burp.api.montoya.scanner.AuditResult;
import burp.api.montoya.scanner.BuiltInAuditConfiguration;
import burp.api.montoya.scanner.CrawlConfiguration;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.audit.issues.AuditIssueDefinition;
import burp.api.montoya.sitemap.SiteMapFilter;
import burp.api.montoya.ui.Selection;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Zs0n implements Zzqf, Zskl {
  private final Zkl6 Zt;
  
  private final Zbnt Zh;
  
  private final Zr_4 ZZ;
  
  private final Zey9 ZS;
  
  private final Supplier<Zslu> Zc;
  
  public Zs0n(Zkl6 paramZkl6, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Supplier<Zslu> paramSupplier) {
    this.Zt = paramZkl6;
    this.Zh = paramZbnt;
    this.ZZ = paramZr_4;
    this.ZS = paramZey9;
    this.Zc = paramSupplier;
  }
  
  public HttpService Zh(String paramString, int paramInt, boolean paramBoolean) {
    return Zzhd.ZE(paramString, paramInt, paramBoolean, this.Zh);
  }
  
  public Range Z_(int paramInt1, int paramInt2) {
    return Zbx8.ZZ(paramInt1, paramInt2);
  }
  
  public HttpParameter ZU(IParameter paramIParameter) {
    return Zbfj.ZV(paramIParameter);
  }
  
  public AuditInsertionPoint Zx(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return Zm3b.Zb(paramString, paramArrayOfbyte, paramInt1, paramInt2, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequestTemplate Zp(byte[] paramArrayOfbyte, List<int[]> paramList) {
    return Zk7m.Zv(paramArrayOfbyte, paramList);
  }
  
  public HttpRequestResponse ZP(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Zlbv.ZI(paramString, paramInt, paramBoolean, paramArrayOfbyte1, paramArrayOfbyte2, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public AuditResult Zi(List<AuditIssue> paramList) {
    return Zkto.ZG(paramList);
  }
  
  public SiteMapFilter ZL(String paramString) {
    return Ze_x.ZP(paramString);
  }
  
  public ByteArray Zb(byte[] paramArrayOfbyte) {
    return Zsyg.Zk(paramArrayOfbyte, this.ZZ).copyToTempFile();
  }
  
  public AuditConfiguration ZC(BuiltInAuditConfiguration paramBuiltInAuditConfiguration) {
    return Zkme.ZR(paramBuiltInAuditConfiguration);
  }
  
  public CrawlConfiguration ZI(String... paramVarArgs) {
    return Zgk2.ZY(paramVarArgs);
  }
  
  public HttpService ZU(Zmzk paramZmzk) {
    return Zzhd.Zb(paramZmzk, this.Zh);
  }
  
  public Zztj Zf(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    return Zsia.ZJ(paramZmzk, paramArrayOfbyte, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequest ZN(Zefx paramZefx) {
    return Zsie.Zu(paramZefx, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public Zztj Zu(Zmfj paramZmfj) {
    return Zsia.ZH(paramZmfj, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpResponse Zc(byte[] paramArrayOfbyte) {
    return Zgtr.ZW(paramArrayOfbyte, this.Zh, this.ZZ);
  }
  
  public HttpResponse ZY(Zstu paramZstu) {
    return Zgtr.Zk(paramZstu, this.Zh, this.ZZ);
  }
  
  public HttpResponse Zf(Zxpe paramZxpe) {
    return (paramZxpe == null) ? null : ZY(paramZxpe.ZS());
  }
  
  public HttpResponse Zr(Zmfj paramZmfj) {
    return (paramZmfj == null) ? null : Zc(paramZmfj.ZM());
  }
  
  public Annotations Zk(Zt83 paramZt83) {
    HighlightColor highlightColor = Zt6v.ZR(paramZt83.ZOX());
    return Zs9n.ZJ(paramZt83.ZOf(), highlightColor);
  }
  
  public Annotations Zm(String paramString, Zmtd paramZmtd) {
    return Zs9n.ZJ(paramString, Zt6v.ZO(paramZmtd));
  }
  
  public Annotations Za(String paramString1, String paramString2) {
    return Zm(paramString1, Zmtd.ZL(paramString2));
  }
  
  public Annotations ZM(Zmfj paramZmfj) {
    return Zs9n.ZW(paramZmfj);
  }
  
  public HttpRequest Zo(HttpService paramHttpService, byte[] paramArrayOfbyte) {
    return Zsia.ZD(paramHttpService, paramArrayOfbyte, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HighlightColor ZB(String paramString) {
    return Arrays.<HighlightColor>stream(HighlightColor.values()).filter(paramString::lambda$highlightColor$0).findFirst().orElse(HighlightColor.NONE);
  }
  
  public AuditIssueDefinition ZW(String paramString1, String paramString2, String paramString3, byte paramByte, Zvs paramZvs) {
    return Zs0.ZZ(paramString1, paramString2, paramString3, paramByte, paramZvs);
  }
  
  public HttpRequestResponse Zv(Zefx paramZefx, byte[] paramArrayOfbyte) {
    return Zlbv.ZF(paramZefx, paramArrayOfbyte, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequestResponse ZF(Zmzk paramZmzk, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Zlbv.ZR(paramZmzk, paramArrayOfbyte1, paramArrayOfbyte2, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequestResponse Zh(Zmfj paramZmfj) {
    return Zlbv.ZD(paramZmfj, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequestResponse ZR(Zsxd paramZsxd) {
    return Zlbv.Zx(paramZsxd, this.Zh, this.ZZ, this.ZS, this.Zc.get(), Zlpv.ZF(paramZsxd.ZL(), paramZsxd.ZE(), paramZsxd.ZG().ZQ()));
  }
  
  public HttpRequestResponse Zt(Zkg1 paramZkg1) {
    return Zlbv.ZF(paramZkg1, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public AuditIssueDefinition Za(String paramString1, String paramString2, String paramString3, String paramString4) {
    return Zs0.Zy(paramString1, paramString2, paramString3, paramString4);
  }
  
  public HttpService Zg(IHttpService paramIHttpService) {
    return Zzhd.ZQ(paramIHttpService, this.Zh);
  }
  
  public Range ZK(int[] paramArrayOfint) {
    return Zbx8.ZM(paramArrayOfint);
  }
  
  public HttpRequestResponse ZE(IHttpRequestResponse paramIHttpRequestResponse) {
    return Zlbv.Zj(paramIHttpRequestResponse, this.Zh, this.ZZ, this.ZS, this.Zc.get()).copyToTempFile();
  }
  
  public HttpRequestResponse ZU(IHttpRequestResponse paramIHttpRequestResponse) {
    return Zlbv.Zj(paramIHttpRequestResponse, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequest ZT(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte) {
    return Zsik.ZR(paramIHttpService, paramList, paramArrayOfbyte, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequest Zj(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    return Zsia.ZT(paramIHttpService, paramArrayOfbyte, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequest Z_(String paramString) {
    return Zsia.Zj(paramString, this::lambda$httpRequestFromUrlHeap$1, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public HttpRequest Zq(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return Zsia.Ze(paramString, paramInt, paramBoolean, paramArrayOfbyte, this.Zh, this.ZZ, this.ZS, this.Zc.get());
  }
  
  public ByteArray ZI(byte[] paramArrayOfbyte) {
    return Zsyg.Zk(paramArrayOfbyte, this.ZZ);
  }
  
  public Selection Zp(byte[] paramArrayOfbyte, int[] paramArrayOfint) {
    return Zk7z.ZK(paramArrayOfbyte, paramArrayOfint);
  }
  
  public Selection ZP(byte[] paramArrayOfbyte) {
    return Zk7z.Zb(paramArrayOfbyte);
  }
  
  public TimingData Zq(long paramLong1, long paramLong2, long paramLong3) {
    return Zlpv.ZF(Duration.ofMillis(paramLong1), Duration.ofMillis(paramLong2), paramLong3);
  }
  
  private Ztom lambda$httpRequestFromUrlHeap$1() {
    return this.Zt.Zs().ZO();
  }
  
  private static boolean lambda$highlightColor$0(String paramString, HighlightColor paramHighlightColor) {
    return paramHighlightColor.displayName().equalsIgnoreCase(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs0n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */