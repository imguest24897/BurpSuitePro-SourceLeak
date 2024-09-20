/*    */ package com.install4j.api;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InvalidObjectException;
/*    */ import java.io.ObjectInputStream;
/*    */ import java.io.ObjectOutputStream;
/*    */ import java.io.ObjectStreamException;
/*    */ import java.io.Serializable;
/*    */ import java.util.Collections;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public abstract class SerializableEnum
/*    */   implements Serializable
/*    */ {
/* 17 */   private static Map<Identifier, Object> identifierToInstance = Collections.synchronizedMap(new HashMap<>());
/* 18 */   private static Map<String, MutableInt> classNameToLastId = Collections.synchronizedMap(new HashMap<>());
/*    */   
/*    */   private int id;
/*    */   
/*    */   protected SerializableEnum() {
/* 23 */     String className = getClass().getName();
/* 24 */     MutableInt mutableInt = classNameToLastId.get(className);
/* 25 */     if (mutableInt == null) {
/* 26 */       mutableInt = new MutableInt();
/* 27 */       classNameToLastId.put(className, mutableInt);
/*    */     } 
/* 29 */     this.id = ++mutableInt.val;
/* 30 */     identifierToInstance.put(new Identifier(className, this.id), this);
/*    */   }
/*    */   
/*    */   private void writeObject(ObjectOutputStream out) throws IOException {
/* 34 */     out.writeInt(this.id);
/*    */   }
/*    */   
/*    */   private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
/* 38 */     this.id = in.readInt();
/*    */   }
/*    */   
/*    */   protected Object readResolve() throws ObjectStreamException {
/* 42 */     Object singleInstance = identifierToInstance.get(new Identifier(getClass().getName(), this.id));
/* 43 */     if (singleInstance == null) {
/* 44 */       throw new InvalidObjectException("unknown id " + this.id + " for class " + getClass().getName());
/*    */     }
/* 46 */     return singleInstance;
/*    */   }
/*    */   
/*    */   private static class Identifier {
/*    */     private String className;
/*    */     private int id;
/*    */     
/*    */     private Identifier(String className, int id) {
/* 54 */       this.className = className;
/* 55 */       this.id = id;
/*    */     }
/*    */ 
/*    */     
/*    */     public boolean equals(Object o) {
/* 60 */       if (this == o) return true; 
/* 61 */       if (o == null || getClass() != o.getClass()) return false;
/*    */       
/* 63 */       Identifier that = (Identifier)o;
/*    */       
/* 65 */       if (this.id != that.id) return false; 
/* 66 */       if (!Objects.equals(this.className, that.className)) return false;
/*    */       
/* 68 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public int hashCode() {
/* 73 */       int result = this.className.hashCode();
/* 74 */       result = 31 * result + this.id;
/* 75 */       return result;
/*    */     }
/*    */   }
/*    */   
/*    */   private static class MutableInt {
/*    */     int val;
/*    */     
/*    */     private MutableInt() {}
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\SerializableEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */