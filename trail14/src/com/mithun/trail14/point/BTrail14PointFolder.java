/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.point;

import javax.baja.ndriver.point.BNPointFolder;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;


import com.mithun.trail14.*;

/**
 * BTrail14PointFolder
 *
 * @author   mithun on 13 May 2025
 */
@NiagaraType
public class BTrail14PointFolder
  extends BNPointFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.point.BTrail14PointFolder(2979906276)1.0$ @*/
/* Generated Tue May 13 05:53:17 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14PointFolder.class);

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
   * Get the device cast to a BTrail14Device.
   *
   * @return device as a BTrail14Device.
   */
  public final BTrail14Device getTrail14Device()
  {
    return (BTrail14Device) getDevice();
  }
}
