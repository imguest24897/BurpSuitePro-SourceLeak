package net.portswigger.devtools.protocol.types.cachestorage;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.cachestorage.DataEntry")
public class DataEntry {
  @Zvd(Zp = "requestURL")
  public final String requestURL;
  
  @Zvd(Zp = "requestMethod")
  public final String requestMethod;
  
  @Zvd(Zp = "requestHeaders")
  public final List<Header> requestHeaders;
  
  @Zvd(Zp = "responseTime")
  public final Double responseTime;
  
  @Zvd(Zp = "responseStatus")
  public final Integer responseStatus;
  
  @Zvd(Zp = "responseStatusText")
  public final String responseStatusText;
  
  @Zvd(Zp = "responseType")
  public final CachedResponseType responseType;
  
  @Zvd(Zp = "responseHeaders")
  public final List<Header> responseHeaders;
  
  @Zox
  public DataEntry(@Zc5(Ze = "requestURL") String paramString1, @Zc5(Ze = "requestMethod") String paramString2, @Zc5(Ze = "requestHeaders") List<Header> paramList1, @Zc5(Ze = "responseTime") Double paramDouble, @Zc5(Ze = "responseStatus") Integer paramInteger, @Zc5(Ze = "responseStatusText") String paramString3, @Zc5(Ze = "responseType") CachedResponseType paramCachedResponseType, @Zc5(Ze = "responseHeaders") List<Header> paramList2) {
    this.requestURL = paramString1;
    this.requestMethod = paramString2;
    this.requestHeaders = paramList1;
    this.responseTime = paramDouble;
    this.responseStatus = paramInteger;
    this.responseStatusText = paramString3;
    this.responseType = paramCachedResponseType;
    String[] arrayOfString = RequestEntries.ZB();
    this.responseHeaders = paramList2;
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\cachestorage\DataEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */