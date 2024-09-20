package burp;

import java.awt.Component;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zgso {
  private final Zbnt ZL;
  
  private final Zkl6 ZX;
  
  private final Zerg Zf;
  
  private final Zeew Zt;
  
  private final Zgli ZF;
  
  private final Zm6x Zp;
  
  private static Zbqc[] Zn;
  
  public Zgso(Zbnt paramZbnt, Zkl6 paramZkl6, Zerg paramZerg, Zeew paramZeew, Zgli paramZgli, Zm6x paramZm6x) {
    this.ZL = paramZbnt;
    this.ZX = paramZkl6;
    this.Zf = paramZerg;
    this.Zt = paramZeew;
    this.ZF = paramZgli;
    this.Zp = paramZm6x;
  }
  
  public List<Component> ZW(Zrpb paramZrpb, InputEvent paramInputEvent, int[] paramArrayOfint, Zlbp paramZlbp) {
    boolean bool = (paramZrpb == Zrpb.CONTEXT_WEB_SOCKET_VIEWER) ? true : false;
    Zg3f zg3f = new Zg3f(paramZlbp, bool, this.ZF);
    return ZZ(paramZrpb, paramInputEvent, paramArrayOfint, null, null, Collections.singletonList(zg3f));
  }
  
  public List<Component> ZW(Zrpb paramZrpb, InputEvent paramInputEvent, List<Zlv8> paramList) {
    return ZZ(paramZrpb, paramInputEvent, null, null, null, paramList);
  }
  
  public List<Component> ZN(Zrpb paramZrpb, InputEvent paramInputEvent, int[] paramArrayOfint, Zmgv paramZmgv) {
    return ZU(paramZrpb, paramInputEvent, paramArrayOfint, new Zmgv[] { paramZmgv });
  }
  
  public List<Component> ZU(Zrpb paramZrpb, InputEvent paramInputEvent, int[] paramArrayOfint, Zmgv[] paramArrayOfZmgv) {
    return ZZ(paramZrpb, paramInputEvent, paramArrayOfint, paramArrayOfZmgv, null, null);
  }
  
  public List<Component> ZZ(Zrpb paramZrpb, InputEvent paramInputEvent, Zrdb[] paramArrayOfZrdb) {
    return ZZ(paramZrpb, paramInputEvent, null, null, paramArrayOfZrdb, null);
  }
  
  public List<Component> Zj(Zrpb paramZrpb, InputEvent paramInputEvent, Zmgv[] paramArrayOfZmgv, List<Zlv8> paramList) {
    Zgvn zgvn = this.Zf.ZM();
    Zb66 zb66 = new Zb66(zgvn);
    if (zb66.Zm())
      return Collections.emptyList(); 
    ArrayList<Zbp7> arrayList = new ArrayList();
    if (paramArrayOfZmgv.length > 0)
      arrayList.add(new Zbp7(paramInputEvent, this.Zt, paramZrpb, null, ZI(paramArrayOfZmgv), null, null)); 
    if (paramList != null && !paramList.isEmpty())
      arrayList.add(new Zbp7(paramInputEvent, this.Zt, paramZrpb, null, null, null, paramList)); 
    return Zr(zgvn, zb66, (List)arrayList);
  }
  
  private List<Component> ZZ(Zrpb paramZrpb, InputEvent paramInputEvent, int[] paramArrayOfint, Zmgv[] paramArrayOfZmgv, Zrdb[] paramArrayOfZrdb, List<Zlv8> paramList) {
    Zgvn zgvn = this.Zf.ZM();
    Zb66 zb66 = new Zb66(zgvn);
    if (zb66.Zm())
      return Collections.emptyList(); 
    IHttpRequestResponse[] arrayOfIHttpRequestResponse = ZI(paramArrayOfZmgv);
    IScanIssue[] arrayOfIScanIssue = ZE(paramArrayOfZrdb);
    List<Zbp7> list = Collections.singletonList(new Zbp7(paramInputEvent, this.Zt, paramZrpb, paramArrayOfint, arrayOfIHttpRequestResponse, arrayOfIScanIssue, paramList));
    return Zr(zgvn, zb66, (List)list);
  }
  
  private List<Component> Zr(Zgvn paramZgvn, Zb66 paramZb66, List<Zezw> paramList) {
    // Byte code:
    //   0: new burp/Zllj
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic ZA : ()[Lburp/Zbqc;
    //   12: aload_2
    //   13: invokevirtual iterator : ()Ljava/util/Iterator;
    //   16: astore #6
    //   18: astore #4
    //   20: aload #6
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 100
    //   30: aload #6
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast java/lang/String
    //   40: astore #7
    //   42: aload_2
    //   43: aload #7
    //   45: invokevirtual Zb : (Ljava/lang/String;)Ljava/util/List;
    //   48: astore #8
    //   50: aload_3
    //   51: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   56: aload_1
    //   57: aload #8
    //   59: <illegal opcode> apply : (Lburp/Zgvn;Ljava/util/List;)Ljava/util/function/Function;
    //   64: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   69: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   74: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   79: invokeinterface toList : ()Ljava/util/List;
    //   84: astore #9
    //   86: aload #5
    //   88: aload #7
    //   90: aload #9
    //   92: invokevirtual Zp : (Ljava/lang/String;Ljava/util/List;)V
    //   95: aload #4
    //   97: ifnonnull -> 20
    //   100: aload #5
    //   102: invokevirtual Zd : ()Ljava/util/List;
    //   105: areturn
  }
  
  private IHttpRequestResponse[] ZI(Zmgv[] paramArrayOfZmgv) {
    Zbqc[] arrayOfZbqc = ZA();
    if (paramArrayOfZmgv == null)
      return null; 
    IHttpRequestResponse[] arrayOfIHttpRequestResponse = new IHttpRequestResponse[paramArrayOfZmgv.length];
    byte b = 0;
    while (b < paramArrayOfZmgv.length) {
      Zmgv zmgv = paramArrayOfZmgv[b];
      Zmfj zmfj = zmgv.Zq(this.ZX, this.Zp);
      arrayOfIHttpRequestResponse[b] = Zkvw.Za(zmfj, this.ZL);
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayOfIHttpRequestResponse;
  }
  
  private IScanIssue[] ZE(Zrdb[] paramArrayOfZrdb) {
    Zbqc[] arrayOfZbqc = ZA();
    if (paramArrayOfZrdb == null)
      return null; 
    IScanIssue[] arrayOfIScanIssue = new IScanIssue[paramArrayOfZrdb.length];
    byte b = 0;
    while (b < paramArrayOfZrdb.length) {
      Zrdb zrdb = paramArrayOfZrdb[b];
      arrayOfIScanIssue[b] = new Zmu0(zrdb, this.ZL, this.ZX, Ztx8.ZC, this.Zp);
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayOfIScanIssue;
  }
  
  private static List lambda$buildContextMenuItems$0(Zgvn paramZgvn, List<Zesk> paramList, Zezw paramZezw) {
    return paramZgvn.Z_(paramList, paramZezw);
  }
  
  public static void ZL(Zbqc[] paramArrayOfZbqc) {
    Zn = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZA() {
    return Zn;
  }
  
  static {
    if (ZA() == null)
      ZL(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgso.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */