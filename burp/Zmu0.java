package burp;

import java.net.URL;
import java.util.List;
import net.portswigger.Zdo;

public class Zmu0 implements IScanIssue {
  private final Zm6x Zk;
  
  private final Zrdb ZW;
  
  private final Zbnt Zt;
  
  private final Zkl6 Zw;
  
  private final Ztx8 ZP;
  
  private static String[] ZV;
  
  public Zmu0(Zrdb paramZrdb, Zbnt paramZbnt, Zkl6 paramZkl6, Ztx8 paramZtx8, Zm6x paramZm6x) {
    this.ZW = paramZrdb;
    this.Zt = paramZbnt;
    this.Zw = paramZkl6;
    this.ZP = paramZtx8;
    this.Zk = paramZm6x;
  }
  
  public Zrdb Zg() {
    return this.ZW;
  }
  
  public String getHost() {
    return this.ZW.ZaB().ZJ1();
  }
  
  public int getPort() {
    return this.ZW.ZaB().ZJO();
  }
  
  public String getProtocol() {
    return this.ZW.ZaB().ZJQ();
  }
  
  public URL getUrl() {
    byte[] arrayOfByte = this.ZW.Zax();
    Zax zax = new Zax(this.ZW.ZaB(), (arrayOfByte == null) ? Zdo.Za : arrayOfByte);
    return Zmg3.ZE(zax);
  }
  
  public String getIssueName() {
    return Zrf1.Za.ZK(this.ZW).ZZV();
  }
  
  public int getIssueType() {
    return this.ZW.Za6().ZS();
  }
  
  public String getSeverity() {
    return Zls9.Zx(this.ZW.ZaJ());
  }
  
  public String getConfidence() {
    return Zewc.ZO(this.ZW.Zac());
  }
  
  public String getIssueBackground() {
    return Zrf1.Za.ZK(this.ZW).ZZA();
  }
  
  public String getRemediationBackground() {
    return Zrf1.Za.ZK(this.ZW).ZZH();
  }
  
  public String getIssueDetail() {
    return this.ZW.Zai();
  }
  
  public String getRemediationDetail() {
    return this.ZW.ZaR();
  }
  
  public IHttpRequestResponse[] getHttpMessages() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> ZC : (Lburp/Zmu0;Ljava/util/List;)Lburp/Zb03;
    //   15: astore_2
    //   16: aload_0
    //   17: getfield ZW : Lburp/Zrdb;
    //   20: invokeinterface Za7 : ()Lburp/Ztub;
    //   25: aload_2
    //   26: <illegal opcode> accept : (Lburp/Zb03;)Ljava/util/function/Consumer;
    //   31: invokevirtual Zj : (Ljava/util/function/Consumer;)V
    //   34: aload_1
    //   35: iconst_0
    //   36: anewarray burp/IHttpRequestResponse
    //   39: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   44: checkcast [Lburp/IHttpRequestResponse;
    //   47: areturn
  }
  
  public IHttpService getHttpService() {
    return Zb28.ZU(this.ZW.ZaB());
  }
  
  private static void lambda$getHttpMessages$1(Zb03 paramZb03, Zgkc paramZgkc) {
    paramZgkc.Zg(paramZb03);
  }
  
  private void lambda$getHttpMessages$0(List<IHttpRequestResponseWithMarkers> paramList, Zzi8 paramZzi8) {
    paramList.add(Zkvn.Zp((Zzu7)paramZzi8.Zq(this.Zw, this.Zk), this.Zt, this.ZP));
  }
  
  public static void ZI(String[] paramArrayOfString) {
    ZV = paramArrayOfString;
  }
  
  public static String[] ZB() {
    return ZV;
  }
  
  static {
    if (ZB() != null)
      ZI(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmu0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */