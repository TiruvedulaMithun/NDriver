/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.learn;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BTrail14LearnDeviceEntry represents a learned device in the deviceManager learn
 * pane.  Add properties which should be displayed to user to identify device or are
 * need during the add/match step.
 *
 * @author mithun on 13 May 2025
 */
@NiagaraType
@NiagaraProperty(
  name = "address",
  type = "String",
  defaultValue = ""
)
public class BTrail14LearnDeviceEntry
  extends BComponent
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.learn.BTrail14LearnDeviceEntry(3857199698)1.0$ @*/
/* Generated Tue May 13 05:53:17 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "address"

  /**
   * Slot for the {@code address} property.
   * @see #getAddress
   * @see #setAddress
   */
  public static final Property address = newProperty(0, "", null);

  /**
   * Get the {@code address} property.
   * @see #address
   */
  public String getAddress() { return getString(address); }

  /**
   * Set the {@code address} property.
   * @see #address
   */
  public void setAddress(String v) { setString(address, v, null); }

  //endregion Property "address"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14LearnDeviceEntry.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BTrail14LearnDeviceEntry()
  {
  }

  public BTrail14LearnDeviceEntry(String address)
  {
    setAddress(address);
  }
}
