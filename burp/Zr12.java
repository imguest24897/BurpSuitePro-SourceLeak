package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zr12 implements Zehc {
  private final Zz_9 Zf;
  
  private final Ze3n Zi;
  
  private final Zz1i ZB;
  
  private static boolean Zn;
  
  public Zr12(Zz_9 paramZz_9, Zz1i paramZz1i, Ze3n paramZe3n) {
    this.Zf = paramZz_9;
    boolean bool = ZR();
    this.ZB = paramZz1i;
    this.Zi = paramZe3n;
    if (Zbqc.Zwu() == null)
      Zb(!bool); 
  }
  
  public Ztk8 Zb() {
    return Zepo.ZE((this.Zi.Zp()).ZQ) ? (this.Zi.Zp()).ZQ.stream().map(this::Zz).reduce(Ztk8.ZD(), Ztk8::Zh) : Ztk8.ZD();
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_VulnerableForms;
  }
  
  private Ztk8 Zz(Zx8_ paramZx8_) {
    try {
      Zgq<Zgpi> zgq = new Zgq<>();
      Ztk8 ztk8 = ZS(paramZx8_);
      try {
        if (this.Zf.Zr(Zzu2.CROSS_DOMAIN_POST))
          zgq.ZM((Zsqx)ZL(paramZx8_)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (this.Zf.Zr(Zzu2.FILE_UPLOAD_FUNCTIONALITY))
          zgq.ZF((Zgq)Zj(paramZx8_)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (this.Zf.Zr(Zzu2.SERIALIZED_OBJECT_IN_HTTP_MESSAGE))
          zgq.ZF((Zgq)(new Zktx(this.Zi, this.Zf.ZqM())).Zs(paramZx8_)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (this.Zf.Zr(Zzu2.CROSS_SITE_REQUEST_FORGERY))
          (new Zk9h(this.Zi, this.ZB)).Za(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      return ztk8.Zh(Ztk8.Zy((Zgq)zgq));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return Ztk8.ZD();
    } 
  }
  
  private Ztk8 ZS(Zx8_ paramZx8_) {
    Zgq<Zgpi> zgq = new Zgq<>();
    List<Zmwr> list = Z_(paramZx8_);
    if (list.isEmpty())
      return Ztk8.ZD(); 
    if (this.Zf.Zr(Zzu2.CLEARTEXT_SUBMISSION_OF_PASSWORD))
      zgq.ZM((Zsqx)Zk(paramZx8_, list)); 
    if (this.Zf.Zr(Zzu2.PASSWORD_SUBMITTED_USING_GET_METHOD))
      zgq.ZM((Zsqx)ZU(paramZx8_, list)); 
    return Ztk8.Zy((Zgq)zgq);
  }
  
  private List<Zmwr> Z_(Zx8_ paramZx8_) {
    ArrayList<Zmwr> arrayList = new ArrayList();
    Iterator<Zmwr> iterator = paramZx8_.ZZp().iterator();
    boolean bool = ZR();
    while (iterator.hasNext()) {
      Zmwr zmwr = iterator.next();
      if (zmwr.ZhK() == Zl2w.PASSWORD && zmwr.Zh4() != null)
        arrayList.add(zmwr); 
      if (bool)
        break; 
    } 
    return arrayList;
  }
  
  private Zsqx<Zrdb> Zk(Zx8_ paramZx8_, List<Zmwr> paramList) {
    if (!paramZx8_.ZZa().Zdz().ZJZ()) {
      List<Zl1r> list = Zg(paramZx8_, paramList);
      Zvow zvow = this.Zi.Zt().Z_(list);
      return Zrcm.Zy((byte)0, this.Zi.Za(), this.Zi.ZN(), zvow, paramZx8_.ZZa(), paramList);
    } 
    return null;
  }
  
  private Zsqx<Zrdb> ZU(Zx8_ paramZx8_, List<Zmwr> paramList) {
    boolean bool = ZR();
    if (paramZx8_.ZZT() == 0) {
      List<Zl1r> list = Zg(paramZx8_, paramList);
      Zvow zvow = this.Zi.Zt().Z_(list);
      LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
      for (Zmwr zmwr : paramList) {
        linkedHashSet.add(zmwr.Zh4());
        if (bool)
          break; 
      } 
      return Zxzo.ZW(this.Zi.Za(), this.Zi.ZN(), zvow, paramZx8_.ZZa().toString(), linkedHashSet);
    } 
    return null;
  }
  
  private List<Zl1r> Zg(Zx8_ paramZx8_, List<Zmwr> paramList) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    arrayList.add(Zrlp.Zj(paramZx8_.ZZh().ZlK(), paramZx8_.ZZh().Zli()));
    Iterator<Zmwr> iterator = paramList.iterator();
    boolean bool = ZR();
    while (iterator.hasNext()) {
      Zmwr zmwr = iterator.next();
      arrayList.add(Zrlp.Zj(zmwr.ZhB().ZlK(), zmwr.ZhB().Zli()));
      if (bool)
        break; 
    } 
    return arrayList;
  }
  
  private Zsqx<Zrdb> ZL(Zx8_ paramZx8_) {
    Zuh.Zv((this.Zi.Za() != null), Zqf.Zr, 1L);
    Zuh.Zv((paramZx8_.ZZa() != null), Zqf.Zr, 2L);
    if (paramZx8_.ZZT() == 1 && Zmhb.ZN(this.Zi.Za().ZJ1(), paramZx8_.ZZa().Zd1())) {
      Zuh.Zv((paramZx8_.ZZh() != null), Zqf.Zr, 3L);
      ArrayList<Zl1r> arrayList = new ArrayList();
      arrayList.add(Zrlp.Zj(paramZx8_.ZZh().ZlK(), paramZx8_.ZZh().Zli()));
      Zvow zvow = this.Zi.Zt().Z_(arrayList);
      return Zk8o.ZY(this.Zi.Za(), this.Zi.ZN(), zvow, paramZx8_);
    } 
    return null;
  }
  
  private Zgq<Zrdb> Zj(Zx8_ paramZx8_) {
    boolean bool = ZR();
    Zgq<Zgpi> zgq = new Zgq<>();
    if (paramZx8_.ZZT() == 1)
      for (Zmwr zmwr : paramZx8_.ZZp()) {
        if (zmwr.ZhK() == Zl2w.FILE && zmwr.Zh4() != null) {
          ArrayList<Zl1r> arrayList = new ArrayList();
          arrayList.add(Zrlp.Zj(zmwr.ZhB().ZlK(), zmwr.ZhB().Zli()));
          Zvow zvow = this.Zi.Zt().Z_(arrayList);
          zgq.Zu((Zsqx)Zm43.Zl(this.Zi.Za(), this.Zi.ZN(), zvow, paramZx8_.ZZa().toString()));
          if (bool)
            continue; 
          break;
        } 
        continue;
        if (bool)
          break; 
      }  
    return (Zgq)zgq;
  }
  
  public static void Zb(boolean paramBoolean) {
    Zn = paramBoolean;
  }
  
  public static boolean ZJ() {
    return Zn;
  }
  
  public static boolean ZR() {
    boolean bool = ZJ();
    return !bool;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZR())
      Zb(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr12.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */