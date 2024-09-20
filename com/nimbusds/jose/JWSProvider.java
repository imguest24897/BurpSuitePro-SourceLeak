package com.nimbusds.jose;

import com.nimbusds.jose.jca.JCAAware;
import com.nimbusds.jose.jca.JCAContext;
import java.util.Set;

public interface JWSProvider extends JOSEProvider, JCAAware<JCAContext> {
  Set<JWSAlgorithm> supportedJWSAlgorithms();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWSProvider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */