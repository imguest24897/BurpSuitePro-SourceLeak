package burp;

import burp.api.montoya.core.Registration;
import burp.api.montoya.scanner.AuditConfiguration;
import burp.api.montoya.scanner.Crawl;
import burp.api.montoya.scanner.CrawlConfiguration;
import burp.api.montoya.scanner.ReportFormat;
import burp.api.montoya.scanner.ScanCheck;
import burp.api.montoya.scanner.Scanner;
import burp.api.montoya.scanner.audit.Audit;
import burp.api.montoya.scanner.audit.AuditIssueHandler;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPointProvider;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.bchecks.BChecks;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbxt implements Scanner {
  private final Zbiv Za;
  
  private final Zkl6 Zx;
  
  private final Zbnt Zg;
  
  private final Zr_4 Zu;
  
  private final Zsuv Zm;
  
  private final Zm37 ZT;
  
  private final Ztcy Zc;
  
  private final Zlz3 ZP;
  
  private final Zm5z Zo;
  
  private final Ze2 ZX;
  
  private final Zkrj ZY;
  
  private final Zskl ZJ;
  
  private final BChecks Zz;
  
  private final Zm6x Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbxt(Zbiv paramZbiv, Zkl6 paramZkl6, Zbnt paramZbnt, Zr_4 paramZr_4, Zsuv paramZsuv, Zm37 paramZm37, Ztcy paramZtcy, Zlz3 paramZlz3, Zm5z paramZm5z, Ze2 paramZe2, Zkrj paramZkrj, Zskl paramZskl, BChecks paramBChecks, Zm6x paramZm6x) {
    this.Za = paramZbiv;
    this.Zx = paramZkl6;
    this.Zg = paramZbnt;
    this.Zu = paramZr_4;
    this.Zm = paramZsuv;
    this.ZT = paramZm37;
    this.Zc = paramZtcy;
    this.ZP = paramZlz3;
    this.Zo = paramZm5z;
    this.ZX = paramZe2;
    this.ZY = paramZkrj;
    this.ZJ = paramZskl;
    this.Zz = paramBChecks;
    this.Zy = paramZm6x;
  }
  
  public Registration registerAuditIssueHandler(AuditIssueHandler paramAuditIssueHandler) {
    try {
      if (paramAuditIssueHandler == null)
        throw new IllegalArgumentException(a(11641, 10174)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZP.Za(this.ZX.<AuditIssueHandler>Zv(paramAuditIssueHandler, AuditIssueHandler.class));
  }
  
  public Registration registerScanCheck(ScanCheck paramScanCheck) {
    try {
      if (paramScanCheck == null)
        throw new IllegalArgumentException(a(11640, -17001)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZP.Zg(this.ZX.<ScanCheck>Zv(paramScanCheck, ScanCheck.class));
  }
  
  public Registration registerInsertionPointProvider(AuditInsertionPointProvider paramAuditInsertionPointProvider) {
    try {
      if (paramAuditInsertionPointProvider == null)
        throw new IllegalArgumentException(a(11647, 12129)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZP.Zq(this.ZX.<AuditInsertionPointProvider>Zv(paramAuditInsertionPointProvider, AuditInsertionPointProvider.class));
  }
  
  public Crawl startCrawl(CrawlConfiguration paramCrawlConfiguration) {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_1
    //   10: invokeinterface seedUrls : ()Ljava/util/List;
    //   15: invokevirtual ZC : (Ljava/util/List;)Lburp/Zkv4;
    //   18: astore_3
    //   19: aload_0
    //   20: aload_2
    //   21: <illegal opcode> ZI : (Lburp/Zbxt;Ljava/util/concurrent/atomic/AtomicReference;)Lburp/Zm0l;
    //   26: astore #4
    //   28: aload_0
    //   29: getfield Za : Lburp/Zbiv;
    //   32: invokevirtual ZW : ()Lburp/Zrfd;
    //   35: aload_3
    //   36: aload #4
    //   38: invokevirtual Zq : (Lburp/Zkv4;Lburp/Zm0l;)Lburp/Ztj1;
    //   41: astore #5
    //   43: new burp/Zxnh
    //   46: dup
    //   47: aload #5
    //   49: aload_2
    //   50: dup
    //   51: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   60: aload_0
    //   61: getfield ZY : Lburp/Zkrj;
    //   64: invokespecial <init> : (Lburp/Ztj1;Ljava/util/function/Supplier;Lburp/Zkrj;)V
    //   67: areturn
    //   68: astore_3
    //   69: aload_3
    //   70: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   73: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   76: new java/lang/IllegalArgumentException
    //   79: dup
    //   80: sipush #11644
    //   83: sipush #14693
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: aload_3
    //   90: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: athrow
    // Exception table:
    //   from	to	target	type
    //   8	67	68	java/net/MalformedURLException
    //   8	67	68	java/net/URISyntaxException
  }
  
  public Audit startAudit(AuditConfiguration paramAuditConfiguration) {
    if (paramAuditConfiguration instanceof Proxyable) {
      Proxyable proxyable = (Proxyable)paramAuditConfiguration;
      Object object = proxyable.proxiedObject();
      if (object instanceof Zkme) {
        Zkme zkme = (Zkme)object;
        try {
          switch (Zzhg.Zi[zkme.ZU().ordinal()]) {
            case 1:
              this.Zm.Zy();
              Objects.requireNonNull(this.Zc);
              return new Zb1u(this.ZT.Zm(), this.Zc::ZW, this.Zg, this.Zx, this.ZJ, this.Zy);
            case 2:
              this.Zm.ZO();
              Objects.requireNonNull(this.Zc);
              return new Zxd6(this.ZT.Zx(), this.Zc::ZS, this.Zg, this.Zx, this.ZJ, this.Zy);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } 
    throw new IllegalStateException(a(11645, 13673) + a(11645, 13673));
  }
  
  public void generateReport(List<AuditIssue> paramList, ReportFormat paramReportFormat, Path paramPath) {
    String str = Zblx.ZK(paramReportFormat);
    List<Zrdb> list = (List)paramList.stream().map(this::ZV).collect(Collectors.toList());
    try {
      this.Zo.Zl(str, list, paramPath.toFile());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      throw new RuntimeException(a(11646, 18539), iOException);
    } 
  }
  
  public BChecks bChecks() {
    return this.Zz;
  }
  
  private Zkv4 ZC(List<String> paramList) throws MalformedURLException, URISyntaxException {
    Ztfs ztfs = new Ztfs(Zkcl.SCAN_CRAWL, Zv(paramList), ZO(paramList), Collections.emptyList());
    return new Zkv4(ztfs, Zz5.ZO, new Zgyw(Collections.emptyList()), new Zmpo(Collections.emptyList()), Zb2y.ZX(), Zlj4.EXTENDER, false);
  }
  
  private Zzxj Zv(List<String> paramList) throws MalformedURLException, URISyntaxException {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zf : ()Ljava/lang/String;
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 127
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast java/lang/String
    //   40: astore #5
    //   42: new java/net/URL
    //   45: dup
    //   46: aload #5
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: astore #6
    //   53: aload #6
    //   55: invokevirtual toURI : ()Ljava/net/URI;
    //   58: astore #7
    //   60: aload #7
    //   62: invokevirtual getPath : ()Ljava/lang/String;
    //   65: invokevirtual isEmpty : ()Z
    //   68: ifeq -> 99
    //   71: aload_3
    //   72: aload #7
    //   74: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   77: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: aload_2
    //   89: ifnonnull -> 123
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_3
    //   100: aload #7
    //   102: ldc '.'
    //   104: invokevirtual resolve : (Ljava/lang/String;)Ljava/net/URI;
    //   107: invokevirtual toString : ()Ljava/lang/String;
    //   110: invokeinterface add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_2
    //   124: ifnonnull -> 20
    //   127: new burp/Zzxj
    //   130: dup
    //   131: aload_0
    //   132: getfield Zg : Lburp/Zbnt;
    //   135: aload_0
    //   136: getfield Zu : Lburp/Zr_4;
    //   139: invokespecial <init> : (Lburp/Zbnt;Lburp/Zr_4;)V
    //   142: astore #4
    //   144: aload #4
    //   146: aload_3
    //   147: invokevirtual ZP : (Ljava/util/List;)V
    //   150: aload #4
    //   152: areturn
    // Exception table:
    //   from	to	target	type
    //   60	92	95	java/net/MalformedURLException
    //   71	116	119	java/net/MalformedURLException
  }
  
  private List<String> ZO(List<String> paramList) throws URISyntaxException {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zf : ()Ljava/lang/String;
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 98
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast java/lang/String
    //   40: astore #5
    //   42: new java/net/URI
    //   45: dup
    //   46: aload #5
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: invokevirtual getPath : ()Ljava/lang/String;
    //   54: invokevirtual isEmpty : ()Z
    //   57: ifeq -> 78
    //   60: aload_3
    //   61: aload #5
    //   63: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   68: invokeinterface add : (Ljava/lang/Object;)Z
    //   73: pop
    //   74: aload_2
    //   75: ifnonnull -> 94
    //   78: aload_3
    //   79: aload #5
    //   81: invokeinterface add : (Ljava/lang/Object;)Z
    //   86: pop
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_2
    //   95: ifnonnull -> 20
    //   98: aload_3
    //   99: areturn
    // Exception table:
    //   from	to	target	type
    //   60	87	90	java/net/URISyntaxException
  }
  
  private Zrdb ZV(AuditIssue paramAuditIssue) {
    if (paramAuditIssue instanceof Zlel) {
      Zlel zlel = (Zlel)paramAuditIssue;
      IScanIssue iScanIssue = zlel.Zn();
      if (iScanIssue instanceof Zmu0) {
        Zmu0 zmu0 = (Zmu0)iScanIssue;
        return zmu0.Zg();
      } 
      iScanIssue = zlel.Zn();
      if (iScanIssue instanceof Zzei) {
        Zzei zzei = (Zzei)iScanIssue;
        Zrdb zrdb = zzei.ZD();
        try {
          if (zrdb != null)
            return zrdb; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } 
    if (paramAuditIssue instanceof Proxyable) {
      Proxyable proxyable = (Proxyable)paramAuditIssue;
      Object object = proxyable.proxiedObject();
      if (object instanceof Zkf_) {
        Zkf_ zkf_ = (Zkf_)object;
        return zkf_.ZI();
      } 
    } 
    return new Zwm(this.ZP.ZC.ZN(), paramAuditIssue, this.Zg, this.Zu);
  }
  
  private void lambda$startCrawl$0(AtomicReference<Zbs1> paramAtomicReference, Ztj1 paramZtj1, Zgna paramZgna, Zskh paramZskh, Zrbm paramZrbm, Zg09 paramZg09, Zkg9 paramZkg9, Supplier<Zbs1> paramSupplier, Zlli<Zt1x> paramZlli1, Zl2h paramZl2h, Zlli<Zt10> paramZlli2, boolean paramBoolean) {
    paramAtomicReference.set(paramSupplier.get());
    this.ZY.ZI(paramZtj1, paramZgna, paramZskh, paramZrbm, paramZg09, paramZkg9, paramSupplier, paramZlli1, paramZl2h, paramZlli2, paramBoolean);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÐÊûLÎ;õãR©}åªÉ&jïx¬ =\tûÍaÏáÙO4Óò÷(4Ç±5`w\\nÌ¨eTãJ@ð6;î/¶\\bçÑQ4G%t\\f¤bI{Ö/Îãüé±ÌÅ¶êÀÈ(Ë$+È:Ðgù*qæ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #29
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #102
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '÷¯#e\ÅöoJc=ÆñË¾Ö¾W6Tý_q¢YûÁK¿êõõU)©;/Pù'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #23
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #117
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zbxt.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbxt.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #58
    //   214: goto -> 244
    //   217: bipush #88
    //   219: goto -> 244
    //   222: bipush #73
    //   224: goto -> 244
    //   227: bipush #80
    //   229: goto -> 244
    //   232: bipush #33
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #102
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2D7D) & 0xFFFF;
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
      byte b1 = 39;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */