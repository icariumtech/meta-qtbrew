FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PR .= ".3"

SRC_URI += "file://0001-create-4-spi0-cs.patch \
"

