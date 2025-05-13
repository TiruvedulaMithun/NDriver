/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14;

import javax.baja.ndriver.BNDeviceFolder;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;


/**
 * BTrail14DeviceFolder is a folder for BTrail14Device.
 *
 * @author mithun on 13 May 2025
 */
@NiagaraType
public class BTrail14DeviceFolder
  extends BNDeviceFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.BTrail14DeviceFolder(2979906276)1.0$ @*/
/* Generated Tue May 13 05:53:17 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14DeviceFolder.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Access
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BTrail14Network.
   *
   * @return network as a BTrail14Network.
   */
  public final BTrail14Network getTrail14Network()
  {
    return (BTrail14Network) getNetwork();
  }

  /**
   * @return true if parent is BTrail14Network or BTrail14DeviceFolder.
   */
  public boolean isParentLegal(BComponent parent)
  {
    return parent instanceof BTrail14Network ||
           parent instanceof BTrail14DeviceFolder;
  }
}
