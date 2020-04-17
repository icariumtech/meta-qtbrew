FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= ".7"

SRC_URI += "file://0001-create-4-spi0-cs.patch \
    file://0002-set-max-spi-speed-to-5khz.patch \
    file://0003-create-4-spi0-cs-rpi4b.patch \
"

INITRAMFS_IMAGE_BUNDLE = "1"

