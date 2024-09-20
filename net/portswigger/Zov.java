package net.portswigger;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.openapi4j.Zi;
import org.openapi4j.Zo;
import org.openapi4j.Zpe;
import org.openapi4j.Zpf;

public class Zov {
  private final Zpf Ze;
  
  private final Zqt Zx;
  
  private final URL ZK;
  
  public Zov(Zpf paramZpf, URL paramURL) {
    this.Ze = paramZpf;
    this.ZK = paramURL;
    this.Zx = new Zqt(paramZpf);
  }
  
  public List<Ztb> ZT() {
    return Optional.<List<Ztb>>of((List<Ztb>)((Set)Optional.<Map>ofNullable(this.Ze.getPaths()).map(Map::entrySet).orElse(new HashSet())).stream().map(this::lambda$create$0).map(this::ZZ).flatMap(Collection::stream).collect(Collectors.toList())).filter(Zov::lambda$create$1).orElse(Collections.emptyList());
  }
  
  private Zsn ZS(Ztb paramZtb) {
    return new Zsn(this.Ze.getComponents(), paramZtb);
  }
  
  private List<Ztb> ZZ(Ztb paramZtb) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZB : ()Lorg/openapi4j/Zi;
    //   4: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   7: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   12: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   15: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   20: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   23: new java/util/HashSet
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   33: checkcast java/util/Set
    //   36: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   41: aload_0
    //   42: aload_1
    //   43: <illegal opcode> apply : (Lnet/portswigger/Zov;Lnet/portswigger/Ztb;)Ljava/util/function/Function;
    //   48: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   53: invokestatic toList : ()Ljava/util/stream/Collector;
    //   56: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   61: checkcast java/util/List
    //   64: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   67: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   72: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   75: invokestatic emptyList : ()Ljava/util/List;
    //   78: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   81: checkcast java/util/List
    //   84: areturn
  }
  
  private Ztb Ze(String paramString, Zpe paramZpe, Ztb paramZtb) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Arrays.<Znv>stream(Znv.values()).forEach(hashMap::lambda$processOperation$4);
    if (paramZtb.ZB() != null && paramZtb.ZB().getParameters() != null)
      ZI((Map)hashMap, paramZtb.ZB().getParameters()); 
    if (paramZpe != null && paramZpe.getParameters() != null)
      ZI((Map)hashMap, paramZpe.getParameters()); 
    return ZS(paramZtb).Za(paramString).ZJ(new Zmf(this.Ze, this.Zx, paramZpe)).ZZ(paramZtb.ZK()).ZO(((Map)hashMap.getOrDefault(Znv.COOKIE, Collections.emptyMap())).values()).ZQ(((Map)hashMap.getOrDefault(Znv.HEADER, Collections.emptyMap())).values()).Zc(((Map)hashMap.getOrDefault(Znv.PATH, Collections.emptyMap())).values()).ZB(((Map)hashMap.getOrDefault(Znv.QUERY, Collections.emptyMap())).values()).Zd();
  }
  
  private void ZI(Map<Znv, Map<String, Zi5>> paramMap, Collection<Zo> paramCollection) {
    Objects.requireNonNull(this.Zx);
    paramCollection.stream().map(this.Zx::ZX).forEach(paramMap::lambda$addParametersToMap$5);
  }
  
  private static void lambda$addParametersToMap$5(Map paramMap, Zi5 paramZi5) {
    ((Map<String, Zi5>)paramMap.get(paramZi5.Zw())).put(paramZi5.ZX(), paramZi5);
  }
  
  private static void lambda$processOperation$4(Map paramMap, Znv paramZnv) {
    paramMap.put(paramZnv, new LinkedHashMap<>());
  }
  
  private static boolean lambda$processPath$3(List paramList) {
    return !paramList.isEmpty();
  }
  
  private Ztb lambda$processPath$2(Ztb paramZtb, Map.Entry paramEntry) {
    return Ze((String)paramEntry.getKey(), (Zpe)paramEntry.getValue(), paramZtb);
  }
  
  private static boolean lambda$create$1(List paramList) {
    return !paramList.isEmpty();
  }
  
  private Ztb lambda$create$0(Map.Entry paramEntry) {
    return (new Zsn(this.Ze.getComponents())).Ze((String)paramEntry.getKey()).ZZ((Zi)paramEntry.getValue()).Zu(this.Ze.getServers()).ZZ(this.ZK).Zd();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zov.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */