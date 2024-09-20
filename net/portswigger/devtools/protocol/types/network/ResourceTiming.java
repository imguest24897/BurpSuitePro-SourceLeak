package net.portswigger.devtools.protocol.types.network;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.network.ResourceTiming")
public class ResourceTiming {
  @Zvd(Zp = "requestTime")
  public final Double requestTime;
  
  @Zvd(Zp = "proxyStart")
  public final Double proxyStart;
  
  @Zvd(Zp = "proxyEnd")
  public final Double proxyEnd;
  
  @Zvd(Zp = "dnsStart")
  public final Double dnsStart;
  
  @Zvd(Zp = "dnsEnd")
  public final Double dnsEnd;
  
  @Zvd(Zp = "connectStart")
  public final Double connectStart;
  
  @Zvd(Zp = "connectEnd")
  public final Double connectEnd;
  
  @Zvd(Zp = "sslStart")
  public final Double sslStart;
  
  @Zvd(Zp = "sslEnd")
  public final Double sslEnd;
  
  @Zvd(Zp = "workerStart")
  @Zy
  public final Double workerStart;
  
  @Zvd(Zp = "workerReady")
  @Zy
  public final Double workerReady;
  
  @Zvd(Zp = "workerFetchStart")
  @Zy
  public final Double workerFetchStart;
  
  @Zvd(Zp = "workerRespondWithSettled")
  @Zy
  public final Double workerRespondWithSettled;
  
  @Zvd(Zp = "workerRouterEvaluationStart")
  @Zy
  @Zj
  public final Double workerRouterEvaluationStart;
  
  @Zvd(Zp = "workerCacheLookupStart")
  @Zy
  @Zj
  public final Double workerCacheLookupStart;
  
  @Zvd(Zp = "sendStart")
  public final Double sendStart;
  
  @Zvd(Zp = "sendEnd")
  public final Double sendEnd;
  
  @Zvd(Zp = "pushStart")
  @Zy
  public final Double pushStart;
  
  @Zvd(Zp = "pushEnd")
  @Zy
  public final Double pushEnd;
  
  @Zvd(Zp = "receiveHeadersStart")
  @Zy
  public final Double receiveHeadersStart;
  
  @Zvd(Zp = "receiveHeadersEnd")
  public final Double receiveHeadersEnd;
  
  @Zox
  public ResourceTiming(@Zc5(Ze = "requestTime") Double paramDouble1, @Zc5(Ze = "proxyStart") Double paramDouble2, @Zc5(Ze = "proxyEnd") Double paramDouble3, @Zc5(Ze = "dnsStart") Double paramDouble4, @Zc5(Ze = "dnsEnd") Double paramDouble5, @Zc5(Ze = "connectStart") Double paramDouble6, @Zc5(Ze = "connectEnd") Double paramDouble7, @Zc5(Ze = "sslStart") Double paramDouble8, @Zc5(Ze = "sslEnd") Double paramDouble9, @Zc5(Ze = "workerStart") Double paramDouble10, @Zc5(Ze = "workerReady") Double paramDouble11, @Zc5(Ze = "workerFetchStart") Double paramDouble12, @Zc5(Ze = "workerRespondWithSettled") Double paramDouble13, @Zc5(Ze = "workerRouterEvaluationStart", ZS = "null") Double paramDouble14, @Zc5(Ze = "workerCacheLookupStart", ZS = "null") Double paramDouble15, @Zc5(Ze = "sendStart") Double paramDouble16, @Zc5(Ze = "sendEnd") Double paramDouble17, @Zc5(Ze = "pushStart") Double paramDouble18, @Zc5(Ze = "pushEnd") Double paramDouble19, @Zc5(Ze = "receiveHeadersStart") Double paramDouble20, @Zc5(Ze = "receiveHeadersEnd") Double paramDouble21) {
    this.requestTime = paramDouble1;
    this.proxyStart = paramDouble2;
    this.proxyEnd = paramDouble3;
    this.dnsStart = paramDouble4;
    this.dnsEnd = paramDouble5;
    this.connectStart = paramDouble6;
    this.connectEnd = paramDouble7;
    this.sslStart = paramDouble8;
    this.sslEnd = paramDouble9;
    this.workerStart = paramDouble10;
    this.workerReady = paramDouble11;
    this.workerFetchStart = paramDouble12;
    this.workerRespondWithSettled = paramDouble13;
    boolean bool = ResourceType.ZU();
    this.workerRouterEvaluationStart = paramDouble14;
    this.workerCacheLookupStart = paramDouble15;
    this.sendStart = paramDouble16;
    this.sendEnd = paramDouble17;
    this.pushStart = paramDouble18;
    this.pushEnd = paramDouble19;
    this.receiveHeadersStart = paramDouble20;
    this.receiveHeadersEnd = paramDouble21;
    if (Zbqc.Zwu() == null)
      ResourceType.Zs(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ResourceTiming.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */