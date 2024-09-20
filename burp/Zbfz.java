package burp;

import burp.api.montoya.http.message.HttpRequestResponse;

class Zbfz implements IMessageEditorController {
  private IHttpService Zi;
  
  private byte[] ZR;
  
  private byte[] ZQ;
  
  private Zbfz(HttpRequestResponse paramHttpRequestResponse) {
    ZX(paramHttpRequestResponse);
  }
  
  public IHttpService getHttpService() {
    return this.Zi;
  }
  
  public byte[] getRequest() {
    return this.ZR;
  }
  
  public byte[] getResponse() {
    return this.ZQ;
  }
  
  void ZX(HttpRequestResponse paramHttpRequestResponse) {
    this.Zi = (paramHttpRequestResponse == null || paramHttpRequestResponse.request() == null) ? null : Zzgg.ZG(paramHttpRequestResponse.request().httpService());
    this.ZR = (paramHttpRequestResponse == null || paramHttpRequestResponse.request() == null) ? null : paramHttpRequestResponse.request().toByteArray().getBytes();
    this.ZQ = (paramHttpRequestResponse == null || paramHttpRequestResponse.response() == null) ? null : paramHttpRequestResponse.response().toByteArray().getBytes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbfz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */