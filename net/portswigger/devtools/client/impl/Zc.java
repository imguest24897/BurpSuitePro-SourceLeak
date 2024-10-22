package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zca;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zh;
import net.portswigger.browser.Zjn;
import net.portswigger.browser.Zt3;
import net.portswigger.browser.Ztk;
import net.portswigger.devtools.client.Zh;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.types.dom.NodeForLocation;

public class Zc implements Zel {
  private final Zn ZB;
  
  private final int ZZ;
  
  private final String Zm;
  
  private final Map<String, String> ZI;
  
  private final Map<String, List<String>> ZN;
  
  private final boolean ZO;
  
  private final boolean Zu;
  
  private final boolean ZK;
  
  private final Zjn ZH;
  
  private List<Zjn> Z_;
  
  private final String ZV;
  
  private final List<Integer> ZU;
  
  private final List<Integer> Zx;
  
  private static final String a;
  
  Zc(Zn paramZn, int paramInt, String paramString1, Map<String, String> paramMap, Map<String, List<String>> paramMap1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Zjn paramZjn, String paramString2, List<Integer> paramList1, List<Integer> paramList2) {
    this.ZB = paramZn;
    this.ZZ = paramInt;
    this.Zm = paramString1;
    this.ZI = paramMap;
    this.ZN = paramMap1;
    this.ZO = paramBoolean1;
    this.Zu = paramBoolean2;
    this.ZK = paramBoolean3;
    this.ZH = paramZjn;
    this.ZV = paramString2;
    String str = Zx7.ZT();
    try {
      this.ZU = paramList1;
      this.Zx = paramList2;
      if (str != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (Zh zh) {
      throw a(null);
    } 
  }
  
  public int Zt() {
    return this.ZZ;
  }
  
  public String ZD() {
    return this.Zm;
  }
  
  public boolean ZC() {
    return this.ZO;
  }
  
  public boolean Zu() {
    return this.Zu;
  }
  
  public Optional<Integer> Z_() {
    Zor zor = (Zor)Zq();
    try {
      Optional<Zca> optional = zor.Zk();
      if (optional.isEmpty())
        return Optional.empty(); 
      NodeForLocation nodeForLocation = (NodeForLocation)this.ZB.Zz(Zk.ZA(optional::lambda$getElementIdentifierAtLocation$0));
      return Optional.of(nodeForLocation.backendNodeId);
    } catch (Zi|InterruptedException|Zh zi) {
      Zah.Zl((Throwable)zi, Zk_.IGNORED);
      return Optional.empty();
    } 
  }
  
  public boolean ZJ() {
    return this.ZK;
  }
  
  public Optional<Zjn> ZW() {
    return Optional.ofNullable(this.ZH);
  }
  
  public String ZI() {
    return this.ZV;
  }
  
  public List<Zjn> ZH(Zt3 paramZt3) {
    try {
      if (this.Z_ == null) {
        this.Z_ = new ArrayList<>();
        paramZt3.ZA(this, this::lambda$getElementTextForDescendants$1);
      } 
    } catch (Zh zh) {
      throw a(null);
    } 
    return this.Z_;
  }
  
  public Map<String, String> ZM() {
    return this.ZI;
  }
  
  public Map<String, List<String>> ZF() {
    return this.ZN;
  }
  
  public List<Zel> ZZ(Zt3 paramZt3) {
    Objects.requireNonNull(paramZt3);
    return (List<Zel>)this.Zx.stream().map(paramZt3::ZS).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
  }
  
  public List<Integer> Zb() {
    return this.ZU;
  }
  
  public Zh Zq() {
    return new Zor(this.ZB, null, Integer.valueOf(this.ZZ));
  }
  
  public String Zd() {
    try {
      return Zq().Zi(a);
    } catch (Ztk ztk) {
      Zah.Zl((Throwable)ztk, Zk_.IGNORED);
      return "";
    } 
  }
  
  private void lambda$getElementTextForDescendants$1(Zel paramZel) {
    Objects.requireNonNull(this.Z_);
    paramZel.ZW().ifPresent(this.Z_::add);
  }
  
  private static CompletableFuture lambda$getElementIdentifierAtLocation$0(Optional<Zca> paramOptional, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getDOM().getNodeForLocation(Integer.valueOf((int)((Zca)paramOptional.get()).ZQ()), Integer.valueOf((int)((Zca)paramOptional.get()).ZG()));
  }
  
  private static Zh a(Zh paramZh) {
    return paramZh;
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc '9E=&w14H>D;==]3U>;0v(qbo8?o]3U>;k\\rs bo8s[Ho\}'"K.qHo8Mhqbo8\\r"}1D U, UQ'F7H>D;[Uo~*^0 vw^<\\rf8$:s[Ho8so01_7F!w;U*8b\\rn[& |:4+U~$& \Y[Ho8s[Ho8B6=v|\SE8s[Ho8<_=\\bok+U#\\bHr8mhqHo8s[H#}+0;}'D\\f*8b=\\f*#Us[Ho8$#}0;}'D\\f*1KY[Ho8s[Ho8S<;8,D6Hr8\6\\r!l,4%y+X}$y+X:}wS<*`+~<\\rf#Us[Ho8s[Hoq9{Z;}/Y[Ho8s[Ho8s[H-j:Q8@bo8s[Ho8s\\b*h,#'0,D6Ats[Ho8s[H,w1D6w;UsFH,w1D6w;U}\\t=}1D\\f*#Us[Ho8.qHo8s[H<l:@ U*n:B @f#Us[Ho8!:j1tTOo3C'<62Q#S;}/nEH<l:@}\\r\\t#m:}&vw|\Ats[tUs[H\\nt:]6<6+\\t;pqo++\\t;p\\tQ?\\ro%V&;q0^{+}v(qHo8s[H#}+<\\fy3E6@bo8s[Ho{0^ H o1y=\\r78b\\r"}1D U, UQ'F`Q'!!|:H{+}vY[Ho8s[)8w_$!!|:HsFUr8rzqHo8s[Ho8!:j1=##Us[Ho8 \\f;{7{+}q^<\\ra/Uz[E8s[Ho8s[.k:\\f*6|6-L ~?-us[Ho8s[Ho8<\\fy3E6[Uov0T6U {>\*#Us[Ho8s[Ho8s*y4Y[Ho8s[Ho8S2\\b\\roV0T6U)L\\ry.<\\nG>RE8s[Ho8s[Ho8_$>.t*UsFHhXxx[ |:=\\f*V>]6SAts[Ho8s[Ho81\\t\\r.sd:s[Ho8s[Ho8<Q Hw;U}/-L ~?-us[Ho8s[H,y,Us5+}qs:<G\\fu/! V ~?-us[Ho8s[Ho8<\\fy3E6[Uo?+U+@f?d:s[Ho8s[Ho8s[\\n=}>[hqHo8s[Ho80*8_7FJs(;Vo5;J\\ns2'G>RE8s[Ho8s[Ho8_$>.t*UsFHhh-_0<q1W~<l-E0 vwt@bo8s[Ho8s[Ho8=B6ts[Ho8s[H,y,Us5+}qs6%\\nVo4,\\n"Us[Ho8s[Ho8s!N>\&Hr8xS<*v+z\SE8s[Ho8s[Ho8R!\\t$#Us[Ho8s[Ho{>C6[& |:4+U~$& \\\nY[Ho8s[Ho8s[H o1f2*8bt\SE8s[Ho8s[Ho8R!\\t$#Us[Ho8s[Ho|:V2;"Us[Ho8s[Ho8s!N>\&Hr8xhqHo8s[Ho8s[Hoz-U2SE8s[Ho8":s[Ho8so00G=2+}'m[Xfs[Ho8s[H o1f2*8t\\rs\3h8t<\\fv;U+[Co?hqHo8s[H=}+E!H!}(\\r"}1D U, UQ'Fl:@{!N>\&Dov0T6U |:d*\\ro%b\\rs5+}qt8=]d\\f5']vY[Ho8"YqHo8u?*v+C}?'H>D;U77H>D;2+}'n[:v<D:gv0T6RH4s[Ho8V&;q0^s*V0T6\\b;&u6\2\\t@#}9D[&7Dz[E8s[Ho8s[)8w\6o%b\\rs\\t(p+Y[Ho8s[Ho8s[H=}+E!H;j*UhqHo8s[Ho8:Hgt:V'U |:d*\\ro%b\\rs5+}qu>%\\nVo4,\\n8ys\\t(p+=\\f*L&@6[Ur%~<\\ra]u>&G>AE8s[Ho8s[Ho8B6=v\6at0S2&.u:nFUoj6W;F#w<Q?5\\t"}d:s[Ho8s[Ho86VsS*~+=\\f*L&@6[Ur%B: ;61_7<6h:Y[Ho8s[Ho8s[H=}+E!H;j*UhqHo8s[Ho80<l\6a/UsFH#}9D}+}I#Hr%b\\f*6t/)Ks2'G>Hp8_7F]d\\f5']\\ns\\r)lq^<\\ra/UhqHo8s[Ho80<lB: ;L&@6[Uoj6W;F!w;U*8b\\rn[& |:?)Y c8<Wo4,\\n8`\\f*6u/7WusAH=q8X'U |:d*\\rts[Ho8s[H=}+E!H#}9D*8b\\rn[&7D*#Us[Ho8.qHo8s[H,w1C'[&z3Y=o%^<\\rah>B6w;UsDH!w;U}\\t=}1D\\f*6<X:\\f=}1i[:t3Y[Ho8s[)8w \\n#q1W Rbo8s[Ho8s\\t\\r;m-^sKSE8s[Ho83U'[ .k\\fQ>&.u:T\\r"}1D @bo8s[Ho~0BsS*lYsFH#YsGH<q=\:<63U='#xAocUs[Ho8s[Hoq9{*V0T6\\b;&u6\2\\t@!w;U[&z3Y=qs]Nok6R?(kY[Ir%^<\\rf8$:s[Ho8s[Ho8s[ .k\\fQ>&.u:T\\r"}1D [Uol-E6@bo8s[Ho8s[Ho8=B6ts[Ho8s[H2s[Ho8MY[Ho8s[)8w;y2U*|\6\\r!l,Y[Ho8s[Ho8B6=v hqHo8s[H#}+<\\fv;U+[Uo)d:s[Ho8s=8w\6H&8bc@H&8c \\n#q1W U*v8D;@Hd36s bo8s[Ho8so0>B65+},c:#y-=\\f*4C:&v8C\\b5f1KY[Ho8s[Ho8s[H&~ \\n#q1W  8b\\rn[ |:Y[Ho8s[Ho8s[Ho8!:j1<\\fv;U+@bo8s[Ho8s[Ho8t<\\fv;U+@bo8s[Ho8sbo8s[HoeUs[Ho8!:j1~JSE8sSEs[-#}2U=a\}'6\\fD6Hr89E=&w1%:}v(qHo8s[H;p6C}\\r\\t#m:n[.t*UhqHo8Mhqbo8!:j1\\r"}1D U, UQ'F7H>D;S'q,hq'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zc.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #17
    //   82: goto -> 111
    //   85: bipush #126
    //   87: goto -> 111
    //   90: bipush #29
    //   92: goto -> 111
    //   95: bipush #53
    //   97: goto -> 111
    //   100: bipush #38
    //   102: goto -> 111
    //   105: iconst_1
    //   106: goto -> 111
    //   109: bipush #86
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */