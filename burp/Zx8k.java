package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.http.handler.TimingData;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;

class Zx8k {
  static Zb4i ZQ(HttpRequestResponse paramHttpRequestResponse, Zr_4 paramZr_4) {
    if (paramHttpRequestResponse == null)
      return null; 
    HttpRequest httpRequest = paramHttpRequestResponse.request();
    Zelu zelu = (httpRequest != null) ? Zr2b.ZP(httpRequest).ZG(paramZr_4).Zx() : null;
    Zg0d zg0d = Zm5l.Zo(paramHttpRequestResponse.response(), paramZr_4);
    Zk2m zk2m = Zm0a.Zc(paramHttpRequestResponse.annotations(), paramZr_4);
    Zr2v zr2v = paramHttpRequestResponse.timingData().map(paramZr_4::lambda$persist$0).orElse(null);
    return paramZr_4.<Zb4i>ZH(new Zt65(zelu, zg0d, zk2m, zr2v));
  }
  
  static HttpRequestResponse ZS(Zb4i paramZb4i, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    if (paramZb4i == null)
      return null; 
    HttpRequest httpRequest = Zr2b.ZJ(paramZb4i.ZM4(), paramZbnt, paramZr_4, paramZey9, paramZslu);
    HttpResponse httpResponse = Zm5l.ZP(paramZb4i.ZM2(), paramZbnt, paramZr_4);
    Annotations annotations = Zm0a.ZD(paramZb4i.ZMF());
    TimingData timingData = Zxpg.ZR(paramZb4i.ZMQ());
    return Zlbv.ZF(httpRequest, httpResponse, annotations, timingData);
  }
  
  private static Zr2v lambda$persist$0(Zr_4 paramZr_4, TimingData paramTimingData) {
    return Zxpg.ZD(paramTimingData, paramZr_4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx8k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */