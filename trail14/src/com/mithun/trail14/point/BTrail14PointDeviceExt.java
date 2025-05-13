/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.point;

import javax.baja.ndriver.discover.*;
import javax.baja.ndriver.point.*;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.mithun.trail14.*;

/**
 * BTrail14PointDeviceExt is a container for trail14 proxy points.
 *
 * @author mithun on 13 May 2025
 */
@NiagaraType
@NiagaraProperty(
  name = "discoveryPreferences",
  type = "BTrail14PointDiscoveryPreferences",
  defaultValue = "new BTrail14PointDiscoveryPreferences()",
  override = true
)
public class BTrail14PointDeviceExt
  extends BNPointDeviceExt
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.point.BTrail14PointDeviceExt(1545356242)1.0$ @*/
/* Generated Tue May 13 05:53:17 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Property "discoveryPreferences"

  /**
   * Slot for the {@code discoveryPreferences} property.
   * @see #getDiscoveryPreferences
   * @see #setDiscoveryPreferences
   */
  public static final Property discoveryPreferences = newProperty(0, new BTrail14PointDiscoveryPreferences(), null);

  //endregion Property "discoveryPreferences"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14PointDeviceExt.class);

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

////////////////////////////////////////////////////////////////
// PointDeviceExt
////////////////////////////////////////////////////////////////

  /**
   * @return the Device type.
   */
  public Type getDeviceType()
  {
    return BTrail14Device.TYPE;
  }

  /**
   * @return the PointFolder type.
   */
  public Type getPointFolderType()
  {
    return BTrail14PointFolder.TYPE;
  }

  /**
   * @return the ProxyExt type.
   */
  public Type getProxyExtType()
  {
    return BTrail14ProxyExt.TYPE;
  }

////////////////////////////////////////////////////////////////
//BINDiscoveryHost
////////////////////////////////////////////////////////////////

  /**
   * Call back for discoveryJob to get an array of discovery objects.
   * Override point for driver specific discovery.
   */
  public BINDiscoveryObject[] getDiscoveryObjects(BNDiscoveryPreferences prefs)
    throws Exception
  {
    //
    // TODO  get array of discovery objects
    //
//    Array<??> a = new Array<>(??.class);
//    for(??)
//     a.add(new BTrail14PointDiscoveryLeaf(??));
//    return a.trim();
    return null;
  }
}
