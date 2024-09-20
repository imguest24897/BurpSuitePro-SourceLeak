/*     */ package com.nimbusds.jose.shaded.json;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Stack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JSONNavi<T>
/*     */ {
/*     */   private JsonReaderI<? super T> mapper;
/*     */   private T root;
/*  36 */   private Stack<Object> stack = new Stack();
/*  37 */   private Stack<Object> path = new Stack();
/*     */   
/*     */   private Object current;
/*     */   
/*     */   private boolean failure = false;
/*     */   private String failureMessage;
/*     */   private boolean readonly = false;
/*  44 */   private Object missingKey = null;
/*     */   
/*     */   public static JSONNavi<JSONAwareEx> newInstance() {
/*  47 */     return new JSONNavi<>(JSONValue.defaultReader.DEFAULT_ORDERED);
/*     */   }
/*     */   
/*     */   public static JSONNavi<JSONObject> newInstanceObject() {
/*  51 */     JSONNavi<JSONObject> o = new JSONNavi<>(JSONValue.defaultReader.getMapper(JSONObject.class));
/*  52 */     o.object();
/*  53 */     return o;
/*     */   }
/*     */   
/*     */   public static JSONNavi<JSONArray> newInstanceArray() {
/*  57 */     JSONNavi<JSONArray> o = new JSONNavi<>(JSONValue.defaultReader.getMapper(JSONArray.class));
/*  58 */     o.array();
/*  59 */     return o;
/*     */   }
/*     */   
/*     */   public JSONNavi(JsonReaderI<? super T> mapper) {
/*  63 */     this.mapper = mapper;
/*     */   }
/*     */ 
/*     */   
/*     */   public JSONNavi(String json) {
/*  68 */     this.root = (T)JSONValue.parse(json);
/*  69 */     this.current = this.root;
/*  70 */     this.readonly = true;
/*     */   }
/*     */   
/*     */   public JSONNavi(String json, JsonReaderI<T> mapper) {
/*  74 */     this.root = JSONValue.parse(json, mapper);
/*  75 */     this.mapper = mapper;
/*  76 */     this.current = this.root;
/*  77 */     this.readonly = true;
/*     */   }
/*     */   
/*     */   public JSONNavi(String json, Class<T> mapTo) {
/*  81 */     this.root = JSONValue.parse(json, mapTo);
/*  82 */     this.mapper = JSONValue.defaultReader.getMapper(mapTo);
/*  83 */     this.current = this.root;
/*  84 */     this.readonly = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> root() {
/*  93 */     this.current = this.root;
/*  94 */     this.stack.clear();
/*  95 */     this.path.clear();
/*  96 */     this.failure = false;
/*  97 */     this.missingKey = null;
/*  98 */     this.failureMessage = null;
/*  99 */     return this;
/*     */   }
/*     */   
/*     */   public boolean hasFailure() {
/* 103 */     return this.failure;
/*     */   }
/*     */   
/*     */   public Object getCurrentObject() {
/* 107 */     return this.current;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getKeys() {
/* 112 */     if (this.current instanceof Map)
/* 113 */       return ((Map)this.current).keySet(); 
/* 114 */     return null;
/*     */   }
/*     */   
/*     */   public int getSize() {
/* 118 */     if (this.current == null)
/* 119 */       return 0; 
/* 120 */     if (isArray())
/* 121 */       return ((List)this.current).size(); 
/* 122 */     if (isObject())
/* 123 */       return ((Map)this.current).size(); 
/* 124 */     return 1;
/*     */   }
/*     */   
/*     */   public String getString(String key) {
/* 128 */     String v = null;
/* 129 */     if (!hasKey(key))
/* 130 */       return v; 
/* 131 */     at(key);
/* 132 */     v = asString();
/* 133 */     up();
/* 134 */     return v;
/*     */   }
/*     */   
/*     */   public int getInt(String key) {
/* 138 */     int v = 0;
/* 139 */     if (!hasKey(key))
/* 140 */       return v; 
/* 141 */     at(key);
/* 142 */     v = asInt();
/* 143 */     up();
/* 144 */     return v;
/*     */   }
/*     */   
/*     */   public Integer getInteger(String key) {
/* 148 */     Integer v = null;
/* 149 */     if (!hasKey(key))
/* 150 */       return v; 
/* 151 */     at(key);
/* 152 */     v = asIntegerObj();
/* 153 */     up();
/* 154 */     return v;
/*     */   }
/*     */   
/*     */   public double getDouble(String key) {
/* 158 */     double v = 0.0D;
/* 159 */     if (!hasKey(key))
/* 160 */       return v; 
/* 161 */     at(key);
/* 162 */     v = asDouble();
/* 163 */     up();
/* 164 */     return v;
/*     */   }
/*     */   
/*     */   public boolean hasKey(String key) {
/* 168 */     if (!isObject())
/* 169 */       return false; 
/* 170 */     return o(this.current).containsKey(key);
/*     */   }
/*     */   
/*     */   public JSONNavi<?> at(String key) {
/* 174 */     if (this.failure)
/* 175 */       return this; 
/* 176 */     if (!isObject())
/* 177 */       object(); 
/* 178 */     if (!(this.current instanceof Map))
/* 179 */       return failure("current node is not an Object", key); 
/* 180 */     if (!o(this.current).containsKey(key)) {
/* 181 */       if (this.readonly)
/* 182 */         return failure("current Object have no key named " + key, key); 
/* 183 */       this.stack.add(this.current);
/* 184 */       this.path.add(key);
/* 185 */       this.current = null;
/* 186 */       this.missingKey = key;
/* 187 */       return this;
/*     */     } 
/* 189 */     Object next = o(this.current).get(key);
/* 190 */     this.stack.add(this.current);
/* 191 */     this.path.add(key);
/* 192 */     this.current = next;
/* 193 */     return this;
/*     */   }
/*     */   
/*     */   public Object get(String key) {
/* 197 */     if (this.failure)
/* 198 */       return this; 
/* 199 */     if (!isObject())
/* 200 */       object(); 
/* 201 */     if (!(this.current instanceof Map))
/* 202 */       return failure("current node is not an Object", key); 
/* 203 */     return o(this.current).get(key);
/*     */   }
/*     */   
/*     */   public Object get(int index) {
/* 207 */     if (this.failure)
/* 208 */       return this; 
/* 209 */     if (!isArray())
/* 210 */       array(); 
/* 211 */     if (!(this.current instanceof List))
/* 212 */       return failure("current node is not an List", Integer.valueOf(index)); 
/* 213 */     return a(this.current).get(index);
/*     */   }
/*     */   
/*     */   public JSONNavi<T> set(String key, String value) {
/* 217 */     object();
/* 218 */     if (this.failure)
/* 219 */       return this; 
/* 220 */     o(this.current).put(key, value);
/* 221 */     return this;
/*     */   }
/*     */   
/*     */   public JSONNavi<T> set(String key, Number value) {
/* 225 */     object();
/* 226 */     if (this.failure)
/* 227 */       return this; 
/* 228 */     o(this.current).put(key, value);
/* 229 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> set(String key, long value) {
/* 242 */     return set(key, Long.valueOf(value));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> set(String key, int value) {
/* 255 */     return set(key, Integer.valueOf(value));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> set(String key, double value) {
/* 268 */     return set(key, Double.valueOf(value));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> set(String key, float value) {
/* 281 */     return set(key, Float.valueOf(value));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> add(Object... values) {
/* 292 */     array();
/* 293 */     if (this.failure)
/* 294 */       return this; 
/* 295 */     List<Object> list = a(this.current);
/* 296 */     for (Object o : values)
/* 297 */       list.add(o); 
/* 298 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String asString() {
/* 308 */     if (this.current == null)
/* 309 */       return null; 
/* 310 */     if (this.current instanceof String)
/* 311 */       return (String)this.current; 
/* 312 */     return this.current.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double asDouble() {
/* 322 */     if (this.current instanceof Number)
/* 323 */       return ((Number)this.current).doubleValue(); 
/* 324 */     return Double.NaN;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double asDoubleObj() {
/* 334 */     if (this.current == null)
/* 335 */       return null; 
/* 336 */     if (this.current instanceof Number) {
/* 337 */       if (this.current instanceof Double)
/* 338 */         return (Double)this.current; 
/* 339 */       return Double.valueOf(((Number)this.current).doubleValue());
/*     */     } 
/* 341 */     return Double.valueOf(Double.NaN);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float asFloat() {
/* 351 */     if (this.current instanceof Number)
/* 352 */       return ((Number)this.current).floatValue(); 
/* 353 */     return Float.NaN;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Float asFloatObj() {
/* 361 */     if (this.current == null)
/* 362 */       return null; 
/* 363 */     if (this.current instanceof Number) {
/* 364 */       if (this.current instanceof Float)
/* 365 */         return (Float)this.current; 
/* 366 */       return Float.valueOf(((Number)this.current).floatValue());
/*     */     } 
/* 368 */     return Float.valueOf(Float.NaN);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int asInt() {
/* 377 */     if (this.current instanceof Number)
/* 378 */       return ((Number)this.current).intValue(); 
/* 379 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer asIntegerObj() {
/* 388 */     if (this.current == null)
/* 389 */       return null; 
/* 390 */     if (this.current instanceof Number) {
/* 391 */       if (this.current instanceof Integer)
/* 392 */         return (Integer)this.current; 
/* 393 */       if (this.current instanceof Long) {
/* 394 */         Long l = (Long)this.current;
/* 395 */         if (l.longValue() == l.intValue()) {
/* 396 */           return Integer.valueOf(l.intValue());
/*     */         }
/*     */       } 
/* 399 */       return null;
/*     */     } 
/* 401 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long asLong() {
/* 410 */     if (this.current instanceof Number)
/* 411 */       return ((Number)this.current).longValue(); 
/* 412 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Long asLongObj() {
/* 422 */     if (this.current == null)
/* 423 */       return null; 
/* 424 */     if (this.current instanceof Number) {
/* 425 */       if (this.current instanceof Long)
/* 426 */         return (Long)this.current; 
/* 427 */       if (this.current instanceof Integer)
/* 428 */         return Long.valueOf(((Number)this.current).longValue()); 
/* 429 */       return null;
/*     */     } 
/* 431 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean asBoolean() {
/* 441 */     if (this.current instanceof Boolean)
/* 442 */       return ((Boolean)this.current).booleanValue(); 
/* 443 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean asBooleanObj() {
/* 453 */     if (this.current == null)
/* 454 */       return null; 
/* 455 */     if (this.current instanceof Boolean)
/* 456 */       return (Boolean)this.current; 
/* 457 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> object() {
/* 467 */     if (this.failure)
/* 468 */       return this; 
/* 469 */     if (this.current == null && this.readonly)
/* 470 */       failure("Can not create Object child in readonly", null); 
/* 471 */     if (this.current != null) {
/* 472 */       if (isObject())
/* 473 */         return this; 
/* 474 */       if (isArray())
/* 475 */         failure("can not use Object feature on Array.", null); 
/* 476 */       failure("Can not use current position as Object", null);
/*     */     } else {
/* 478 */       this.current = this.mapper.createObject();
/*     */     } 
/* 480 */     if (this.root == null) {
/* 481 */       this.root = (T)this.current;
/*     */     } else {
/* 483 */       store();
/* 484 */     }  return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> array() {
/* 495 */     if (this.failure)
/* 496 */       return this; 
/* 497 */     if (this.current == null && this.readonly)
/* 498 */       failure("Can not create Array child in readonly", null); 
/* 499 */     if (this.current != null) {
/* 500 */       if (isArray())
/* 501 */         return this; 
/* 502 */       if (isObject())
/* 503 */         failure("can not use Object feature on Array.", null); 
/* 504 */       failure("Can not use current position as Object", null);
/*     */     } else {
/* 506 */       this.current = this.mapper.createArray();
/*     */     } 
/* 508 */     if (this.root == null) {
/* 509 */       this.root = (T)this.current;
/*     */     } else {
/* 511 */       store();
/* 512 */     }  return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> set(Number num) {
/* 521 */     if (this.failure)
/* 522 */       return this; 
/* 523 */     this.current = num;
/* 524 */     store();
/* 525 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> set(Boolean bool) {
/* 535 */     if (this.failure)
/* 536 */       return this; 
/* 537 */     this.current = bool;
/* 538 */     store();
/* 539 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<T> set(String text) {
/* 549 */     if (this.failure)
/* 550 */       return this; 
/* 551 */     this.current = text;
/* 552 */     store();
/* 553 */     return this;
/*     */   }
/*     */   
/*     */   public T getRoot() {
/* 557 */     return this.root;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void store() {
/* 564 */     Object parent = this.stack.peek();
/* 565 */     if (isObject(parent)) {
/* 566 */       o(parent).put((String)this.missingKey, this.current);
/* 567 */     } else if (isArray(parent)) {
/* 568 */       int index = ((Number)this.missingKey).intValue();
/* 569 */       List<Object> lst = a(parent);
/* 570 */       while (lst.size() <= index)
/* 571 */         lst.add(null); 
/* 572 */       lst.set(index, this.current);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isArray() {
/* 582 */     return isArray(this.current);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isObject() {
/* 591 */     return isObject(this.current);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isArray(Object obj) {
/* 600 */     if (obj == null)
/* 601 */       return false; 
/* 602 */     return obj instanceof List;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isObject(Object obj) {
/* 610 */     if (obj == null)
/* 611 */       return false; 
/* 612 */     return obj instanceof Map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private List<Object> a(Object obj) {
/* 621 */     return (List<Object>)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<String, Object> o(Object obj) {
/* 629 */     return (Map<String, Object>)obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<?> at(int index) {
/* 641 */     if (this.failure)
/* 642 */       return this; 
/* 643 */     if (!(this.current instanceof List)) {
/* 644 */       return failure("current node is not an Array", Integer.valueOf(index));
/*     */     }
/* 646 */     List<Object> lst = (List<Object>)this.current;
/* 647 */     if (index < 0) {
/* 648 */       index = lst.size() + index;
/* 649 */       if (index < 0)
/* 650 */         index = 0; 
/*     */     } 
/* 652 */     if (index >= lst.size()) {
/* 653 */       if (this.readonly) {
/* 654 */         return failure("Out of bound exception for index", Integer.valueOf(index));
/*     */       }
/* 656 */       this.stack.add(this.current);
/* 657 */       this.path.add(Integer.valueOf(index));
/* 658 */       this.current = null;
/* 659 */       this.missingKey = Integer.valueOf(index);
/* 660 */       return this;
/*     */     } 
/* 662 */     Object next = lst.get(index);
/* 663 */     this.stack.add(this.current);
/* 664 */     this.path.add(Integer.valueOf(index));
/* 665 */     this.current = next;
/* 666 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<?> atNext() {
/* 675 */     if (this.failure)
/* 676 */       return this; 
/* 677 */     if (!(this.current instanceof List)) {
/* 678 */       return failure("current node is not an Array", null);
/*     */     }
/* 680 */     List<Object> lst = (List<Object>)this.current;
/* 681 */     return at(lst.size());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<?> up(int level) {
/* 691 */     while (level-- > 0 && 
/* 692 */       this.stack.size() > 0) {
/* 693 */       this.current = this.stack.pop();
/* 694 */       this.path.pop();
/*     */     } 
/*     */ 
/*     */     
/* 698 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JSONNavi<?> up() {
/* 706 */     if (this.stack.size() > 0) {
/* 707 */       this.current = this.stack.pop();
/* 708 */       this.path.pop();
/*     */     } 
/* 710 */     return this;
/*     */   }
/*     */   
/* 713 */   private static final JSONStyle ERROR_COMPRESS = new JSONStyle(2);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 719 */     if (this.failure)
/* 720 */       return JSONValue.toJSONString(this.failureMessage, ERROR_COMPRESS); 
/* 721 */     return JSONValue.toJSONString(this.root);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString(JSONStyle compression) {
/* 730 */     if (this.failure)
/* 731 */       return JSONValue.toJSONString(this.failureMessage, compression); 
/* 732 */     return JSONValue.toJSONString(this.root, compression);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JSONNavi<?> failure(String err, Object jPathPostfix) {
/* 739 */     this.failure = true;
/* 740 */     StringBuilder sb = new StringBuilder();
/* 741 */     sb.append("Error: ");
/* 742 */     sb.append(err);
/* 743 */     sb.append(" at ");
/* 744 */     sb.append(getJPath());
/* 745 */     if (jPathPostfix != null)
/* 746 */       if (jPathPostfix instanceof Integer) {
/* 747 */         sb.append('[').append(jPathPostfix).append(']');
/*     */       } else {
/* 749 */         sb.append('/').append(jPathPostfix);
/* 750 */       }   this.failureMessage = sb.toString();
/* 751 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getJPath() {
/* 758 */     StringBuilder sb = new StringBuilder();
/* 759 */     for (Object o : this.path) {
/* 760 */       if (o instanceof String) {
/* 761 */         sb.append('/').append(o.toString()); continue;
/*     */       } 
/* 763 */       sb.append('[').append(o.toString()).append(']');
/*     */     } 
/* 765 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\JSONNavi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */