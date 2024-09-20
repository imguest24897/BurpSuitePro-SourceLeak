package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;

public final class Zzsr extends Record implements Zz4k {
  private final Zbnt ZU;
  
  public Zzsr(Zbnt paramZbnt) {
    this.ZU = paramZbnt;
  }
  
  public void Zi(Zmfj paramZmfj, HttpRequest paramHttpRequest, Annotations paramAnnotations) {
    if (paramHttpRequest != null) {
      paramZmfj.ZU(Zblx.Zm(paramHttpRequest.httpService(), this.ZU));
      paramZmfj.ZH(paramHttpRequest.toByteArray().getBytes());
    } 
    if (paramAnnotations != null) {
      paramZmfj.ZP(paramAnnotations.notes());
      paramZmfj.ZB((Zblx.ZA(paramAnnotations.highlightColor())).name);
    } 
  }
  
  public void Zw(Zmfj paramZmfj, HttpResponse paramHttpResponse, Annotations paramAnnotations) {
    if (paramHttpResponse != null)
      paramZmfj.ZV(paramHttpResponse.toByteArray().getBytes()); 
    if (paramAnnotations != null) {
      paramZmfj.ZP(paramAnnotations.notes());
      paramZmfj.ZB((Zblx.ZA(paramAnnotations.highlightColor())).name);
    } 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zzsr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zzsr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zzsr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */