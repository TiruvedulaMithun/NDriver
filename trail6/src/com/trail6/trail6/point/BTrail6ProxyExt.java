/*
 * Copyright 2025 TRAIL6. All Rights Reserved.
 */

package com.trail6.trail6.point;

import javax.baja.driver.point.BReadWriteMode;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusEnum;
import javax.baja.status.BStatusNumeric;
import javax.baja.status.BStatusString;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.driver.util.DrUtil;
import javax.baja.ndriver.point.BNProxyExt;

import com.trail6.trail6.*;

/**
 * BTrail6ProxyExt
 *
 * @author TRAIL6 on 07 May 2025
 */
@NiagaraType
/*
Override ProxyExt default status to clear stale state if needed
@NiagaraProperty(
  name = "status",
  type = "BStatus",
  defaultValue = "BStatus.ok",
  flags = Flags.READONLY | Flags.TRANSIENT,
  override = true
)
*/
public class BTrail6ProxyExt
  extends BNProxyExt
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.trail6.trail6.point.BTrail6ProxyExt(2979906276)1.0$ @*/
/* Generated Wed May 07 10:17:22 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail6ProxyExt.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Access
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BTrail6Network.
   */
  public final BTrail6Network getTrail6Network()
  {
    return (BTrail6Network) getNetwork();
  }

  /**
   * Get the device cast to a BTrail6Device.
   */
  public final BTrail6Device getBTrail6Device()
  {
    return (BTrail6Device) DrUtil.getParent(this, BTrail6Device.TYPE);
  }

  /**
   * Get the point device ext cast to a BTrail6PointDeviceExt.
   */
  public final BTrail6PointDeviceExt getTrail6PointDeviceExt()
  {
    return (BTrail6PointDeviceExt) getDeviceExt();
  }

////////////////////////////////////////////////////////////////
// ProxyExt
////////////////////////////////////////////////////////////////
  public void readSubscribed(Context cx)
    throws Exception
  {
    // TODO
  }

  public void readUnsubscribed(Context cx)
    throws Exception
  {
     // TODO
  }

  public boolean write(Context cx)
    throws Exception
  {
    // TODO
    return false;
  }

  /**
   * Return the device type.
   */
  public Type getDeviceExtType()
  {
    return BTrail6PointDeviceExt.TYPE;
  }

  /**
   * Return the read/write mode of this proxy.
   */
  public BReadWriteMode getMode()
  {
    // TODO
    return BReadWriteMode.readonly;
  }

  public boolean isBoolean()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusBoolean;
  }

  public boolean isNumeric()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusNumeric;
  }

  public boolean isString()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusString;
  }

  public boolean isEnum()
  {
    return getParentPoint().getOutStatusValue() instanceof BStatusEnum;
  }
}
