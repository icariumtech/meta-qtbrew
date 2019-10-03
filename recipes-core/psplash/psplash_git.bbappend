FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR .= ".3"

SPLASH_IMAGES = "file://brewerycontroller.png;outsuffix=brewerycontroller"

SRC_URI += "file://psplash-bar-img.png \
            file://psplash-colors.h \
            file://psplash-init"

do_configure_append () {
    cd ${S}
    cp ../psplash-colors.h ./
    cp ../psplash-bar-img.png ./psplash-bar.png
    ./make-image-header.sh ./psplash-bar.png BAR
}

INITSCRIPT_NAME = "psplash.sh"
INITSCRIPT_PARAMS = "start 5 S . stop 20 0 1 6 ."
