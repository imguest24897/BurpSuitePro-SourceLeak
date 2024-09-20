package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zs94 {
  public static Map<String, List<? extends Zsnh>> Zc(Set<Zmln> paramSet, Zmf_ paramZmf_1, Zmf_ paramZmf_2, Zbqp paramZbqp, Zxts paramZxts, Zr49 paramZr49, Ztfv paramZtfv, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zvo_ paramZvo_, Zm9o paramZm9o) {
    return ZD(paramSet, paramZmf_1, paramZmf_2, paramZbqp, paramZxts, paramZr49, paramZtfv, paramZezx, paramZt8u, paramZbnt, paramZr_4, Zsnq.ZA, paramZvo_, paramZm9o, true);
  }
  
  public static Map<String, List<? extends Zsnh>> ZD(Set<Zmln> paramSet, Zmf_ paramZmf_1, Zmf_ paramZmf_2, Zbqp paramZbqp, Zxts paramZxts, Zr49 paramZr49, Ztfv paramZtfv, Zezx paramZezx, Zt8u paramZt8u, Zbnt paramZbnt, Zr_4 paramZr_4, Zsnq paramZsnq, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean) {
    Zkkg zkkg = Zb(paramZr_4);
    Zqu zqu = ZH(paramZr_4);
    Zx_7 zx_7 = Zx_7.ZM(paramZr_4);
    int i = Zbho.Zm();
    Zljp zljp = Zt(paramSet, zkkg, zqu, zx_7, paramZbqp, paramZxts, paramZr49, paramZtfv, paramZbnt, paramZr_4, paramZsnq, paramZvo_, paramZm9o, paramBoolean);
    Zmv8 zmv8 = new Zmv8(new Zm3g[] { zkkg, zqu, zx_7, zljp.Zl });
    ZV(zmv8, paramZmf_1, paramZmf_2, paramZt8u, paramZezx, (List<? extends Zsnh>)zljp.Zc.values().stream().flatMap(Collection::stream).collect(Collectors.toList()));
    if (Zbqc.Zwu() == null)
      Zbho.Zz(++i); 
    return zljp.Zc;
  }
  
  private static Zkkg Zb(Zr_4 paramZr_4) {
    return new Zkkg(paramZr_4.<Zrmh>ZH(new Zli6()), paramZr_4.<Zlzm>ZH(new Zt9v()), paramZr_4.<Zlxo>ZH(new Zgyf()), paramZr_4.<Zrl9>ZH(new Ztu4()), paramZr_4.<Zmu3>ZH(new Zbux()), paramZr_4.<Zrfu>ZH(new Zmd1()));
  }
  
  private static Zqu ZH(Zr_4 paramZr_4) {
    return paramZr_4.<Zqu>ZH(new Zgz8());
  }
  
  private static void ZV(Zm3g paramZm3g, Zmf_ paramZmf_1, Zmf_ paramZmf_2, Zt8u paramZt8u, Zezx paramZezx, List<? extends Zsnh> paramList) {
    Zlaq zlaq = new Zlaq(paramZm3g, Zskh.Zo, paramZt8u, paramZezx);
    zlaq.ZC(paramZmf_1, new String[0]);
    zlaq.ZC(paramZmf_2, new String[0]);
    paramList.forEach(Zedo::Zt2);
  }
  
  private static Zljp Zt(Set<Zmln> paramSet, Zkkg paramZkkg, Zqu paramZqu, Zx_7 paramZx_7, Zbqp paramZbqp, Zxts paramZxts, Zr49 paramZr49, Ztfv paramZtfv, Zbnt paramZbnt, Zr_4 paramZr_4, Zsnq paramZsnq, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean) {
    // Byte code:
    //   0: new burp/Zmv8
    //   3: dup
    //   4: iconst_0
    //   5: anewarray burp/Zm3g
    //   8: invokespecial <init> : ([Lburp/Zm3g;)V
    //   11: astore #14
    //   13: new java/util/HashMap
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore #15
    //   22: aload_0
    //   23: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   28: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   33: invokestatic comparingInt : (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    //   36: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
    //   41: aload #15
    //   43: aload_1
    //   44: aload_2
    //   45: aload_3
    //   46: aload #4
    //   48: aload #5
    //   50: aload #6
    //   52: aload #7
    //   54: aload #8
    //   56: aload #9
    //   58: aload #10
    //   60: aload #11
    //   62: aload #12
    //   64: iload #13
    //   66: aload #14
    //   68: <illegal opcode> accept : (Ljava/util/Map;Lburp/Zkkg;Lburp/Zqu;Lburp/Zx_7;Lburp/Zbqp;Lburp/Zxts;Lburp/Zr49;Lburp/Ztfv;Lburp/Zbnt;Lburp/Zr_4;Lburp/Zsnq;Lburp/Zvo_;Lburp/Zm9o;ZLburp/Zmv8;)Ljava/util/function/Consumer;
    //   73: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   78: aload #15
    //   80: invokeinterface isEmpty : ()Z
    //   85: ifeq -> 101
    //   88: iconst_0
    //   89: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   92: aload_0
    //   93: invokeinterface toString : ()Ljava/lang/String;
    //   98: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   101: new burp/Zljp
    //   104: dup
    //   105: aload #15
    //   107: aload #14
    //   109: invokespecial <init> : (Ljava/util/Map;Lburp/Zmv8;)V
    //   112: areturn
  }
  
  private static List<? extends Zsnh> ZL(Zmln paramZmln, Zkkg paramZkkg, Zqu paramZqu, Zx_7 paramZx_7, Zbqp paramZbqp, Zxts paramZxts, Zr49 paramZr49, Ztfv paramZtfv, Zbnt paramZbnt, Zr_4 paramZr_4, Zsnq paramZsnq, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean, Zmv8 paramZmv8) {
    Zbmn zbmn;
    LinkedList<Zbek> linkedList;
    Zbmf zbmf;
    Zbm_ zbm_;
    switch (Zs2_.ZL[paramZmln.ordinal()]) {
      case 1:
        zbmn = new Zbmn(paramZkkg.Zp(), paramZkkg.ZM(), paramBoolean);
        Objects.requireNonNull(zbmn);
        return List.of(new Zbmz(paramZkkg.ZM(), paramBoolean, zbmn::Zi), new Zbm6(paramZkkg.ZD()), zbmn, new Zbml(paramZkkg.ZP(), paramBoolean), new Zbmx(paramZkkg.Zb(), paramBoolean), new Zbmj(paramZkkg.Zq(), paramBoolean));
      case 2:
        linkedList = new LinkedList();
        linkedList.add(new Zbek(paramZx_7.Zi(), paramBoolean));
        linkedList.add(new Zba8(paramZx_7.Zk(), paramZsnq));
        linkedList.add(new Zbea(paramZx_7.ZK()));
        if (paramZsnq.Zr()) {
          linkedList.add(new Zber(paramZx_7.ZA()));
          linkedList.add(new Zbao(paramZx_7.ZA()));
          linkedList.add(new Zbeg(paramZx_7.ZA(), paramZmv8, paramZr_4));
          linkedList.add(new Zbed(paramZx_7.ZA()));
          linkedList.add(new Zbey(paramZx_7.ZA()));
        } 
        linkedList.add(new Zbet(paramZx_7.Zq()));
        linkedList.add(new Zbec(paramZx_7.Zv()));
        return (List)linkedList;
      case 3:
        return List.of(new Zbmw(paramZqu, paramZr49, paramZbqp, paramZxts, paramZtfv, paramZbnt, paramZr_4));
      case 4:
        zbmf = new Zbmf(paramZvo_, paramZm9o);
        paramZmv8.Zi(zbmf);
        return List.of(zbmf);
      case 5:
        zbm_ = new Zbm_(paramZr49, paramZbnt, paramZr_4);
        paramZmv8.Zi(zbm_);
        return List.of(zbm_);
    } 
    Zuh.ZT(false, Zqf.Zk, paramZmln.displayString);
    return Collections.emptyList();
  }
  
  private static void lambda$buildConfigPanels$1(Map<String, List<? extends Zsnh>> paramMap, Zkkg paramZkkg, Zqu paramZqu, Zx_7 paramZx_7, Zbqp paramZbqp, Zxts paramZxts, Zr49 paramZr49, Ztfv paramZtfv, Zbnt paramZbnt, Zr_4 paramZr_4, Zsnq paramZsnq, Zvo_ paramZvo_, Zm9o paramZm9o, boolean paramBoolean, Zmv8 paramZmv8, Zmln paramZmln) {
    paramMap.put(paramZmln.displayString, ZL(paramZmln, paramZkkg, paramZqu, paramZx_7, paramZbqp, paramZxts, paramZr49, paramZtfv, paramZbnt, paramZr_4, paramZsnq, paramZvo_, paramZm9o, paramBoolean, paramZmv8));
  }
  
  private static int lambda$buildConfigPanels$0(Zmln paramZmln) {
    return paramZmln.displayOrder;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs94.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */