inherit gitpkgv

SUMMARY = "Brewery Controller"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRCREV = "${AUTOREV}"
PV = "git-${SRCPV}"
PR = "r3"

SRC_URI = "git://github.com/icariumtech/qtbrew.git \
	file://qtbrew.init"

DEPENDS = "qtbase \
	qtcharts \
	qtvirtualkeyboard \
	qtquickcontrols2 \
	qtdeclarative \
	qtsensors \
        qtgraphicaleffects \
        libgpiod \
        libsoc \
"

inherit cmake_qt5

INITSCRIPT_NAME = "qtbrew"
INITSCRIPT_PARAMS = "start S 5 . stop 8 0 1 6 ."
inherit update-rc.d

S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/qtbrew.init ${D}/${sysconfdir}/init.d/qtbrew
}

FILES_${PN} += "${sysconfdir}/init.d/qtbrew"
