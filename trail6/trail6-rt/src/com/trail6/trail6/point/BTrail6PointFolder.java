/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6.point;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ndriver.point.BNPointFolder;

import com.trail6.trail6.*;

/**
 * BTrail6PointFolder
 *
 * @author   TRAIL6 on 07 May 2025
 */
@NiagaraType
public class BTrail6PointFolder
  extends BNPointFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.trail6.trail6.point.BTrail6PointFolder(2979906276)1.0$ @*/
/* Generated Wed May 07 10:17:22 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail6PointFolder.class);

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
   * Get the device cast to a BTrail6Device.
   *
   * @return device as a BTrail6Device.
   */
  public final BTrail6Device getTrail6Device()
  {
    return (BTrail6Device) getDevice();
  }
}
