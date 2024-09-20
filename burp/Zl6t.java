package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Zl6t implements Zic {
  private final Zgy2 ZJ;
  
  private final Zr34 ZU;
  
  private final List<Zsd7> Zl;
  
  private final List<Zsd7> Za;
  
  private Zbav ZS;
  
  private Zba0 Zw;
  
  public Zl6t(Zgy2 paramZgy2, Zr34 paramZr34) {
    this.ZJ = paramZgy2;
    this.ZU = paramZr34;
    this.Zl = new LinkedList<>();
    int i = Zs70.ZD();
    this.Za = new LinkedList<>();
    if (Zbqc.Zwu() == null)
      Zs70.Zl(++i); 
  }
  
  public void ZM(Zxgc paramZxgc, Zslu paramZslu, Zlaa paramZlaa) {
    Zvm();
    ZvR();
    Zz(paramZslu, paramZlaa);
    Zv4();
    Zp(paramZxgc);
    ZvO();
    int i = Zs70.ZD();
    Zs70.Zn().forEach(this::ZH);
    Zt2();
    if (i == 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private void Zvm() {
    this.ZU.Zm(Zs70.BURPS_BROWSER_PATH, Zg29.USER, this.ZJ.Zt());
    this.ZU.Zm(Zs70.BURPS_BROWSER_PATH, Zg29.PROJECT, this.ZJ.ZU());
    this.ZU.Zm(Zs70.BURPS_BROWSER_PATH, Zg29.PROJECT, this.ZJ.ZH());
  }
  
  private void ZvR() {
    this.ZU.Zm(Zs70.SCOPE_PATH, Zg29.PROJECT, this.ZJ.ZR());
    this.ZU.ZE(Zs70.COLLABORATOR_PATH, Zg29.USER_AND_PROJECT, this.ZJ.ZK());
    this.ZU.ZE(Zs70.TASKS_PATH, Zg29.PROJECT, this.ZJ.Zg());
    this.Zw = this.ZJ.Zp();
    this.ZU.ZE(Zs70.AUTOMATIC_BACKUP_PATH, Zg29.USER, this.Zw);
    this.ZU.Zm(Zs70.LOGGING_PATH, Zg29.PROJECT, this.ZJ.ZW());
  }
  
  private void Zz(Zslu paramZslu, Zlaa paramZlaa) {
    this.ZU.Zm(Zs70.SESSIONS_PATH, Zg29.PROJECT, this.ZJ.Zj(paramZslu, paramZlaa));
    this.ZU.Zm(Zs70.SESSIONS_PATH, Zg29.PROJECT, this.ZJ.Zv());
    this.ZU.Zm(Zs70.SESSIONS_PATH, Zg29.PROJECT, this.ZJ.Zq(paramZslu, paramZlaa));
  }
  
  private void Zv4() {
    this.ZU.Zm(Zs70.CONNECTIONS_PATH, Zg29.USER_AND_PROJECT, this.ZJ.Zi());
    this.ZU.Zm(Zs70.CONNECTIONS_PATH, Zg29.PROJECT, this.ZJ.Zy());
    this.ZU.Zm(Zs70.CONNECTIONS_PATH, Zg29.USER_AND_PROJECT, this.ZJ.Zq());
    this.ZU.Zm(Zs70.CONNECTIONS_PATH, Zg29.PROJECT, this.ZJ.Zz());
    this.ZU.Zm(Zs70.CONNECTIONS_PATH, Zg29.USER_AND_PROJECT, this.ZJ.ZP());
    this.ZU.Zm(Zs70.TLS_PATH, Zg29.PROJECT, this.ZJ.Zc());
    this.ZU.Zm(Zs70.TLS_PATH, Zg29.USER_AND_PROJECT, this.ZJ.ZL());
    this.ZU.Zm(Zs70.TLS_PATH, Zg29.PROJECT, this.ZJ.ZA());
    this.ZU.Zm(Zs70.TLS_PATH, Zg29.USER, this.ZJ.ZN());
    this.ZU.Zm(Zs70.HTTP_PATH, Zg29.PROJECT, this.ZJ.Zd());
    this.ZU.Zm(Zs70.HTTP_PATH, Zg29.PROJECT, this.ZJ.ZD());
    this.ZU.Zm(Zs70.HTTP_PATH, Zg29.PROJECT, this.ZJ.ZQ());
    this.ZU.Zm(Zs70.HTTP_PATH, Zg29.PROJECT, this.ZJ.ZV());
    this.ZU.Zm(Zs70.HTTP_PATH, Zg29.PROJECT, this.ZJ.ZG());
  }
  
  private void Zp(Zxgc paramZxgc) {
    this.ZU.Zm(Zs70.SIDE_PANEL_PATH, Zg29.USER, this.ZJ.ZX());
    this.ZU.Zm(Zs70.SIDE_PANEL_PATH, Zg29.USER, this.ZJ.ZE());
    this.ZU.Zm(Zs70.MESSAGE_EDITOR_PATH, Zg29.USER, this.ZJ.Za());
    this.ZU.Zm(Zs70.MESSAGE_EDITOR_PATH, Zg29.USER, this.ZJ.Zw());
    this.ZU.Zm(Zs70.MESSAGE_EDITOR_PATH, Zg29.USER, this.ZJ.ZO());
    this.ZU.Zm(Zs70.MESSAGE_EDITOR_PATH, Zg29.USER, this.ZJ.Zx());
    this.ZU.Zm(Zs70.MESSAGE_EDITOR_PATH, Zg29.USER, this.ZJ.Zk());
    this.ZU.Zm(Zs70.MESSAGE_EDITOR_PATH, Zg29.USER, this.ZJ.ZC());
    this.ZU.Zm(Zs70.MESSAGE_EDITOR_PATH, Zg29.USER, this.ZJ.Zu());
    this.ZU.Zm(Zs70.HOTKEYS_PATH, Zg29.USER, this.ZJ.ZJ(paramZxgc.ZKB()));
    this.ZU.Zm(Zs70.DISPLAY_PATH, Zg29.USER, this.ZJ.Zn());
    this.ZU.Zm(Zs70.DISPLAY_PATH, Zg29.USER, this.ZJ.ZI());
    this.ZU.Zm(Zs70.DISPLAY_PATH, Zg29.USER, this.ZJ.ZB());
    this.ZS = this.ZJ.ZH(paramZxgc);
    this.ZU.Zm(Zs70.DISPLAY_PATH, Zg29.USER, this.ZS);
  }
  
  private void ZvO() {
    this.ZU.ZE(Zs70.REST_API_PATH, Zg29.USER, this.ZJ.Ze());
    this.ZU.Zm(Zs70.UPDATES_PATH, Zg29.USER, this.ZJ.Z_());
    this.ZU.Zm(Zs70.PERFORMANCE_FEEDBACK_PATH, Zg29.USER, this.ZJ.Zm());
    this.ZU.Zm(Zs70.TEMPORARY_FILES_LOCATION_PATH, Zg29.USER, this.ZJ.Zo());
    this.ZU.Zm(Zs70.STARTUP_BEHAVIOR_PATH, Zg29.USER, this.ZJ.Zj());
    this.ZU.Zm(Zs70.STARTUP_BEHAVIOR_PATH, Zg29.USER, this.ZJ.ZJ());
    this.ZU.Zm(Zs70.STARTUP_BEHAVIOR_PATH, Zg29.USER, this.ZJ.ZM());
    this.ZU.Zm(Zs70.SHUTDOWN_BEHAVIOR_PATH, Zg29.USER, this.ZJ.ZY());
  }
  
  public List<Zsd7> Zf(Zg29 paramZg29, String paramString) {
    if (paramString == null)
      paramString = ""; 
    if (paramString.isEmpty() && paramZg29 == Zg29.USER_AND_PROJECT)
      return new LinkedList<>(this.Za); 
    String str = paramString.toLowerCase(Locale.ENGLISH);
    return (List<Zsd7>)this.Za.stream().filter(paramZg29::lambda$configPanelsMatching$0).filter(str::lambda$configPanelsMatching$4).collect(Collectors.toList());
  }
  
  public Zgo7 ZU() {
    return this.ZU.Zh();
  }
  
  public void Zt2() {
    this.Zl.forEach(Zsd7::Zt2);
  }
  
  public void ZW() {
    this.ZS.Zt2();
  }
  
  public void ZOf() {
    this.Zw.Zt2();
  }
  
  private void ZH(Zs70 paramZs70) {
    this.ZU.ZV(paramZs70).forEach(this::Ze);
  }
  
  private void Ze(Zsd7 paramZsd7) {
    if (paramZsd7.ZOu())
      this.Zl.add(paramZsd7); 
    this.Za.add(paramZsd7);
  }
  
  private static boolean lambda$configPanelsMatching$4(String paramString, Zsd7 paramZsd7) {
    return (paramZsd7.ZOA().ZB().stream().anyMatch(paramString::lambda$configPanelsMatching$1) || paramZsd7.Zp().stream().map(Zl6t::lambda$configPanelsMatching$2).anyMatch(paramString::lambda$configPanelsMatching$3));
  }
  
  private static boolean lambda$configPanelsMatching$3(String paramString1, String paramString2) {
    return paramString2.contains(paramString1);
  }
  
  private static String lambda$configPanelsMatching$2(String paramString) {
    return paramString.toLowerCase(Locale.ENGLISH);
  }
  
  private static boolean lambda$configPanelsMatching$1(String paramString1, String paramString2) {
    return paramString2.toLowerCase(Locale.ENGLISH).contains(paramString1);
  }
  
  private static boolean lambda$configPanelsMatching$0(Zg29 paramZg29, Zsd7 paramZsd7) {
    return paramZsd7.ZOf().Zi(paramZg29);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl6t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */