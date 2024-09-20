package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Marker;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.ContentType;
import burp.api.montoya.http.message.HttpHeader;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.params.HttpParameterType;
import burp.api.montoya.http.message.params.ParsedHttpParameter;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.requests.HttpTransformation;
import burp.api.montoya.http.message.requests.MalformedRequestException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

public abstract class Zsie implements Zztj, Proxyable {
  final Zr_4 ZE;
  
  final Zbnt ZY;
  
  final Zelu Zo;
  
  final List<Marker> ZD;
  
  final Zey9 Zw;
  
  final Zslu Zq;
  
  private final boolean ZF;
  
  Zt68 ZR;
  
  private static boolean ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zsie(Zelu paramZelu, Zbnt paramZbnt, List<Marker> paramList, Zr_4 paramZr_4, boolean paramBoolean, Zey9 paramZey9, Zslu paramZslu) {
    this.Zo = paramZelu;
    this.ZY = paramZbnt;
    this.ZD = paramList;
    this.ZR = Zt68.Zv;
    this.ZE = paramZr_4;
    this.ZF = paramBoolean;
    this.Zw = paramZey9;
    this.Zq = paramZslu;
  }
  
  abstract HttpRequest ZD(Zefx paramZefx, List<Marker> paramList);
  
  abstract HttpRequest ZN(List<Marker> paramList);
  
  abstract Zztj ZW(Zr_4 paramZr_4, boolean paramBoolean);
  
  public abstract Zefx ZE();
  
  public HttpRequest withAddedHeaders(List<? extends HttpHeader> paramList) {
    HttpRequest httpRequest = this;
    Iterator<? extends HttpHeader> iterator = paramList.iterator();
    boolean bool = Z_();
    while (iterator.hasNext()) {
      HttpHeader httpHeader = iterator.next();
      httpRequest = httpRequest.withAddedHeader(httpHeader);
      if (bool)
        break; 
    } 
    return httpRequest;
  }
  
  public HttpRequest withAddedHeaders(HttpHeader... paramVarArgs) {
    return withAddedHeaders(Arrays.asList(paramVarArgs));
  }
  
  public HttpRequest withUpdatedHeaders(List<? extends HttpHeader> paramList) {
    HttpRequest httpRequest = this;
    Iterator<? extends HttpHeader> iterator = paramList.iterator();
    boolean bool = Zv();
    while (iterator.hasNext()) {
      HttpHeader httpHeader = iterator.next();
      httpRequest = httpRequest.withUpdatedHeader(httpHeader);
      if (!bool)
        break; 
    } 
    return httpRequest;
  }
  
  public HttpRequest withUpdatedHeaders(HttpHeader... paramVarArgs) {
    return withUpdatedHeaders(Arrays.asList(paramVarArgs));
  }
  
  public HttpRequest withRemovedHeaders(List<? extends HttpHeader> paramList) {
    HttpRequest httpRequest = this;
    Iterator<? extends HttpHeader> iterator = paramList.iterator();
    boolean bool = Z_();
    while (iterator.hasNext()) {
      HttpHeader httpHeader = iterator.next();
      httpRequest = httpRequest.withRemovedHeader(httpHeader);
      if (bool)
        break; 
    } 
    return httpRequest;
  }
  
  public HttpRequest withRemovedHeaders(HttpHeader... paramVarArgs) {
    return withRemovedHeaders(Arrays.asList(paramVarArgs));
  }
  
  public Zztj ZG(Zr_4 paramZr_4) {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    boolean bool = (paramZr_4 != this.ZE) ? true : false;
    try {
      if (ZH())
        try {
          if (bool)
            return this; 
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return ZW(paramZr_4, bool);
  }
  
  public boolean isInScope() {
    return this.Zq.ZG(ZO());
  }
  
  public HttpService httpService() {
    return Zzhd.Zb(this.Zo.ZDj(), this.ZY);
  }
  
  public String method() {
    Zb((byte)1);
    String str = this.ZR.ZX();
    try {
      if (str == null)
        throw new MalformedRequestException(a(9518, 26274)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return str;
  }
  
  public String path() {
    Zb((byte)1);
    Zlit zlit = this.ZR.Zo();
    try {
      if (zlit == null)
        throw new MalformedRequestException(a(9506, 1521)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return Zkb.ZG(zlit.ZdH());
  }
  
  public String query() {
    Zb((byte)1);
    Zlit zlit = this.ZR.Zo();
    try {
      if (zlit == null)
        throw new MalformedRequestException(a(9506, 1521)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    String str = Zkb.ZG(zlit.ZdC());
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return (str == null) ? "" : str;
  }
  
  public String fileExtension() {
    Zb((byte)1);
    Zlit zlit = this.ZR.Zo();
    try {
      if (zlit == null)
        throw new MalformedRequestException(a(9506, 1521)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    String str = zlit.Zd_();
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return (str == null) ? "" : str;
  }
  
  public String pathWithoutQuery() {
    Zb((byte)1);
    Zlit zlit = this.ZR.Zo();
    try {
      if (zlit == null)
        throw new MalformedRequestException(a(9505, -29346)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return Zkb.ZG(zlit.Zd4());
  }
  
  public String httpVersion() {
    Zb((byte)1);
    return this.ZR.ZV();
  }
  
  public String url() {
    Zlit zlit = ZO();
    try {
      if (zlit == null)
        throw new MalformedRequestException(a(9506, 1521)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return zlit.toString();
  }
  
  private Zlit ZO() {
    Zb((byte)1);
    return this.ZR.Zo();
  }
  
  public ContentType contentType() {
    Zb((byte)2);
    return Ztc3.Zu(this.ZR.Zr());
  }
  
  public int bodyOffset() {
    Zb((byte)1);
    return this.ZR.Zl();
  }
  
  public String bodyToString() {
    return body().toString();
  }
  
  public List<ParsedHttpParameter> parameters() {
    Zb((byte)2);
    return (List<ParsedHttpParameter>)this.ZR.Zm().stream().map(Zxdv::Zl).collect(Collectors.toList());
  }
  
  public List<ParsedHttpParameter> parameters(HttpParameterType paramHttpParameterType) {
    return parameters().stream().filter(paramHttpParameterType::lambda$parameters$0).toList();
  }
  
  public boolean hasParameters(HttpParameterType paramHttpParameterType) {
    return parameters().stream().anyMatch(paramHttpParameterType::lambda$parameters$0);
  }
  
  public boolean hasParameters() {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return !parameters().isEmpty();
  }
  
  public ParsedHttpParameter parameter(String paramString, HttpParameterType paramHttpParameterType) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual parameters : ()Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_1
    //   10: aload_2
    //   11: <illegal opcode> test : (Ljava/lang/String;Lburp/api/montoya/http/message/params/HttpParameterType;)Ljava/util/function/Predicate;
    //   16: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   21: invokeinterface findFirst : ()Ljava/util/Optional;
    //   26: aconst_null
    //   27: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   30: checkcast burp/api/montoya/http/message/params/ParsedHttpParameter
    //   33: areturn
  }
  
  public String parameterValue(String paramString, HttpParameterType paramHttpParameterType) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual parameters : ()Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_1
    //   10: aload_2
    //   11: <illegal opcode> test : (Ljava/lang/String;Lburp/api/montoya/http/message/params/HttpParameterType;)Ljava/util/function/Predicate;
    //   16: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   21: invokeinterface findFirst : ()Ljava/util/Optional;
    //   26: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   31: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   34: aconst_null
    //   35: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast java/lang/String
    //   41: areturn
  }
  
  public boolean hasParameter(String paramString, HttpParameterType paramHttpParameterType) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual parameters : ()Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_1
    //   10: aload_2
    //   11: <illegal opcode> test : (Ljava/lang/String;Lburp/api/montoya/http/message/params/HttpParameterType;)Ljava/util/function/Predicate;
    //   16: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   21: ireturn
  }
  
  public boolean hasParameter(HttpParameter paramHttpParameter) {
    return parameters().stream().anyMatch(paramHttpParameter::lambda$hasParameter$5);
  }
  
  boolean ZH() {
    return this.ZF;
  }
  
  public boolean contains(String paramString, boolean paramBoolean) {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return (toByteArray().indexOf(paramString, paramBoolean) != -1);
  }
  
  public boolean contains(Pattern paramPattern) {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return (toByteArray().indexOf(paramPattern) != -1);
  }
  
  public String toString() {
    return toByteArray().toString();
  }
  
  public HttpRequest withMethod(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(9504, 23990)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zefx zefx = ZE().Zr(paramString);
    return ZD(zefx, this.ZD);
  }
  
  public boolean hasHeader(HttpHeader paramHttpHeader) {
    return hasHeader(paramHttpHeader.name(), paramHttpHeader.value());
  }
  
  public boolean hasHeader(String paramString) {
    return headers().stream().map(HttpHeader::name).anyMatch(paramString::lambda$hasHeader$6);
  }
  
  public boolean hasHeader(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual headers : ()Ljava/util/List;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_1
    //   10: aload_2
    //   11: <illegal opcode> test : (Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Predicate;
    //   16: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   21: ireturn
  }
  
  public HttpHeader header(String paramString) {
    return headers().stream().filter(paramString::lambda$header$8).findFirst().orElse(null);
  }
  
  public String headerValue(String paramString) {
    Optional optional = headers().stream().filter(paramString::lambda$header$8).findFirst();
    return optional.map(HttpHeader::value).orElse(null);
  }
  
  public HttpRequest withPath(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(9517, -7384)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zefx zefx = ZE().Zo(paramString);
    return ZD(zefx, this.ZD);
  }
  
  public HttpRequest withService(HttpService paramHttpService) {
    try {
      if (paramHttpService == null)
        throw new IllegalArgumentException(a(9509, 30402)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zmzk zmzk = Zblx.Zm(paramHttpService, this.ZY);
    Zefx zefx = ZE().ZS(zmzk, this.Zw);
    return ZD(zefx, this.ZD);
  }
  
  public HttpRequest withHeader(HttpHeader paramHttpHeader) {
    boolean bool = headers().stream().anyMatch(paramHttpHeader::lambda$withHeader$10);
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return bool ? withUpdatedHeader(paramHttpHeader) : withAddedHeader(paramHttpHeader);
  }
  
  public HttpRequest withHeader(String paramString1, String paramString2) {
    boolean bool = headers().stream().anyMatch(paramString1::lambda$withHeader$11);
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return bool ? withUpdatedHeader(paramString1, paramString2) : withAddedHeader(paramString1, paramString2);
  }
  
  public HttpRequest withParameter(HttpParameter paramHttpParameter) {
    boolean bool = parameters().stream().anyMatch(paramHttpParameter::lambda$withParameter$12);
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return bool ? withUpdatedParameters(new HttpParameter[] { paramHttpParameter }) : withAddedParameters(new HttpParameter[] { paramHttpParameter });
  }
  
  public HttpRequest withAddedParameters(HttpParameter... paramVarArgs) {
    try {
      if (paramVarArgs == null)
        throw new IllegalArgumentException(a(9519, -28840)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return withAddedParameters(Arrays.asList(paramVarArgs));
  }
  
  public HttpRequest withAddedParameters(List<? extends HttpParameter> paramList) {
    boolean bool = Zv();
    try {
      if (paramList == null)
        throw new IllegalArgumentException(a(9510, 19617)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zefx zefx = ZE();
    for (HttpParameter httpParameter : paramList) {
      zefx = zefx.ZH(Z_(zefx, httpParameter));
      if (!bool)
        break; 
    } 
    zefx = ZC(zefx);
    return ZD(zefx, this.ZD);
  }
  
  public HttpRequest withRemovedParameters(HttpParameter... paramVarArgs) {
    try {
      if (paramVarArgs == null)
        throw new IllegalArgumentException(a(9510, 19617)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return withRemovedParameters(Arrays.asList(paramVarArgs));
  }
  
  public HttpRequest withRemovedParameters(List<? extends HttpParameter> paramList) {
    boolean bool = Zv();
    try {
      if (paramList == null)
        throw new IllegalArgumentException(a(9510, 19617)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zefx zefx = ZE();
    for (HttpParameter httpParameter : paramList) {
      zefx = zefx.ZO(ZW(zefx, httpParameter));
      if (!bool)
        break; 
    } 
    zefx = ZC(zefx);
    return ZD(zefx, this.ZD);
  }
  
  public HttpRequest withUpdatedParameters(HttpParameter... paramVarArgs) {
    try {
      if (paramVarArgs == null)
        throw new IllegalArgumentException(a(9510, 19617)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return withUpdatedParameters(Arrays.asList(paramVarArgs));
  }
  
  public HttpRequest withUpdatedParameters(List<? extends HttpParameter> paramList) {
    boolean bool = Zv();
    try {
      if (paramList == null)
        throw new IllegalArgumentException(a(9510, 19617)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zefx zefx = ZE();
    for (HttpParameter httpParameter : paramList) {
      zefx = zefx.ZK(httpParameter.name(), Zz(httpParameter.type(), zefx), httpParameter.value());
      if (!bool)
        break; 
    } 
    zefx = ZC(zefx);
    return ZD(zefx, this.ZD);
  }
  
  public HttpRequest withTransformationApplied(HttpTransformation paramHttpTransformation) {
    Zefx zefx = ZE();
    zefx = zefx.ZN(ZN(paramHttpTransformation));
    return ZD(zefx, this.ZD);
  }
  
  public HttpRequest withBody(String paramString) {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return withBody((paramString == null) ? null : Zsyg.Zh(paramString));
  }
  
  public HttpRequest withBody(ByteArray paramByteArray) {
    try {
      if (paramByteArray == null)
        throw new IllegalArgumentException(a(9507, -15295)); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zefx zefx = ZE();
    zefx = zefx.ZZ(paramByteArray.getBytes());
    zefx = ZC(zefx);
    return ZD(zefx, this.ZD);
  }
  
  public List<Marker> markers() {
    return this.ZD;
  }
  
  public HttpRequest withMarkers(List<Marker> paramList) {
    return ZN(paramList);
  }
  
  public HttpRequest withMarkers(Marker... paramVarArgs) {
    return withMarkers(List.of(paramVarArgs));
  }
  
  public HttpRequest withAddedHeader(String paramString1, String paramString2) {
    return withAddedHeader(Zzn7.ZU(paramString1, paramString2));
  }
  
  public HttpRequest withAddedHeader(HttpHeader paramHttpHeader) {
    Zefx zefx1 = ZE();
    Zefx zefx2 = zefx1.ZQ(paramHttpHeader.name(), paramHttpHeader.value());
    return ZD(zefx2, this.ZD);
  }
  
  public HttpRequest withUpdatedHeader(String paramString1, String paramString2) {
    return withUpdatedHeader(Zzn7.ZU(paramString1, paramString2));
  }
  
  public HttpRequest withUpdatedHeader(HttpHeader paramHttpHeader) {
    Zefx zefx1 = ZE();
    Zefx zefx2 = zefx1.Zj(paramHttpHeader.name(), paramHttpHeader.value());
    return ZD(zefx2, this.ZD);
  }
  
  public HttpRequest withRemovedHeader(HttpHeader paramHttpHeader) {
    return withRemovedHeader(paramHttpHeader.name());
  }
  
  public HttpRequest withRemovedHeader(String paramString) {
    Zefx zefx1 = ZE();
    Zefx zefx2 = zefx1.ZY(paramString);
    return ZD(zefx2, this.ZD);
  }
  
  public HttpRequest withDefaultHeaders() {
    HttpRequest httpRequest = this;
    Iterator<Ztnz> iterator = Zldg.Zd(false).iterator();
    boolean bool = Z_();
    while (iterator.hasNext()) {
      Ztnz ztnz = iterator.next();
      httpRequest = httpRequest.withAddedHeader(Zkb.ZG(ztnz.Ze), Zkb.ZG(ztnz.ZM));
      if (bool)
        break; 
    } 
    return httpRequest;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zsie zsie = (Zsie)paramObject;
    try {
      if (Objects.equals(this.Zo, zsie.Zo))
        try {
          if (Objects.equals(this.ZD, zsie.ZD));
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zo, this.ZD });
  }
  
  void Zb(byte paramByte) {
    try {
      if (!this.ZR.Zf(paramByte))
        this.ZR = Zk(paramByte); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
  }
  
  abstract Zt68 Zk(byte paramByte);
  
  abstract Zefx ZC(Zefx paramZefx);
  
  private static Zlou Z_(Zefx paramZefx, HttpParameter paramHttpParameter) {
    return Zlou.Z_(Zz(paramHttpParameter.type(), paramZefx), paramHttpParameter.name(), paramHttpParameter.value());
  }
  
  private static Zlou ZW(Zefx paramZefx, HttpParameter paramHttpParameter) {
    return Zlou.Z_(Zz(paramHttpParameter.type(), paramZefx), paramHttpParameter.name(), null);
  }
  
  private static Zrdu Zz(HttpParameterType paramHttpParameterType, Zefx paramZefx) {
    try {
      switch (Zkmy.Zb[paramHttpParameterType.ordinal()]) {
        case 1:
        
        case 2:
          try {
          
          } catch (MalformedRequestException malformedRequestException) {
            throw a(null);
          } 
          return paramZefx.ZC() ? Zrdu.BODY_PARAM_MULTIPART : Zrdu.BODY_PARAM_URL_ENCODED;
        case 3:
        
      } 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    throw new UnsupportedOperationException(a(9508, -23859));
  }
  
  private static Zrec ZN(HttpTransformation paramHttpTransformation) {
    try {
      if (paramHttpTransformation == HttpTransformation.TOGGLE_METHOD)
        return Ztvk.Zv; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(9511, -30851) + a(9511, -30851));
  }
  
  static HttpRequest Zg(Zelu paramZelu, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    try {
      if (paramZelu == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    try {
      if (paramZelu.ZD7() != null)
        return Zsik.ZI(paramZelu, paramZbnt, paramZr_4, paramZey9, paramZslu); 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return Zsia.Zh(paramZelu, paramZbnt, paramZr_4, paramZey9, paramZslu);
  }
  
  static HttpRequest Zu(Zefx paramZefx, Zbnt paramZbnt, Zr_4 paramZr_4, Zey9 paramZey9, Zslu paramZslu) {
    try {
      if (paramZefx == null)
        return null; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    Zbpg zbpg = new Zbpg(paramZbnt, paramZr_4, paramZey9, paramZslu);
    paramZefx.Zi(zbpg);
    return zbpg.ZD;
  }
  
  private static boolean ZR(ParsedHttpParameter paramParsedHttpParameter, String paramString, HttpParameterType paramHttpParameterType) {
    try {
      if (paramParsedHttpParameter.name().equalsIgnoreCase(paramString))
        try {
          if (paramParsedHttpParameter.type() == paramHttpParameterType);
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean lambda$withParameter$12(HttpParameter paramHttpParameter, ParsedHttpParameter paramParsedHttpParameter) {
    try {
      if (paramParsedHttpParameter.name().equals(paramHttpParameter.name()))
        try {
          if (paramParsedHttpParameter.type() == paramHttpParameter.type());
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean lambda$withHeader$11(String paramString, HttpHeader paramHttpHeader) {
    return paramHttpHeader.name().equals(paramString);
  }
  
  private static boolean lambda$withHeader$10(HttpHeader paramHttpHeader1, HttpHeader paramHttpHeader2) {
    return paramHttpHeader2.name().equals(paramHttpHeader1.name());
  }
  
  private static boolean lambda$header$8(String paramString, HttpHeader paramHttpHeader) {
    return paramHttpHeader.name().equalsIgnoreCase(paramString);
  }
  
  private static boolean lambda$hasHeader$7(String paramString1, String paramString2, HttpHeader paramHttpHeader) {
    try {
      if (paramHttpHeader.name().equalsIgnoreCase(paramString1))
        try {
          if (paramHttpHeader.value().equals(paramString2));
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean lambda$hasHeader$6(String paramString1, String paramString2) {
    return paramString2.equalsIgnoreCase(paramString1);
  }
  
  private static boolean lambda$hasParameter$5(HttpParameter paramHttpParameter, ParsedHttpParameter paramParsedHttpParameter) {
    try {
      if (paramParsedHttpParameter.name().equals(paramHttpParameter.name()))
        try {
          if (paramParsedHttpParameter.type() == paramHttpParameter.type())
            try {
              if (paramParsedHttpParameter.value().equals(paramHttpParameter.value()));
            } catch (MalformedRequestException malformedRequestException) {
              throw a(null);
            }  
        } catch (MalformedRequestException malformedRequestException) {
          throw a(null);
        }  
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean lambda$parameter$2(String paramString, HttpParameterType paramHttpParameterType, ParsedHttpParameter paramParsedHttpParameter) {
    return ZR(paramParsedHttpParameter, paramString, paramHttpParameterType);
  }
  
  private static boolean lambda$parameters$0(HttpParameterType paramHttpParameterType, ParsedHttpParameter paramParsedHttpParameter) {
    try {
    
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return (paramParsedHttpParameter.type() == paramHttpParameterType);
  }
  
  public static void ZB(boolean paramBoolean) {
    ZG = paramBoolean;
  }
  
  public static boolean Z_() {
    return ZG;
  }
  
  public static boolean Zv() {
    boolean bool = Z_();
    try {
      if (!bool)
        return true; 
    } catch (MalformedRequestException malformedRequestException) {
      throw a(null);
    } 
    return false;
  }
  
  private static MalformedRequestException a(MalformedRequestException paramMalformedRequestException) {
    return paramMalformedRequestException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '{ @õä¸¡úw8@·:¢&­zçw`Ê»I\uTÀè='î3û\\ná£\\tDü¸*ZÞXÜ¤ÑyzÑcúÐ?h?~Âk-/\\nç9y«'È;VVifÛì(å'g¶^çg5f ä*\~E\\tB5~3äÄz.õÒyèn3n¯º/Û)6Ï54OáGêËRÏêp£ $ú,¥¼§A×'LD v®;{EªÈl:ÄèBþã&iq¶m|#EtÒ¯4Òôk´ý\\b]4Îãb\\bÇ´'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #24
    //   20: istore_1
    //   21: iconst_0
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZB : (Z)V
    //   27: bipush #21
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '%§C¥K\\rl.üÖ&é¡ç6\2 Á¿gLËYU++CZi'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #18
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #81
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zsie.a : [Ljava/lang/String;
    //   136: bipush #11
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zsie.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #24
    //   218: goto -> 248
    //   221: bipush #118
    //   223: goto -> 248
    //   226: bipush #15
    //   228: goto -> 248
    //   231: bipush #69
    //   233: goto -> 248
    //   236: bipush #44
    //   238: goto -> 248
    //   241: bipush #107
    //   243: goto -> 248
    //   246: bipush #89
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2527) & 0xFFFF;
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
      char c = 'î';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsie.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */