#ifndef SIREUM_H_art_Bridge_EntryPoints
#define SIREUM_H_art_Bridge_EntryPoints
#include <types.h>

// art.Bridge.EntryPoints

#define art_Bridge_EntryPoints__eq(this, other) Type__eq(this, other)
#define art_Bridge_EntryPoints__ne(this, other) (!Type__eq(this, other))
#define art_Bridge_EntryPoints_cprint(this, isOut) Type_cprint(this, isOut)
B art_Bridge_EntryPoints__is(STACK_FRAME void *this);
art_Bridge_EntryPoints art_Bridge_EntryPoints__as(STACK_FRAME void *this);
static inline void art_Bridge_EntryPoints_string(STACK_FRAME String result, art_Bridge_EntryPoints this) {
  Type_string(CALLER result, this);
}

Unit art_Bridge_EntryPoints_initialise_(STACK_FRAME art_Bridge_EntryPoints this);

Unit art_Bridge_EntryPoints_compute_(STACK_FRAME art_Bridge_EntryPoints this);

Unit art_Bridge_EntryPoints_finalise_(STACK_FRAME art_Bridge_EntryPoints this);

#endif