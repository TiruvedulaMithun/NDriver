/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.point;

import javax.baja.driver.point.BReadWriteMode;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.ndriver.point.BNProxyExt;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusEnum;
import javax.baja.status.BStatusNumeric;
import javax.baja.status.BStatusString;
import javax.baja.sys.*;

import com.mithun.trail14.*;

/**
 * BTrail14ProxyExt
 *
 * @author mithun on 13 May 2025
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
public class BTrail14ProxyExt
  extends BNProxyExt
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.point.BTrail14ProxyExt(2979906276)1.0$ @*/
/* Generated Tue May 13 05:53:18 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14ProxyExt.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Access
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BTrail14Network.
   */
  public final BTrail14Network getTrail14Network()
  {
    return (BTrail14Network) getNetwork();
  }

  /**
   * Get the device cast to a BTrail14Device.
   */
  public final BTrail14Device getBTrail14Device()
  {
    return (BTrail14Device) ((BComplex) this).getAncestor(BTrail14Device.TYPE);
  }

  /**
   * Get the point device ext cast to a BTrail14PointDeviceExt.
   */
  public final BTrail14PointDeviceExt getTrail14PointDeviceExt()
  {
    return (BTrail14PointDeviceExt) getDeviceExt();
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
    return BTrail14PointDeviceExt.TYPE;
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
