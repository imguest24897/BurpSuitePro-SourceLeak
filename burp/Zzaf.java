package burp;

import java.io.InputStream;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zzaf {
  private final Zl11 ZN;
  
  private final Zzen ZJ;
  
  private static String ZB;
  
  public Zzaf(Zl11 paramZl11, Zskh paramZskh) {
    this.ZN = paramZl11;
    this.ZJ = new Zlbx(paramZskh);
  }
  
  public Zsxd Zu(Zefx paramZefx, AtomicBoolean paramAtomicBoolean, Zms7 paramZms7, Zts5 paramZts5, Zrtw paramZrtw) {
    Zs(paramZrtw);
    return this.ZN.ZE(paramZefx, paramZts5, new Zxf0(paramZrtw, paramZms7, paramAtomicBoolean), this.ZJ);
  }
  
  public Zx4j Zk(List<Zefx> paramList, AtomicBoolean paramAtomicBoolean, Zts5 paramZts5, Zrtw paramZrtw) {
    return this.ZN.Zf(Zlx4.Zw(paramList), paramZts5, new Zxf0(paramZrtw, Zzaf::lambda$createBatchedRequests$0, paramAtomicBoolean), this.ZJ);
  }
  
  private void Zs(Zrtw paramZrtw) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface Zsl : ()Z
    //   10: ifne -> 19
    //   13: getstatic burp/Zrrh.REPEATER_OPTIONS_UPDATE_CONTENT_LENGTH_DISABLED : Lburp/Zrrh;
    //   16: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   19: aload_1
    //   20: invokeinterface ZsR : ()Z
    //   25: ifne -> 34
    //   28: getstatic burp/Zrrh.REPEATER_OPTIONS_UNPACK_GZIP_DISABLED : Lburp/Zrrh;
    //   31: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   34: aload_1
    //   35: invokeinterface ZTQ : ()I
    //   40: tableswitch default -> 102, 0 -> 72, 1 -> 76, 2 -> 86, 3 -> 96
    //   72: aload_2
    //   73: ifnonnull -> 102
    //   76: getstatic burp/Zrrh.REPEATER_OPTIONS_FOLLOW_REDIRECTIONS_ON_SITE_ONLY : Lburp/Zrrh;
    //   79: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   82: aload_2
    //   83: ifnonnull -> 102
    //   86: getstatic burp/Zrrh.REPEATER_OPTIONS_FOLLOW_REDIRECTIONS_IN_SCOPE_ONLY : Lburp/Zrrh;
    //   89: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   92: aload_2
    //   93: ifnonnull -> 102
    //   96: getstatic burp/Zrrh.REPEATER_OPTIONS_FOLLOW_REDIRECTIONS_ALWAYS : Lburp/Zrrh;
    //   99: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   102: aload_1
    //   103: invokeinterface ZTk : ()Z
    //   108: ifeq -> 117
    //   111: getstatic burp/Zrrh.REPEATER_OPTIONS_PROCESS_COOKIES_IN_REDIRECTIONS : Lburp/Zrrh;
    //   114: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   117: aload_1
    //   118: invokeinterface Zsw : ()Z
    //   123: ifne -> 132
    //   126: getstatic burp/Zrrh.REPEATER_OPTIONS_NORMALIZE_LINE_ENDINGS_DISABLED : Lburp/Zrrh;
    //   129: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   132: return
  }
  
  private static void lambda$createBatchedRequests$0(Socket paramSocket, InputStream paramInputStream) {}
  
  public static void ZO(String paramString) {
    ZB = paramString;
  }
  
  public static String ZU() {
    return ZB;
  }
  
  static {
    if (ZU() == null)
      ZO("QKpvCc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzaf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */