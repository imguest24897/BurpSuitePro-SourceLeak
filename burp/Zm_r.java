package burp;

import java.awt.Window;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zl0;
import net.portswigger.Zm2;

public class Zm_r implements Zzyl {
  private final Zgxi Zs;
  
  private final Zkar ZF;
  
  private final Zskh ZD;
  
  private final Zbiv Zt;
  
  private final Window Zg;
  
  private final Zr00 ZN;
  
  private final Zx_a Zc;
  
  private final Zbui Zk;
  
  private final Zg_j Zy;
  
  private final Zt80 Zv;
  
  private final Zeu0 Zr;
  
  private final Zgvn ZR;
  
  private final Zgbj Zj;
  
  private final Zmo9 Zi;
  
  private final Ztwv Zu;
  
  private final Ztdi ZS;
  
  private final Zbnt ZZ;
  
  private final Zr_4 ZC;
  
  private final Zxgc ZX;
  
  private final Zskh Zz;
  
  private final Zes1 ZG;
  
  private final Zmjm ZO;
  
  private final Zl0 ZP;
  
  private final Runnable ZK;
  
  private final Consumer<List<Zgxp>> Zn;
  
  private final Consumer<Zgxp> Zq;
  
  private final Consumer<String> ZU;
  
  private final Supplier<List<Zgxp>> Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zm_r(Zgxi paramZgxi, Zkar paramZkar, Zskh paramZskh1, Zbiv paramZbiv, Window paramWindow, Zr00 paramZr00, Zx_a paramZx_a, Zbui paramZbui, Zg_j paramZg_j, Zt80 paramZt80, Zeu0 paramZeu0, Zgvn paramZgvn, Zgbj paramZgbj, Zmo9 paramZmo9, Ztwv paramZtwv, Ztdi paramZtdi, Zbnt paramZbnt, Zr_4 paramZr_4, Zxgc paramZxgc, Consumer<List<Zgxp>> paramConsumer, Consumer<Zgxp> paramConsumer1, Consumer<String> paramConsumer2, Zskh paramZskh2, Runnable paramRunnable, Zes1 paramZes1, Zmjm paramZmjm, Zl0 paramZl0, Supplier<List<Zgxp>> paramSupplier) {
    this.Zs = paramZgxi;
    this.ZF = paramZkar;
    this.ZD = paramZskh1;
    this.Zt = paramZbiv;
    this.Zg = paramWindow;
    this.ZN = paramZr00;
    this.Zc = paramZx_a;
    int i = Zmuy.Zp();
    this.Zk = paramZbui;
    this.Zy = paramZg_j;
    this.Zv = paramZt80;
    this.Zr = paramZeu0;
    this.ZR = paramZgvn;
    this.Zj = paramZgbj;
    this.Zi = paramZmo9;
    this.Zu = paramZtwv;
    this.ZS = paramZtdi;
    this.ZZ = paramZbnt;
    this.ZC = paramZr_4;
    this.ZX = paramZxgc;
    this.Zn = paramConsumer;
    this.Zq = paramConsumer1;
    this.ZU = paramConsumer2;
    this.Zz = paramZskh2;
    this.ZK = paramRunnable;
    this.ZG = paramZes1;
    this.ZO = paramZmjm;
    this.ZP = paramZl0;
    this.Zl = paramSupplier;
    if (i == 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public boolean ZZ(int paramInt, List<Zgxp> paramList) {
    return (paramList == null || paramList.isEmpty()) ? ZE(paramInt) : Zk(paramInt, paramList);
  }
  
  private boolean Zk(int paramInt, List<Zgxp> paramList) {
    switch (paramInt) {
      case 136448:
        return Zz(paramList);
      case 136704:
        return ZL(paramList);
      case 136960:
        return ZM(paramList);
      case 131584:
        return ZN(paramList);
      case 131328:
        return ZD(paramList);
      case 133120:
        return ZZ(paramList);
      case 132608:
        return ZV(paramList);
      case 132672:
        return Zh(paramList);
      case 132736:
        return ZE(paramList);
      case 132992:
        return Zx(paramList);
      case 133008:
        return Zq(paramList);
      case 134912:
        return Zt(paramList);
      case 135168:
      case 135424:
        return ZQ(paramList, (paramInt == 135424));
      case 134144:
        return ZX(paramList);
      case 134864:
        return Zv(paramList);
      case 527360:
        return ZF(paramList);
      case 527616:
        return ZQ(paramList);
      case 134416:
        return Zr(paramList);
      case 135680:
        return ZI(paramList);
      case 135936:
        return Zw(paramList);
      case 524544:
      case 524545:
      case 524546:
      case 524547:
      case 524548:
      case 524549:
      case 524550:
      case 524551:
      case 524552:
      case 524553:
        return Zq(paramList, paramInt);
      case 134432:
        return ZH(paramList);
      case 134784:
        return ZC(paramList);
    } 
    return false;
  }
  
  private boolean ZE(int paramInt) {
    switch (paramInt) {
      case 266800:
        this.Zs.ZI(paramInt, this);
        return true;
    } 
    return false;
  }
  
  private boolean ZC(List<Zgxp> paramList) {
    Zg89 zg89 = new Zg89();
    File file = Zs6n.ZA(Zg1m.DATA, this.ZO, this.Zg, 1, a(15704, -14054), zg89);
    if (file == null)
      return false; 
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_RESULTS_SAVE_ITEM);
    String str = a(15697, 7919);
    if (ZY(paramList, str))
      return false; 
    Zzq9 zzq9 = new Zzq9(paramList.<Zll9>toArray(new Zll9[0]), this.Zg, this.ZD, file, zg89.Zi(), this.ZZ, this.ZP);
    this.Zu.Zx(zzq9);
    return true;
  }
  
  private boolean ZH(List<Zgxp> paramList) {
    // Byte code:
    //   0: getstatic burp/Zrrh.INTRUDER_ATTACK_RESULTS_COPY_LINKS : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: aload_0
    //   7: getfield Zu : Lburp/Ztwv;
    //   10: aload_0
    //   11: aload_1
    //   12: <illegal opcode> run : (Lburp/Zm_r;Ljava/util/List;)Ljava/lang/Runnable;
    //   17: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   22: pop
    //   23: iconst_1
    //   24: ireturn
  }
  
  private void Ze(List<Zgxp> paramList) {
    Zboe zboe = new Zboe(this.Zg, this.Zu);
    TreeSet treeSet = new TreeSet();
    float f1 = 0.0F;
    float f2 = 100.0F / paramList.size();
    int i = Zmuy.Zp();
    for (Zgxp zgxp : paramList) {
      if (zgxp == null)
        continue; 
      Zstu zstu = zgxp.ZoO();
      if (zstu == null)
        continue; 
      Zs68 zs68 = Zbwc.Zt((Zlit)null, zstu, Zt0k.HTML_ANALYSIS, this.ZZ);
      List<Zsq8> list = Zm46.Zl(zgxp.ZlL(), zs68, null, zstu.ZiD(), this.ZS, this.ZZ, this.ZG);
      list.forEach(treeSet::lambda$copyLinksToClipboard$1);
      if (!zboe.Zq((int)f1, ""))
        break; 
      f1 += f2;
      if (i == 0)
        break; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : treeSet) {
      stringBuilder.append(str);
      stringBuilder.append(Zlb0.Zp);
      if (i == 0)
        break; 
    } 
    this.ZU.accept(stringBuilder.toString());
    zboe.Zd(true);
  }
  
  private boolean Zq(List<Zgxp> paramList, int paramInt) {
    Zz5n.ZY(paramInt);
    return Zw(paramList);
  }
  
  private boolean Zw(List<Zgxp> paramList) {
    Zy(paramList);
    Zm2.Zi(Zv8r.INTRUDER_ATTACK_RESULTS_HIGHLIGHT, Zlxk.ZS);
    return true;
  }
  
  private boolean ZI(List<Zgxp> paramList) {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_RESULTS_ADD_COMMENT);
    String str = Zz5n.ZS((List)paramList, this.Zg);
    if (str == null)
      return false; 
    paramList.forEach(str::lambda$addCommentToResultItems$2);
    this.ZK.run();
    return true;
  }
  
  private boolean Zr(List<Zgxp> paramList) {
    if (paramList.size() > 1)
      return false; 
    Zgxp zgxp = paramList.get(0);
    Zmzk zmzk = zgxp.Zod();
    Zstu zstu = zgxp.Zos();
    Zz1p zz1p = Zghc.ZY(zmzk, zstu, (byte)2, this.ZZ);
    String str = Zt5w.ZP(zz1p, zstu, this.Zg, this.Zz);
    if (str.isEmpty())
      return false; 
    this.ZU.accept(str);
    return true;
  }
  
  private boolean ZQ(List<Zgxp> paramList) {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_RESULTS_DEFINE_EXTRACT_GREP_FROM_RESPONSE);
    Zgxp zgxp = paramList.get(0);
    this.Zq.accept(zgxp);
    return true;
  }
  
  private boolean ZF(List<Zgxp> paramList) {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_RESULTS_REQUEST_ITEM_AGAIN);
    this.Zn.accept(paramList);
    return true;
  }
  
  private boolean Zv(List<Zgxp> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface size : ()I
    //   6: iconst_1
    //   7: if_icmple -> 14
    //   10: iconst_1
    //   11: goto -> 15
    //   14: iconst_0
    //   15: invokestatic Zs : (Z)Ljava/lang/String;
    //   18: astore_2
    //   19: aload_0
    //   20: getfield Zi : Lburp/Zmo9;
    //   23: aload_0
    //   24: getfield Zg : Ljava/awt/Window;
    //   27: aload_2
    //   28: invokeinterface ZM : (Ljava/awt/Component;Ljava/lang/String;)Z
    //   33: ifne -> 40
    //   36: iconst_1
    //   37: goto -> 41
    //   40: iconst_0
    //   41: istore_3
    //   42: iload_3
    //   43: ifeq -> 48
    //   46: iconst_0
    //   47: ireturn
    //   48: getstatic burp/Zrrh.INTRUDER_ATTACK_RESULTS_ADD_TO_SITE_MAP : Lburp/Zrrh;
    //   51: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   54: aload_0
    //   55: getfield Zu : Lburp/Ztwv;
    //   58: aload_0
    //   59: aload_1
    //   60: <illegal opcode> run : (Lburp/Zm_r;Ljava/util/List;)Ljava/lang/Runnable;
    //   65: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   70: pop
    //   71: iconst_1
    //   72: ireturn
  }
  
  private void Z_(List<Zgxp> paramList) {
    int i = Zmuy.Zp();
    if (ZY(paramList, a(15701, -15234)))
      return; 
    Zboe zboe = new Zboe(this.Zg, this.Zu);
    float f1 = 0.0F;
    float f2 = 100.0F / paramList.size();
    for (Zgxp zgxp : paramList) {
      if (zgxp == null || zgxp.Zos() == null)
        continue; 
      Zi(zgxp);
      if (!zboe.Zq((int)f1, ""))
        break; 
      f1 += f2;
      if (i == 0)
        break; 
    } 
    zboe.Zd(true);
  }
  
  private void Zi(Zgxp paramZgxp) {
    Zmzk zmzk = paramZgxp.Zod();
    Zstu zstu1 = paramZgxp.Zos();
    zstu1 = zstu1.Zp(this.ZC);
    Zz1p zz1p = Zghc.ZY(zmzk, zstu1, (byte)1, this.ZZ);
    Zez3 zez3 = a(15706, -21410).equalsIgnoreCase(zz1p.Zb) ? this.ZS.ZP(zz1p.Zo, zstu1, zz1p.ZO(), (short)0) : this.ZS.Zq(zz1p.Zo, (short)0);
    Zsir zsir = (new Zsir()).ZG(zstu1, zz1p.Zb, paramZgxp.Zef()).ZZ((byte)2, (byte)0);
    Zstu zstu2 = paramZgxp.ZoO();
    if (zstu2 != null) {
      Zs68 zs68 = Zbwc.Zt((Zlit)null, zstu2, Zt0k.HTML_HEAD_ANALYSIS, this.ZZ);
      zstu2 = zstu2.Zp(this.ZC);
      zsir.ZV(zstu2, paramZgxp.Zlq(), paramZgxp.Zl7(), zs68.ZH.Zj, Zsir.ZO(zs68), paramZgxp.Zef());
    } 
    zsir.Zd(zez3);
    this.ZS.ZR(zez3);
    this.ZX.Zd(Zeew.TARGET, 0, Zlkk.TAB_FLASH_COLOUR.ZS(), false, true, true);
  }
  
  private boolean ZX(List<Zgxp> paramList) {
    if (ZY(paramList, a(15711, -16003)))
      return false; 
    Zgxp zgxp = paramList.get(0);
    this.Zj.ZC(Zeew.INTRUDER, this.Zg, zgxp.Zod(), zgxp.Zo3(), zgxp.Zoe());
    return true;
  }
  
  private boolean ZQ(List<Zgxp> paramList, boolean paramBoolean) {
    Zgxp zgxp = paramList.get(0);
    Zstu zstu = zgxp.Zos();
    if (zstu == null)
      return false; 
    this.Zv.Zj(zgxp.ZlL(), zstu, paramBoolean, this.Zg);
    return true;
  }
  
  private boolean Zt(List<Zgxp> paramList) {
    Zgxp zgxp = paramList.get(0);
    Zstu zstu = zgxp.ZoO();
    if (zstu == null)
      return false; 
    this.Zv.Zf(zgxp.ZlL(), zstu, this.Zg, (byte)0);
    return true;
  }
  
  private boolean ZE(List<Zgxp> paramList) {
    return ZP(paramList, Zmgv::ZoO);
  }
  
  private boolean Zh(List<Zgxp> paramList) {
    return ZY(paramList, ZR((paramList.size() > 1))) ? false : ZP(paramList, Zmgv::Zos);
  }
  
  private boolean ZP(List<Zgxp> paramList, Function<Zgxp, Zstu> paramFunction) {
    List<Zstu> list = (List)paramList.stream().<Zstu>map(paramFunction).filter(Objects::nonNull).collect(Collectors.toList());
    if (list.isEmpty())
      return false; 
    this.Zy.Zk(list);
    return true;
  }
  
  private boolean ZV(List<Zgxp> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Zf : (Ljava/util/List;)Z
    //   5: pop
    //   6: invokestatic ZK : ()I
    //   9: aload_1
    //   10: iconst_0
    //   11: invokeinterface get : (I)Ljava/lang/Object;
    //   16: checkcast burp/Zgxp
    //   19: astore_3
    //   20: istore_2
    //   21: aload_3
    //   22: invokeinterface ZoO : ()Lburp/Zstu;
    //   27: astore #4
    //   29: aload #4
    //   31: ifnull -> 49
    //   34: aload_0
    //   35: getfield Zy : Lburp/Zg_j;
    //   38: aload #4
    //   40: invokeinterface ZM : (Lburp/Zstu;)V
    //   45: iload_2
    //   46: ifeq -> 73
    //   49: aload_3
    //   50: invokeinterface Zos : ()Lburp/Zstu;
    //   55: astore #5
    //   57: aload #5
    //   59: ifnull -> 73
    //   62: aload_0
    //   63: getfield Zy : Lburp/Zg_j;
    //   66: aload #5
    //   68: invokeinterface ZM : (Lburp/Zstu;)V
    //   73: iconst_1
    //   74: ireturn
  }
  
  private boolean ZZ(List<Zgxp> paramList) {
    int i = Zmuy.ZK();
    if (ZY(paramList, a(15711, -16003)))
      return false; 
    Zgxp zgxp = paramList.get(0);
    Zmzk zmzk = zgxp.Zod();
    Zstu zstu1 = zgxp.Zos();
    Zstu zstu2 = zgxp.ZoO();
    if (zstu2 != null) {
      this.Zk.ZP(zmzk, zstu1, zstu2);
      if (i != 0) {
        this.Zk.ZU(zmzk, zstu1);
        return true;
      } 
      return true;
    } 
    this.Zk.ZU(zmzk, zstu1);
    return true;
  }
  
  private boolean ZD(List<Zgxp> paramList) {
    if (ZY(paramList, a(15711, -16003)))
      return false; 
    Zgxp zgxp = paramList.get(0);
    this.Zc.Ze(zgxp.Zod(), zgxp.Zos(), null, null);
    return true;
  }
  
  private boolean ZN(List<Zgxp> paramList) {
    if (ZY(paramList, a(15711, -16003)))
      return false; 
    Zgxp zgxp = paramList.get(0);
    this.ZN.Zp(zgxp.Zod(), zgxp.Zos(), null, zgxp.ZoO());
    return true;
  }
  
  private boolean Zx(List<Zgxp> paramList) {
    if (ZY(paramList, a(15711, -16003)))
      return false; 
    Ztei.Zj(Zeew.INTRUDER, Zeew.ORGANISER);
    Zgxp zgxp = paramList.get(0);
    this.Zr.ZE(Zeew.INTRUDER, zgxp.Zod(), zgxp.Zo3(), zgxp.ZoO(), zgxp.ZoB(), null);
    return true;
  }
  
  private boolean Zq(List<Zgxp> paramList) {
    if (ZY(paramList, a(15696, -1564)))
      return false; 
    Zgxp zgxp = paramList.get(0);
    this.ZR.Za(zgxp.Zod(), zgxp.Zo3(), zgxp.ZoO(), Zeew.INTRUDER);
    return true;
  }
  
  private boolean ZM(List<Zgxp> paramList) {
    String str = ZN((paramList.size() > 1));
    if (ZY(paramList, str))
      return false; 
    Zm2.Zo(Zze0.INTRUDER_UI_RESULTS_DO_ACTIVE_SCAN);
    this.Zt.Zv().ZO((List)paramList);
    return true;
  }
  
  private boolean ZL(List<Zgxp> paramList) {
    String str = ZN((paramList.size() > 1));
    if (ZY(paramList, str))
      return false; 
    Zm2.Zo(Zze0.INTRUDER_UI_RESULTS_DO_PASSIVE_SCAN);
    this.Zt.Zv().Zg((List)paramList);
    return true;
  }
  
  private boolean Zz(List<Zgxp> paramList) {
    String str = ZN((paramList.size() > 1));
    if (ZY(paramList, str))
      return false; 
    this.Zt.ZH(this.Zg, (List)paramList);
    return true;
  }
  
  boolean ZY(List<Zgxp> paramList, String paramString) {
    if (Zf(paramList)) {
      this.ZD.Zz().Zl(Zkqn.INFORMATION, paramString);
      return true;
    } 
    return false;
  }
  
  private boolean Zf(List<Zgxp> paramList) {
    boolean bool = false;
    Iterator<Zgxp> iterator = paramList.iterator();
    int i = Zmuy.ZK();
    while (iterator.hasNext()) {
      Zgxp zgxp = iterator.next();
      if (zgxp.Zos() != null)
        continue; 
      if (!this.ZF.Ze(zgxp))
        bool = true; 
      if (i != 0)
        break; 
    } 
    return bool;
  }
  
  private void Zy(List<Zgxp> paramList) {
    paramList.forEach(Zm_r::lambda$applyHighlightsToResultItems$4);
    this.ZK.run();
  }
  
  private static String ZN(boolean paramBoolean) {
    return String.format(a(15699, -12417), new Object[] { paramBoolean ? a(15707, -13880) : a(15698, -13121) });
  }
  
  private static String ZR(boolean paramBoolean) {
    return String.format(a(15708, -8319), new Object[] { paramBoolean ? a(15710, 18537) : a(15705, -1496) });
  }
  
  private static String Zs(boolean paramBoolean) {
    return String.format(a(15709, 12339), new Object[] { paramBoolean ? a(15707, -13880) : a(15698, -13121) });
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return ZZ(paramInt, this.Zl.get());
  }
  
  public boolean ZY(int paramInt, List<Zgxp> paramList) {
    return ZZ(paramInt, paramList);
  }
  
  private static void lambda$applyHighlightsToResultItems$4(Zgxp paramZgxp) {
    paramZgxp.ZB((byte)Zlxk.ZS);
  }
  
  private void lambda$addToSiteMap$3(List<Zgxp> paramList) {
    Z_(paramList);
  }
  
  private static void lambda$addCommentToResultItems$2(String paramString, Zgxp paramZgxp) {
    paramZgxp.Zxg(paramString);
  }
  
  private static void lambda$copyLinksToClipboard$1(Set<String> paramSet, Zsq8 paramZsq8) {
    paramSet.add(paramZsq8.ZZ.toString());
  }
  
  private void lambda$copyLinksForResultItemsToClipboard$0(List<Zgxp> paramList) {
    Ze(paramList);
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '>È«\\rGâ6i:vªnãÞèÇR%sxì=R&Í#Ü1²üÂôñ\\tµë*cr£)´ u¦6¢ò[8ÚBRõêpP° ÿs& l¿<¼ mP:/~I^:d-ø¾»´ã-á$¦² Y|ZÌ¾6m£æ×EÌpxl\\\b½¹xíî27 Ç»°¶Å£Ïr½T¯Deu2±â]»âmÇp¡ÐÑm·ü$!\¶xóÉN¦ì;«ö>aÀäö/Ë&3¹øUòûÛ>ïgoß»V!c'í6°+¯kñôüê&ï¤±>GdJôj®0¯-uïÅ¢y-\\f3\\n-¬æ÷w?ý§+\\fþ{YF$õ\\rª7çPyä^å¥Å{-XüÎªÌ"x:>\xÃ\7cqÏ\\tÅQÌÊ~¨;|4]·³`Ò3ÿrA3Íxâñ;ÉþávZçSÀÈªó"sK*î ÎTMr2´ uxÜ¹«ÅÔÉ¬¨ÞI}¹g+þ!?\\n±Kÿz9ç¢½ÀqaczÁ ³üFO3kJeM5Ä!±DzGÄK:\\tÖo§ë*+¾mú|â=¶ì-^á©ôáÞ¨#å³7SJW+ÓV`PYY2-o6ö­çWzTí{¨a§Ý /¯xr¤2hrÐ6ÓW;ÑB\\r¢B><pÍþ6Où ÌÙ[ûcø?´Í>ÁíÁ½ïhðÏ>ô¥ t5ªV"Rtðß¯´Ô1y£µÌûÕk)0^5@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #21
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'éAUm°Ø?·_àá²ÙFõ­dÒ´<»¿\\nüOI¨n\\taÌ­â>yF¹H@ÉK^ÑºT¬xîj{\PJ:Ì!õYÏ®4^Ä§![Jÿ1þõî¢®{_µ\\në¸6\\bOåZù¿'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #79
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zm_r.a : [Ljava/lang/String;
    //   130: bipush #13
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zm_r.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #58
    //   214: goto -> 244
    //   217: bipush #120
    //   219: goto -> 244
    //   222: bipush #123
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #13
    //   234: goto -> 244
    //   237: bipush #106
    //   239: goto -> 244
    //   242: bipush #49
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3D59) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 29;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */