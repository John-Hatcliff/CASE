// #Sireum

package hamr

import org.sireum._
import art._
import art.PortMode._
import art.DispatchPropertyProtocol._

// This file was auto-generated.  Do not edit

object Arch {
  val top_impl_Instance_src_process_src_thread : hamr.test_event_data_port_periodic_domains.emitter_t_impl_Bridge = {
    val write_port = Port[S8] (id = 0, name = "top_impl_Instance_src_process_src_thread_write_port", mode = EventOut)

    hamr.test_event_data_port_periodic_domains.emitter_t_impl_Bridge(
      id = 0,
      name = "top_impl_Instance_src_process_src_thread",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      write_port = write_port
    )
  }
  val top_impl_Instance_dst_process_dst_thread : hamr.test_event_data_port_periodic_domains.consumer_t_impl_Bridge = {
    val read_port = Port[S8] (id = 1, name = "top_impl_Instance_dst_process_dst_thread_read_port", mode = EventIn)

    hamr.test_event_data_port_periodic_domains.consumer_t_impl_Bridge(
      id = 1,
      name = "top_impl_Instance_dst_process_dst_thread",
      dispatchProtocol = Periodic(period = 1000),
      dispatchTriggers = None(),

      read_port = read_port
    )
  }

  val ad : ArchitectureDescription = {

    ArchitectureDescription(
      components = MSZ (top_impl_Instance_src_process_src_thread, top_impl_Instance_dst_process_dst_thread),

      connections = ISZ (Connection(from = top_impl_Instance_src_process_src_thread.write_port, to = top_impl_Instance_dst_process_dst_thread.read_port))
    )
  }
}