package com.nimbusds.jose.util;

import java.io.IOException;
import java.net.URL;

public interface ResourceRetriever {
  Resource retrieveResource(URL paramURL) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\ResourceRetriever.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */