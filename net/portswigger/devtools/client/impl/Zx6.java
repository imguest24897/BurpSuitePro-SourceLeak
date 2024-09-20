package net.portswigger.devtools.client.impl;

import java.util.HashMap;
import net.portswigger.browser.Zec;
import net.portswigger.devtools.protocol.types.network.ResourceType;

class Zx6 extends HashMap<ResourceType, Zec> {
  Zx6() {
    put(ResourceType.DOCUMENT, Zec.DOCUMENT);
    put(ResourceType.STYLESHEET, Zec.STYLESHEET);
    put(ResourceType.IMAGE, Zec.IMAGE);
    put(ResourceType.XHR, Zec.XHR);
    put(ResourceType.MEDIA, Zec.MEDIA);
    put(ResourceType.FONT, Zec.FONT);
    put(ResourceType.SCRIPT, Zec.SCRIPT);
    put(ResourceType.TEXT_TRACK, Zec.TEXT_TRACK);
    put(ResourceType.PING, Zec.PING);
    put(ResourceType.CSP_VIOLATION_REPORT, Zec.CSP_VIOLATION_REPORT);
    put(ResourceType.OTHER, Zec.OTHER);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zx6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */