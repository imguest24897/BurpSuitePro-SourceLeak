package burp;

class Zl_0 implements Runnable {
  final boolean Zv;
  
  final Zo1 Zo;
  
  final Zleg ZK;
  
  final Zmfj Zz;
  
  final Zxs7 ZX;
  
  final Ze3n Zc;
  
  final Zgq ZJ;
  
  final Zlzj Zf;
  
  Zl_0(Zlzj paramZlzj, boolean paramBoolean, Zo1 paramZo1, Zleg paramZleg, Zmfj paramZmfj, Zxs7 paramZxs7, Ze3n paramZe3n, Zgq paramZgq) {}
  
  public void run() {
    // Byte code:
    //   0: invokestatic ZY : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zv : Z
    //   8: ifeq -> 111
    //   11: aload_0
    //   12: getfield Zo : Lburp/Zo1;
    //   15: aload_0
    //   16: getfield ZK : Lburp/Zleg;
    //   19: invokevirtual Zu : (Lburp/Zleg;)V
    //   22: aload_0
    //   23: getfield Zf : Lburp/Zlzj;
    //   26: getfield ZT : Lburp/api/montoya/scanner/ScanCheck;
    //   29: aload_0
    //   30: getfield Zf : Lburp/Zlzj;
    //   33: getfield ZA : Lburp/Zzqf;
    //   36: aload_0
    //   37: getfield Zz : Lburp/Zmfj;
    //   40: aload_0
    //   41: getfield Zf : Lburp/Zlzj;
    //   44: getfield ZS : Lburp/Zbnt;
    //   47: invokestatic Za : (Lburp/Zmfj;Lburp/Zbnt;)Lburp/IHttpRequestResponse;
    //   50: invokeinterface ZU : (Lburp/IHttpRequestResponse;)Lburp/api/montoya/http/message/HttpRequestResponse;
    //   55: new burp/Zb_a
    //   58: dup
    //   59: aload_0
    //   60: getfield ZX : Lburp/Zxs7;
    //   63: invokestatic Ze : (Lburp/Zxs7;)Lburp/IScannerInsertionPoint;
    //   66: aload_0
    //   67: getfield Zf : Lburp/Zlzj;
    //   70: getfield ZA : Lburp/Zzqf;
    //   73: invokespecial <init> : (Lburp/IScannerInsertionPoint;Lburp/Zzqf;)V
    //   76: invokeinterface activeAudit : (Lburp/api/montoya/http/message/HttpRequestResponse;Lburp/api/montoya/scanner/audit/insertionpoint/AuditInsertionPoint;)Lburp/api/montoya/scanner/AuditResult;
    //   81: invokeinterface auditIssues : ()Ljava/util/List;
    //   86: astore_2
    //   87: aload_0
    //   88: getfield Zo : Lburp/Zo1;
    //   91: invokevirtual ZG : ()V
    //   94: goto -> 107
    //   97: astore_3
    //   98: aload_0
    //   99: getfield Zo : Lburp/Zo1;
    //   102: invokevirtual ZG : ()V
    //   105: aload_3
    //   106: athrow
    //   107: iload_1
    //   108: ifne -> 155
    //   111: aload_0
    //   112: getfield Zf : Lburp/Zlzj;
    //   115: getfield ZT : Lburp/api/montoya/scanner/ScanCheck;
    //   118: aload_0
    //   119: getfield Zf : Lburp/Zlzj;
    //   122: getfield ZA : Lburp/Zzqf;
    //   125: aload_0
    //   126: getfield Zz : Lburp/Zmfj;
    //   129: aload_0
    //   130: getfield Zf : Lburp/Zlzj;
    //   133: getfield ZS : Lburp/Zbnt;
    //   136: invokestatic Za : (Lburp/Zmfj;Lburp/Zbnt;)Lburp/IHttpRequestResponse;
    //   139: invokeinterface ZU : (Lburp/IHttpRequestResponse;)Lburp/api/montoya/http/message/HttpRequestResponse;
    //   144: invokeinterface passiveAudit : (Lburp/api/montoya/http/message/HttpRequestResponse;)Lburp/api/montoya/scanner/AuditResult;
    //   149: invokeinterface auditIssues : ()Ljava/util/List;
    //   154: astore_2
    //   155: aload_2
    //   156: ifnull -> 328
    //   159: aload_2
    //   160: invokeinterface iterator : ()Ljava/util/Iterator;
    //   165: astore_3
    //   166: aload_3
    //   167: invokeinterface hasNext : ()Z
    //   172: ifeq -> 328
    //   175: aload_3
    //   176: invokeinterface next : ()Ljava/lang/Object;
    //   181: checkcast burp/api/montoya/scanner/audit/issues/AuditIssue
    //   184: astore #4
    //   186: aload_0
    //   187: getfield Zf : Lburp/Zlzj;
    //   190: getfield Zc : Lburp/Zeu1;
    //   193: invokevirtual Zi : ()Ljava/lang/String;
    //   196: aload_0
    //   197: getfield Zf : Lburp/Zlzj;
    //   200: getfield Zy : I
    //   203: aload_0
    //   204: getfield Zf : Lburp/Zlzj;
    //   207: getfield Zc : Lburp/Zeu1;
    //   210: invokevirtual ZN : ()Ljava/lang/String;
    //   213: aload_0
    //   214: getfield Zc : Lburp/Ze3n;
    //   217: invokevirtual Zod : ()Lburp/Zmzk;
    //   220: aload_0
    //   221: getfield ZX : Lburp/Zxs7;
    //   224: new burp/Zwb
    //   227: dup
    //   228: aload_0
    //   229: getfield Zf : Lburp/Zlzj;
    //   232: getfield Zc : Lburp/Zeu1;
    //   235: invokevirtual ZN : ()Ljava/lang/String;
    //   238: new burp/Zzei
    //   241: dup
    //   242: aload #4
    //   244: invokespecial <init> : (Lburp/api/montoya/scanner/audit/issues/AuditIssue;)V
    //   247: aload_0
    //   248: getfield Zc : Lburp/Ze3n;
    //   251: dup
    //   252: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   255: pop
    //   256: <illegal opcode> apply : (Lburp/Ze3n;)Ljava/util/function/Function;
    //   261: aload_0
    //   262: getfield Zf : Lburp/Zlzj;
    //   265: getfield ZS : Lburp/Zbnt;
    //   268: aload_0
    //   269: getfield Zf : Lburp/Zlzj;
    //   272: getfield Zb : Lburp/Zr_4;
    //   275: invokespecial <init> : (Ljava/lang/String;Lburp/IScanIssue;Ljava/util/function/Function;Lburp/Zbnt;Lburp/Zr_4;)V
    //   278: invokestatic ZV : (Ljava/lang/String;ILjava/lang/String;Lburp/Zmzk;Lburp/Zxs7;Lburp/Zg72;)Lburp/Zsqx;
    //   281: astore #5
    //   283: aload_0
    //   284: getfield ZJ : Lburp/Zgq;
    //   287: aload #5
    //   289: invokevirtual Zu : (Lburp/Zsqx;)V
    //   292: goto -> 324
    //   295: astore #5
    //   297: aload #5
    //   299: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   302: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   305: aload_0
    //   306: getfield Zf : Lburp/Zlzj;
    //   309: getfield Zc : Lburp/Zeu1;
    //   312: aload #5
    //   314: aload_0
    //   315: getfield Zf : Lburp/Zlzj;
    //   318: getfield ZV : Lburp/Zskh;
    //   321: invokevirtual ZN : (Ljava/lang/Throwable;Lburp/Zskh;)V
    //   324: iload_1
    //   325: ifne -> 166
    //   328: aload_0
    //   329: dup
    //   330: astore_3
    //   331: monitorenter
    //   332: aload_0
    //   333: invokevirtual notifyAll : ()V
    //   336: aload_3
    //   337: monitorexit
    //   338: goto -> 348
    //   341: astore #6
    //   343: aload_3
    //   344: monitorexit
    //   345: aload #6
    //   347: athrow
    //   348: goto -> 428
    //   351: astore_3
    //   352: aload_3
    //   353: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   356: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   359: aload_0
    //   360: getfield Zf : Lburp/Zlzj;
    //   363: getfield Zc : Lburp/Zeu1;
    //   366: aload_3
    //   367: aload_0
    //   368: getfield Zf : Lburp/Zlzj;
    //   371: getfield ZV : Lburp/Zskh;
    //   374: invokevirtual ZN : (Ljava/lang/Throwable;Lburp/Zskh;)V
    //   377: aload_0
    //   378: dup
    //   379: astore_3
    //   380: monitorenter
    //   381: aload_0
    //   382: invokevirtual notifyAll : ()V
    //   385: aload_3
    //   386: monitorexit
    //   387: goto -> 397
    //   390: astore #7
    //   392: aload_3
    //   393: monitorexit
    //   394: aload #7
    //   396: athrow
    //   397: goto -> 428
    //   400: astore #8
    //   402: aload_0
    //   403: dup
    //   404: astore #9
    //   406: monitorenter
    //   407: aload_0
    //   408: invokevirtual notifyAll : ()V
    //   411: aload #9
    //   413: monitorexit
    //   414: goto -> 425
    //   417: astore #10
    //   419: aload #9
    //   421: monitorexit
    //   422: aload #10
    //   424: athrow
    //   425: aload #8
    //   427: athrow
    //   428: return
    // Exception table:
    //   from	to	target	type
    //   4	328	351	java/lang/Throwable
    //   4	328	400	finally
    //   11	87	97	finally
    //   186	292	295	java/lang/Throwable
    //   332	338	341	finally
    //   341	345	341	finally
    //   351	377	400	finally
    //   381	387	390	finally
    //   390	394	390	finally
    //   400	402	400	finally
    //   407	414	417	finally
    //   417	422	417	finally
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */