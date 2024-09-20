package com.sun.javafx.event;

import java.util.Set;
import javafx.event.EventTarget;

public interface CompositeEventTarget extends EventTarget {
  Set<EventTarget> getTargets();
  
  boolean containsTarget(EventTarget paramEventTarget);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\CompositeEventTarget.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */