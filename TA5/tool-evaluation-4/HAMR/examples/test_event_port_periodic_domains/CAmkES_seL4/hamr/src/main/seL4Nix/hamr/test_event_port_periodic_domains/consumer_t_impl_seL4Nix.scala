// #Sireum

package hamr.test_event_port_periodic_domains

import org.sireum._
import art._

@ext object consumer_t_impl_seL4Nix {
  // returns T if seL4's consume port is empty, F otherwise 
  def consume_IsEmpty(): B = $

  // returns result of dequeuing seL4's consume port 
  def consume_Receive(): Option[DataContent] = $
}
