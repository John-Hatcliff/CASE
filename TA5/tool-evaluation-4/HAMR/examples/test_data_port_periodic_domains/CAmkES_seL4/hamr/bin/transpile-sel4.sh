#!/usr/bin/env bash
#
# This file is autogenerated.  Do not edit
#
set -e

if [ -z "${SIREUM_HOME}" ]; then
  echo "SIREUM_HOME not set. Refer to https://github.com/sireum/kekinian/#installing"
  exit 1
fi

SCRIPT_HOME=$( cd "$( dirname "$0" )" &> /dev/null && pwd )

PATH_SEP=":"
if [ -n "$COMSPEC" -a -x "$COMSPEC" ]; then
  PATH_SEP=";"
fi

OUTPUT_DIR="${SCRIPT_HOME}/../src/c/CAmkES_seL4/hamr/top_impl_Instance_source_process_component_source_thread_component"

${SIREUM_HOME}/bin/sireum slang transpilers c \
  --sourcepath "${SCRIPT_HOME}/../src/main/bridge${PATH_SEP}${SCRIPT_HOME}/../src/main/component${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/hamr/test_data_port_periodic_domains${PATH_SEP}${SCRIPT_HOME}/../src/main/art${PATH_SEP}${SCRIPT_HOME}/../src/main/data${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/hamr/top_impl_Instance_source_process_component_source_thread_component" \
  --output-dir "${OUTPUT_DIR}" \
  --name "main" \
  --apps "hamr.top_impl_Instance_source_process_component_source_thread_component.source_thread_component" \
  --fingerprint 3 \
  --bits 32 \
  --string-size 256 \
  --sequence-size 1 \
  --sequence "MS[Z,art.Bridge]=1;MS[Z,MOption[art.Bridge]]=1;IS[Z,art.UPort]=1;IS[Z,art.UConnection]=1" \
  --constants "art.Art.maxComponents=1;art.Art.maxPorts=1" \
  --forward "art.ArtNative=hamr.top_impl_Instance_source_process_component_source_thread_component.source_thread_component" \
  --stack-size "16777216" \
  --stable-type-id \
  --exts "${SCRIPT_HOME}/../src/c/ext-c/ext.c${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/ext.h${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/source_thread_impl_Impl/source_thread_impl_Impl_api.h${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/source_thread_impl_Impl/source_thread_impl_Impl_api.c${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/source_thread_impl_Impl/source_thread_impl_Impl.c${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/adapters/top_impl_Instance_source_process_component_source_thread_component/source_thread_impl_adapter.h${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/adapters/top_impl_Instance_source_process_component_source_thread_component/source_thread_impl_adapter.c" \
  --exclude-build "hamr.test_data_port_periodic_domains.source_thread_impl_Impl,hamr.test_data_port_periodic_domains.destination_thread_impl_Impl" \
  --lib-only \
  --verbose

FILE=${OUTPUT_DIR}/CMakeLists.txt
echo -e "\n\nadd_definitions(-DCAMKES)" >> $FILE

OUTPUT_DIR="${SCRIPT_HOME}/../src/c/CAmkES_seL4/hamr/top_impl_Instance_destination_process_component_destination_thread_component"

${SIREUM_HOME}/bin/sireum slang transpilers c \
  --sourcepath "${SCRIPT_HOME}/../src/main/bridge${PATH_SEP}${SCRIPT_HOME}/../src/main/component${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/hamr/test_data_port_periodic_domains${PATH_SEP}${SCRIPT_HOME}/../src/main/art${PATH_SEP}${SCRIPT_HOME}/../src/main/data${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/hamr/top_impl_Instance_destination_process_component_destination_thread_component" \
  --output-dir "${OUTPUT_DIR}" \
  --name "main" \
  --apps "hamr.top_impl_Instance_destination_process_component_destination_thread_component.destination_thread_component" \
  --fingerprint 3 \
  --bits 32 \
  --string-size 256 \
  --sequence-size 1 \
  --sequence "MS[Z,art.Bridge]=1;MS[Z,MOption[art.Bridge]]=1;IS[Z,art.UPort]=1;IS[Z,art.UConnection]=1" \
  --constants "art.Art.maxComponents=1;art.Art.maxPorts=1" \
  --forward "art.ArtNative=hamr.top_impl_Instance_destination_process_component_destination_thread_component.destination_thread_component" \
  --stack-size "16777216" \
  --stable-type-id \
  --exts "${SCRIPT_HOME}/../src/c/ext-c/ext.c${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/ext.h${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/destination_thread_impl_Impl/destination_thread_impl_Impl_api.h${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/destination_thread_impl_Impl/destination_thread_impl_Impl_api.c${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/destination_thread_impl_Impl/destination_thread_impl_Impl.c${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/adapters/top_impl_Instance_destination_process_component_destination_thread_component/destination_thread_impl_adapter.h${PATH_SEP}${SCRIPT_HOME}/../src/c/ext-c/adapters/top_impl_Instance_destination_process_component_destination_thread_component/destination_thread_impl_adapter.c" \
  --exclude-build "hamr.test_data_port_periodic_domains.source_thread_impl_Impl,hamr.test_data_port_periodic_domains.destination_thread_impl_Impl" \
  --lib-only \
  --verbose

FILE=${OUTPUT_DIR}/CMakeLists.txt
echo -e "\n\nadd_definitions(-DCAMKES)" >> $FILE

OUTPUT_DIR="${SCRIPT_HOME}/../src/c/CAmkES_seL4/hamr/SlangTypeLibrary"

${SIREUM_HOME}/bin/sireum slang transpilers c \
  --sourcepath "${SCRIPT_HOME}/../src/main/art${PATH_SEP}${SCRIPT_HOME}/../src/main/data${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/hamr/SlangTypeLibrary" \
  --output-dir "${OUTPUT_DIR}" \
  --name "main" \
  --apps "hamr.SlangTypeLibrary.SlangTypeLibrary" \
  --fingerprint 3 \
  --bits 32 \
  --string-size 256 \
  --sequence-size 1 \
  --forward "art.ArtNative=hamr.SlangTypeLibrary.SlangTypeLibrary" \
  --stack-size "16777216" \
  --stable-type-id \
  --lib-only \
  --verbose

FILE=${OUTPUT_DIR}/CMakeLists.txt
echo -e "\n\nadd_definitions(-DCAMKES)" >> $FILE