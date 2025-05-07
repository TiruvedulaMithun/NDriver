/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6.point;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import javax.baja.ndriver.discover.BNDiscoveryPreferences;

/**
 * BTrail6PointDiscoveryPreferences controls the type of discovery leafs using during
 * point discovery for trail6
 *
 * @author TRAIL6 on 07 May 2025
 */
@NiagaraType
public class BTrail6PointDiscoveryPreferences
  extends BNDiscoveryPreferences
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.trail6.trail6.point.BTrail6PointDiscoveryPreferences(2979906276)1.0$ @*/
/* Generated Wed May 07 10:17:22 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail6PointDiscoveryPreferences.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BTrail6PointDiscoveryPreferences()
  {
  }

  public Type getDiscoveryLeafType()
  {
    return BTrail6PointDiscoveryLeaf.TYPE;
  }
}
