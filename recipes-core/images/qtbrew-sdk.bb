require qtbrew-image.bb
inherit populate_sdk_qt5

IMAGE_NAME = "qtbrew-sdk-${DISTRO_VERSION}"

IMAGE_FEATURES += "staticdev-pkgs dev-pkgs tools-debug tools-sdk"

TOOLCHAIN_HOST_TASK += "nativesdk-cmake nativesdk-make"
