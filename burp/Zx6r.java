package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;

class Zx6r implements Zs0s {
  private final Zs4l<LoggerCaptureHttpRequestResponse, Boolean> ZJ;
  
  private final Zskl Zx;
  
  private final Zbnt Za;
  
  Zx6r(Zs4l<LoggerCaptureHttpRequestResponse, Boolean> paramZs4l, Zskl paramZskl, Zbnt paramZbnt) {
    this.ZJ = paramZs4l;
    this.Zx = paramZskl;
    this.Za = paramZbnt;
  }
  
  public boolean ZX(Zesy paramZesy) {
    String str = Ztz2.Ze();
    Zeky zeky = new Zeky(paramZesy, this.Zx, this.Za);
    if (Zbqc.Zwu() == null)
      Ztz2.ZS("gNC6l"); 
    return !((Boolean)this.ZJ.ZQ(zeky, paramZesy.ZW, Boolean.valueOf(true))).booleanValue();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx6r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */