


cmake_minimum_required(VERSION 3.18)
project(HelloWorldApp)

include_directories(${JNI_INCLUDE_DIRS})


# Define the shared library
add_library(
    native-lib
    SHARED
    native-lib.cpp
)

# Link JNI libraries (and log if needed)
target_link_libraries(
    native-lib
    ${JNI_LIBRARIES}
    # ${log-lib}
)

