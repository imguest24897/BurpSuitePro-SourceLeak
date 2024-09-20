package burp;

import java.net.URL;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrlb implements IHttpRequestResponse {
  private final IHttpRequestResponse Zx;
  
  private final Ztx8 ZY;
  
  public Zrlb(IHttpRequestResponse paramIHttpRequestResponse) {
    this(paramIHttpRequestResponse, Ztx8.ZC);
  }
  
  public Zrlb(IHttpRequestResponse paramIHttpRequestResponse, Ztx8 paramZtx8) {
    this.Zx = paramIHttpRequestResponse;
    this.ZY = paramZtx8;
  }
  
  public String getHost() {
    return this.Zx.getHttpService().getHost();
  }
  
  public int getPort() {
    return this.Zx.getHttpService().getPort();
  }
  
  public String getProtocol() {
    return this.Zx.getHttpService().getProtocol();
  }
  
  public void setHost(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void setPort(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: iload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;I)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void setProtocol(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public byte[] getRequest() {
    try {
      return this.Zx.getRequest();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  public URL getUrl() {
    try {
      return this.Zx.getUrl();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  public void setRequest(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;[B)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public byte[] getResponse() {
    try {
      return this.Zx.getResponse();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  public void setResponse(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;[B)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public short getStatusCode() {
    try {
      return this.Zx.getStatusCode();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return 0;
    } 
  }
  
  public String getComment() {
    try {
      return this.Zx.getComment();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZY.Zf(throwable);
    } 
  }
  
  public void setComment(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public String getHighlight() {
    try {
      return this.Zx.getHighlight();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZY.Zf(throwable);
    } 
  }
  
  public void setHighlight(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public IHttpService getHttpService() {
    return this.Zx.getHttpService();
  }
  
  public void setHttpService(IHttpService paramIHttpService) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zrlb;Lburp/IHttpService;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  private void lambda$setHttpService$7(IHttpService paramIHttpService) throws Throwable {
    this.Zx.setHttpService(paramIHttpService);
  }
  
  private void lambda$setHighlight$6(String paramString) throws Throwable {
    this.Zx.setHighlight(paramString);
  }
  
  private void lambda$setComment$5(String paramString) throws Throwable {
    this.Zx.setComment(paramString);
  }
  
  private void lambda$setResponse$4(byte[] paramArrayOfbyte) throws Throwable {
    this.Zx.setResponse(paramArrayOfbyte);
  }
  
  private void lambda$setRequest$3(byte[] paramArrayOfbyte) throws Throwable {
    this.Zx.setRequest(paramArrayOfbyte);
  }
  
  private void lambda$setProtocol$2(String paramString) throws Throwable {
    this.Zx.setProtocol(paramString);
  }
  
  private void lambda$setPort$1(int paramInt) throws Throwable {
    this.Zx.setPort(paramInt);
  }
  
  private void lambda$setHost$0(String paramString) throws Throwable {
    this.Zx.setHost(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrlb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */