// #Sireum

package hamr.top_impl_Instance_destination_process_component_destination_thread_component

import org.sireum._
import art._
import art.DispatchPropertyProtocol._
import art.PortMode._
import hamr._
import hamr.test_data_port_periodic_domains.destination_thread_impl_seL4Nix

object destination_thread_component extends App {

  val destination_thread_componentBridge : hamr.test_data_port_periodic_domains.destination_thread_impl_Bridge = {
    val read_port = Port[S8] (id = 0, name = "top_impl_Instance_destination_process_component_destination_thread_component_read_port", mode = DataIn)

    hamr.test_data_port_periodic_domains.destination_thread_impl_Bridge(
      id = 0,
      name = "top_impl_Instance_destination_process_component_destination_thread_component",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      read_port = read_port
    )
  }

  val entryPoints: Bridge.EntryPoints = destination_thread_componentBridge.entryPoints
  val noData: Option[DataContent] = None()

  // read_port: In DataPort Base_Types.Integer_8
  val read_port_id: Art.PortId = destination_thread_componentBridge.read_port.id
  var read_port_port: Option[DataContent] = noData

  def dispatchStatus(bridgeId: Art.BridgeId): DispatchStatus = {
    return TimeTriggered()
  }

  def getValue(portId: Art.PortId): Option[DataContent] = {
    if(portId == read_port_id) {
      return read_port_port
    } else {
      halt(s"Unexpected: destination_thread_component.getValue called with: ${portId}")
    }
  }

  def receiveInput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    // ignore params

    read_port_port = destination_thread_impl_seL4Nix.read_port_Receive()  
  }

  def putValue(portId: Art.PortId, data: DataContent): Unit = {
    halt(s"Unexpected: destination_thread_component.putValue called with: ${portId}")
  }

  def sendOutput(eventPortIds: ISZ[Art.PortId], dataPortIds: ISZ[Art.PortId]): Unit = {
    // ignore params


  }

  def initialiseArchitecture(): Unit = { 
    val ad = ArchitectureDescription(
      components = MSZ (destination_thread_componentBridge),
      connections = ISZ ()
    )   
    Art.run(ad)
  }

  def initialiseEntryPoint(): Unit = { entryPoints.initialise() }

  def computeEntryPoint(): Unit = { entryPoints.compute() }

  def finaliseEntryPoint(): Unit = { entryPoints.finalise() }

  def main(args: ISZ[String]): Z = {

    // need to touch the following for transpiler
    initialiseArchitecture()
    initialiseEntryPoint()
    computeEntryPoint()
    finaliseEntryPoint()

    // touch each payload/type in case some are only used as a field in a record
    def printDataContent(a: art.DataContent): Unit = { println(s"${a}") }

    printDataContent(Base_Types.Integer_8_Payload(Base_Types.Integer_8_empty()))
    printDataContent(art.Empty())

    return 0
  }

  def logInfo(title: String, msg: String): Unit = {
    print(title)
    print(": ")
    println(msg)
  }

  def logError(title: String, msg: String): Unit = {
    eprint(title)
    eprint(": ")
    eprintln(msg)
  }

  def logDebug(title: String, msg: String): Unit = {
    print(title)
    print(": ")
    println(msg)
  }

  def run(): Unit = {}

}
