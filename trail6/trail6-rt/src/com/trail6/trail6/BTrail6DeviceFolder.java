/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import javax.baja.ndriver.BNDeviceFolder;

/**
 * BTrail6DeviceFolder is a folder for BTrail6Device.
 *
 * @author TRAIL6 on 07 May 2025
 */
@NiagaraType
public class BTrail6DeviceFolder
  extends BNDeviceFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.trail6.trail6.BTrail6DeviceFolder(2979906276)1.0$ @*/
/* Generated Wed May 07 10:17:22 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail6DeviceFolder.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Access
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BTrail6Network.
   *
   * @return network as a BTrail6Network.
   */
  public final BTrail6Network getTrail6Network()
  {
    return (BTrail6Network) getNetwork();
  }

  /**
   * @return true if parent is BTrail6Network or BTrail6DeviceFolder.
   */
  public boolean isParentLegal(BComponent parent)
  {
    return parent instanceof BTrail6Network ||
           parent instanceof BTrail6DeviceFolder;
  }
}
