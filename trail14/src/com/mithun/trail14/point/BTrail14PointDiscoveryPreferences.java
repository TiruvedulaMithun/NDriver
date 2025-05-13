/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.point;

import javax.baja.ndriver.discover.BNDiscoveryPreferences;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;


/**
 * BTrail14PointDiscoveryPreferences controls the type of discovery leafs using during
 * point discovery for trail14
 *
 * @author mithun on 13 May 2025
 */
@NiagaraType
public class BTrail14PointDiscoveryPreferences
  extends BNDiscoveryPreferences
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.point.BTrail14PointDiscoveryPreferences(2979906276)1.0$ @*/
/* Generated Tue May 13 05:53:17 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14PointDiscoveryPreferences.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BTrail14PointDiscoveryPreferences()
  {
  }

  public Type getDiscoveryLeafType()
  {
    return BTrail14PointDiscoveryLeaf.TYPE;
  }
}
