package hamr.test_data_port_periodic_domains

import org.sireum._
import art._

object destination_thread_impl_seL4Nix_Ext {
  def read_port_IsEmpty(): B = halt("stub")

  def read_port_Receive(): Option[DataContent] = halt("stub")
}
