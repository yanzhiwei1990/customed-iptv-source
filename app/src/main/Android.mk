LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_PACKAGE_NAME := IptvSource

LOCAL_AAPT_FLAGS := --auto-add-overlay \
   --extra-packages android.support.v17.leanback

LOCAL_RESOURCE_DIR := frameworks/support/leanback/src/main/res \
   $(LOCAL_PATH)/res

LOCAL_STATIC_JAVA_LIBRARIES += \
   iptvlibrary \
   android-support-v17-leanback

LOCAL_SRC_FILES := $(call all-subdir-java-files)

LOCAL_CERTIFICATE := platform
LOCAL_PROGUARD_ENABLED := disabled

include $(BUILD_PACKAGE)
include $(call all-makefiles-under, $(LOCAL_PATH))

