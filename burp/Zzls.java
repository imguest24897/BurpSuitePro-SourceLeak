package burp;

import burp.api.montoya.ui.editor.EditorOptions;
import burp.api.montoya.ui.editor.HttpRequestEditor;
import burp.api.montoya.ui.editor.HttpResponseEditor;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public class Zzls {
  private final Zbnt Zq;
  
  private final Ztyg Zx;
  
  private final Zskl Zd;
  
  private final Zey9 ZR;
  
  private final ScheduledExecutorService Za;
  
  private static String Zc;
  
  public Zzls(Zbnt paramZbnt, Ztyg paramZtyg, Zskl paramZskl, Zey9 paramZey9, Ztwv paramZtwv) {
    this.Zq = paramZbnt;
    this.Zx = paramZtyg;
    this.Zd = paramZskl;
    this.ZR = paramZey9;
    this.Za = paramZtwv.Ze();
  }
  
  public HttpRequestEditor ZE(EditorOptions... paramVarArgs) {
    Zbdf zbdf = Zh(Zgu3.HTTP_REQUEST, paramVarArgs);
    return new Zed3(this.Zq, zbdf, this.Zd, this.ZR);
  }
  
  public HttpResponseEditor Zh(EditorOptions... paramVarArgs) {
    Zbdf zbdf = Zh(Zgu3.HTTP_RESPONSE, paramVarArgs);
    return new Zsxr(zbdf, this.Zd);
  }
  
  private Zbdf Zh(Zgu3 paramZgu3, EditorOptions... paramVarArgs) {
    boolean bool = !List.<EditorOptions>of(paramVarArgs).contains(EditorOptions.READ_ONLY) ? true : false;
    AtomicReference<Zbdf> atomicReference = new AtomicReference();
    Objects.requireNonNull(atomicReference);
    Ze96 ze96 = new Ze96(atomicReference::get);
    Zbdf zbdf = this.Zx.Zz(ze96, Zeew.EXTENDER, bool, EnumSet.of(paramZgu3), Zb9b.Zx);
    Objects.requireNonNull(zbdf);
    zbdf.Zn(new Ztk3(this.Za, zbdf::Zc));
    atomicReference.set(zbdf);
    return zbdf;
  }
  
  public static void ZB(String paramString) {
    Zc = paramString;
  }
  
  public static String Zf() {
    return Zc;
  }
  
  static {
    if (Zf() == null)
      ZB("P1aAob"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzls.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */