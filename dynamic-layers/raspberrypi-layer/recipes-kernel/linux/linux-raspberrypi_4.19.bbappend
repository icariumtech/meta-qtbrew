FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= ".4"

SRC_URI += "file://0001-create-4-spi0-cs.patch \
    file://0002-set-max-spi-speed-to-5khz.patch \
"

