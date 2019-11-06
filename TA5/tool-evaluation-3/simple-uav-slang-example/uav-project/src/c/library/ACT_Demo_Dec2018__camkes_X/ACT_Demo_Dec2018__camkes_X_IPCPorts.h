#ifndef SIREUM_H_ACT_Demo_Dec2018__camkes_X_IPCPorts
#define SIREUM_H_ACT_Demo_Dec2018__camkes_X_IPCPorts
#include <types.h>

void ACT_Demo_Dec2018__camkes_X_IPCPorts_init(STACK_FRAME_LAST);

Z ACT_Demo_Dec2018__camkes_X_IPCPorts_UART_Impl_App(STACK_FRAME_LAST);
Z ACT_Demo_Dec2018__camkes_X_IPCPorts_WaypointManager_Impl_App(STACK_FRAME_LAST);
Z ACT_Demo_Dec2018__camkes_X_IPCPorts_Radio_Impl_App(STACK_FRAME_LAST);
Z ACT_Demo_Dec2018__camkes_X_IPCPorts_FlightPlanner_Impl_App(STACK_FRAME_LAST);
Z ACT_Demo_Dec2018__camkes_X_IPCPorts_UARTDriver_Impl_App(STACK_FRAME_LAST);
Z ACT_Demo_Dec2018__camkes_X_IPCPorts_RadioDriver_Impl_App(STACK_FRAME_LAST);
Z ACT_Demo_Dec2018__camkes_X_IPCPorts_Main(STACK_FRAME_LAST);

#endif