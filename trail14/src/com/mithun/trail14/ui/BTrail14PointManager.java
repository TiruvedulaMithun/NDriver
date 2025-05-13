/*
 * Copyright 2025 mithun. All Rights Reserved.
 */

package com.mithun.trail14.ui;

import javax.baja.sys.*;
import javax.baja.util.*;
import javax.baja.gx.*;
import javax.baja.ui.*;
import javax.baja.control.*;
import javax.baja.driver.*;
import javax.baja.driver.point.*;
import javax.baja.ndriver.ui.point.*;
import javax.baja.workbench.mgr.*;
import javax.baja.workbench.mgr.folder.*;
import javax.baja.nre.annotations.*;


import com.mithun.trail14.*;
import com.mithun.trail14.point.*;

/**
 * BTrail14PointManager provides the user interface to manage
 * proxy points in single device
 *
 * @author mithun on 13 May 2025
 */
@NiagaraType(
  agent = @AgentOn(types = { "trail14:Trail14PointDeviceExt", "trail14:Trail14PointFolder" })
)
public class BTrail14PointManager
  extends BNPointManager
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.mithun.trail14.ui.BTrail14PointManager(17462039)1.0$ @*/
/* Generated Tue May 13 05:53:18 EDT 2025 by Slot-o-Matic (c) Tridium, Inc. 2012-2025 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BTrail14PointManager.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Constructor
////////////////////////////////////////////////////////////////

  public BTrail14PointManager()
  {
  }

////////////////////////////////////////////////////////////////
// Support
////////////////////////////////////////////////////////////////

  protected MgrModel makeModel()
  {
    return new Model(this);
  }

  protected MgrController makeController()
  {
    return new Controller(this);
  }

////////////////////////////////////////////////////////////////
// Model
////////////////////////////////////////////////////////////////

  class Model extends NPointModel
  {
    Model(BNPointManager manager)
    {
      super(manager);
    }

    protected MgrColumn[] makeColumns()
    {
      return cols;
    }
  }

////////////////////////////////////////////////////////////////
// Controller
////////////////////////////////////////////////////////////////

  class Controller extends NPointController
  {
    Controller(BNPointManager mgr)
    {
      super(mgr);
    }
  }

////////////////////////////////////////////////////////////////
// Attributes
////////////////////////////////////////////////////////////////

  static Lexicon lex = Lexicon.make(BTrail14PointManager.class);

  // base class columns
  MgrColumn colPath        = new MgrColumn.Path(MgrColumn.UNSEEN);
  MgrColumn colName        = new MgrColumn.Name();
  MgrColumn colType        = new MgrColumn.Type();
  MgrColumn colToString    = new MgrColumn.ToString("Out", 0);
  MgrColumn colEnabled     = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.enabled}, MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colFacets      = new MgrColumn.PropPath(new Property[] {BControlPoint.facets},  MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colTuning      = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.tuningPolicyName}, MgrColumn.EDITABLE);
  MgrColumn colDeviceFacets= new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.deviceFacets}, MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colConversion  = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.conversion},   MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colFaultCause  = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.faultCause},   MgrColumn.UNSEEN);
  MgrColumn colReadValue   = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.readValue},    MgrColumn.UNSEEN);
  MgrColumn colWriteValue  = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.writeValue},   MgrColumn.UNSEEN);

  // Trail14ProxyExt specific columns
  MgrColumn[] cols =
  {
    colPath, colName, colType, colToString,
    colEnabled, colFacets, colTuning, colDeviceFacets, colConversion,
    colFaultCause, colReadValue, colWriteValue,
  };
}
