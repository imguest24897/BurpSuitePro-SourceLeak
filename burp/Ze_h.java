package burp;

public class Ze_h {
  void Zo(Zs9s paramZs9s) {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokeinterface ZS : ()I
    //   10: sipush #8080
    //   13: if_icmpeq -> 22
    //   16: getstatic burp/Zrrh.PROXY_OPTIONS_NONDEFAULT_PORT : Lburp/Zrrh;
    //   19: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   22: aload_1
    //   23: invokeinterface ZY : ()B
    //   28: lookupswitch default -> 79, 0 -> 56, 2 -> 73
    //   56: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_BOUND_ALL_INTERFACES : Lburp/Zrrh;
    //   59: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   62: iload_2
    //   63: ifne -> 79
    //   66: iconst_4
    //   67: anewarray burp/Zbqc
    //   70: invokestatic Zr : ([Lburp/Zbqc;)V
    //   73: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_BOUND_SPECIFIC_ADDRESS : Lburp/Zrrh;
    //   76: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   79: aload_1
    //   80: invokeinterface Zg : ()Lburp/Zi8;
    //   85: astore_3
    //   86: aload_3
    //   87: getfield Z_ : Ljava/lang/String;
    //   90: ifnull -> 99
    //   93: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_HOST_REDIRECTED : Lburp/Zrrh;
    //   96: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   99: aload_3
    //   100: getfield ZU : I
    //   103: ifeq -> 112
    //   106: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_PORT_REDIRECTED : Lburp/Zrrh;
    //   109: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   112: aload_3
    //   113: getfield Zo : Z
    //   116: ifeq -> 125
    //   119: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_PROTOCOL_REDIRECTED : Lburp/Zrrh;
    //   122: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   125: aload_1
    //   126: invokeinterface ZV : ()Z
    //   131: ifeq -> 140
    //   134: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_INVISIBLE_PROXYING_ENABLED : Lburp/Zrrh;
    //   137: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   140: aload_1
    //   141: invokeinterface ZI : ()B
    //   146: tableswitch default -> 212, 0 -> 176, 1 -> 186, 2 -> 196, 3 -> 206
    //   176: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_CERT_SELF_SIGNED : Lburp/Zrrh;
    //   179: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   182: iload_2
    //   183: ifne -> 212
    //   186: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_CERT_PER_HOST : Lburp/Zrrh;
    //   189: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   192: iload_2
    //   193: ifne -> 212
    //   196: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_CERT_SPECIFIC_HOSTNAME : Lburp/Zrrh;
    //   199: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   202: iload_2
    //   203: ifne -> 212
    //   206: getstatic burp/Zrrh.PROXY_OPTIONS_LISTENER_CERT_CUSTOM : Lburp/Zrrh;
    //   209: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   212: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */