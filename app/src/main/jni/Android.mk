LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := NativeUtils
LOCAL_SRC_FILES := xnmini.c
include $(BUILD_SHARED_LIBRARY)

