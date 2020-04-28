// #Sireum

package hamr.test_data_port_periodic_domains

import org.sireum._
import art._
import hamr._

// This file was auto-generated.  Do not edit

@record class destination_thread_impl_Bridge(
  val id: Art.BridgeId,
  val name: String,
  val dispatchProtocol: DispatchPropertyProtocol,
  val dispatchTriggers: Option[ISZ[Art.PortId]],

  read_port: Port[S8]
  ) extends Bridge {

  val ports : Bridge.Ports = Bridge.Ports(
    all = ISZ(read_port),

    dataIns = ISZ(read_port),

    dataOuts = ISZ(),

    eventIns = ISZ(),

    eventOuts = ISZ()
  )

  val api : destination_thread_impl_Bridge.Api =
    destination_thread_impl_Bridge.Api(
      id,
      read_port.id
    )

  val entryPoints : Bridge.EntryPoints =
    destination_thread_impl_Bridge.EntryPoints(
      id,

      read_port.id,

      dispatchTriggers,

      destination_thread_impl_Impl(api)
    )
}

object destination_thread_impl_Bridge {

  @record class Api(
    id : Art.BridgeId,
    read_port_Id : Art.PortId) {


    def getread_port() : Option[S8] = {
      val value : Option[S8] = Art.getValue(read_port_Id) match {
        case Some(Base_Types.Integer_8_Payload(v)) => Some(v)
        case Some(v) => 
          Art.logError(id, s"Unexpected payload on port read_port.  Expecting 'Base_Types.Integer_8_Payload' but received ${v}")
          None[S8]() 
        case _ => None[S8]()
      }
      return value
    }

    def logInfo(msg: String): Unit = {
      Art.logInfo(id, msg)
    }

    def logDebug(msg: String): Unit = {
      Art.logDebug(id, msg)
    }

    def logError(msg: String): Unit = {
      Art.logError(id, msg)
    }
  }

  @record class EntryPoints(
    destination_thread_impl_BridgeId : Art.BridgeId,

    read_port_Id : Art.PortId,

    dispatchTriggers : Option[ISZ[Art.PortId]],

    component : destination_thread_impl_Impl ) extends Bridge.EntryPoints {

    val dataInPortIds: ISZ[Art.PortId] = ISZ(read_port_Id)

    val eventInPortIds: ISZ[Art.PortId] = ISZ()

    val dataOutPortIds: ISZ[Art.PortId] = ISZ()

    val eventOutPortIds: ISZ[Art.PortId] = ISZ()

    def compute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)
      component.timeTriggered()
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    override
    def testCompute(): Unit = {
      Art.receiveInput(eventInPortIds, dataInPortIds)
      component.timeTriggered()
      Art.releaseOutput(eventOutPortIds, dataOutPortIds)
    }

    def activate: Unit = {
      component.activate()
    }

    def deactivate: Unit = {
      component.deactivate()
    }

    def finalise: Unit = {
      component.finalise()
    }

    def initialise: Unit = {
      component.initialise()
      Art.sendOutput(eventOutPortIds, dataOutPortIds)
    }

    def recover: Unit = {
      component.recover()
    }
  }
}