package burp;

import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.HttpRequestResponse;

public class Zr0x extends Zr0z {
  final Zbnt ZD;
  
  private static final String c;
  
  public Zr0x(HttpRequestResponse paramHttpRequestResponse, Zbnt paramZbnt, Zzqf paramZzqf) {
    super(paramHttpRequestResponse, paramZzqf);
    this.ZD = paramZbnt;
  }
  
  public void setRequest(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte == null)
        throw new NullPointerException(c); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zm = this.ZQ.Zo(this.Zm.httpService(), paramArrayOfbyte);
  }
  
  public void setResponse(byte[] paramArrayOfbyte) {
    this.ZU = this.ZQ.Zc(paramArrayOfbyte);
  }
  
  public void setHttpService(IHttpService paramIHttpService) {
    this.Zm = this.Zm.withService(this.ZQ.Zg(paramIHttpService));
  }
  
  public void setHost(String paramString) {
    HttpService httpService = this.Zm.httpService();
    this.Zm = this.Zm.withService(this.ZQ.Zh(paramString, httpService.port(), httpService.secure()));
  }
  
  public void setPort(int paramInt) {
    HttpService httpService = this.Zm.httpService();
    this.Zm = this.Zm.withService(this.ZQ.Zh(httpService.host(), paramInt, httpService.secure()));
  }
  
  public void setProtocol(String paramString) {
    Zbqc[] arrayOfZbqc = Zr0z.ZA();
    HttpService httpService = this.Zm.httpService();
    try {
      this.Zm = this.Zm.withService(this.ZQ.Zh(httpService.host(), httpService.port(), Zxxw.ZL(paramString)));
      if (Zbqc.Zwu() == null)
        Zr0z.Ze(new Zbqc[3]); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: bipush #97
    //   2: ldc 'q>2]Gxu8 @Hpd9$Hj|P'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr0x.c : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #93
    //   82: goto -> 112
    //   85: bipush #58
    //   87: goto -> 112
    //   90: bipush #32
    //   92: goto -> 112
    //   95: bipush #79
    //   97: goto -> 112
    //   100: bipush #71
    //   102: goto -> 112
    //   105: bipush #126
    //   107: goto -> 112
    //   110: bipush #113
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr0x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */