inherit gitpkgv

SUMMARY = "Brewery Controller"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRCREV = "AUTOINC"
PV = "git-${SRCPV}"

SRC_URI = "git://github.com/icariumtech/qtbrew.git"

DEPENDS = "qtbase \
	qtcharts \
	qtvirtualkeyboard \
	qtquickcontrols2 \
	qtdeclarative \
	qtsensors \
"

inherit cmake_qt5

S = "${WORKDIR}/git"

