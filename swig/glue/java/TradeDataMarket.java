/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

public class TradeDataMarket extends Displayable {
  private long swigCPtr;

  protected TradeDataMarket(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.TradeDataMarket_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TradeDataMarket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_TradeDataMarket(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
/*@SWIG:otapi/OTAPI.i,388,OT_CAN_BE_CONTAINED_BY@*/
	// Ensure that the GC doesn't collect any OT_CONTAINER instance set from Java
	private TradeListMarket containerRefTradeListMarket;
	// ----------------	
	protected void addReference(TradeListMarket theContainer) {  // This is Java code
		containerRefTradeListMarket = theContainer;
	}
	// ----------------
/*@SWIG@*/
	// ------------------------
  public void setGui_label(String value) {
    otapiJNI.TradeDataMarket_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.TradeDataMarket_gui_label_get(swigCPtr, this);
  }

  public void setTransaction_id(String value) {
    otapiJNI.TradeDataMarket_transaction_id_set(swigCPtr, this, value);
  }

  public String getTransaction_id() {
    return otapiJNI.TradeDataMarket_transaction_id_get(swigCPtr, this);
  }

  public void setDate(String value) {
    otapiJNI.TradeDataMarket_date_set(swigCPtr, this, value);
  }

  public String getDate() {
    return otapiJNI.TradeDataMarket_date_get(swigCPtr, this);
  }

  public void setPrice(String value) {
    otapiJNI.TradeDataMarket_price_set(swigCPtr, this, value);
  }

  public String getPrice() {
    return otapiJNI.TradeDataMarket_price_get(swigCPtr, this);
  }

  public void setAmount_sold(String value) {
    otapiJNI.TradeDataMarket_amount_sold_set(swigCPtr, this, value);
  }

  public String getAmount_sold() {
    return otapiJNI.TradeDataMarket_amount_sold_get(swigCPtr, this);
  }

  public static TradeDataMarket ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.TradeDataMarket_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new TradeDataMarket(cPtr, false);
  }

}
